/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CAT;

import Dao.CAT.UsuarioDao;
import Model.CAT.Termino;
import Model.CAT.TerminoLamina;
import Model.CAT.Test;
import Model.CAT.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import javax.servlet.ServletContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;

/**
 *
 * @author jean
 */
@ManagedBean(name = "terminosBean")
@ViewScoped

public class TerminosBean {

    
   
   private Usuario usuario;
   private Test test;
   
   @ManagedProperty("#{calcularMetricas}")
   private CalcularMetricas metricas;
   
    @ManagedProperty("#{adminTerminosBean}")
    private AdminTerminosBean adminTerminos;
    
    @ManagedProperty("#{analisis}")
    private Analisis terminosAnalisis;
   
    
 
  
   
       //esto debe ir en un relatos bean
   private List<Termino>[] terminosTest;
   private int idRelato;
   
   private Termino terminoTemp;
   private Termino terminoTemp2;
    private Termino terminoTemp2Copia;
   
   
    
    
    public TerminosBean() throws IOException, FileNotFoundException, ClassNotFoundException {
        
    
       // terminosTest=new ArrayList[2];
       test= new Test();
         usuario= new Usuario();
        terminoTemp2= new Termino();
       terminoTemp2Copia=new Termino();
        
         }
   
//    public List<Termino> getTerminosRelato(int idRelato) throws IOException, FileNotFoundException, ClassNotFoundException{
//        
//        
//        getTerminosTest();
//       
//           System.out.println(" el id test es "+test.getIdTest());
//         System.out.println(" el rut examinado es "+test.getRutExaminado());
//          System.out.println(" el id relato es "+idRelato);
//        
//        /*
//        System.out.println(" el id test es "+test.getIdTest());
//         System.out.println(" el rut examinado es "+test.getRutExaminado());
//          System.out.println(" el id relato es "+idRelato);
//          for (List termino : terminosTest){
//              System.out.println(" hola ");
//              
//              for (Object term: termino){
//                  Termino terminito= (Termino)term;
//                  System.out.println(" la palabra que tiene es"+terminito.getPalabra());
//   
//              }
//
//          }
//          */
//        
//        return terminosTest[idRelato];
//
//    }
//


    public List<Termino>[] getTerminosTest() throws IOException, FileNotFoundException, ClassNotFoundException {
        
         if(terminosTest==null)
          //  terminosTest=deserializarTerminosTest();
             terminosTest=terminosAnalisis.getTerminosTest();
        
        return terminosTest;
    }

     public List<Termino> getTerminosRelato(int idRelato) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        
          List<Termino>[] listaTerms=terminosAnalisis.getTerminosTest();
        
        return listaTerms[idRelato];
    }
    
    public List<Termino>[] deserializarTerminosTest() throws FileNotFoundException, IOException, ClassNotFoundException{
        
             List<Termino>[] terminos;     
  ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String realPath=(String) servletContext.getRealPath("/"); // Sustituye "/" por el directorio ej: "/upload"
          
         
           //recuperar los terminos // setearle el rut del examinado para obtenerlo
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(realPath+"/Tests/"+test.getIdTest()+".obj"));
                terminos=(List<Termino>[])entrada.readObject();
                
              
           
        return terminos;
    }

public void guardarTerminosDiccionario() throws IOException{
    
     //hay que serializar los terminos;
        adminTerminos.serializarTerminos();
    
} 
    
    public void calcularMetricasTest() throws IOException, FileNotFoundException, ClassNotFoundException{
        
      
        
         //guardamos el test
         
             UsuarioDao dao= new UsuarioDao();
          //aca debemos insertar en la bd el test y los relatos 
          // primero insertamos, luego seteamos el valor del idTest a analisis
        dao.insertarTest(terminosAnalisis.getRelatos(),terminosAnalisis.getRutExaminado(),terminosAnalisis.getRutUsuario()); 
      
        // si es el primer test
        if(terminosAnalisis.getIdTest()==1){
      
            //No ocuparemos Analisis = analisis = new Analisis(); porque esto me lo crea de 0
            //terminosAnalisis es una copia de Analisis.
            terminosAnalisis.setIdTest(dao.getUltimoTest());
       test.setIdTest(dao.getUltimoTest());
       System.out.println(" el test =1 y se cambió a"+(dao.getUltimoTest())+1);
        }
        
        
        
        
          //serilizar el test
        //luego calcular las metricas
        
        serializarTest();
        //hay que serializar los terminos;
        adminTerminos.serializarTerminos();
        
        metricas.calcularMetricaTest(test.getIdTest());
        
       
         
        
        
        
       //Esto es importante ya que acá redireccionaremos una vez terminado el análisis 
        FacesContext fc=FacesContext.getCurrentInstance();
         fc.getExternalContext().redirect("/Proyecto/faces/CATPages/consultarResultadoAnalisis.xhtml?idTest="+test.getIdTest());//redirecciona la página
        
        
        
    }
    
    
    public void serializarTest() throws IOException{
    
        //serialización
          ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String realPath=(String) servletContext.getRealPath("/"); // Sustituye "/" por el directorio ej: "/upload"
          
          
          //serialización
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(realPath+"/Tests/"+test.getIdTest()+".obj"))) {
                salida.writeObject(terminosTest);
                System.out.println(" se serializó");
              
            }
    
}
    
       public void remove(Termino termino, int idLamina) {
    try {
        
        System.out.println("id lamina a eliminar "+idLamina);
        System.out.println("termino "+ termino.getPalabra());
        
        //hay que borrar tambien los terminos del tesauro
        terminosTest[idLamina].remove(termino);
        System.out.println(" se ha eliminado");
        //terminoTemp=new Termino();
   
       
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
       
       public void editarTermino(int idLamina){
           System.out.println(" vamos a editar "+idLamina);
           
           
       }
    
    
      public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }  
 
    
    public String clasificacion(int connotacion){
        //Metodo que dada una clasificacion me retorna el string correspondiente
        String clasif="Neutro";
        if (connotacion==0) return "Negativo";
        if (connotacion==1) return "Positivo";
        
            return clasif;
    }
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getIdRelato() {
        return idRelato;
    }

    public void setIdRelato(int idRelato) {
        this.idRelato = idRelato;
    }

    public void setTerminosTest(List<Termino>[] terminosTest) {
        this.terminosTest = terminosTest;
    }

    public Termino getTerminoTemp() {
        return terminoTemp;
    }

    public void setTerminoTemp(Termino terminoTemp) {
        this.terminoTemp = terminoTemp;
    }

    public Termino getTerminoTemp2() {
        return terminoTemp2;
    }

    public void setTerminoTemp2(Termino terminoTemp2) {
        this.terminoTemp2 = terminoTemp2;
    }

    public CalcularMetricas getMetricas() {
        return metricas;
    }

    public void setMetricas(CalcularMetricas metricas) {
        this.metricas = metricas;
    }

    public AdminTerminosBean getAdminTerminos() {
        return adminTerminos;
    }

    public void setAdminTerminos(AdminTerminosBean adminTerminos) {
        this.adminTerminos = adminTerminos;
    }

    public Analisis getTerminosAnalisis() {
        return terminosAnalisis;
    }

    public void setTerminosAnalisis(Analisis terminosAnalisis) {
        this.terminosAnalisis = terminosAnalisis;
    }
        
        
        
   
     
 
    public Termino getTerminoTemp2Copia() {
        return terminoTemp2Copia;
    }

    public void setTerminoTemp2Copia(Termino terminoTemp2Copia) {
        this.terminoTemp2Copia = terminoTemp2Copia;
    }
    
    
       public void destroy() {
        System.out.println(" se destruyo");
    }

    
        public void cerrarDialog(){
            
            //existe el termino por lo cual tiene que volver a ser el mismo
    // terminoTemp2Copia.setTerminoAsociado("");
           terminoTemp2Copia.setTerminoAsociado("");
            System.out.println(" se cambió al término original");
            
            
                RequestContext rc = RequestContext.getCurrentInstance();
    rc.execute("PF('dlgmodificar3').hide();");  
    
            System.out.println("termino"+terminoTemp2.getTerminoAsociado());
             System.out.println("copia"+terminoTemp2Copia.getTerminoAsociado());
    
            }
        
        
        
           public void añadirNuevoTerminoDesdeRectificar(Termino termino) throws FileNotFoundException, IOException, ClassNotFoundException{
              // desde rectificar terminos estamos agregando una nueva palabra al diccionario con id relato y termino asociado al cual hay que añadirla
          //   List<Termino>[]  terminosTestsClone=(List<Termino>[])terminosAnalisis.getTerminosTest().clone();
              
          // ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Datos.obj"));
          //      salida.writeObject(terminosAnalisis.getTerminosTest());
          //      System.out.println(" se serializó");
                
                //recuperar los terminos // setearle el rut del examinado para obtenerlo
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Datos.obj"));
                List<Termino>[] terminosTestsClone = (List<Termino>[])entrada.readObject();
                System.out.println(" se deserializó");
                
                
            
      
                
              System.out.println("ela palabra a añadir es "+termino.getPalabra());
              System.out.println(" el id relato es"+termino.getIdLámina());
              System.out.println(" el nuevo Termino es  "+termino.getTerminoAsociado());
              
              String palabraAñadir=termino.getPalabra();
              int idRelato=termino.getIdLámina();
              String nuevoTermino=termino.getTerminoAsociado();
              int connotacion=termino.getConnotacion();
              
         
           if(!adminTerminos.existeTermino(adminTerminos.getTerm()[idRelato], termino.getTerminoAsociado())){      
             //verificar que no exista en la lista para añadirla si existe lanzar mensaje
              if(palabraAñadir.equals(nuevoTermino)){
                  
              //tener cuidado con el null en la lista
              TerminoLamina nuevo =new TerminoLamina(palabraAñadir, connotacion, new ArrayList());
                  this.adminTerminos.getTerm()[idRelato].add(nuevo);
               }else{
                  List<String> lista= new ArrayList<>();
                  lista.add(palabraAñadir);
                   TerminoLamina nuevo =new TerminoLamina(nuevoTermino, connotacion, lista);
                   this.adminTerminos.getTerm()[idRelato].add(nuevo);
                  
              }
              
               
                    System.out.println(" no existe el termino");
                }else{
                    
               
               System.out.println("el termino ya existe");
                 
                    //hay que devolverlo a su valor real y no al modificado.
                    
                    for (Termino terminoRecorrer:terminosTestsClone[termino.getIdLámina()]){
                        //rescatamos la coincidencia
                        if (terminoRecorrer.getPalabra().equals(termino.getPalabra())){
                            
                            terminoTemp2.setTerminoAsociado(terminoRecorrer.getTerminoAsociado());
                            //se cambió a su valor anterior
                            System.out.println("se cambió a su valor anterior"+terminoRecorrer.getPalabra());
                        }
                        
                    }
                    
                     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al añadir término! El término "+termino.getTerminoAsociado()+" ya existe", "")); 
                    
                    //terminoTemp2.setTerminoAsociado("mama");
                    
                }
           //    RequestContext rc = RequestContext.getCurrentInstance();
   // rc.execute("PF('dlgmodificar3').hide();");
              
          }
            
        
       
}
