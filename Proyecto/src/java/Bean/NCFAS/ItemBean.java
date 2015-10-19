package Bean.NCFAS;


import Dao.NCFAS.IdDAO;
import Dao.NCFAS.ItemDao;
import Model.NCFAS.Item;
import Model.NCFAS.Ncfas;
import java.util.List;
import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



@ManagedBean 
@Named(value = "itembean")
@RequestScoped
@ViewScoped

public class ItemBean implements Serializable{
    
    private Item item;
    private Ncfas ncfas;
    private Integer[] valores;
    private Integer[] valoresID;
    private List<Item> items; 
    private int idamandar;
    private int idncfasEliminar;
    private String observacion;
    private int itemgeneral1;
    private int itemgeneral2;
    private int itemgeneral3;
    private int itemgeneral4;
    private int itemgeneral5;
    private int itemgeneral6;
    private int itemgeneral7;
    private int itemgeneral8;
    private Integer[] valoresGenerales;

    public int getItemgeneral1() {
        return itemgeneral1;
    }

    public void setItemgeneral1(int itemgeneral1) {
        this.itemgeneral1 = itemgeneral1;
    }

    public int getItemgeneral2() {
        return itemgeneral2;
    }

    public void setItemgeneral2(int itemgeneral2) {
        this.itemgeneral2 = itemgeneral2;
    }

    public int getItemgeneral3() {
        return itemgeneral3;
    }

    public void setItemgeneral3(int itemgeneral3) {
        this.itemgeneral3 = itemgeneral3;
    }

    public int getItemgeneral4() {
        return itemgeneral4;
    }

    public void setItemgeneral4(int itemgeneral4) {
        this.itemgeneral4 = itemgeneral4;
    }

    public int getItemgeneral5() {
        return itemgeneral5;
    }

    public void setItemgeneral5(int itemgeneral5) {
        this.itemgeneral5 = itemgeneral5;
    }

    public int getItemgeneral6() {
        return itemgeneral6;
    }

    public void setItemgeneral6(int itemgeneral6) {
        this.itemgeneral6 = itemgeneral6;
    }

    public int getItemgeneral7() {
        return itemgeneral7;
    }

    public void setItemgeneral7(int itemgeneral7) {
        this.itemgeneral7 = itemgeneral7;
    }

    public int getItemgeneral8() {
        return itemgeneral8;
    }

    public void setItemgeneral8(int itemgeneral8) {
        this.itemgeneral8 = itemgeneral8;
    }
    
    

    public int getIdncfasEliminar() {
        return idncfasEliminar;
    }

    public void setIdncfasEliminar(int idncfasEliminar) {
        this.idncfasEliminar = idncfasEliminar;
    }
    
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


    public int getIdamandar() {
        return idamandar;
    }

    public void setIdamandar(int idamandar) {
        this.idamandar = idamandar;
    }

    
    public Integer[] getValoresID() {
        return valoresID;
    }

    public void setValoresID(Integer[] valoresID) {
        this.valoresID = valoresID;
    }
    
    
    
    public Ncfas getNcfas() {
        return ncfas;
    }

    public void setNcfas(Ncfas ncfas) {
        this.ncfas = ncfas;
    }
       

    public Integer[] getValores() {
        return valores;
    }

    public void setValores(Integer[] valores) {
        this.valores = valores;
    }

    public ItemBean(Integer[] valores) {
        this.valores = valores;
    }

    public ItemBean(List<Item> items) {
        this.items = items;
    }
    

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    

    public ItemBean() {
        System.out.println("entramos al contructor");
        valores = new Integer[59];
        valoresID = new Integer[4];
        valoresGenerales = new Integer[9];

        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        Map params = externalContext.getRequestParameterMap();
        //Integer categorySelected = new Integer((String) params.get("username" ));
        
        for (int i = 1; i < valoresID.length; i++) {
            valoresID[i] = 0;
        }
        
        
        
        for (int i = 1; i < valores.length; i++) {
            valores[i] = 0;
        }
        /*itemgeneral1=0;
        itemgeneral2=0;
        itemgeneral3=0;
        itemgeneral4=0;
        itemgeneral5=0;
        itemgeneral6=0;
        itemgeneral7=0;
        itemgeneral8=0;*/
    }
  
/*public void eliminarNcfas() throws Exception{
    
        ItemDao dao;
        try {       
           dao = new ItemDao();
         
           dao.eliminarNcfas(idncfasEliminar);   
           
           } catch (Exception e) {
            throw e;}
       

}*/

    public void registrarEntorno() throws Exception {
        int bandera=0;
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[7],1);
         
        for (int i = 1; i<=7; i++) {
            System.out.println(valores[i]);
        
        try {       
           dao.actualizarItems1(valores[i],i);
           }
            catch (Exception e) {
            throw e;}
        }
}

    public void registrarCompetencias() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[15],2);
        for (int i = 8; i<=15; i++) {
            System.out.println(valores[i]);
        
        try {       
           
           
           dao.actualizarItems2(valores[i],i);
           }
            catch (Exception e) {
            throw e;}
        }
}
    public void registrarInteracciones() throws Exception {
      
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[23],3);
        
        for (int i = 16; i<=23; i++) {
            System.out.println(valores[i]);
        
        try {       
           
           
           dao.actualizarItems3(valores[i],i);
           
           } catch (Exception e) {
            throw e;}
        }
}
    public void registrarSeguridad() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[31],4);
        
        for (int i = 24; i<=31; i++) {
            System.out.println(valores[i]);  
            
        try { 
            dao.actualizarItems4(valores[i],i);
           } catch (Exception e) {
            throw e;}
        }
}
    public void registrarBienestar() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[38],5);
        
        for (int i = 32; i<=38; i++) {
            System.out.println(valores[i]);
        
        try {       
           
           
           dao.actualizarItems5(valores[i],i);
           
           } catch (Exception e) {
            throw e;}
        }
}
    public void registrarVidaSocial() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[44],6);
        for (int i = 39; i<=44; i++) {
            System.out.println(valores[i]);
        
        try {       
           
           
           dao.actualizarItems6(valores[i],i);
           }
            catch (Exception e) {
            throw e;}
        }
}
    public void registrarAutonomia() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[50],7);
        for (int i = 45; i<=50; i++) {
            System.out.println(valores[i]);
        try {       
           dao.actualizarItems7(valores[i],i);
           
           } catch (Exception e) {
            throw e;}
        }
}
    public void registrarSalud() throws Exception {
        
        ItemDao dao;
        dao = new ItemDao();
        guardarItemsGenerales(valores[58],8);
        dao.insertarEnArff(itemgeneral1,itemgeneral2,itemgeneral3,itemgeneral4,itemgeneral5,itemgeneral6,itemgeneral7,itemgeneral8);
           System.out.println(itemgeneral1 + itemgeneral3 +  itemgeneral4 + itemgeneral6 +itemgeneral8);
        
        for (int i = 51; i<=58; i++) {
            System.out.println(valores[i]);
        try {       
           dao.actualizarItems8(valores[i],i);  
           } catch (Exception e) {
            throw e;}
        }
}
    
public void registrarObservacion() throws Exception {
        int bandera=0;
       
            
        ItemDao dao;
        try {       
           dao = new ItemDao();
           
           dao.actualizarObs(observacion);   
           
           } catch (Exception e) {
            throw e;}
        
}    

public void obtenerUltimoid() throws Exception {
    
    ItemDao dao;
    dao= new ItemDao();
    try { 
        dao.obtenerIdNcfas();
    }catch(Exception e){
        
        throw e;
    }}

public void mostrarID(int idncfas) throws Exception{

    System.out.println("estamos guarando el id de este ncfas ->"+idncfas);
    IdDAO iddao = new IdDAO();
    iddao.guardarID(idncfas);
}

public void guardarItemsGenerales(int itemgeneral,int dim){
    
    valoresGenerales[dim]=itemgeneral;

    
    if(valoresGenerales[1]!=null){
    System.out.println(valoresGenerales[1]);
    }
    if(valoresGenerales[2]!=null){
    System.out.println(valoresGenerales[2]);
    }
    if(valoresGenerales[3]!=null){
    System.out.println(valoresGenerales[3]);
    }
    if(valoresGenerales[4]!=null){
    System.out.println(valoresGenerales[4]);
    }
    if(valoresGenerales[5]!=null){
    System.out.println(valoresGenerales[5]);
    }
    if(valoresGenerales[6]!=null){
    System.out.println(valoresGenerales[6]);
    }
    if(valoresGenerales[7]!=null){
    System.out.println(valoresGenerales[7]);
    }
    if(valoresGenerales[8]!=null){
    System.out.println(valoresGenerales[8]);
    }
    
}
   





}
    
    
    /*public void mostrarItems() throws Exception {
    ItemDao dao;
    
        try {
          dao = new ItemDao();
          items = dao.mostrItems();
        } catch (Exception e) {
            throw e;
        }
    }
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
    
}*/
