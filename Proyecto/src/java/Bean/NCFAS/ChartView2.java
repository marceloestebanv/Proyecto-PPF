/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.NCFAS;

import Dao.NCFAS.DAOException;

import Dao.NCFAS.PruebaWekaDao;

import Model.NCFAS.reglasEncontradas;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;

import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;

import org.primefaces.model.chart.PieChartModel;
 

@ManagedBean
@Named(value = "chartbean2")
@ViewScoped
@RequestScoped

public class ChartView2 implements Serializable{
    
private PieChartModel pieModel1;
private PieChartModel pieModel2;
private PieChartModel pieModel3;
private PieChartModel pieModel4;
private PieChartModel pieModel5;
private PieChartModel pieModel6;
private PieChartModel pieModel7;
private PieChartModel pieModel8;
private PieChartModel pieModel9;
private PieChartModel pieModel10;
private HorizontalBarChartModel horizontalBarModel1;

private int total;

    public PieChartModel getPieModel1() {
        return pieModel1;
    }

    public void setPieModel1(PieChartModel pieModel1) {
        this.pieModel1 = pieModel1;
    }

      public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel1;
    }



@PostConstruct
public void ChartView2()  {
createPieModel1();
createHorizontalBarModel();
}
 
   
    
        
        
     /*   
     
     numXregla2=dao.getNumXregla2();
      numYregla2=dao.getNumYregla2();
      numXregla3=dao.getNumXregla3();
      numYregla3=dao.getNumYregla3();
      numXregla4=dao.getNumXregla4();
      numYregla4=dao.getNumYregla4();
      numXregla5=dao.getNumXregla5();
      numYregla5=dao.getNumYregla5();
      numXregla6=dao.getNumXregla6();
      numYregla6=dao.getNumYregla6();
      numXregla7=dao.getNumXregla7();
      numYregla7=dao.getNumYregla7();
      numXregla8=dao.getNumXregla8();
      numYregla8=dao.getNumYregla8();
      numXregla9=dao.getNumXregla9();
      numYregla9=dao.getNumYregla9();
      numXregla10=dao.getNumXregla2();
      numYregla10=dao.getNumYregla2();*/

private void createPieModel1() {
    
int X=0;
int Y=0;

List<reglasEncontradas> reglas = null;


    reglas = new ArrayList<reglasEncontradas>();
    
        try{
        PruebaWekaDao dao;  
        dao = new PruebaWekaDao();
        
    reglas=dao.retornarReglas();
    
    X=reglas.get(1).getValorX();
    Y=reglas.get(1).getValorY();
        }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     } catch (Exception ex) {
        Logger.getLogger(ChartView2.class.getName()).log(Level.SEVERE, null, ex);
    }
  
        
    pieModel1 = new PieChartModel();
         
    pieModel1.set("X",X );
    pieModel1.set("Y",Y );
         
    pieModel1.setTitle("Simple Pie");
    pieModel1.setLegendPosition("w");
    pieModel1.setFill(false);
        pieModel1.setShowDataLabels(true);
    pieModel1.setDiameter(150);
}
     
    
     
    private void createHorizontalBarModel() {
        
        List<reglasEncontradas> reglas = null;
    reglas = new ArrayList<reglasEncontradas>();
        
         try{
        PruebaWekaDao dao;  
        dao = new PruebaWekaDao();
        
    reglas=dao.retornarReglas();
    
        }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     } catch (Exception ex) {
        Logger.getLogger(ChartView2.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        horizontalBarModel1 = new HorizontalBarChartModel();
 
        ChartSeries boys = new ChartSeries();
       
        boys.setLabel("X");
        boys.set("Regla", reglas.get(1).getValorX());

 
ChartSeries girls = new ChartSeries();


        girls.setLabel("Y");
   
        girls.set("Regla", reglas.get(1).getValorY());

 
        horizontalBarModel1.addSeries(boys);
        horizontalBarModel1.addSeries(girls);
         
        horizontalBarModel1.setTitle("Horizontal and Stacked");
        horizontalBarModel1.setLegendPosition("e");
        horizontalBarModel1.setStacked(true);
         
        Axis xAxis = horizontalBarModel1.getAxis(AxisType.X);
        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(200);
         
        Axis yAxis = horizontalBarModel1.getAxis(AxisType.Y);
        yAxis.setLabel("Gender");        
    }
    
    /*private void createPieModel2() {
    pieModel2 = new PieChartModel();
         
    pieModel2.set("X",numXregla2 );
    pieModel2.set("Y",numYregla2 );
         
    pieModel2.setTitle("Simple Pie");
    pieModel2.setLegendPosition("w");
    }
    private void createPieModel3() {
    pieModel3 = new PieChartModel();
         
    pieModel3.set("X", numXregla3);
    pieModel3.set("Y",numYregla3 );
         
    pieModel3.setTitle("Simple Pie");
    pieModel3.setLegendPosition("w");
    }
    
    private void createPieModel4() {
    pieModel4 = new PieChartModel();
         
    pieModel4.set("X",numXregla4 );
    pieModel4.set("Y", numYregla4);
         
    pieModel4.setTitle("Simple Pie");
    pieModel4.setLegendPosition("w");
    }
    
    private void createPieModel5() {
    pieModel5 = new PieChartModel();
         
    pieModel5.set("X",numXregla5 );
    pieModel5.set("Y", numYregla5);
         
    pieModel5.setTitle("Simple Pie");
    pieModel5.setLegendPosition("w");
    }
    
    private void createPieModel6() {
    pieModel6 = new PieChartModel();
         
    pieModel6.set("X",numXregla6 );
    pieModel6.set("Y", numYregla6);
         
    pieModel6.setTitle("Simple Pie");
    pieModel6.setLegendPosition("w");
    }
    
    private void createPieModel7() {
    pieModel7 = new PieChartModel();
         
    pieModel7.set("X", numXregla7);
    pieModel7.set("Y", numYregla7);
         
    pieModel7.setTitle("Simple Pie");
    pieModel7.setLegendPosition("w");
    }
    
    private void createPieModel8() {
    pieModel8 = new PieChartModel();
         
    pieModel8.set("X", numXregla8);
    pieModel8.set("Y", numYregla8);
         
    pieModel8.setTitle("Simple Pie");
    pieModel8.setLegendPosition("w");
    }
    
    private void createPieModel9() {
    pieModel9 = new PieChartModel();
         
    pieModel9.set("X",numXregla9 );
    pieModel9.set("Y",numYregla9 );
         
    pieModel9.setTitle("Simple Pie");
    pieModel9.setLegendPosition("w");
    }
    
    private void createPieModel10() {
    pieModel10 = new PieChartModel();
         
    pieModel10.set("X",numXregla10 );
    pieModel10.set("Y", numYregla10);
         
    pieModel10.setTitle("Simple Pie");
    pieModel10.setLegendPosition("w");
    }*/
    
}
