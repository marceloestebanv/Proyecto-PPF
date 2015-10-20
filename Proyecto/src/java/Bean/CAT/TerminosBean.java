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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import javax.servlet.ServletContext;
import org.apache.commons.collections.ListUtils;
import org.apache.poi.util.ArrayUtil;
import org.primefaces.context.RequestContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.util.ArrayUtils;

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
   
     @ManagedProperty("#{modifTestBean}")
    private ModifTestBean modifTestBean;
 
  
   
       //esto debe ir en un relatos bean
   private List<Termino>[] terminosTest;
   private int idRelato;
   
   private Termino terminoTemp;
   private Termino terminoTemp2;
    private Termino terminoTemp2Copia;
   
    private int relatoActual;
    
    
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
     
     public List<Termino> getTerminosRelatoSerializado(int idRelato) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        
        
          List<Termino>[] terminosTestLocal=deserializarTerminosTest();
        
        return terminosTestLocal[idRelato];
        
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
        
       // se setean como null y se calcularán de nuevo 
    //  modifTestBean.setListNuevosTermAsocDiccTest(null);
    //  modifTestBean.setListNuevosTermDiccTest(null);
      

      
   //calcularCambios me genera nuevas listas, hay que unirlas con la global
      
     // List<TerminoLamina>[] newList = new ArrayList[10];
    //  newList=modifTestBean.listNuevosTermAsocDicc;
    //CONCATENAR
    
      
        
         //guardamos el test
         
             UsuarioDao dao= new UsuarioDao();
          //aca debemos insertar en la bd el test y los relatos 
          // primero insertamos, luego seteamos el valor del idTest a analisis
             
             System.out.println("el test a ingresar es "+test.getIdTest());
       
             //acá hay que ver cuando se edita el test en la base de datos
             
             if(!dao.existeIdTest(test.getIdTest())){ 
                dao.insertarTest(terminosAnalisis.getRelatos(),terminosAnalisis.getRutExaminado(),terminosAnalisis.getRutUsuario()); 
                System.out.println("No existe el idTest así que se insertó");
      
              // si es el primer test el que se insertó
                if(terminosAnalisis.getIdTest()==1){
      
                    //No ocuparemos Analisis = analisis = new Analisis(); porque esto me lo crea de 0
                    //terminosAnalisis es una copia de Analisis.
                    terminosAnalisis.setIdTest(dao.getUltimoTest());
                    test.setIdTest(dao.getUltimoTest());
                    System.out.println(" el test =1 y se cambió a"+(dao.getUltimoTest())+1);
        }

             
             }else{
                    //si existe se actualizan los relatos
                    
                    dao.modificarRelatosTest(test.getIdTest(),terminosAnalisis.getRelatosEditar());
                    System.out.println("se modificaron los relatos");
                }
             
       
       
        
        
        
              
                   //serilizar el test
        //luego calcular las metricas
        
        serializarTest();
        //hay que serializar los terminos;
        
           
        
 
      
  //  estos no se debe guardar ya que se guardan antes
  //    adminTerminos.serializarTerminos();
        
        metricas.calcularMetricaTest(test.getIdTest());
       
            calcularCambiosDicc();
     
     //añade y serializa los terminos en diccionario
     añadirNuevosTerminosListaDicc();
     modifTestBean.unirListas();
     
        System.out.println("seteando listas no globales null");
     modifTestBean.setListNuevosTermAsocDicc(null);
     modifTestBean.setListNuevosTermDicc(null);
      
        
     
        modifTestBean.setListEliminTest(null);
        
       
       
         
        
        
        
       //Esto es importante ya que acá redireccionaremos una vez terminado el análisis 
        FacesContext fc=FacesContext.getCurrentInstance();
         fc.getExternalContext().redirect("/Proyecto/faces/CATPages/consultarResultadoAnalisis.xhtml?idTest="+test.getIdTest());//redirecciona la página
        
        
        
    }
    
    public void calcularCambiosDicc() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        System.out.println("calculando cambios");
        
     //   for (List<TerminoLamina> terminosLamina: adminTerminos.getTerm() ){
 //
   //     }
        
       
        List<TerminoLamina>[] termLaminasTemp=RI.deserializarTerminos();
        
         // recorreremos todos los cambios que se hicieron en el diccionario en admin terminos // los cuales no guardaremos
        // porque se guardaran una vez se contabilizen todos y no mientras se vayan añadiendo
        
        for (int i = 0; i < 10; i++) {
           
            for(Termino termino:terminosTest[i]){
 
                // si el termino no tiene termino asociado
                
               if (!termino.getTerminoAsociado().equals("-")){
                
                if(!adminTerminos.existeTermino(termLaminasTemp[i],termino.getTerminoAsociado())){
                    System.out.println(" el termino no existe en el diccionario" +termino.getPalabra()+ "termino asociado: "+termino.getTerminoAsociado());
                  // no existe el término en el diccionario, hay que añadirlo a la lista de términos
                   
                    if(!adminTerminos.existeTermino(modifTestBean.listNuevosTermDicc[i],termino.getTerminoAsociado())){
                    // si no existe en los nuevos terminos a añadir, lo añadimos a la lista 
                        System.out.println(" no existe el termino en la lista de nuevos terminos: "+termino.getPalabra()+" el termino asociado es: "+termino.getTerminoAsociado());
                    List termAsoc=new ArrayList();
                    
                    if(!termino.getTerminoAsociado().equals(termino.getPalabra())){
                        // si son distintos el termino y su asociado, se añade a la lista de asociados
                        termAsoc.add(termino.getPalabra());
                    }
                    
                    TerminoLamina nuevoTermLam= new TerminoLamina(termino.getTerminoAsociado(),termino.getConnotacion(), termAsoc);
                       modifTestBean.listNuevosTermDicc[i].add(nuevoTermLam);
                    }else{
                        System.out.println(" este termino ya se encontró en la lista de nuevos terminos: "+termino.getPalabra());
                        
                        System.out.println(" pasando a añadirlo a termino asociado");
                       // si ya existe en esta lista hay que añadirlo a termino asociado
                        modifTestBean.añadirTerminoAsocNuevoTerm(i, termino);
                        
                    }
                       
                }else{
                    // si el termino ya existe hay que añadirlo a terminos asociados
                    System.out.println(" el termino ya existe en el diccionario"+termino.getPalabra()+" asociado: "+termino.getTerminoAsociado());
                  for(TerminoLamina termiLami: termLaminasTemp[i]) {
                      if(termiLami.getTermino().equals(termino.getTerminoAsociado())&&(!termiLami.getTerminosAsociados().contains(termino.getPalabra()))){
                          
                                  
                                // si coinciden los terminos y no está el termino asociado ya en él se añadirá un nuevo objeto
                         if(!adminTerminos.existeTermino(modifTestBean.listNuevosTermAsocDicc[i],termino.getTerminoAsociado())){
                             System.out.println(" no existe el termino "+ termino.getPalabra()+" en la nueva lista de terminos existentes");
                             System.out.println("creamos el objeto");
                             List terminosAsocExist= new ArrayList();
                             
                              if(!termino.getTerminoAsociado().equals(termino.getPalabra())){
                        // si son distintos el termino y su asociado, se añade a la lista de asociados
                         terminosAsocExist.add(termino.getPalabra());
                    }
                             
                         
                          
                          TerminoLamina nuevoTermAsocExist = new TerminoLamina(termiLami.getTermino(),termiLami.getConnotacion(), terminosAsocExist);
                          modifTestBean.listNuevosTermAsocDicc[i].add(nuevoTermAsocExist);
                          
                         }else{
                             
                             System.out.println(" ya existe el termino "+termino.getPalabra() + "y termino asoc"+termino.getTerminoAsociado() +"en terminos asociados de terminos asoc");
                           // si ya existe en esta lista hay que añadirlo a termino asociado
                        modifTestBean.añadirTerminoAsocNuevoTerminAsoc(i, termino);   
                         }
                         
                         break;
                      }
                  } 
                    
                    
                    
                }
                
             } 
            }
            
            
            
        }
        
        
    }
    
    
    public void añadirNuevosTerminosListaDicc() throws IOException, FileNotFoundException, ClassNotFoundException {
      //primero los de la lista de nuevos términos
        
        System.out.println("añadiendo nuevos terminos en el diccionario");
        
   List<TerminoLamina>[] diccionario= RI.deserializarTerminos(); 
        
        //añadimos los nuevos términos
        for (int i = 0; i < 10; i++) {
            for(TerminoLamina termLamAñadir:modifTestBean.listNuevosTermDicc[i]){
                diccionario[i].add(termLamAñadir);
                System.out.println("    añadiendo nuevo termino al diccionario encontrado"+termLamAñadir.getTermino()+" y terminos asociados" +termLamAñadir.getTerminosAsociadosString());
                 }
    
            }
        
        //añadimos los términos asociados
        for (int i = 0; i < 10; i++) {
            for(TerminoLamina termLamAñadir:modifTestBean.listNuevosTermAsocDicc[i]){
                  for(TerminoLamina termLam:diccionario[i]){
                     if (termLam.getTermino().equals(termLamAñadir.getTermino())){
                         //añadir los términos asociados 
                    List<String> listaNueva =  ListUtils.union(termLamAñadir.getTerminosAsociados(),termLam.getTerminosAsociados());
                        termLam.setTerminosAsociados(listaNueva);
                        
                         System.out.println("añadiendo al diccionario terminosasoc"+termLamAñadir.getTerminosAsociadosString());

                     }

                  }

                 }
            }
        
        //terminado el proceso se serializan los términos que se modificaron
        adminTerminos.serializarTerminos(diccionario);
        System.out.println(" se serializaron nuevos terminos");
        System.out.println("finalizó añadir nuevos terminos");
        
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
        
        if(terminosTest[idLamina].size()!=1){
        //hay que borrar tambien los terminos del tesauro
        terminosTest[idLamina].remove(termino);
        
        
        //añadir a los terminos eliminados para ese test
        modifTestBean.listEliminTest[idLamina].add(termino);
        
        
        System.out.println(" se ha eliminado");
        //terminoTemp=new Termino();
        }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al eliminar el término! La cantidad de términos para el relato no puede ser 0.", ""));  
        }
       
    } catch (Exception e) {
        e.printStackTrace();
    }
}
       
       public void devolverTermino(Termino termino, int idLamina){
           //este método devuelve los términos a la lista y los quita de la lista de terminos eliminados
           
           for (Termino term: modifTestBean.listEliminTest[idLamina] ){
              
               if (term.equals(termino)){
                   terminosTest[idLamina].add(termino);
                   modifTestBean.listEliminTest[idLamina].remove(term);
                   
                        //ordenamos nuevamente la coleccion
           
            Comparator<Termino> ordenAlfabetico = new Comparator<Termino>(){
           @Override
           
          
           public int compare(Termino a, Termino b){
               return a.getPalabra().compareTo(b.getPalabra());
               
              
        }};
            
          Collections.sort(terminosTest[idLamina],ordenAlfabetico);
           
                   
                   
                   
                   return;
               }
               
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
        
        public void validarTerminoDesdeRectificar(Termino termino) throws IOException, FileNotFoundException, ClassNotFoundException{
            //Este metodo valida la entrada vacía o "-"
            if(((termino.getTerminoAsociado().length())==0 )||(termino.getTerminoAsociado().equals("-"))){
                System.out.println("termino invalido : vacio o '-'");
                //termino invalido es necesario que se vuelva al termino anterior
                 //recuperar los terminos // setearle el rut del examinado para obtenerlo
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Datos.obj"));
                List<Termino>[] terminosTestsClone = (List<Termino>[])entrada.readObject();
                System.out.println(" se deserializó");
                
                
                Termino terminoOriginal=new Termino();
               
                    //hay que devolverlo a su valor real y no al modificado.
                    
                    for (Termino terminoRecorrer:terminosTestsClone[termino.getIdLámina()]){
                        //rescatamos la coincidencia
                        if (terminoRecorrer.getPalabra().equals(termino.getPalabra())){
                            terminoOriginal=terminoRecorrer;
                            //se devuelve al valor anterior
                            terminoTemp2.setTerminoAsociado(terminoRecorrer.getTerminoAsociado());
                            break;
                         //   terminoTemp2.setTerminoAsociado(terminoRecorrer.getTerminoAsociado());
                            //se cambió a su valor anterior

                          //  System.out.println("se cambió a su valor anterior"+terminoRecorrer.getPalabra());
                        }
                        
                    }
                    
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al añadir término! El término es erróneo.", ""));
                
                
                
            }else{
               //terminoValido
                añadirNuevoTerminoDesdeRectificar(termino);
            }
            
            
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
                    
                //acá hay que actualizar todas las coincidencias de ese término en la tabla
                    actualizarTerminosTablaNuevoTermino(termino);
                    
                    
                     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito se añadió el termino ingresado al Diccionario", "")); 
                
           
           }else{
                    
               
               System.out.println("el termino ya existe");
          
               
             Termino terminoOriginal=new Termino();
               
                    //hay que devolverlo a su valor real y no al modificado.
                    
                    for (Termino terminoRecorrer:terminosTestsClone[termino.getIdLámina()]){
                        //rescatamos la coincidencia
                        if (terminoRecorrer.getPalabra().equals(termino.getPalabra())){
                            terminoOriginal=terminoRecorrer;
                            break;
                         //   terminoTemp2.setTerminoAsociado(terminoRecorrer.getTerminoAsociado());
                            //se cambió a su valor anterior

                          //  System.out.println("se cambió a su valor anterior"+terminoRecorrer.getPalabra());
                        }
                        
                    }
                    
                    //acá actualizamos todos los valores
                    
                     for (Termino term:terminosTest[idRelato]){
                  if (term.getPalabra().equals(terminoOriginal.getPalabra())){
                    term.setTerminoAsociado(terminoOriginal.getTerminoAsociado());
                    term.setConnotacion(terminoOriginal.getConnotacion());
                  }
                  
              }
                    
                     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al añadir término! Éste ya existe en el diccionario o es erróneo.", "")); 
                    
                    //terminoTemp2.setTerminoAsociado("mama");
                    
                }
           //    RequestContext rc = RequestContext.getCurrentInstance();
   // rc.execute("PF('dlgmodificar3').hide();");
              
          }
            
   
           public void actualizarTerminosTablaNuevoTermino(Termino termino){
               
                 System.out.println("ela palabra a añadir es "+termino.getPalabra());
              System.out.println(" el id relato es"+termino.getIdLámina());
              System.out.println(" el nuevo Termino es  "+termino.getTerminoAsociado());
              
              String palabraAñadir=termino.getPalabra();
              int idRelato=termino.getIdLámina();
              String nuevoTermino=termino.getTerminoAsociado();
              int connotacion=termino.getConnotacion();
              
              for (Termino term:terminosTest[idRelato]){
                  if (term.getPalabra().equals(termino.getPalabra())){
                    term.setTerminoAsociado(termino.getTerminoAsociado());
                    term.setConnotacion(termino.getConnotacion());
                  }
                  
              }
               
           }

    public ModifTestBean getModifTestBean() {
        return modifTestBean;
    }

    public void setModifTestBean(ModifTestBean modifTestBean) {
        this.modifTestBean = modifTestBean;
    }

    public int getRelatoActual() {
        return relatoActual;
    }

    public void setRelatoActual(int relatoActual) {
        this.relatoActual = relatoActual;
    }

  





 
           
           
           
       
}
