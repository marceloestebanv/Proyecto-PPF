/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CAT;

import Model.CAT.Termino;
import Model.CAT.TerminoLamina;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jean
 */
@ManagedBean(name = "modifTestBean")
@ViewScoped

public class ModifTestBean {

  
    List<Termino>[] listEliminTest;
    List<Termino>[] listModifTest;
    List<TerminoLamina>[] listModifDiccionario;
    
   
   
    
    /**
     * Creates a new instance of ModifTestBean
     */
    public ModifTestBean() {
    
        listEliminTest= new ArrayList[10];
        for (int i = 0; i < 10; i++) {
           if (listEliminTest[i]==null) {
              listEliminTest[i]=new ArrayList<>();
               
               
           }
               
               }
        
        listModifDiccionario= new ArrayList[10];
        listModifTest= new ArrayList[10];
        
    }

    public List<Termino>[] getListEliminTest() {
        return listEliminTest;
    }

    public void setListEliminTest(List<Termino>[] listEliminTest) {
        this.listEliminTest = listEliminTest;
    }

    public List<Termino>[] getListModifTest() {
        return listModifTest;
    }

    public void setListModifTest(List<Termino>[] listModifTest) {
        this.listModifTest = listModifTest;
    }

    public List<TerminoLamina>[] getListModifDiccionario() {
        return listModifDiccionario;
    }

    public void setListModifDiccionario(List<TerminoLamina>[] listModifDiccionario) {
        this.listModifDiccionario = listModifDiccionario;
    }
    
    
    
    public List<Termino> TermElimID(int idLamina){
        return listEliminTest[idLamina];
    }
    
}
