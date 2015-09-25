/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CAT;


import Dao.CAT.UsuarioDao;
import Model.CAT.Usuario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;



/**
 *
 * @author jean
 */
@ManagedBean(name = "usuarioBean")
@ViewScoped

public class UsuarioBean {

    /**
     * Creates a new instance of UsuarioBean
     */
    
 
    Usuario usuario;
    List<Usuario> usuarios;
    List<Usuario> psicologos;
    List<Usuario> asistentes;
    String tipoUsuario;
    
    
    private final HttpServletRequest httpServletRequest;
    private final FacesContext faceContext;
   
    public UsuarioBean() {
        
        
          faceContext=FacesContext.getCurrentInstance();
        httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest();
        
        usuario = new Usuario();
       //  updateUsuarios();
         
    }

    
    public void insertar(){
    
      System.out.println("Usuario a insertar:" +usuario.getNombre());
    UsuarioDao linkDAO= new UsuarioDao();
    
    int insercion=linkDAO.insertarUsuario(usuario,tipoUsuario);

    if(insercion==1){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito al ingresar usuario.", "Se insertó el usuario.")); 
     
//el 8 lo asignamos arbitrariamente en el metodo insertar
        
    }else if(insercion==3){
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! El usuario ya existe en el sistema.", "El usuario ya Existe")); 
    }
    else{
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! Hubo un fallo al insertar el usuario.", "Hubo error al insertar el usuario")); 
    }
        usuario= new Usuario();
        updateUsuarios();
    //    System.out.println("nobmre: "+usuario.getNombre());
        
    }
    
    
  
    
    
    public void modificar(){
        
        System.out.println("a modificicar");
   
    UsuarioDao linkDAO= new UsuarioDao();
    
    if(usuario.getCorreo().length()==0||usuario.getNombre().length()==0){
     //   FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Complete los campos"));
       //quiere decir que esta vacio 
        
    }else{
      
       int modifica= linkDAO.modificarUsuario(usuario);
        if(modifica==1)
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito al editar el usuario!", "Se editó el usuario."));
       else
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! Hubo un fallo al tratar de editar el usuario, intentelo más tarde.", "Complete los campos"));  
       
       
       
        updateUsuarios();
        usuario= new Usuario();
     
    }
   
    }
    public void eliminar(){
        System.out.println("nombre usuario bean:" +usuario.getRut());
    UsuarioDao linkDAO= new UsuarioDao();
       int elimina= linkDAO.eliminarUsuario(usuario);
       
       if(elimina==1)
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Éxito al eliminar el usuario!", "Se eliminó el usuario."));
       else
         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error! Hubo un fallo al tratar de eliminar el usuario, intentelo más tarde.", "Complete los campos"));  
       
       updateUsuarios();
        usuario= new Usuario();
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        UsuarioDao dao=new UsuarioDao();
        if(dao.existePersona(usuario))
            System.out.println("yaa esta en la base de datos adios");
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
    //  UsuarioDao linkDAO= new UsuarioDao();
        if(usuarios==null)
         updateUsuarios();
      //  usuarios=linkDAO.mostrarUsuarios();
        
     //   return usuarios;
        return usuarios;
    }
        
    //este metodo constantemente actualiza la lista de usuarios
        public void updateUsuarios(){
            UsuarioDao linkDao =new UsuarioDao();
    this.usuarios = linkDao.mostrarUsuarios();
}
   
       
    public List<Usuario> getPsicologos() {
        
        UsuarioDao linkDAO= new UsuarioDao();
        usuarios=linkDAO.mostrarUsuarios2(tipoUsuario);
        return psicologos;
    }

    public void setPsicologos(List<Usuario> psicologos) {
        UsuarioDao linkDAO= new UsuarioDao();
        usuarios=linkDAO.mostrarUsuarios2(tipoUsuario);
        this.psicologos = psicologos;
    }

    public List<Usuario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Usuario> asistentes) {
        this.asistentes = asistentes;
    }


    public void setUsuarios(List<Usuario> usuarios) {
       
        this.usuarios = usuarios;
       
    }
 
     public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

   
    
  
    
}
