/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CAT;

import Model.CAT.Termino;
import Model.CAT.TerminoLamina;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.apache.commons.collections.ListUtils;

/**
 *
 * @author jean
 */
@ManagedBean(name = "modifTestBean")
@SessionScoped

public class ModifTestBean {

    List<Termino>[] listEliminTest;
    List<Termino>[] listModifTest;
    List<TerminoLamina>[] listNuevosTermAsocDicc;
    List<TerminoLamina>[] listNuevosTermDicc;

    List<TerminoLamina>[] listNuevosTermAsocDiccGlobal;
    List<TerminoLamina>[] listNuevosTermDiccGlobal;

    /**
     * Creates a new instance of ModifTestBean
     */
    public ModifTestBean() {

        listEliminTest = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            if (listEliminTest[i] == null) {
                listEliminTest[i] = new ArrayList<>();

            }

        }

        listNuevosTermAsocDicc = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            if (listNuevosTermAsocDicc[i] == null) {
                listNuevosTermAsocDicc[i] = new ArrayList<>();

            }

        }

        listNuevosTermDicc = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            if (listNuevosTermDicc[i] == null) {
                listNuevosTermDicc[i] = new ArrayList<>();

            }

        }

        listModifTest = new ArrayList[10];

        listNuevosTermDiccGlobal = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            if (listNuevosTermDiccGlobal[i] == null) {
                listNuevosTermDiccGlobal[i] = new ArrayList<>();

            }

        }

        listNuevosTermAsocDiccGlobal = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            if (listNuevosTermAsocDiccGlobal[i] == null) {
                listNuevosTermAsocDiccGlobal[i] = new ArrayList<>();

            }

        }

    }

    public void añadirTerminoAsocNuevoTerm(int idLam, Termino term) {

        for (TerminoLamina termLam : listNuevosTermDicc[idLam]) {
            if (termLam.getTermino().equals(term.getTerminoAsociado()) &&(!termLam.getTerminosAsociados().contains(term.getPalabra()))) {
                termLam.getTerminosAsociados().add(term.getPalabra());
            
            System.out.println("se añadio un termino asociado a " + termLam.getTermino());
            }
            
        }

    }
    
    public void añadirTerminoAsocNuevoTerminAsoc(int idLam, Termino term) {

        for (TerminoLamina termLam : listNuevosTermAsocDicc[idLam]) {
            if (termLam.getTermino().equals(term.getTerminoAsociado()) &&(!termLam.getTerminosAsociados().contains(term.getPalabra()))) {
                termLam.getTerminosAsociados().add(term.getPalabra());
            
            System.out.println("se añadio un termino asociado a " + termLam.getTermino());
            }
            
        }

    }

  

    public void removeNuevosTerminos(TerminoLamina termino, int idLamina) {
        try {

        //System.out.println(" se quiere eliminar de la lista de terminos ");
            //System.out.println("termino "+termino.getTermino());
            //System.out.println("id de la lamina" + idLamina);
            //hay que borrar tambien los terminos del tesauro
            listNuevosTermDicc[idLamina].remove(termino);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito! El término Aceptado", "El término fue Aceptado "));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeNuevosTermAsoc(TerminoLamina termino, int idLamina) {
        try {

        //System.out.println(" se quiere eliminar de la lista de terminos ");
            //System.out.println("termino "+termino.getTermino());
            //System.out.println("id de la lamina" + idLamina);
            //hay que borrar tambien los terminos del tesauro
            listNuevosTermAsocDicc[idLamina].remove(termino);

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito! El término Aceptado", "El término fue Aceptado "));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void unirListas() throws IOException, FileNotFoundException, ClassNotFoundException{
        
        System.out.println(" ingresando unir listas");
              ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
           String pathTermNuevos=(String) servletContext.getRealPath("/")+"/Terminos/NuevosTermDiccGlobal.obj"; 
           String pathTermNuevosAsoc=(String) servletContext.getRealPath("/")+"/Terminos/NuevosTermAsocDiccGlobal.obj"; 
          File f = new File(pathTermNuevos);
          File e= new File(pathTermNuevosAsoc);
       // if(f.exists() && !f.isDirectory()) { 

        if(f.exists()&& e.exists() ) { 
            
            System.out.println(" la lista de cambios ya existe por lo que se deserializarán");
        listNuevosTermAsocDiccGlobal=deserializarNuevosTermAsocDiccGlobal();
        listNuevosTermDiccGlobal=deserializarlistNuevosTermDiccGlobal();
        
        }
        
         List<TerminoLamina>[] terminosTempGlobal= new ArrayList[10];
        System.out.println("comenzando union de listas asoc");
         for (int i = 0; i < 10; i++) {
             System.out.println("union "+i);
            List<TerminoLamina> terminosTemp=  ListUtils.union(listNuevosTermAsocDicc[i],listNuevosTermAsocDiccGlobal[i]);     
        terminosTempGlobal[i]=terminosTemp;
   
        }
        System.out.println("comenzando union de listas nuevos terminos");
         List<TerminoLamina>[] terminosTempGlobal2= new ArrayList[10];
        for (int i = 0; i < 10; i++) {
             System.out.println("union "+i);
        List<TerminoLamina> terminosTemp2=  ListUtils.union(listNuevosTermDicc[i],listNuevosTermDiccGlobal[i]);     
        terminosTempGlobal2[i]=terminosTemp2;
   
        }
         listNuevosTermAsocDiccGlobal=terminosTempGlobal;
         listNuevosTermDiccGlobal=terminosTempGlobal2;
    
        //serializamos los cambios en las listas del diccionario
        serializarListasCambiosDiccionario();
        System.out.println(" se serializaron las listas globales de cambios en diccionario");
        
        
}

    public List<Termino>[] getListEliminTest() {

        return listEliminTest;
    }

    public void setListEliminTest(List<Termino>[] listEliminTest) {

        if (listEliminTest == null) {
            listEliminTest = new ArrayList[10];

            for (int i = 0; i < 10; i++) {
                if (listEliminTest[i] == null) {
                    listEliminTest[i] = new ArrayList<>();

                }

            }
        }

        this.listEliminTest = listEliminTest;
    }

    public List<Termino>[] getListModifTest() {
        return listModifTest;
    }

    public void setListModifTest(List<Termino>[] listModifTest) {
        this.listModifTest = listModifTest;
    }

    public List<Termino> TermElimID(int idLamina) {
        return listEliminTest[idLamina];
    }

    public List<TerminoLamina>[] getListNuevosTermAsocDicc() {
        return listNuevosTermAsocDicc;
    }

    public void setListNuevosTermAsocDicc(List<TerminoLamina>[] listNuevosTermAsocDicc) {
        this.listNuevosTermAsocDicc = listNuevosTermAsocDicc;
    }

    public List<TerminoLamina>[] getListNuevosTermDicc() {
        return listNuevosTermDicc;
    }

    public void setListNuevosTermDicc(List<TerminoLamina>[] listNuevosTermDicc) {
        this.listNuevosTermDicc = listNuevosTermDicc;
    }

    public List<TerminoLamina>[] getListNuevosTermAsocDiccGlobal() {
        return listNuevosTermAsocDiccGlobal;
    }

    public void setListNuevosTermAsocDiccGlobal(List<TerminoLamina>[] listNuevosTermAsocDiccGlobal) {

        if (listNuevosTermAsocDiccGlobal == null) {
            this.listNuevosTermAsocDiccGlobal = new ArrayList[10];

            for (int i = 0; i < 10; i++) {
                if (this.listNuevosTermAsocDiccGlobal[i] == null) {
                    this.listNuevosTermAsocDiccGlobal[i] = new ArrayList<>();

                }

            }
        }

        this.listNuevosTermAsocDiccGlobal = listNuevosTermAsocDiccGlobal;
    }

    public List<TerminoLamina>[] getListNuevosTermDiccGlobal() throws IOException, FileNotFoundException, ClassNotFoundException {
       
        return listNuevosTermDiccGlobal;
    }

    public void setListNuevosTermDiccGlobal(List<TerminoLamina>[] listNuevosTermDiccGlobal) {

        if (listNuevosTermDiccGlobal == null) {
            this.listNuevosTermDiccGlobal = new ArrayList[10];

            for (int i = 0; i < 10; i++) {
                if (this.listNuevosTermDiccGlobal[i] == null) {
                    this.listNuevosTermDiccGlobal[i] = new ArrayList<>();

                }

            }
        }

        this.listNuevosTermDiccGlobal = listNuevosTermDiccGlobal;
    }
    
    
    
    public void serializarListasCambiosDiccionario() throws FileNotFoundException, IOException{
        System.out.println(" entrando a serializar listas cambios diccionario");
  //serialización
          ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String realPath=(String) servletContext.getRealPath("/"); // Sustituye "/" por el directorio ej: "/upload"
          
          
          //serialización
            try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(realPath+"/Terminos/NuevosTermAsocDiccGlobal.obj"))) {
                salida.writeObject(listNuevosTermAsocDiccGlobal);
               // RecuperacionInformacion.setListaTerminosLaminas2(term);
                System.out.println(" se serializó lista de  nuevos terminos asoc Global");
               
               
            } 
            
             try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(realPath+"/Terminos/NuevosTermDiccGlobal.obj"))) {
                salida.writeObject(listNuevosTermDiccGlobal);
               // RecuperacionInformacion.setListaTerminosLaminas2(term);
                System.out.println(" se serializó nuevos terminos global dicc");
               
               
            } 
            System.out.println(" saliendo serializar listas cambios diccionario");
       }
    
    
            public  List<TerminoLamina>[] deserializarNuevosTermAsocDiccGlobal() throws FileNotFoundException, IOException, ClassNotFoundException{
          
                List<TerminoLamina>[] term;
                
           ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String realPath=(String) servletContext.getRealPath("/"); // Sustituye "/" por el directorio ej: "/upload"
          
         
           //recuperar los terminos // setearle el rut del examinado para obtenerlo
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(realPath+"/Terminos/NuevosTermAsocDiccGlobal.obj"));
                term=(List<TerminoLamina>[])entrada.readObject();
                
                return term;
       }
            
            
                      public List<TerminoLamina>[] deserializarlistNuevosTermDiccGlobal() throws FileNotFoundException, IOException, ClassNotFoundException{
          
                List<TerminoLamina>[] term;
                
           ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
 String realPath=(String) servletContext.getRealPath("/"); // Sustituye "/" por el directorio ej: "/upload"
          
         
           //recuperar los terminos // setearle el rut del examinado para obtenerlo
                ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(realPath+"/Terminos/NuevosTermDiccGlobal.obj"));
                term=(List<TerminoLamina>[])entrada.readObject();
                
                return term;
       }


}
