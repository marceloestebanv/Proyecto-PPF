/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CAT;


import Dao.CAT.UsuarioDao;
import Model.CAT.CausaIngresoExaminado;
import Model.CAT.Examinado;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jean
 */
@ManagedBean(name = "examinadoBean")
@ViewScoped
public class ExaminadoBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    
 
    Examinado examinado;
    List<Examinado> examinados;
    List<CausaIngresoExaminado> causasIngreso;
    
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
    
    
    
    public ExaminadoBean() {
        
        
        faceContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest();
        examinado = new Examinado();
    }

    
    public void insertar() throws ParseException{
        System.out.println("la fecha es "+examinado.getFechaNac()); 
    
        
      //  Date d = javax.xml.bind.DatatypeConverter.parseDateTime(examinado.getFechaNac()).getTime();
      
     SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.ENGLISH);
      Date date = (Date)formatter.parse(examinado.getFechaNac());
       
      
      SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        String fecha=format.format(date);
     
       
        
       
        
        
   
        System.out.println(" convertio" +fecha);
      examinado.setFechaNac(fecha);
      
    
    UsuarioDao linkDAO= new UsuarioDao();
     
    int insercion=linkDAO.insertarExaminado(examinado);
    
    if(insercion==1){
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito al ingresar el examinado.", "Se insertó el examinado.")); 
    }else if(insercion==3){
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! Este rut ya existe en el sistema.", "El rut ya Existe"));
    }   else{
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! Hubo un fallo al insertar el examinado.", "Hubo error al insertar el examinado")); 
    }    
    
        examinado= new Examinado();
        
        
    }
    public void modificar(){
    UsuarioDao linkDAO= new UsuarioDao();
     //   linkDAO.modificarExaminado(examinado);
     //   examinado= new Examinado();
    }
    public void eliminar(){
        System.out.println("nombre usuario bean:" +examinado.getRut());
    UsuarioDao linkDAO= new UsuarioDao();
   //     linkDAO.eliminarExaminado(examinado);
    //    usuario= new Examinado();
    }
    public Examinado getExaminado() {
        return examinado;
    }

    public void setUsuario(Examinado examinado) {
        this.examinado = examinado;
    }

    public List<Examinado> getExaminados() {
       UsuarioDao linkDAO= new UsuarioDao();
        examinados=linkDAO.mostrarExaminados();
        return examinados;
    }
    
      public List<Examinado> getExaminadosConTest() {
       UsuarioDao linkDAO= new UsuarioDao();
        examinados=linkDAO.mostrarExaminadosConTest();
        return examinados;
    }
    
    

    public void setExaminados(List<Examinado> examinados) {
        this.examinados = examinados;
    }

    public List<CausaIngresoExaminado> getCausasIngreso() {
        
         UsuarioDao linkDAO= new UsuarioDao();
        causasIngreso= linkDAO.getCausasIngreso();
        
        return causasIngreso;
    }

      public List<CausaIngresoExaminado> getCausasIngresoConTest() {
        
         UsuarioDao linkDAO= new UsuarioDao();
        causasIngreso= linkDAO.getCausasIngresoConTest();
        
        return causasIngreso;
    }
    
    public void setCausasIngreso(List<CausaIngresoExaminado> causasIngreso) {
        this.causasIngreso = causasIngreso;
    }
 
    
    
    
    
        public void redireccionar(String rutExaminado) throws IOException {
        
      
         FacesContext fc=FacesContext.getCurrentInstance();
         fc.getExternalContext().redirect("/Proyecto/faces/estadisticaExaminado.xhtml?rutExaminado="+rutExaminado);//redirecciona la página
        
    
}
        
    
        
        
}
