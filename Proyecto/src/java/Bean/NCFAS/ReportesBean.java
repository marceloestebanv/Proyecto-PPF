/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.NCFAS;

import Dao.NCFAS.PruebaWekaDao;
import Model.NCFAS.NcfasReport;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRAbstractBeanDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@ManagedBean 
@Named(value = "reportesbean")
@SessionScoped
@RequestScoped

public class ReportesBean implements Serializable {
    
    
    
    
    
     public void reporNcfasPDF() throws JRException, IOException, Exception{
        
     Integer[] valores1;
     Integer[] valores2;
     Integer[] valores3;
     Integer[] valores4;
     Integer[] valores5;
     Integer[] valores6;
     Integer[] valores7;
     Integer[] valores8;
            
     
     ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
      String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; 

        
    ListarItemsBean beanItems;
    beanItems= new ListarItemsBean();
    
    String nombrefamilia = beanItems.getNombrefamilia();
    String rutUuario =beanItems.getRutUsuario();
    Date fechaIngreso =beanItems.getFechaIngreso();
    int parteproceso = beanItems.getParteProceso();
    String parteProceso="";
    
    if(parteproceso!=-1){
    parteproceso = (int)parteproceso;
        switch(parteproceso){
            case 1:
                parteProceso="Inicial";
                break;
            case 2:
                parteProceso="Porceso";
                break;
            case 3:
                parteProceso="Final";
                break;
        }
    }
    
    valores1=beanItems.getValores1();
    valores2=beanItems.getValores2();
    valores3=beanItems.getValores3();
    valores4=beanItems.getValores4();
    valores5=beanItems.getValores5();
    valores6=beanItems.getValores6();
    valores7=beanItems.getValores7();
    valores8=beanItems.getValores8();
    
   
    
    Map<String,Object> parametros= new HashMap<>();        
    parametros.put("parameter1",valores1[1]);
    parametros.put("parameter2",valores1[2]);
    parametros.put("parameter3",valores1[3]);
    parametros.put("parameter4",valores1[4]);
    parametros.put("parameter5",valores1[5]);
    parametros.put("parameter6",valores1[6]);
    parametros.put("parameter7",valores1[7]);
    
    parametros.put("parameter8",valores2[1]);
    parametros.put("parameter9",valores2[2]);
    parametros.put("parameter10",valores2[3]);
    parametros.put("parameter11",valores2[4]);
    parametros.put("parameter12",valores2[5]);
    parametros.put("parameter13",valores2[6]);
    parametros.put("parameter14",valores2[7]);
    parametros.put("parameter15",valores2[8]);
    
    parametros.put("parameter16",valores3[1]);
    parametros.put("parameter17",valores3[2]);
    parametros.put("parameter18",valores3[3]);
    parametros.put("parameter19",valores3[4]);
    parametros.put("parameter20",valores3[5]);
    parametros.put("parameter21",valores3[6]);
    parametros.put("parameter22",valores3[7]);
    parametros.put("parameter23",valores3[8]);
    
    parametros.put("parameter24",valores4[1]);
    parametros.put("parameter25",valores4[2]);
    parametros.put("parameter26",valores4[3]);
    parametros.put("parameter27",valores4[4]);
    parametros.put("parameter28",valores4[5]);
    parametros.put("parameter29",valores4[6]);
    parametros.put("parameter30",valores4[7]);
    parametros.put("parameter31",valores4[8]);
    
    parametros.put("parameter32",valores5[1]);
    parametros.put("parameter33",valores5[2]);
    parametros.put("parameter34",valores5[3]);
    parametros.put("parameter35",valores5[4]);
    parametros.put("parameter36",valores5[5]);
    parametros.put("parameter37",valores5[6]);
    parametros.put("parameter38",valores5[7]);
   
   
    parametros.put("parameter39",valores6[1]);
    parametros.put("parameter40",valores6[2]);
    parametros.put("parameter41",valores6[3]);
    parametros.put("parameter42",valores6[4]);
    parametros.put("parameter43",valores6[5]);
    parametros.put("parameter44",valores6[6]);
    
    
    
    parametros.put("parameter45",valores7[1]);
    parametros.put("parameter46",valores7[2]);
    parametros.put("parameter47",valores7[3]);
    parametros.put("parameter48",valores7[4]);
    parametros.put("parameter49",valores7[5]);
    parametros.put("parameter50",valores7[6]);
    
    
    parametros.put("parameter51",valores8[1]);
    parametros.put("parameter52",valores8[2]);
    parametros.put("parameter53",valores8[3]);
    parametros.put("parameter54",valores8[4]);
    parametros.put("parameter55",valores8[5]);
    parametros.put("parameter56",valores8[6]);
    parametros.put("parameter57",valores8[7]);
    parametros.put("parameter58",valores8[8]);
    
    parametros.put("nombreFamilia",nombrefamilia);
    parametros.put("examinador",rutUuario);
    parametros.put("fechaAplica",fechaIngreso);
    parametros.put("parteProceso",parteProceso);
        
    
   // parametros.put("nombreUs",testBean.getUsuario().getNombre());

            File jasper= new File(pathArchivos+"reporteNcfas.jasper");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros , new JREmptyDataSource());
       
     HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		response.addHeader("Content-disposition","attachment; filename=Ncfas-"+".pdf");
		ServletOutputStream stream = response.getOutputStream();
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
		
		stream.flush();
		stream.close();
		FacesContext.getCurrentInstance().responseComplete();
                
    }
     
     
      public void reporMineriaPDF() throws JRException, IOException, Exception{
        
    List<String> reglasEncontradas;
            
     
     ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
      String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; 

        
    PruebaWekaDao dao2;
    dao2 = new PruebaWekaDao();
    //OBTENGO LAS REGLAS
    reglasEncontradas=dao2.retornarReglas();
        //campo fijo (txtUsu.. valor del parmetro jasper, Mitocode... valor que le daremos desde java
        
    Map<String,Object> parametros= new HashMap<>();
    
          for(int i=0; i<reglasEncontradas.size();i++){
   System.out.println( reglasEncontradas.size());
              System.out.println(reglasEncontradas.get(2));
    parametros.put("regla"+i, reglasEncontradas.get(i));
          }
   /* parametros.put("regla1", reglasEncontradas.get(0));
    parametros.put("regla2", reglasEncontradas.get(1));
    parametros.put("regla3", reglasEncontradas.get(2));
    parametros.put("regla4", reglasEncontradas.get(3));
    parametros.put("regla5", reglasEncontradas.get(4));
    parametros.put("regla6", reglasEncontradas.get(5));
    parametros.put("regla7", reglasEncontradas.get(6));
    parametros.put("regla8", reglasEncontradas.get(7));
    parametros.put("regla9", reglasEncontradas.get(8));
    parametros.put("regla10", reglasEncontradas.get(9));*/
    
    
          System.out.println(reglasEncontradas.get(1));
   // parametros.put("nombreUs",testBean.getUsuario().getNombre());
        
        
        
        File jasper= new File(pathArchivos+"reporteMineriaFinal.jasper");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(),parametros , new JREmptyDataSource()); 
            
       
     HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		response.addHeader("Content-disposition","attachment; filename=Mineria-Resultados-"+".pdf");
		ServletOutputStream stream = response.getOutputStream();
		
		JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
		
                System.out.println("ruta jasper: " + pathArchivos+"reporteMineria.jasper");
		stream.flush();
		stream.close();
		FacesContext.getCurrentInstance().responseComplete();
       
                
             
                    
	



    }
    
}
