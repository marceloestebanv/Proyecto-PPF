package Bean.NCFAS;

import Bean.CAT.LoginControlador;
import Dao.NCFAS.ItemDao;
import Dao.NCFAS.NcfasDAO;
import java.util.List;
import Model.NCFAS.Ncfas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;




@ManagedBean 
@Named(value = "ncfasbean")
@SessionScoped
@RequestScoped


public class NcfasBean {
    
    
    List<Ncfas> ncfases;
    List<Ncfas> ncfases2;
    Ncfas ncfas;
    private String rutUsuario;
    private String nombrefamilia;
    private int parteproceso;
    public int id=40;
    private Date date1;
    private Date date2;
    private Integer[] valores;
   private int idRazonIngreso;
   
   
   
   
   
  
    
    
   
    
     public NcfasBean() {
         
    System.out.println("entramos al contructor del NCFAS");
    FacesContext facesContext = FacesContext.getCurrentInstance();
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    ExternalContext externalContext = facesContext.getExternalContext();
    Map params = externalContext.getRequestParameterMap();
        
        valores = new Integer[59];
        for (int i = 1; i < valores.length; i++) {
            valores[i] = 0;
        }
    }
     
      public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
    
    
    
    public Ncfas getNcfas() {
        return ncfas;
    }

    public void setNcfas(Ncfas ncfas) {
        this.ncfas = ncfas;
    }

    
    public List<Ncfas> getNcfases() {
        return ncfases;
    }

    public void setNcfases(List<Ncfas> ncfases) {
        this.ncfases = ncfases;
    }


    public int getId() {
        return id;
    }

    public void setIdncfas(int id) {
        this.id = id;
    }


    public String getNombrefamilia() {
        return nombrefamilia;
    }

    public void setNombrefamilia(String nombrefamilia) {
        this.nombrefamilia = nombrefamilia;
    }

    public int getParteproceso() {
        return parteproceso;
    }

    public void setParteproceso(int parteproceso) {
        this.parteproceso = parteproceso;
    }

    public List<Ncfas> getNcfases2() {
        return ncfases2;
    }

    public void setNcfases2(List<Ncfas> ncfases2) {
        this.ncfases2 = ncfases2;
    }

    public int getIdRazonIngreso() {
        return idRazonIngreso;
    }

    public void setIdRazonIngreso(int idRazonIngreso) {
        this.idRazonIngreso = idRazonIngreso;
    }    

    public void registrarNcfas() throws Exception {
    NcfasDAO dao;
    FacesContext contex = FacesContext.getCurrentInstance();  
        System.out.println(nombrefamilia);
        System.out.println(parteproceso);        
        LoginControlador User = new LoginControlador();
        rutUsuario=User.getUsuario().getRut();
        System.out.println(rutUsuario); 
    try {
        
            ItemDao daoitems;
           daoitems = new ItemDao(); 
            dao = new NcfasDAO();
           dao.ingresarNcafas(nombrefamilia,parteproceso,rutUsuario,idRazonIngreso);

        for (int i = 1; i<=7; i++) {
            //System.out.println(valores[i]);
         
           daoitems.ingresarItems1(valores[i]);   
           
           
        }
        
        for (int i = 8; i<=15; i++) {
            //System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems2(valores[i]);   
           
           
        }
       
        for (int i = 16; i<=23; i++) {
            
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems3(valores[i]);   
           
           
        }
        
        for (int i = 24; i<=31; i++) {
           // System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems4(valores[i]);   
           
           
        }
        
        for (int i = 32; i<=38; i++) {
           // System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems5(valores[i]);   
           
           
        }
        
        for (int i = 39; i<=44; i++) {
           // System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
          
               
           daoitems.ingresarItems6(valores[i]);   
           
           
        }
       
        for (int i = 45; i<=50; i++) {
            //System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems7(valores[i]);   
           
           
        }
        
       
        for (int i = 51; i<=58; i++) {
          //  System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems8(valores[i]);   
           
           
        }
           contex.getExternalContext().redirect("/Proyecto/faces/NCFASPages/nuevositemsncfas_1.xhtml");
        } catch (Exception e) {
            throw e;
        }
}
    
    public void registrarNcfasFinal() throws Exception {

          
    NcfasDAO dao;
    FacesContext contex = FacesContext.getCurrentInstance();  
        System.out.println(nombrefamilia);
        System.out.println(parteproceso);        
        LoginControlador User = new LoginControlador();
        rutUsuario=User.getUsuario().getRut();
        System.out.println(rutUsuario); 
    try {
            ItemDao daoitems;
            dao = new NcfasDAO();
           dao.ingresarNcafas(nombrefamilia,3,rutUsuario,idRazonIngreso);
           
           
        for (int i = 1; i<=7; i++) {
            System.out.println(valores[i]);
        
            
           daoitems = new ItemDao();
           
               
           daoitems.ingresarItems1(valores[i]);   
           
           
        }
    
        for (int i = 8; i<=15; i++) {
            System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
           daoitems.ingresarItems2(valores[i]);   
           
           
        }
        
        for (int i = 16; i<=23; i++) {
            System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
           daoitems.ingresarItems3(valores[i]);   
           
           
        }
       
        for (int i = 24; i<=31; i++) {
            System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
             
           daoitems.ingresarItems4(valores[i]);   
           
           
        }
        //bandera=0;
        for (int i = 32; i<=38; i++) {
            System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
              
           daoitems.ingresarItems5(valores[i]);   
           
           
        }
        //bandera=0;
        for (int i = 39; i<=44; i++) {
            System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
             
           daoitems.ingresarItems6(valores[i]);   
           
           
        }
        //bandera=0;
        for (int i = 45; i<=50; i++) {
            System.out.println(valores[i]);
        //ItemDao daoitems;
            
           daoitems = new ItemDao();
           
              
           daoitems.ingresarItems7(valores[i]);   
           
           
        }
        
        //bandera=0;
        for (int i = 51; i<=58; i++) {
            System.out.println(valores[i]);
       // ItemDao daoitems;
            
           daoitems = new ItemDao();
           
              
           daoitems.ingresarItems8(valores[i]);   
           
           
        }
           contex.getExternalContext().redirect("/Proyecto/faces/NCFASPages/newNcfasFinal.xhtml");
        } catch (Exception e) {
            throw e;
        }
}

public void modificar(){
    NcfasDAO linkDAO= new NcfasDAO();
        linkDAO.modificarNcfas(ncfas);
        ncfas= new Ncfas();
}
    
public void eliminar(){
        System.out.println("nombre familia:" +ncfas.getNombrefamilia());
    NcfasDAO linkDAO= new NcfasDAO();
        linkDAO.eliminarNcfas(ncfas);
        ncfas= new Ncfas();
}
/*    public void mostrarNcfases() throws Exception {
    NcfasDAO dao;
    
        try {
          dao = new NcfasDAO();
          ncfases = dao.mostrarListNcfas();
        } catch (Exception e) {
            throw e;
        }
    }*/
    /*public  void  () throws Exception{
        /*try {
        NcfasDAO linkDAO= new NcfasDAO();
        ncfases=linkDAO.mostrarNcfas();
        } catch (Exception e) {
        }
    return ncfases;
        
    }
    
     
        NcfasDAO dao;
    
        try {
            dao = new NcfasDAO();
            ncfases = dao.mostrarNcfas();
        } catch (Exception e) {
            throw e;
        }
    
}
    public void leerID(Ncfas ncfas){
    
        int idncfas=0;
        idncfas=ncfas.getIdncfas();
        NcfasDAO linkDAO= new NcfasDAO();
        linkDAO.leerIdncfas();
        return ncfases;
    }*/
 public void outcome() throws Exception{
        FacesContext contex = FacesContext.getCurrentInstance();
        try{
           // ChartView algo = new ChartView();
            //algo.createLineModels1(id);
            contex.getExternalContext().redirect("/Proyecto/faces/NCFASPages/result.xhtml");
	}catch(Exception e){
            throw e;
        }
    }   
 
  public void outcome2() throws Exception{
        FacesContext contex = FacesContext.getCurrentInstance();
        try{
           // ChartView algo = new ChartView();
            //algo.createLineModels1(id);
            contex.getExternalContext().redirect("/Proyecto/faces/NCFASPages/graficosMineria.xhtml");
	}catch(Exception e){
            throw e;
        }
    }  

 
    public List<Ncfas> listarNcfas() throws Exception {
       NcfasDAO linkDAO= new NcfasDAO();
        ncfases=linkDAO.mostrarNcfases();
        return ncfases;
    }
    
    public List<Ncfas> listarNcfasporinicial() throws Exception {
       NcfasDAO linkDAO= new NcfasDAO();
        ncfases=linkDAO.mostrarNcfasesIniciales();
        return ncfases;
    }
    
    public List<Ncfas> listarNcfasporfinal() throws Exception {
       NcfasDAO linkDAO= new NcfasDAO();
        ncfases=linkDAO.mostrarNcfasesFinales();
        return ncfases;
    }
    
    public List<Ncfas> listarNcfasfechas() throws Exception {
       NcfasDAO linkDAO= new NcfasDAO();
        ncfases=linkDAO.mostrarNcfasesporFechas(date1,date2);
        return ncfases;
    }
    
     public List<Ncfas> listarNcfasInicialYFinal() throws Exception {
       int n;
       List<Ncfas> listaTemp;
       List<Ncfas> listaCompleta;
       listaCompleta = new ArrayList();
       Ncfas tempNcfas;
       NcfasDAO linkDAO= new NcfasDAO();
       //OBTENEMOS TODOS LOS NCFAS FINALES DE LA BASE DE DATOS
       ncfases=linkDAO.mostrarNcfasesFinales();
       // CREAMOS UNA VARIABLE ENTERO CON EL DOBLE DE LOS NCFAS FINALES OBTENIDOS
       n=ncfases.size()*2;
       
       
        NcfasDAO linkDAO2= new NcfasDAO();
        listaTemp = new ArrayList();
       //OBTENEMOS LOS NCFAS INICIALES A PARTIR DE LOS NCFAS FINALES OBTENIDOS 
        for(Ncfas ncfas: ncfases){
            tempNcfas = new Ncfas();
            tempNcfas=linkDAO2.obtenerNcfasporNombreFamilia(ncfas.getNombrefamilia());
            listaTemp.add(tempNcfas);
        }
        
        //LLENAMOS UNA LISTA CON LOS NCFAS FINALES Y LOS NCFAS INICIALES
        for(Ncfas ncfas: ncfases){
            listaCompleta.add(ncfas);
        }
        for(Ncfas ncfas: listaTemp){
            listaCompleta.add(ncfas);
        }
        return listaCompleta;
    }
     
    
    
}
