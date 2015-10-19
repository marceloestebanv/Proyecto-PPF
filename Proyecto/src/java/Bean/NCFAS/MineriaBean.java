/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.NCFAS;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import Dao.NCFAS.PruebaWekaDao;
import Dao.NCFAS.PruebaWekaDaoDim3;
import Model.NCFAS.reglasEncontradas;
import java.util.ArrayList;
import java.util.List;


@ManagedBean 
@Named(value = "mineriabean")
@RequestScoped
@ViewScoped


public class MineriaBean implements Serializable {
    
    
     
    
    List<reglasEncontradas> reglasEncontradas;
    List<reglasEncontradas> reglasEncontradasDim3;

    public List<reglasEncontradas> getReglasEncontradasDim3() {
        return reglasEncontradasDim3;
    }

    public void setReglasEncontradasDim3(List<reglasEncontradas> reglasEncontradasDim3) {
        this.reglasEncontradasDim3 = reglasEncontradasDim3;
    }
    
    

    public List<reglasEncontradas> getReglasEncontradas() {
        return reglasEncontradas;
    }

    public void setReglasEncontradas(List<reglasEncontradas> reglasEncontradas) {
        this.reglasEncontradas = reglasEncontradas;
    }
    
    public MineriaBean(){
    }
    
    public List<reglasEncontradas> obtenerNum() throws Exception{
        //CREO LA COMUNICACIÓN CON PRUEBAWEKADAO
    PruebaWekaDao dao;
    dao = new PruebaWekaDao();
    //OBTENGO LAS REGLAS
    reglasEncontradas=dao.retornarReglas();
    //LAS ENVÍO A PANTALLA
    return reglasEncontradas;
    }
    
   public List<reglasEncontradas> obtenerDim3() throws Exception{
        //CREO LA COMUNICACIÓN CON PRUEBAWEKADAO
    PruebaWekaDaoDim3 dao;
    dao = new PruebaWekaDaoDim3();
    //OBTENGO LAS REGLAS
    reglasEncontradasDim3=dao.retornarReglasDim3();
    //LAS ENVÍO A PANTALLA
    return reglasEncontradasDim3;
    }
    
    
    
        
    
    
}
