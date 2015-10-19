/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.NCFAS;


import Dao.NCFAS.DAOException;
import Dao.NCFAS.IdDAO;
import Dao.NCFAS.ItemDao;
import Dao.NCFAS.NcfasDAO;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.BubbleChartSeries;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.PieChartModel;
 

@ManagedBean
@Named(value = "chartbean")
@ViewScoped
@RequestScoped

public class ChartView implements Serializable{
    
 
    

    private LineChartModel lineModel1;
    private LineChartModel lineModel2;
    private LineChartModel lineModel3;
    private LineChartModel lineModel4;
    private LineChartModel lineModel5;
    private LineChartModel lineModel6;
    private LineChartModel lineModel7;
    private LineChartModel lineModel8;
    private LineChartModel lineModel9;
    private LineChartModel lineModel10;
    private LineChartModel lineModel11;
    private LineChartModel lineModel12;
    private LineChartModel lineModel13;
    private LineChartModel lineModel14;
    private LineChartModel lineModel15;
    private LineChartModel lineModel16;
    private LineChartModel lineModel17;
    private LineChartModel lineModel18;
    private LineChartModel lineModel20;
    private PieChartModel mineriamodel;
    
    private BarChartModel barModel1;
    
    private BubbleChartModel bubbleModel1;
    private BubbleChartModel bubbleModel2; 
    private BubbleChartModel bubbleModel3; 
    private BubbleChartModel bubbleModel4; 
    private BubbleChartModel bubbleModel5; 
    private BubbleChartModel bubbleModel6; 
    private BubbleChartModel bubbleModel7; 
    private BubbleChartModel bubbleModel8;
    
    private String dimension1;
    private String dimension2;
    private String dimension3;

    private int total;
    private int numveces;

    public BubbleChartModel getBubbleModel2() {
        return bubbleModel2;
    }

    public void setBubbleModel2(BubbleChartModel bubbleModel2) {
        this.bubbleModel2 = bubbleModel2;
    }

    public BubbleChartModel getBubbleModel3() {
        return bubbleModel3;
    }

    public void setBubbleModel3(BubbleChartModel bubbleModel3) {
        this.bubbleModel3 = bubbleModel3;
    }

    public BubbleChartModel getBubbleModel4() {
        return bubbleModel4;
    }

    public void setBubbleModel4(BubbleChartModel bubbleModel4) {
        this.bubbleModel4 = bubbleModel4;
    }

    public BubbleChartModel getBubbleModel5() {
        return bubbleModel5;
    }

    public void setBubbleModel5(BubbleChartModel bubbleModel5) {
        this.bubbleModel5 = bubbleModel5;
    }

    public BubbleChartModel getBubbleModel6() {
        return bubbleModel6;
    }

    public void setBubbleModel6(BubbleChartModel bubbleModel6) {
        this.bubbleModel6 = bubbleModel6;
    }

    public BubbleChartModel getBubbleModel7() {
        return bubbleModel7;
    }

    public void setBubbleModel7(BubbleChartModel bubbleModel7) {
        this.bubbleModel7 = bubbleModel7;
    }

    public BubbleChartModel getBubbleModel8() {
        return bubbleModel8;
    }

    public void setBubbleModel8(BubbleChartModel bubbleModel8) {
        this.bubbleModel8 = bubbleModel8;
    }
    
    

    public String getDimension1() {
        return dimension1;
    }

    public void setDimension1(String dimension1) {
        this.dimension1 = dimension1;
    }

    public String getDimension2() {
        return dimension2;
    }

    public void setDimension2(String dimension2) {
        this.dimension2 = dimension2;
    }

    public String getDimension3() {
        return dimension3;
    }

    public void setDimension3(String dimension3) {
        this.dimension3 = dimension3;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumveces() {
        return numveces;
    }

    public void setNumveces(int numveces) {
        this.numveces = numveces;
    }

    public Axis getyAxis() {
        return yAxis;
    }

    public void setyAxis(Axis yAxis) {
        this.yAxis = yAxis;
    }
    
    
    private Axis yAxis;
  
 
    
    @PostConstruct
    public void ChartView()  {
        
        /*createLineModels1();
        createLineModels2();
        createLineModels3();
        createLineModels4();
        createLineModels5();
        createLineModels6();
        createLineModels7();
        createLineModels8();*/
        createLineModelComparar();
        createLineModelComparar2();
        createLineModelComparar3();
        createLineModelComparar4();
        createLineModelComparar5();
        createLineModelComparar6();
        createLineModelComparar7();
        createLineModelComparar8();
        createLineModelComparar9();
        createLineModelCompararporFecha();
        
        //GRAFICOS DE BARRA
        
        //createBarModel();
        createBubbleModels();
        createBubbleModels2();
        createBubbleModels3();
        createBubbleModels4();
        createBubbleModels5();
        createBubbleModels6();
        createBubbleModels7();
        createBubbleModels8();
       // createMineriaModel();
        //createPieModelInteracciones3dim();
        
    }
 
   /* public void crearGraficos(){
    
    }*/

    public BubbleChartModel getBubbleModel1() {
        return bubbleModel1;
    }

    public void setBubbleModel1(BubbleChartModel bubbleModel1) {
        this.bubbleModel1 = bubbleModel1;
    }
    
    
    
    

    public LineChartModel getLineModel20() {
        return lineModel20;
    }

    public void setLineModel20(LineChartModel lineModel20) {
        this.lineModel20 = lineModel20;
    }
    
    
    public LineChartModel getLineModel18() {
        return lineModel18;
    }

    public void setLineModel18(LineChartModel lineModel18) {
        this.lineModel18 = lineModel18;
    }
    
    
    public LineChartModel getLineModel17() {
        return lineModel17;
    }

    public void setLineModel17(LineChartModel lineModel17) {
        this.lineModel17 = lineModel17;
    }

    
    public LineChartModel getLineModel10() {
        return lineModel10;
    }

    public void setLineModel10(LineChartModel lineModel10) {
        this.lineModel10 = lineModel10;
    }

    public LineChartModel getLineModel11() {
        return lineModel11;
    }

    public void setLineModel11(LineChartModel lineModel11) {
        this.lineModel11 = lineModel11;
    }

    public LineChartModel getLineModel12() {
        return lineModel12;
    }

    public void setLineModel12(LineChartModel lineModel12) {
        this.lineModel12 = lineModel12;
    }

    public LineChartModel getLineModel13() {
        return lineModel13;
    }

    public void setLineModel13(LineChartModel lineModel13) {
        this.lineModel13 = lineModel13;
    }

    public LineChartModel getLineModel14() {
        return lineModel14;
    }

    public void setLineModel14(LineChartModel lineModel14) {
        this.lineModel14 = lineModel14;
    }

    public LineChartModel getLineModel15() {
        return lineModel15;
    }

    public void setLineModel15(LineChartModel lineModel15) {
        this.lineModel15 = lineModel15;
    }

    public LineChartModel getLineModel16() {
        return lineModel16;
    }

    public void setLineModel16(LineChartModel lineModel16) {
        this.lineModel16 = lineModel16;
    }

    
    public LineChartModel getLineModel9() {
        return lineModel9;
    }

    public void setLineModel9(LineChartModel lineModel9) {
        this.lineModel9 = lineModel9;
    }
    
    
     public LineChartModel getLineModel1() {
        return lineModel1;
    }

    public void setLineModel1(LineChartModel lineModel1) {
        this.lineModel1 = lineModel1;
    }

    public LineChartModel getLineModel3() {
        return lineModel3;
    }

    public void setLineModel3(LineChartModel lineModel3) {
        this.lineModel3 = lineModel3;
    }

    public LineChartModel getLineModel4() {
        return lineModel4;
    }

    public void setLineModel4(LineChartModel lineModel4) {
        this.lineModel4 = lineModel4;
    }

    public LineChartModel getLineModel5() {
        return lineModel5;
    }

    public void setLineModel5(LineChartModel lineModel5) {
        this.lineModel5 = lineModel5;
    }

    public LineChartModel getLineModel6() {
        return lineModel6;
    }

    public void setLineModel6(LineChartModel lineModel6) {
        this.lineModel6 = lineModel6;
    }

    public LineChartModel getLineModel7() {
        return lineModel7;
    }

    public void setLineModel7(LineChartModel lineModel7) {
        this.lineModel7 = lineModel7;
    }

    public LineChartModel getLineModel8() {
        return lineModel8;
    }

    public void setLineModel8(LineChartModel lineModel8) {
        this.lineModel8 = lineModel8;
    }
    
    
    public PieChartModel getMineriamodel() {
        return mineriamodel;
    }

    public void setMineriamodel(PieChartModel mineriamodel) {
        this.mineriamodel = mineriamodel;
    }

    
    public LineChartModel getAreaModel() {
        return lineModel2;
    }
     
    
    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    public BarChartModel getBarModel1() {
        return barModel1;
    }

    public void setBarModel1(BarChartModel barModel1) {
        this.barModel1 = barModel1;
    }
    
    
    
 /*private void createMineriaModel(){   
 int valorcumple=0;
 int nocumple=0;    
     try{
         PruebaWekaDao dao;  
        dao = new PruebaWekaDao();
     valorcumple=dao.retornarNumero();
        System.out.println(valorcumple);
        nocumple=52-valorcumple;
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        mineriamodel = new PieChartModel();
        mineriamodel.set("Cumplimiento de la hipotesis", valorcumple);  
        mineriamodel.set("No cumple hipotesis", nocumple);
        mineriamodel.setShowDataLabels(true);
        mineriamodel.setTitle("Porcentage de la Hipotesis");
        mineriamodel.setDataFormat("value");
        mineriamodel.setLegendPosition("w"); 
    }*/
    
   /*  private void createMineriaModel()  {
        
       
      Integer listaValores[];
     listaValores = new Integer[8];
     
     PruebaWekaDao dao;  
     dao = new PruebaWekaDao();
     int numXregla1=dao.getNumXregla1();
     int numYregla1=dao.getNumYregla1();
     int total=dao.getTotal();
     System.out.println(total);
     
     mineriamodel = new PieChartModel();
        mineriamodel.set("X", listaValores[1]);
        mineriamodel.set("Y", listaValores[2]);
        mineriamodel.setShowDataLabels(true);
        mineriamodel.setTitle("Valores Dimensión Entorno");
        mineriamodel.setDataFormat("value");
        mineriamodel.setLegendPosition("w");
         
        }

       private void createPieModelInteracciones3dim() {
        pieModel2 = new PieChartModel();
         
        pieModel2.set(dimension1, numveces );
        pieModel2.set(dimension2, numveces);
        pieModel2.set(dimension3, numveces );
        
        pieModel2.setTitle("Competencias Parentales");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(total);
    }
    
    private void createPieModelInteracciones3dim() {
        pieModel2 = new PieChartModel();
         
        pieModel2.set("Entorno", );
        pieModel2.set("Competencias Parentales", );
        pieModel2.set("Interacciones Familiares", );
        pieModel2.set("Seguridad Social", );
        pieModel2.set("Bienestar del Niño", );
        pieModel2.set("Vida Social Comunitaria", );
        pieModel2.set("Autonomía", );
        pieModel2.set("Salud Familiar", );
         
        pieModel2.setTitle("Interacciones Familiares");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter();
    }*/
 
    //ENTORNO BUBBLES
 private void createBubbleModels(){
     
        bubbleModel1 = initBubbleModel();
        bubbleModel1.setTitle("Dimensión Entorno");
        bubbleModel1.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel1.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel1.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(1,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Estab. Vivienda",1,listaValores[1] ,10));
        model.add(new BubbleChartSeries("Segur. Comunidad.",2,listaValores[2] , 10));
        model.add(new BubbleChartSeries("Riesg. Entorno",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Hab. Vivienda",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Higiene Per.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Entorno Aprend.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Entorno General",7, listaValores[7], 10));
        return model;
    }

//C P BUBBLES           
 private void createBubbleModels2(){
     
        bubbleModel2 = initBubbleModel2();
        bubbleModel2.setTitle("Dimensión Competencias Parentales");
        bubbleModel2.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel2.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel2.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
 

private BubbleChartModel initBubbleModel2(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(2,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Supervisión N.",1,listaValores[1] ,10));
        model.add(new BubbleChartSeries("Pra. Discipl.",2,listaValores[2] , 10));
        model.add(new BubbleChartSeries("Op. Des./Cre.",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Uso D/A ",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Est. Edu. N.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Ctrl. Mat. Med.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Liter. Prog.",7, listaValores[7], 10));
        model.add(new BubbleChartSeries("C. P. General",8, listaValores[8], 10));
        return model;
    }


//Int. Fam Bubbles
 private void createBubbleModels3(){
     
        bubbleModel3 = initBubbleModel3();
        bubbleModel3.setTitle("Interacciones Familiares");
        bubbleModel3.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel3.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel3.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel3(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(3,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Apego N.",1,listaValores[1] ,10));
        model.add(new BubbleChartSeries("Comunicación N..",2,listaValores[2] , 10));
        model.add(new BubbleChartSeries("Expectativas N.",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Apoyo Fam.",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Rel. Prog.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Rut. Rit. Fam.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Rec. Juego Fam.",7, listaValores[7], 10));
         model.add(new BubbleChartSeries("Int. Fam. General",8, listaValores[8], 10));
        return model;
    }


//SEG. SOC. BUBBLES
 private void createBubbleModels4(){
     
        bubbleModel4 = initBubbleModel4();
        bubbleModel4.setTitle("Seguridad Social");
        bubbleModel4.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel4.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel4.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel4(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(4,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Aus/Pres. Viol. Dom.",1,listaValores[1] ,10));
        model.add(new BubbleChartSeries("Aus/Pres. Conf. Fam.",2,listaValores[2] , 10));
        model.add(new BubbleChartSeries("Aus/Pres. Abuso F.",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Aus/Pres. Abuso E.",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Aus/Pres Abuso S.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Aus/Pres Neglig.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Aus/Pres Arm.",7, listaValores[7], 10));
        model.add(new BubbleChartSeries("S.S General",8, listaValores[8], 10));
        return model;
    }


//BIENESTAR DEL NIÑO BUBBLE
 private void createBubbleModels5(){
     
        bubbleModel5 = initBubbleModel5();
        bubbleModel5.setTitle("Bienestar del Niño");
        bubbleModel5.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel5.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel5.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
 
 
private BubbleChartModel initBubbleModel5(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(5,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        
        model.add(new BubbleChartSeries("Comportamiento N.",1,listaValores[1] , 10));
        model.add(new BubbleChartSeries("Desmpeño Escolar",2, listaValores[2], 10));
        model.add(new BubbleChartSeries("Rel. N. Progenitor",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Rel. N. Hermanos",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Rel N. Pares",5,listaValores[5] ,10));
        model.add(new BubbleChartSeries("Motiv. Perm. Fam.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Bienestar N. General",7, listaValores[7], 10));
        return model;
    }

//V.S.C bubbles
 private void createBubbleModels6(){
     
        bubbleModel6 = initBubbleModel6();
        bubbleModel6.setTitle("Vida Social Comunitaria");
        bubbleModel6.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel6.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel6.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel6(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(6,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Relaciones Sociales",1,listaValores[1] ,10));
        model.add(new BubbleChartSeries("Relaciones cuidado Inf.",2,listaValores[2] , 10));
        model.add(new BubbleChartSeries("Conexión Vecindario",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Conexión Com. Esp.",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Inic. Acept. Ayuda",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("V.S.C. General",6, listaValores[6], 10));
        return model;
    }

//BUBBLES AUTONOMÍA
 private void createBubbleModels7(){
     
        bubbleModel7 = initBubbleModel7();
        bubbleModel7.setTitle("Autonomía");
        bubbleModel7.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel7.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel7.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel7(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(7,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
        model.add(new BubbleChartSeries("Empleo cuidad.",1,listaValores[1] , 10));
        model.add(new BubbleChartSeries("Ingreso Fam.",2, listaValores[2], 10));
        model.add(new BubbleChartSeries("Manejo Financ.",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Comida y Nutri.",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Transporte.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Autonomía General",6, listaValores[6], 10));
        return model;
    }

//SALUD FAMILIAR BUBBLES
 private void createBubbleModels8(){
     
        bubbleModel8 = initBubbleModel8();
        bubbleModel8.setTitle("Salud Familiar");
        bubbleModel8.getAxis(AxisType.X).setLabel("Items");
        Axis yAxis = bubbleModel8.getAxis(AxisType.Y);
        Axis xAxis = bubbleModel8.getAxis(AxisType.X);
         yAxis.setTickInterval("1");
         xAxis.setTickInterval("1");
         yAxis.setMin("0");
         xAxis.setMax("8");  
        yAxis.setMin(-3);
        yAxis.setMax(2);
        yAxis.setLabel("Valores");  
    }
     
private BubbleChartModel initBubbleModel8(){
    
 Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(8,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        BubbleChartModel model = new BubbleChartModel(); 
       
        model.add(new BubbleChartSeries("Salud Física Prog.",1,listaValores[1] , 10));
        model.add(new BubbleChartSeries("Invalidez Prog.",2, listaValores[2], 10));
        model.add(new BubbleChartSeries("Salud Mental Prog.",3, listaValores[3], 10));
        model.add(new BubbleChartSeries("Salud Física N.",4, listaValores[4], 10));
        model.add(new BubbleChartSeries("Invalidez N.",5, listaValores[5], 10));
        model.add(new BubbleChartSeries("Salud Mental N.",6, listaValores[6], 10));
        model.add(new BubbleChartSeries("Acceso Cuidados",7,listaValores[7] ,10));
        model.add(new BubbleChartSeries("Salud General",8, listaValores[8], 10));
        return model;
    }
  

//GRAFICOS LINEALES
    //ENTORNO

/*
    public void createLineModels1() {  

        lineModel1 = initCategoryModel1();
        lineModel1.setTitle("DIMENSION ENTORNO");
        lineModel1.setLegendPosition("e");
        lineModel1.setShowPointLabels(true);
        lineModel1.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel1() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(1,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item General", listaValores[7]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
    
     private void createLineModels2() {
        lineModel2 = initCategoryModel2();
        lineModel2.setTitle("COMPETENCIAS PARENTALES");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel2() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(2,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item 7", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item 7", listaValores[7]);
        valores.set("Item General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels3() {
        lineModel3 = initCategoryModel3();
        lineModel3.setTitle("INTERACCIONES FAMILIARES");
        lineModel3.setLegendPosition("e");
        lineModel3.setShowPointLabels(true);
        lineModel3.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel3.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel3() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(3,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item 7", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item 7", listaValores[7]);
        valores.set("Item General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels4() {
        lineModel4 = initCategoryModel4();
        lineModel4.setTitle("SEGURIDAD SOCIAL");
        lineModel4.setLegendPosition("e");
        lineModel4.setShowPointLabels(true);
        lineModel4.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel4.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel4() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(4,dao2.retornarID());
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
    
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item 7", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item 7", listaValores[7]);
        valores.set("Item General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels5() {
        lineModel5 = initCategoryModel5();
        lineModel5.setTitle("BIENESTAR DEL NIÑO");
        lineModel5.setLegendPosition("e");
        lineModel5.setShowPointLabels(true);
        lineModel5.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel5.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel5() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(5,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item General", listaValores[7]);
           
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels6() {
        lineModel6 = initCategoryModel6();
        lineModel6.setTitle("VIDA SOCIAL COMUNITARIA");
        lineModel6.setLegendPosition("e");
        lineModel6.setShowPointLabels(true);
        lineModel6.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel6.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel6() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(6,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item General", listaValores[6]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels7() {
        lineModel7 = initCategoryModel7();
        lineModel7.setTitle("AUTONOMÍA");
        lineModel7.setLegendPosition("e");
        lineModel7.setShowPointLabels(true);
        lineModel7.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel7.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel7() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(7,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item General", -1);
        
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item General", listaValores[6]);
        
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     private void createLineModels8() {
        lineModel8 = initCategoryModel8();
        lineModel8.setTitle("SALUD FAMILIAR");
        lineModel8.setLegendPosition("e");
        lineModel8.setShowPointLabels(true);
        lineModel8.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel8.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);
    }
     private LineChartModel initCategoryModel8() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     try{
         IdDAO dao2;  
     dao2 = new IdDAO();
     ItemDao dao;  
     dao = new ItemDao();
     listaValores=dao.obtenerPuntajesDim1(8,dao2.retornarID());
        System.out.println(listaValores[2]);
     
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
     
        LineChartModel model = new LineChartModel();
 
      
   
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.set("Item 1", -1);
        riesgo.set("Item 2", -1);
        riesgo.set("Item 3", -1);
        riesgo.set("Item 4", -1);
        riesgo.set("Item 5", -1);
        riesgo.set("Item 6", -1);
        riesgo.set("Item 7", -1);
        riesgo.set("Item General", -1);
 
        ChartSeries valores = new ChartSeries();
       
        
        valores.setLabel("Valores DE LA DIMENSION");
        valores.set("Item 1", listaValores[1]);
        valores.set("Item 2", listaValores[2]);
        valores.set("Item 3", listaValores[3]);
        valores.set("Item 4", listaValores[4]);
        valores.set("Item 5", listaValores[5]);
        valores.set("Item 6", listaValores[6]);
        valores.set("Item 7", listaValores[7]);
        valores.set("Item General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }*/
     
     public void createLineModelComparar() {  

        lineModel9 = initCategoryModel9();
        lineModel9.setTitle("Dimensión Entorno");
        lineModel9.setLegendPosition("e");
        lineModel9.setShowPointLabels(true);
        lineModel9.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel9.getAxis(AxisType.Y);
        yAxis.setTickInterval("1");
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel9() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(1,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(1,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      /*  ChartSeries confort = new ChartSeries();
      
        confort.setLabel("CONFORT");
        confort.set("Item 1", 1);
        confort.set("Item 2", 1);
        confort.set("Item 3", 1);
        confort.set("Item 4", 1);
        confort.set("Item 5", 1);
        confort.set("Item 6", 1);
        confort.set("Item 7", 1);*/
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Estab. Vivienda", listaValores2[1]);
        riesgo.set("Segur. Comunidad.", listaValores2[2]);
        riesgo.set("Riesg. Entorno", listaValores2[3]);
        riesgo.set("Hab. Vivienda", listaValores2[4]);
        riesgo.set("Higiene Per.", listaValores2[5]);
        riesgo.set("Entorno Aprend.", listaValores2[6]);
        riesgo.set("Entorno General", listaValores2[7]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Estab. Vivienda", listaValores[1]);
        valores.set("Segur. Comunidad.", listaValores[2]);
        valores.set("Riesg. Entorno", listaValores[3]);
        valores.set("Hab. Vivienda", listaValores[4]);
        valores.set("Higiene Per.", listaValores[5]);
        valores.set("Entorno Aprend.", listaValores[6]);
        valores.set("Entorno General", listaValores[7]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar2() {  

        lineModel10 = initCategoryModel10();
        lineModel10.setTitle("Dimensión Competencias Parentales");
        lineModel10.setLegendPosition("e");
        lineModel10.setShowPointLabels(true);
        lineModel10.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel10.getAxis(AxisType.Y);
        yAxis.setTickInterval("1");
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel10() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(2,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(2,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Supervisión N.", listaValores2[1]);
        riesgo.set("Pra. Discipl.", listaValores2[2]);
        riesgo.set("Op. Des./Cre.", listaValores2[3]);
        riesgo.set("Uso D/A ", listaValores2[4]);
        riesgo.set("Est. Edu. N.", listaValores2[5]);
        riesgo.set("Ctrl. Mat. Med.", listaValores2[6]);
        riesgo.set("Liter. Prog.", listaValores2[7]);
        riesgo.set("C. P. General", listaValores2[8]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Supervisión N.", listaValores[1]);
        valores.set("Pra. Discipl.", listaValores[2]);
        valores.set("Op. Des./Cre.", listaValores[3]);
        valores.set("Uso D/A ", listaValores[4]);
        valores.set("Est. Edu. N.", listaValores[5]);
        valores.set("Ctrl. Mat. Med.", listaValores[6]);
        valores.set("Liter. Prog.", listaValores[7]);
        valores.set("C. P. General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar3() {  

        lineModel11 = initCategoryModel11();
        lineModel11.setTitle("Dimensión Interacciones Familiares");
        lineModel11.setLegendPosition("e");
        lineModel11.setShowPointLabels(true);
        lineModel11.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel11.getAxis(AxisType.Y);
        yAxis.setTickInterval("1");
        yAxis.setLabel("Valores");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel11() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(3,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(3,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      /*  ChartSeries confort = new ChartSeries();
      
        confort.setLabel("CONFORT");
        confort.set("Item 1", 1);
        confort.set("Item 2", 1);
        confort.set("Item 3", 1);
        confort.set("Item 4", 1);
        confort.set("Item 5", 1);
        confort.set("Item 6", 1);
        confort.set("Item 7", 1);*/
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Apego N.", listaValores2[1]);
        riesgo.set("Comunicación N.", listaValores2[2]);
        riesgo.set("Expectativas N.", listaValores2[3]);
        riesgo.set("Apoyo Fam.", listaValores2[4]);
        riesgo.set("Rel. Prog.", listaValores2[5]);
        riesgo.set("Rut. Rit. Fam.", listaValores2[6]);
        riesgo.set("Rec. Juego Fam.", listaValores2[7]);
        riesgo.set("Int. Fam. General", listaValores2[8]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Apego N.", listaValores[1]);
        valores.set("Comunicación N.", listaValores[2]);
        valores.set("Expectativas N.", listaValores[3]);
        valores.set("Apoyo Fam.", listaValores[4]);
        valores.set("Rel. Prog.", listaValores[5]);
        valores.set("Rut. Rit. Fam.", listaValores[6]);
        valores.set("Rec. Juego Fam.", listaValores[7]);
        valores.set("Int. Fam. General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar4() {  

        lineModel12 = initCategoryModel12();
        lineModel12.setTitle("Dimensión Seguridad Social");
        lineModel12.setLegendPosition("e");
        lineModel12.setShowPointLabels(true);
        lineModel12.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel12.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel12() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(4,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(4,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Aus/Pres. Viol. Dom.", listaValores2[1]);
        riesgo.set("Aus/Pres. Conf. Fam.", listaValores2[2]);
        riesgo.set("Aus/Pres. Abuso F.", listaValores2[3]);
        riesgo.set("Aus/Pres. Abuso E.", listaValores2[4]);
        riesgo.set("Aus/Pres Abuso S.", listaValores2[5]);
        riesgo.set("Aus/Pres Neglig.", listaValores2[6]);
        riesgo.set("Aus/Pres Arm.", listaValores2[7]);
        riesgo.set("S.S General", listaValores2[8]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Aus/Pres. Viol. Dom.", listaValores[1]);
        valores.set("Aus/Pres. Conf. Fam.", listaValores[2]);
        valores.set("Aus/Pres. Abuso F.", listaValores[3]);
        valores.set("Aus/Pres. Abuso E.", listaValores[4]);
        valores.set("Aus/Pres Abuso S.", listaValores[5]);
        valores.set("Aus/Pres Neglig.", listaValores[6]);
        valores.set("Aus/Pres Arm.", listaValores[7]);
        valores.set("S.S General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar5() {  

        lineModel13 = initCategoryModel13();
        lineModel13.setTitle("Dimensión Bienestar del Niño");
        lineModel13.setLegendPosition("e");
        lineModel13.setShowPointLabels(true);
        lineModel13.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel13.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel13() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(5,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(5,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      /*  ChartSeries confort = new ChartSeries();
      
        confort.setLabel("CONFORT");
        confort.set("Item 1", 1);
        confort.set("Item 2", 1);
        confort.set("Item 3", 1);
        confort.set("Item 4", 1);
        confort.set("Item 5", 1);
        confort.set("Item 6", 1);
        confort.set("Item 7", 1);*/
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Comportamiento N.", listaValores2[1]);
        riesgo.set("Desmpeño Escolar", listaValores2[2]);
        riesgo.set("Rel. N. Progenitor", listaValores2[3]);
        riesgo.set("Rel. N. Hermanos", listaValores2[4]);
        riesgo.set("Rel N. Pares", listaValores2[5]);
        riesgo.set("Motiv. Perm. Fam.", listaValores2[6]);
        riesgo.set("Bienestar N. General", listaValores2[7]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Comportamiento N.", listaValores[1]);
        valores.set("Desmpeño Escolar", listaValores[2]);
        valores.set("Rel. N. Progenitor", listaValores[3]);
        valores.set("Rel. N. Hermanos", listaValores[4]);
        valores.set("Rel N. Pares", listaValores[5]);
        valores.set("Motiv. Perm. Fam.", listaValores[6]);
        valores.set("Bienestar N. General", listaValores[7]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar6() {  

        lineModel14 = initCategoryModel14();
        lineModel14.setTitle("Dimensión Vida Social Comunitaria");
        lineModel14.setLegendPosition("e");
        lineModel14.setShowPointLabels(true);
        lineModel14.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel14.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");   
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel14() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(6,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(6,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
     
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Relaciones Sociales", listaValores2[1]);
        riesgo.set("Relaciones cuidado Inf.", listaValores2[2]);
        riesgo.set("Conexión Vecindario", listaValores2[3]);
        riesgo.set("Conexión Com. Esp.", listaValores2[4]);
        riesgo.set("Inic. Acept. Ayuda", listaValores2[5]);
        riesgo.set("V.S.C. General", listaValores2[6]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Relaciones Sociales", listaValores[1]);
        valores.set("Relaciones cuidado Inf.", listaValores[2]);
        valores.set("Conexión Vecindario", listaValores[3]);
        valores.set("Conexión Com. Esp.", listaValores[4]);
        valores.set("Inic. Acept. Ayuda", listaValores[5]);
        valores.set("V.S.C. General", listaValores[6]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar7() {  

        lineModel15 = initCategoryModel15();
        lineModel15.setTitle("Dimensión Autonomía");
        lineModel15.setLegendPosition("e");
        lineModel15.setShowPointLabels(true);
        lineModel15.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel15.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel15() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(7,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(7,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Empleo cuidad.", listaValores2[1]);
        riesgo.set("Ingreso Fam.", listaValores2[2]);
        riesgo.set("Manejo Financ.", listaValores2[3]);
        riesgo.set("Comida y Nutri.", listaValores2[4]);
        riesgo.set("Transporte.", listaValores2[5]);
        riesgo.set("Autonomía General", listaValores2[6]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Empleo cuidad.", listaValores[1]);
        valores.set("Ingreso Fam.", listaValores[2]);
        valores.set("Manejo Financ.", listaValores[3]);
        valores.set("Comida y Nutri.", listaValores[4]);
        valores.set("Transporte.", listaValores[5]);
        valores.set("Autonomía General", listaValores[6]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar8() {  

        lineModel16 = initCategoryModel16();
        lineModel16.setTitle("Dimensión Salud Familiar");
        lineModel16.setLegendPosition("e");
        lineModel16.setShowPointLabels(true);
        lineModel16.getAxes().put(AxisType.X, new CategoryAxis("Items"));
        yAxis = lineModel16.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel16() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
     IdDAO dao2;  
     dao2 = new IdDAO();
     
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     listaValores=dao.obtenerPuntajesDim1(8,dao2.retornarID());
     
     listaValores2=dao1.obtenerPuntajesDim1(8,elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Riesgo");
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Salud Física Prog.", listaValores2[1]);
        riesgo.set("Invalidez Prog.", listaValores2[2]);
        riesgo.set("Salud Mental Prog.", listaValores2[3]);
        riesgo.set("Salud Física N.", listaValores2[4]);
        riesgo.set("Invalidez N.", listaValores2[5]);
        riesgo.set("Salud Mental N.", listaValores2[6]);
        riesgo.set("Acceso Cuidados", listaValores2[7]);
        riesgo.set("Salud General", listaValores2[8]);
 
        ChartSeries valores = new ChartSeries();
       
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Salud Física Prog.", listaValores[1]);
        valores.set("Invalidez Prog.", listaValores[2]);
        valores.set("Salud Mental Prog.", listaValores[3]);
        valores.set("Salud Física N.", listaValores[4]);
        valores.set("Invalidez N.", listaValores[5]);
        valores.set("Salud Mental N.", listaValores[6]);
        valores.set("Acceso Cuidados", listaValores[7]);
        valores.set("Salud General", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
         System.out.println("rellenamos la dim 1 :S");
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelComparar9() {  

        lineModel17 = initCategoryModel17();
        lineModel17.setTitle("Items Generales");
        lineModel17.setLegendPosition("e");
        lineModel17.setShowPointLabels(true);
        lineModel17.getAxes().put(AxisType.X, new CategoryAxis("Dimensiones"));
        yAxis = lineModel17.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel17() {
        
     Integer listaValores[];
     listaValores = new Integer[8];
     
     Integer listaValores2[];
     listaValores2 = new Integer[8];
     
     int elotroid;
     
     try{
         
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     IdDAO dao2;  
     dao2 = new IdDAO();
   
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     
     //OBTENGO EL ID DE LA OTRA APRECIACION A PARTIR DEL ID DEL NCFAS FINAL
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     //OBTENGO LOS Valores DE LA DIMENSION 8 DEL NCFAS FINAL
     listaValores=dao.obtenerPuntajesItemsGenerales(dao2.retornarID());
     
     //OBTENGO LOS Valores DE LA DIMENSION 8 DEL NCFAS INICIAL
     listaValores2=dao1.obtenerPuntajesItemsGenerales(elotroid);
        System.out.println(listaValores[2]);
     }catch(DAOException ex){
     Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
     }
        LineChartModel model = new LineChartModel();
 
      
        ChartSeries riesgo = new ChartSeries();    
        riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("Entorno", listaValores2[1]);
        riesgo.set("Com. Par.", listaValores2[2]);
        riesgo.set("Int. Fam.", listaValores2[3]);
        riesgo.set("Seg. Soc.", listaValores2[4]);
        riesgo.set("Bien. Niño", listaValores2[5]);
        riesgo.set("Vida S.C.", listaValores2[6]);
        riesgo.set("Automía", listaValores2[7]);
        riesgo.set("Salud Fam.", listaValores2[8]);
 
        ChartSeries valores = new ChartSeries();
        valores.setLabel("Valores de la Apreciación Inicial");
        valores.set("Entorno", listaValores[1]);
        valores.set("Com. Par.", listaValores[2]);
        valores.set("Int. Fam.", listaValores[3]);
        valores.set("Seg. Soc.", listaValores[4]);
        valores.set("Bien. Niño", listaValores[5]);
        valores.set("Vida S.C.", listaValores[6]);
        valores.set("Automía", listaValores[7]);
        valores.set("Salud Fam.", listaValores[8]);
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     public void createLineModelCompararporFecha() {  

        lineModel20 = initCategoryModel20();
        lineModel20.setTitle("Comparación por Fechas");
        lineModel20.setLegendPosition("e");
        lineModel20.setShowPointLabels(true);
        lineModel20.getAxes().put(AxisType.X, new CategoryAxis("Fechas"));
        yAxis = lineModel20.getAxis(AxisType.Y);
        yAxis.setLabel("Valores");
        yAxis.setTickInterval("1");
        yAxis.setMin(-3);
        yAxis.setMax(2);               
    }
    
     private LineChartModel initCategoryModel20() {
        
     Integer listaValores[];
     listaValores = new Integer[9];
     
     String listaMeses[];
     listaMeses = new String[13];
     listaMeses[1]="ENERO";
     listaMeses[2]="FEBR.";
     listaMeses[3]="MARZO";
     listaMeses[4]="ABRIL";
     listaMeses[5]="MAYO";
     listaMeses[6]="JUNIO";
     listaMeses[7]="JULIO";
     listaMeses[8]="AGOSTO";
     listaMeses[9]="SEPT.";
     listaMeses[10]="OCTUB.";
     listaMeses[11]="NOVIEM.";
     listaMeses[12]="DICIEM.";
     
     Integer listaValores2[];
     listaValores2 = new Integer[9];
     
     String fecha1;
     String fecha2;
     String fechainicial="";
     String fechafinal="";
     int fecha1int=0;
     int fecha2int=0;
     
     int elotroid;
     
     try{
         
     ItemDao dao;  
     dao = new ItemDao();
     
     ItemDao dao1;  
     dao1 = new ItemDao();
     
     IdDAO dao2;  
     dao2 = new IdDAO();
   
     NcfasDAO dao3;
     dao3=new NcfasDAO();
     
     //OBTENGO EL ID DE LA OTRA APRECIACION A PARTIR DEL ID DEL NCFAS FINAL
     elotroid=dao3.obtenerIdPorotroID(dao2.retornarID());
     //OBTENGO LOS Valores DE LA DIMENSION 8 DEL NCFAS FINAL
     listaValores=dao.obtenerPuntajesItemsGenerales(dao2.retornarID());
     
     //OBTENGO LOS Valores DE LA DIMENSION 8 DEL NCFAS INICIAL
     listaValores2=dao1.obtenerPuntajesItemsGenerales(elotroid);
     
     //OBETNER FECHA APRECIACION INICIAL
     fecha2=dao.obtenerFecha(dao2.retornarID());
     //OBTENER FECHA APRECIACION FINAL
     fecha1=dao1.obtenerFecha(elotroid);
     

    String delimiter = "-";
    String[] temp;
    temp = new String[3];
    String[] temp2;
    temp2 = new String[3];
    temp2 = fecha1.split(delimiter);
    temp = fecha2.split(delimiter);
   
    
    fecha1int=Integer.parseInt(temp[1]);
    fecha2int=Integer.parseInt(temp2[1]);
    
    fechainicial=temp[0]+"-"+listaMeses[fecha2int];
    fechafinal=temp2[0]+"-"+listaMeses[fecha1int];
    
        
     System.out.println(listaValores[2]);
    }catch(DAOException ex){
    Logger.getLogger(ChartView.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        LineChartModel model = new LineChartModel();
 
      
        ChartSeries riesgo = new ChartSeries(); 
         
         riesgo.setLabel("DIMENSIÓN COMPETENCIAS PARENTALES");       
         riesgo.set(fechafinal, listaValores2[2]);
         riesgo.set(fechainicial, listaValores[2]);
         for(int i=fecha1int;i<fecha2int;i++){
         //seteo los meses intermedios
             riesgo.set(listaMeses[i], null);
         }
         
         
        
       /*  ChartSeries valores = new ChartSeries();
        valores.setLabel("Valores de la Apreciación Inicial");
            for(int i=1;i<=listaValores.length;i++){
         valores.set(listaMeses[i], listaValores2[i]);
        }*/
        /*riesgo.setLabel("Valores de la Apreciación Final");
        riesgo.set("ENTORNO", listaValores2[1]);
        riesgo.set("COMPETENCIAS PARENTALES", listaValores2[2]);
        riesgo.set("INTERACCIONES FAMILIARES", listaValores2[3]);
        riesgo.set("SEGURIDAD SOCIAL", listaValores2[4]);
        riesgo.set("BIENESTAR DEL NIÑO", listaValores2[5]);
        riesgo.set("VIDA SOCIAL COMUNITARIA", listaValores2[6]);
        riesgo.set("AUTONOMÍA", listaValores2[7]);
        riesgo.set("SALUD FAMILIAR", listaValores2[8]);*/
 
        ChartSeries valores = new ChartSeries();
        valores.setLabel("DIMENSIÓN INTERACCIONES FAMILIARES");
        valores.set(fechafinal, listaValores2[3]); 
        valores.set(fechainicial, listaValores[3]); 
          for(int i=fecha1int;i<fecha2int;i++){
         //seteo los meses intermedios
             valores.set(listaMeses[i], null);
         }
        /*valores.set("ENTORNO", listaValores[1]);
        valores.set("COMPETENCIAS PARENTALES", listaValores[2]);
        valores.set("INTERACCIONES FAMILIARES", listaValores[3]);
        valores.set("SEGURIDAD SOCIAL", listaValores[4]);
        valores.set("BIENESTAR DEL NIÑO", listaValores[5]);
        valores.set("VIDA SOCIAL COMUNITARIA", listaValores[6]);
        valores.set("AUTONOMÍA", listaValores[7]);
        valores.set("SALUD FAMILIAR", listaValores[8]);*/
        
       
       // model.addSeries(confort);
        model.addSeries(riesgo);
        model.addSeries(valores);
       //areaModel.addSeries(confort);
  return model;
        
    }
     
     
     
    
        
    
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
