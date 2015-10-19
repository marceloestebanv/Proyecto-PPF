/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.NCFAS;


import Model.NCFAS.reglasEncontradas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;


import weka.core.converters.ConverterUtils.DataSource;
import weka.associations.Apriori;
import weka.core.Instances;

public class PruebaWekaDao {
    
    
    
   
    private int total;
    private int numXregla1;
    private int numYregla1;
    private int numXregla2;
    private int numYregla2;
    private int numXregla3;
    private int numYregla3;
    private int numXregla4;
    private int numYregla4;
    private int numXregla5;
    private int numYregla5;
    private int numXregla6;
    private int numYregla6;
    private int numXregla7;
    private int numYregla7;
    private int numXregla8;
    private int numYregla8;
    private int numXregla9;
    private int numYregla9;
    private int numXregla10;
    private int numYregla10;
    private int conf1;
    private int conf2;
    private int conf3;
    private int conf4;
    private int conf5;
    private int conf6;
    private int conf7;
    private int conf8;
    private int conf9;
    private int conf10;
    private int count;
    
    public  PruebaWekaDao(){
        System.out.println("Entramos al constructor de pruebawekadao");
        count++;
        System.out.println(count);
    }

    public int getConf1() {
        return conf1;
    }

    public void setConf1(int conf1) {
        this.conf1 = conf1;
    }

    public int getConf2() {
        return conf2;
    }

    public void setConf2(int conf2) {
        this.conf2 = conf2;
    }

    public int getConf3() {
        return conf3;
    }

    public void setConf3(int conf3) {
        this.conf3 = conf3;
    }

    public int getConf4() {
        return conf4;
    }

    public void setConf4(int conf4) {
        this.conf4 = conf4;
    }

    public int getConf5() {
        return conf5;
    }

    public void setConf5(int conf5) {
        this.conf5 = conf5;
    }

    public int getConf6() {
        return conf6;
    }

    public void setConf6(int conf6) {
        this.conf6 = conf6;
    }

    public int getConf7() {
        return conf7;
    }

    public void setConf7(int conf7) {
        this.conf7 = conf7;
    }

    public int getConf8() {
        return conf8;
    }

    public void setConf8(int conf8) {
        this.conf8 = conf8;
    }

    public int getConf9() {
        return conf9;
    }

    public void setConf9(int conf9) {
        this.conf9 = conf9;
    }

    public int getConf10() {
        return conf10;
    }

    public void setConf10(int conf10) {
        this.conf10 = conf10;
    }

    
    
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumXregla1() {
        return numXregla1;
    }

    public void setNumXregla1(int numXregla1) {
        this.numXregla1 = numXregla1;
    }

    public int getNumYregla1() {
        return numYregla1;
    }

    public void setNumYregla1(int numYregla1) {
        this.numYregla1 = numYregla1;
    }

    public int getNumXregla2() {
        return numXregla2;
    }

    public void setNumXregla2(int numXregla2) {
        this.numXregla2 = numXregla2;
    }

    public int getNumYregla2() {
        return numYregla2;
    }

    public void setNumYregla2(int numYregla2) {
        this.numYregla2 = numYregla2;
    }

    public int getNumXregla3() {
        return numXregla3;
    }

    public void setNumXregla3(int numXregla3) {
        this.numXregla3 = numXregla3;
    }

    public int getNumYregla3() {
        return numYregla3;
    }

    public void setNumYregla3(int numYregla3) {
        this.numYregla3 = numYregla3;
    }

    public int getNumXregla4() {
        return numXregla4;
    }

    public void setNumXregla4(int numXregla4) {
        this.numXregla4 = numXregla4;
    }

    public int getNumYregla4() {
        return numYregla4;
    }

    public void setNumYregla4(int numYregla4) {
        this.numYregla4 = numYregla4;
    }

    public int getNumXregla5() {
        return numXregla5;
    }

    public void setNumXregla5(int numXregla5) {
        this.numXregla5 = numXregla5;
    }

    public int getNumYregla5() {
        return numYregla5;
    }

    public void setNumYregla5(int numYregla5) {
        this.numYregla5 = numYregla5;
    }

    public int getNumXregla6() {
        return numXregla6;
    }

    public void setNumXregla6(int numXregla6) {
        this.numXregla6 = numXregla6;
    }

    public int getNumYregla6() {
        return numYregla6;
    }

    public void setNumYregla6(int numYregla6) {
        this.numYregla6 = numYregla6;
    }

    public int getNumXregla7() {
        return numXregla7;
    }

    public void setNumXregla7(int numXregla7) {
        this.numXregla7 = numXregla7;
    }

    public int getNumYregla7() {
        return numYregla7;
    }

    public void setNumYregla7(int numYregla7) {
        this.numYregla7 = numYregla7;
    }

    public int getNumXregla8() {
        return numXregla8;
    }

    public void setNumXregla8(int numXregla8) {
        this.numXregla8 = numXregla8;
    }

    public int getNumYregla8() {
        return numYregla8;
    }

    public void setNumYregla8(int numYregla8) {
        this.numYregla8 = numYregla8;
    }

    public int getNumXregla9() {
        return numXregla9;
    }

    public void setNumXregla9(int numXregla9) {
        this.numXregla9 = numXregla9;
    }

    public int getNumYregla9() {
        return numYregla9;
    }

    public void setNumYregla9(int numYregla9) {
        this.numYregla9 = numYregla9;
    }

    public int getNumXregla10() {
        return numXregla10;
    }

    public void setNumXregla10(int numXregla10) {
        this.numXregla10 = numXregla10;
    }

    public int getNumYregla10() {
        return numYregla10;
    }

    public void setNumYregla10(int numYregla10) {
        this.numYregla10 = numYregla10;
    }
    
     

public int consultaConfianza(String confianza){
int valorConfianza;
String sepConfianza[] =confianza.split("");

if("0".equals(sepConfianza[7])){
    valorConfianza=Integer.parseInt(sepConfianza[9]+sepConfianza[10]);
}
else{   
    valorConfianza=Integer.parseInt(sepConfianza[7]);
    valorConfianza=valorConfianza+99;
}  
return valorConfianza;
}

public void vaciarDataSet() throws IOException
{
ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();  
//Ruta de nuestros archivos
String pathArchivos=(String) servletContext.getRealPath("/")+"archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"  

String cabecera=pathArchivos+"cabecera.txt";
String dataset=pathArchivos+"DataSetSimulado.arff";

    InputStream in = new FileInputStream(cabecera);
    OutputStream out = new FileOutputStream(dataset);

        byte[] buf = new byte[1024];
    int len;
     
    while ((len = in.read(buf)) > 0) {
      out.write(buf, 0, len);
    }
    
    in.close();
    out.close();
    
}
    

public void actualizarItemsGenerales() throws DAOException, IOException{
ItemDao itemdao;
itemdao = new ItemDao();
itemdao.insertaPuntajesItemsGenerales();
}

public String consultaPalabra(String palabra) {
    
    String obtenerNum[] =palabra.split("");
    

     Matcher mat;
    Pattern pat1 = Pattern.compile("DIM1.*");
    Pattern pat2 = Pattern.compile("DIM2.*");
    Pattern pat3 = Pattern.compile("DIM3.*");
    Pattern pat4 = Pattern.compile("DIM4.*");
    Pattern pat5 = Pattern.compile("DIM5.*");
    Pattern pat6 = Pattern.compile("DIM6.*");
    Pattern pat7 = Pattern.compile("DIM7.*");
    Pattern pat8 = Pattern.compile("DIM8.*");
     
    String dim1="Entorno";
    String dim2="Competenicas Parentales";
    String dim3="Interacciones Familiares";
    String dim4="Seguridad Social";
    String dim5="Bienestar del Niño";
    String dim6="Vida Social Comunitaria";
    String dim7="Autonomía";
    String dim8="Salud Familiar";
    
    
    mat = pat1.matcher(palabra);
            if (mat.matches()) {
                palabra=dim1;
            }else{          
            mat = pat2.matcher(palabra);
            if(mat.matches()){
            palabra=dim2;
            }else{
            mat = pat3.matcher(palabra);
            if(mat.matches()){
            palabra=dim3;
            }else{
            mat = pat4.matcher(palabra);
            if(mat.matches()){
            palabra=dim4;
            }else{
            mat = pat5.matcher(palabra);
            if(mat.matches()){
            palabra=dim5;
            }else{
            mat = pat6.matcher(palabra);
            if(mat.matches()){
            palabra=dim6;
            }else{
            mat = pat7.matcher(palabra);
            if(mat.matches()){
            palabra=dim7;
            }else{
            mat = pat8.matcher(palabra);
            if(mat.matches()){
            palabra=dim8;
            }
            }
            }
            }
            }
            }
            }
            }
            
            if(obtenerNum[5].equals("-")){
            
            return palabra+ " la cual adquiere un valor igual a " + obtenerNum[5]+obtenerNum[6];
            
            }else{
            
            return palabra+ " la cual adquiere un valor igual a " + obtenerNum[5];
            }
}    
    
public String consultaValor(String dim2) {

    
    String valorDim2;
    String obtenerNum[] =dim2.split("");
    if(obtenerNum[5].equals("-")){
            
            valorDim2 =obtenerNum[5]+obtenerNum[6];
            
            }else{
            
            valorDim2 = obtenerNum[5];
            }
    
    return valorDim2;
}
    
public List<reglasEncontradas> retornarReglas() throws DAOException, IOException, Exception{

    
  actualizarItemsGenerales();
  ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
  
  //Ruta de nuestros archivos
  String pathArchivos=(String) servletContext.getRealPath("/")+"archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"
  
//CREO FICHEROS PARA  LUEGO GUARDAR LOS RESULTADOS DE WEKA  
    FileWriter fichero = null; 
    FileWriter fichero2 = null; 
    PrintWriter pw = null; 
    
 //CREO UN FICHERO PARA LUEGO GUARDAR LOS RESULTADOS FILTRADOS DE MINERIA   
    //FileWriter ficheroMin = null; 
   // PrintWriter pwMin = null; 
 
 //   FileWriter ficheroMin = null;
   // PrintWriter pwMin = null;

    //LEO DATASET .ARFF
    String dataset=pathArchivos+"DataSetSimulado.arff";
    //String datasettxt=pathArchivos+"datasettxt.txt";

    
  //File fichero2 = new File(dataset);
  try {
   BufferedReader fich = new BufferedReader(new FileReader(dataset));
   //Usamos la clase BufferReadeader para tener acceso a un metodo propio (readLine()) y asi mediante un contador contar las lineas.
   int contadorL = 0;
   String linea;
   try {
    //En este caso la condicion final del while corresponde a null, para indicar el final de linea
    while((linea = fich.readLine()) != null){
     contadorL++;
    }
    contadorL=contadorL-13;
    total=contadorL;
   System.out.println("El número de líneas :" + contadorL);
   } catch (IOException e) {
    // TODO Bloque catch generado automáticamente
    e.printStackTrace();
   }
  } catch (FileNotFoundException e) {
   e.printStackTrace();
  }
   
    int retorno=0;
    List<String> almacenaRetorno = null;
    almacenaRetorno = new ArrayList<String>();
    
    List<String> numVeces = null;
        numVeces = new ArrayList<String>();
        
        List<reglasEncontradas> reglas = null;
    reglas = new ArrayList<reglasEncontradas>();
 
        
        for(int i = 1; i<=10 ;i++){
        numVeces.add("0");
        }
        
    final String nomFich = pathArchivos+"Resultado.txt";  
    Scanner in = null;
    Scanner in2 = null;
    
    // ficheroMin = new FileWriter(pathArchivos+"reporteMineria.txt");
    //pwMin = new PrintWriter(ficheroMin);
    
    int band=0;
 DataSource source = new DataSource(dataset);
 Apriori model = new Apriori();
 
 
 
 
 
    
 try{

    //REALIZAMOS MINERÍA DE DATOS CON WEKA
    Instances data = source.getDataSet();
    model.buildAssociations(data);
    
    //PREPARAR PARA ESCRIBIR LO GENERADO POR WEKA EN UN ARCHIVO RESULTADO.TXT
    fichero = new FileWriter(pathArchivos+"Resultado.txt",true); 
    pw = new PrintWriter(fichero);
    pw.println(model);
    
    
    //SE MUESTRA LOS RESULTADOS OBTENIDOS POR APRIORI
     //System.out.println("LOS RESULTADOS DE APRIORI A DataSetSimulado.arff son:");
    //System.out.println(model);
    //borra el archivo
    BufferedWriter bw = new BufferedWriter(new FileWriter(pathArchivos+"Resultado.txt"));
    bw.write("");
    fichero.close();
    
    
    
    
    //System.out.println("Ahora vamos a leer los resultados obtenidos por apriori");
//BufferedReader bf = new BufferedReader(new FileReader("Resultado.txt"));
	// abre el fichero
	in = new Scanner(new FileReader(nomFich));
	 
	// lee el fichero palabra a palabra
	while (in.hasNext()) {
	 
	// lee primera palabra
	String palabra0 = in.next();
        int numRegla=0;
        float porcentaje;
        float porcentaje2;
        List<String> almacenaAnterior = null;
        almacenaAnterior = new ArrayList<String>();
        String palabra1;
        String palabra2;
        String palabra3;
        String palabra4;
        String palabra5;
        String palabra6;
        String palabra7;
        
        String frase1;
        String frase2;
        String frase3;
        
        Pattern pat = Pattern.compile("DIM2.*"); 
        Pattern pat2 = Pattern.compile("==>");
        Pattern pat3 = Pattern.compile("^\\d.^");
        Pattern pat4 = Pattern.compile("DIM.*");
        
        String num1=("1.");
        String num2=("2.");
        String num3=("3.");
        String num4=("4.");
        String num5=("5.");
        String num6=("6.");
        String num7=("7.");
        String num8=("8.");
        String num9=("9.");
        String num10=("10.");
        
        
        
        
        List<String> dimInvolucradas = null;
        dimInvolucradas = new ArrayList<String>();
        
        
        Matcher mat;
           //PRIMERA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num1.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla1= Integer.parseInt((palabra2));
                    numYregla1= Integer.parseInt((palabra5));
                    conf1=consultaConfianza(palabra6);
                    porcentaje=(numXregla1*100)/total;
                    porcentaje2=(numYregla1*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla1+" veces ("+porcentaje+"%)(X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf1+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla1 = new reglasEncontradas();
                            regla1.setContenido(frase1);
                            regla1.setValorX(numXregla1);
                            regla1.setValorY(numYregla1);
                            regla1.setNumRegla(1);
                            reglas.add(regla1);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla1= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla1= Integer.parseInt((palabra6));
                        porcentaje=(numXregla1*100)/total;    
                        porcentaje2=(numYregla1*100)/total;
                        conf1=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla1+" veces ("+porcentaje+"%)(X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf1+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla1 + numYregla1);
                            
                            reglasEncontradas regla1 = new reglasEncontradas();
                            regla1.setContenido(frase1);
                            regla1.setValorX(numXregla1);
                            regla1.setValorY(numYregla1);
                            regla1.setNumRegla(1);
                            reglas.add(regla1);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla1= Integer.parseInt((palabra5));
                    numYregla1= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla1*100)/total;
                    porcentaje2=(numYregla1*100)/total;
                    conf1=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla1+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla1 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf1+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla2 + numYregla2);
                    reglasEncontradas regla1 = new reglasEncontradas();
                            regla1.setContenido(frase1);
                            regla1.setValorX(numXregla1);
                            regla1.setValorY(numYregla1);
                            regla1.setNumRegla(1);
                            reglas.add(regla1);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla1= Integer.parseInt((palabra3));
                            numYregla1= Integer.parseInt((palabra6));
                            conf1=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla1*100)/total;
                            porcentaje2=(numYregla1*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla1+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf1+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla1 = new reglasEncontradas();
                            regla1.setContenido(frase1);
                            regla1.setValorX(numXregla1);
                            regla1.setValorY(numYregla1);
                            regla1.setNumRegla(1);
                            reglas.add(regla1);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla1= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla1= Integer.parseInt((palabra6));
                            conf1=consultaConfianza(palabra7);
                            porcentaje=(numXregla1*100)/total;
                            porcentaje2=(numYregla1*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla1+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf1+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla1 = new reglasEncontradas();
                            regla1.setContenido(frase1);
                            regla1.setValorX(numXregla1);
                            regla1.setValorY(numYregla1);
                            regla1.setNumRegla(1);
                            reglas.add(regla1);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
            
            
//SEGUNDA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num2.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla2= Integer.parseInt((palabra2));
                    numYregla2= Integer.parseInt((palabra5));
                    conf2=consultaConfianza(palabra6);
                    porcentaje=(numXregla2*100)/total;
                    porcentaje2=(numYregla2*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla2+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf2+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla2 = new reglasEncontradas();
                            regla2.setContenido(frase1);
                            regla2.setValorX(numXregla2);
                            regla2.setValorY(numYregla2);
                            regla2.setNumRegla(2);
                            reglas.add(regla2);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla2= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla2= Integer.parseInt((palabra6));
                        porcentaje=(numXregla2*100)/total;    
                        porcentaje2=(numYregla2*100)/total;
                        conf2=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla2+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf2+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla2 + numYregla2);
                            
                            reglasEncontradas regla2 = new reglasEncontradas();
                            regla2.setContenido(frase1);
                            regla2.setValorX(numXregla2);
                            regla2.setValorY(numYregla2);
                            regla2.setNumRegla(2);
                            reglas.add(regla2);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla2= Integer.parseInt((palabra5));
                    numYregla2= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla2*100)/total;
                    porcentaje2=(numYregla2*100)/total;
                    conf2=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla2+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla2 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf2+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla2 + numYregla2);
                    reglasEncontradas regla2 = new reglasEncontradas();
                            regla2.setContenido(frase1);
                            regla2.setValorX(numXregla2);
                            regla2.setValorY(numYregla2);
                            regla2.setNumRegla(2);
                            reglas.add(regla2);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla2= Integer.parseInt((palabra3));
                            numYregla2= Integer.parseInt((palabra6));
                            conf2=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla2*100)/total;
                            porcentaje2=(numYregla2*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla2+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf2+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla2 = new reglasEncontradas();
                            regla2.setContenido(frase1);
                            regla2.setValorX(numXregla2);
                            regla2.setValorY(numYregla2);
                            regla2.setNumRegla(2);
                            reglas.add(regla2);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla2= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla2= Integer.parseInt((palabra6));
                            conf2=consultaConfianza(palabra7);
                            porcentaje=(numXregla2*100)/total;
                            porcentaje2=(numYregla2*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla2+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf2+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla2 = new reglasEncontradas();
                            regla2.setContenido(frase1);
                            regla2.setValorX(numXregla2);
                            regla2.setValorY(numYregla2);
                            regla2.setNumRegla(2);
                            reglas.add(regla2);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}

//ERCERA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num3.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla3= Integer.parseInt((palabra2));
                    numYregla3= Integer.parseInt((palabra5));
                    conf3=consultaConfianza(palabra6);
                    porcentaje=(numXregla3*100)/total;
                    porcentaje2=(numYregla3*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla3+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf3+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla3 = new reglasEncontradas();
                            regla3.setContenido(frase1);
                            regla3.setValorX(numXregla3);
                            regla3.setValorY(numYregla3);
                            regla3.setNumRegla(3);
                            reglas.add(regla3);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla3= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla3= Integer.parseInt((palabra6));
                        porcentaje=(numXregla3*100)/total;    
                        porcentaje2=(numYregla3*100)/total;
                        conf3=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla3+" veces ("+porcentaje+"%). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf3+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla3 + numYregla3);
                            
                            reglasEncontradas regla3 = new reglasEncontradas();
                            regla3.setContenido(frase1);
                            regla3.setValorX(numXregla3);
                            regla3.setValorY(numYregla3);
                            regla3.setNumRegla(3);
                            reglas.add(regla3);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla3= Integer.parseInt((palabra5));
                    numYregla3= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla3*100)/total;
                    porcentaje2=(numYregla3*100)/total;
                    conf3=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla3+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla3 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf3+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla3 + numYregla3);
                    reglasEncontradas regla3 = new reglasEncontradas();
                            regla3.setContenido(frase1);
                            regla3.setValorX(numXregla3);
                            regla3.setValorY(numYregla3);
                            regla3.setNumRegla(3);
                            reglas.add(regla3);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla3= Integer.parseInt((palabra3));
                            numYregla3= Integer.parseInt((palabra6));
                            conf3=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla3*100)/total;
                            porcentaje2=(numYregla3*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla3+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf3+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla3 = new reglasEncontradas();
                            regla3.setContenido(frase1);
                            regla3.setValorX(numXregla3);
                            regla3.setValorY(numYregla3);
                            regla3.setNumRegla(3);
                            reglas.add(regla3);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla3= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla3= Integer.parseInt((palabra6));
                            conf3=consultaConfianza(palabra7);
                            porcentaje=(numXregla3*100)/total;
                            porcentaje2=(numYregla3*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla3+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf3+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla3 = new reglasEncontradas();
                            regla3.setContenido(frase1);
                            regla3.setValorX(numXregla3);
                            regla3.setValorY(numYregla3);
                            regla3.setNumRegla(3);
                            reglas.add(regla3);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
        
//cuarta RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num4.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla4= Integer.parseInt((palabra2));
                    numYregla4= Integer.parseInt((palabra5));
                    conf4=consultaConfianza(palabra6);
                    porcentaje=(numXregla4*100)/total;
                    porcentaje2=(numYregla4*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla4+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf4+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla4 = new reglasEncontradas();
                            regla4.setContenido(frase1);
                            regla4.setValorX(numXregla4);
                            regla4.setValorY(numYregla4);
                            regla4.setNumRegla(4);
                            reglas.add(regla4);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla4= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla4= Integer.parseInt((palabra6));
                        porcentaje=(numXregla4*100)/total;    
                        porcentaje2=(numYregla4*100)/total;
                        conf4=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla4+" veces ("+porcentaje+"%). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf4+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla4 + numYregla4);
                            
                            reglasEncontradas regla4 = new reglasEncontradas();
                            regla4.setContenido(frase1);
                            regla4.setValorX(numXregla4);
                            regla4.setValorY(numYregla4);
                            regla4.setNumRegla(4);
                            reglas.add(regla4);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla4= Integer.parseInt((palabra5));
                    numYregla4= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla4*100)/total;
                    porcentaje2=(numYregla4*100)/total;
                    conf4=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla4+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla4 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf4+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla4 + numYregla4);
                    reglasEncontradas regla4 = new reglasEncontradas();
                            regla4.setContenido(frase1);
                            regla4.setValorX(numXregla4);
                            regla4.setValorY(numYregla4);
                            regla4.setNumRegla(4);
                            reglas.add(regla4);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla4= Integer.parseInt((palabra3));
                            numYregla4= Integer.parseInt((palabra6));
                            conf4=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla4*100)/total;
                            porcentaje2=(numYregla4*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla4+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf4+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla4 = new reglasEncontradas();
                            regla4.setContenido(frase1);
                            regla4.setValorX(numXregla4);
                            regla4.setValorY(numYregla4);
                            regla4.setNumRegla(4);
                            reglas.add(regla4);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla4= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla4= Integer.parseInt((palabra6));
                            conf4=consultaConfianza(palabra7);
                            porcentaje=(numXregla4*100)/total;
                            porcentaje2=(numYregla4*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla4+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf4+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla4 = new reglasEncontradas();
                            regla4.setContenido(frase1);
                            regla4.setValorX(numXregla4);
                            regla4.setValorY(numYregla4);
                            regla4.setNumRegla(4);
                            reglas.add(regla4);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
           
 //PRIMERA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num5.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla5= Integer.parseInt((palabra2));
                    numYregla5= Integer.parseInt((palabra5));
                    conf5=consultaConfianza(palabra6);
                    porcentaje=(numXregla5*100)/total;
                    porcentaje2=(numYregla5*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla5+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf5+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla5 = new reglasEncontradas();
                            regla5.setContenido(frase1);
                            regla5.setValorX(numXregla5);
                            regla5.setValorY(numYregla5);
                            regla5.setNumRegla(5);
                            reglas.add(regla5);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla5= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla5= Integer.parseInt((palabra6));
                        porcentaje=(numXregla5*100)/total;    
                        porcentaje2=(numYregla5*100)/total;
                        conf5=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla5+" veces ("+porcentaje+"%). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf5+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla5 + numYregla5);
                            
                            reglasEncontradas regla5 = new reglasEncontradas();
                            regla5.setContenido(frase1);
                            regla5.setValorX(numXregla5);
                            regla5.setValorY(numYregla5);
                            regla5.setNumRegla(5);
                            reglas.add(regla5);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla5= Integer.parseInt((palabra5));
                    numYregla5= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla5*100)/total;
                    porcentaje2=(numYregla5*100)/total;
                    conf5=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla5+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla5 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf5+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla5 + numYregla5);
                    reglasEncontradas regla5 = new reglasEncontradas();
                            regla5.setContenido(frase1);
                            regla5.setValorX(numXregla5);
                            regla5.setValorY(numYregla5);
                            regla5.setNumRegla(5);
                            reglas.add(regla5);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla5= Integer.parseInt((palabra3));
                            numYregla5= Integer.parseInt((palabra6));
                            conf5=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla5*100)/total;
                            porcentaje2=(numYregla5*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla5+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf5+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla5 = new reglasEncontradas();
                            regla5.setContenido(frase1);
                            regla5.setValorX(numXregla5);
                            regla5.setValorY(numYregla5);
                            regla5.setNumRegla(5);
                            reglas.add(regla5);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla5= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla5= Integer.parseInt((palabra6));
                            conf5=consultaConfianza(palabra7);
                            porcentaje=(numXregla5*100)/total;
                            porcentaje2=(numYregla5*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla5+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf5+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla5 = new reglasEncontradas();
                            regla5.setContenido(frase1);
                            regla5.setValorX(numXregla5);
                            regla5.setValorY(numYregla5);
                            regla5.setNumRegla(5);
                            reglas.add(regla5);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
            
//SEXTA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num6.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla6= Integer.parseInt((palabra2));
                    numYregla6= Integer.parseInt((palabra5));
                    conf6=consultaConfianza(palabra6);
                    porcentaje=(numXregla6*100)/total;
                    porcentaje2=(numYregla6*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla6+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf6+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla6 = new reglasEncontradas();
                            regla6.setContenido(frase1);
                            regla6.setValorX(numXregla6);
                            regla6.setValorY(numYregla6);
                            regla6.setNumRegla(6);
                            reglas.add(regla6);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla6= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla6= Integer.parseInt((palabra6));
                        porcentaje=(numXregla6*100)/total;    
                        porcentaje2=(numYregla6*100)/total;
                        conf6=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla6+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf6+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla6 + numYregla6);
                            
                            reglasEncontradas regla6 = new reglasEncontradas();
                            regla6.setContenido(frase1);
                            regla6.setValorX(numXregla6);
                            regla6.setValorY(numYregla6);
                            regla6.setNumRegla(6);
                            reglas.add(regla6);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla6= Integer.parseInt((palabra5));
                    numYregla6= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla6*100)/total;
                    porcentaje2=(numYregla6*100)/total;
                    conf6=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla6+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf6+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla6 + numYregla6);
                    reglasEncontradas regla6 = new reglasEncontradas();
                            regla6.setContenido(frase1);
                            regla6.setValorX(numXregla6);
                            regla6.setValorY(numYregla6);
                            regla6.setNumRegla(6);
                            reglas.add(regla6);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla6= Integer.parseInt((palabra3));
                            numYregla6= Integer.parseInt((palabra6));
                            conf6=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla6*100)/total;
                            porcentaje2=(numYregla6*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla6+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf6+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla6 = new reglasEncontradas();
                            regla6.setContenido(frase1);
                            regla6.setValorX(numXregla6);
                            regla6.setValorY(numYregla6);
                            regla6.setNumRegla(6);
                            reglas.add(regla6);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla6= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla6= Integer.parseInt((palabra6));
                            conf6=consultaConfianza(palabra7);
                            porcentaje=(numXregla6*100)/total;
                            porcentaje2=(numYregla6*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla6+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf6+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla6 = new reglasEncontradas();
                            regla6.setContenido(frase1);
                            regla6.setValorX(numXregla6);
                            regla6.setValorY(numYregla6);
                            regla6.setNumRegla(6);
                            reglas.add(regla6);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}

//SEPTIMA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num7.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla7= Integer.parseInt((palabra2));
                    numYregla7= Integer.parseInt((palabra5));
                    conf7=consultaConfianza(palabra6);
                    porcentaje=(numXregla7*100)/total;
                    porcentaje2=(numYregla7*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla7+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf7+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla7 = new reglasEncontradas();
                            regla7.setContenido(frase1);
                            regla7.setValorX(numXregla7);
                            regla7.setValorY(numYregla7);
                            regla7.setNumRegla(7);
                            reglas.add(regla7);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla7= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla7= Integer.parseInt((palabra6));
                        porcentaje=(numXregla7*100)/total;    
                        porcentaje2=(numYregla7*100)/total;
                        conf7=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla7+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf7+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla7 + numYregla7);
                            
                            reglasEncontradas regla7 = new reglasEncontradas();
                            regla7.setContenido(frase1);
                            regla7.setValorX(numXregla7);
                            regla7.setValorY(numYregla7);
                            regla7.setNumRegla(7);
                            reglas.add(regla7);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla7= Integer.parseInt((palabra5));
                    numYregla7= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla7*100)/total;
                    porcentaje2=(numYregla7*100)/total;
                    conf7=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla7+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla7 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf7+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla7 + numYregla7);
                    reglasEncontradas regla7 = new reglasEncontradas();
                            regla7.setContenido(frase1);
                            regla7.setValorX(numXregla7);
                            regla7.setValorY(numYregla7);
                            regla7.setNumRegla(7);
                            reglas.add(regla7);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla7= Integer.parseInt((palabra3));
                            numYregla7= Integer.parseInt((palabra6));
                            conf7=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla7*100)/total;
                            porcentaje2=(numYregla7*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla7+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf7+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla7 = new reglasEncontradas();
                            regla7.setContenido(frase1);
                            regla7.setValorX(numXregla7);
                            regla7.setValorY(numYregla7);
                            regla7.setNumRegla(7);
                            reglas.add(regla7);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla7= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla7= Integer.parseInt((palabra6));
                            conf7=consultaConfianza(palabra7);
                            porcentaje=(numXregla7*100)/total;
                            porcentaje2=(numYregla7*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla7+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf7+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla7 = new reglasEncontradas();
                            regla7.setContenido(frase1);
                            regla7.setValorX(numXregla7);
                            regla7.setValorY(numYregla7);
                            regla7.setNumRegla(7);
                            reglas.add(regla7);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}

//OCTAVA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num8.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla8= Integer.parseInt((palabra2));
                    numYregla8= Integer.parseInt((palabra5));
                    conf8=consultaConfianza(palabra6);
                    porcentaje=(numXregla8*100)/total;
                    porcentaje2=(numYregla8*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla8+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf8+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla8 = new reglasEncontradas();
                            regla8.setContenido(frase1);
                            regla8.setValorX(numXregla8);
                            regla8.setValorY(numYregla8);
                            regla8.setNumRegla(8);
                            reglas.add(regla8);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla8= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla8= Integer.parseInt((palabra6));
                        porcentaje=(numXregla8*100)/total;    
                        porcentaje2=(numYregla8*100)/total;
                        conf8=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla8+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf8+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla8 + numYregla8);
                            
                            reglasEncontradas regla8 = new reglasEncontradas();
                            regla8.setContenido(frase1);
                            regla8.setValorX(numXregla8);
                            regla8.setValorY(numYregla8);
                            regla8.setNumRegla(8);
                            reglas.add(regla8);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla8= Integer.parseInt((palabra5));
                    numYregla8= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla8*100)/total;
                    porcentaje2=(numYregla8*100)/total;
                    conf8=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla8+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla8 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf8+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla8 + numYregla8);
                    reglasEncontradas regla8 = new reglasEncontradas();
                            regla8.setContenido(frase1);
                            regla8.setValorX(numXregla8);
                            regla8.setValorY(numYregla8);
                            regla8.setNumRegla(8);
                            reglas.add(regla8);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla8= Integer.parseInt((palabra3));
                            numYregla8= Integer.parseInt((palabra6));
                            conf8=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla8*100)/total;
                            porcentaje2=(numYregla8*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla8+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf8+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla8 = new reglasEncontradas();
                            regla8.setContenido(frase1);
                            regla8.setValorX(numXregla8);
                            regla8.setValorY(numYregla8);
                            regla8.setNumRegla(8);
                            reglas.add(regla8);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla8= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla8= Integer.parseInt((palabra6));
                            conf8=consultaConfianza(palabra7);
                            porcentaje=(numXregla8*100)/total;
                            porcentaje2=(numYregla8*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla8+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf8+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla8 = new reglasEncontradas();
                            regla8.setContenido(frase1);
                            regla8.setValorX(numXregla8);
                            regla8.setValorY(numYregla8);
                            regla8.setNumRegla(8);
                            reglas.add(regla8);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}

 //NOVENA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num9.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla9= Integer.parseInt((palabra2));
                    numYregla9= Integer.parseInt((palabra5));
                    conf9=consultaConfianza(palabra6);
                    porcentaje=(numXregla9*100)/total;
                    porcentaje2=(numYregla9*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla9+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf9+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla9 = new reglasEncontradas();
                            regla9.setContenido(frase1);
                            regla9.setValorX(numXregla9);
                            regla9.setValorY(numYregla9);
                            regla9.setNumRegla(9);
                            reglas.add(regla9);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla9= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla9= Integer.parseInt((palabra6));
                        porcentaje=(numXregla9*100)/total;    
                        porcentaje2=(numYregla9*100)/total;
                        conf9=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla9+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf9+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla9 + numYregla9);
                            
                            reglasEncontradas regla9 = new reglasEncontradas();
                            regla9.setContenido(frase1);
                            regla9.setValorX(numXregla9);
                            regla9.setValorY(numYregla9);
                            regla9.setNumRegla(9);
                            reglas.add(regla9);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla9= Integer.parseInt((palabra5));
                    numYregla9= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla9*100)/total;
                    porcentaje2=(numYregla9*100)/total;
                    conf9=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla9+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla9 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf9+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla9 + numYregla9);
                    reglasEncontradas regla9 = new reglasEncontradas();
                            regla9.setContenido(frase1);
                            regla9.setValorX(numXregla9);
                            regla9.setValorY(numYregla9);
                            regla9.setNumRegla(9);
                            reglas.add(regla9);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla9= Integer.parseInt((palabra3));
                            numYregla9= Integer.parseInt((palabra6));
                            conf9=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla9*100)/total;
                            porcentaje2=(numYregla9*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla9+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf9+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla9 = new reglasEncontradas();
                            regla9.setContenido(frase1);
                            regla9.setValorX(numXregla9);
                            regla9.setValorY(numYregla9);
                            regla9.setNumRegla(9);
                            reglas.add(regla9);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla9= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla9= Integer.parseInt((palabra6));
                            conf9=consultaConfianza(palabra7);
                            porcentaje=(numXregla9*100)/total;
                            porcentaje2=(numYregla9*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla9+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf9+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla9 = new reglasEncontradas();
                            regla9.setContenido(frase1);
                            regla9.setValorX(numXregla9);
                            regla9.setValorY(numYregla9);
                            regla9.setNumRegla(9);
                            reglas.add(regla9);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
         
//DECIMA RELGA DE ASOCIACIÓN
            //BLOQUE 1
            //COMPROBAR SI ESTÁ DIM2 INVOLUCRADA
            mat = pat3.matcher(palabra0);
            //
            if(num10.equals(palabra0)){
                if(in.hasNext()){
                palabra1=in.next(); // SEGUNDA PALABRA             
                //GUARDO LO LEIDO
                almacenaAnterior.add(palabra0);
                almacenaAnterior.add(palabra1);               
                mat = pat.matcher(palabra1);
                //PALABRA 1 ES DIMENSION 2?
                if (mat.matches()) { 
                 
                dimInvolucradas.add(palabra1);    
                String valorDim2=consultaValor(palabra1);    
               //REVISAMOS LO QUE VIENE DESPUES DE DIM2=
                    if(in.hasNext()){
                    palabra2=in.next(); //PALABRA 3 EN EL CAMINO FELIZ
                    if(in.hasNext()){
                    palabra3=in.next(); //PALABRA 4 EN EL CAMINO FELIZ                    
                    almacenaAnterior.add(palabra2);
                    almacenaAnterior.add(palabra3);                   
                    mat = pat2.matcher(palabra3);                    
               //SI ES UNA ==> ENTONCES
                if (mat.matches()) {                   
                    if(in.hasNext()){
                    palabra4=in.next(); //PALABRA 5 CAMINO FELIZ
                    dimInvolucradas.add(palabra4);
                    palabra4=consultaPalabra(palabra4);
                    palabra5=in.next(); //VALOR DE VECES DESPUES DE =>
                    palabra6=in.next();
                    numXregla10= Integer.parseInt((palabra2));
                    numYregla10= Integer.parseInt((palabra5));
                    conf10=consultaConfianza(palabra6);
                    porcentaje=(numXregla10*100)/total;
                    porcentaje2=(numYregla10*100)/total;     
                    frase1=("De un total de "+total+" NCFAS, se cumple que la dimension Competencias Parentales adquiere un valor igual a "+valorDim2+" una cantidad de "+numXregla10+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+palabra4+ ", una cantidad de "+palabra5+" vececs ("+porcentaje2+"%) (Y). \n Es decir esta regla se cumple el "+conf10+"% de las veces. \n" ); 
                    almacenaRetorno.add(frase1);
                    
                    numVeces.add(1,palabra2+" "+palabra5);
                    
                    reglasEncontradas regla10 = new reglasEncontradas();
                            regla10.setContenido(frase1);
                            regla10.setValorX(numXregla10);
                            regla10.setValorY(numYregla10);
                            regla10.setNumRegla(10);
                            reglas.add(regla10);
                    System.out.println("ENTRAMOS ACÁ");
                   // band=1;
                    
                }}
                
                // LA REGLA TIENE MAS DE UNA DIMENSIÓN INVOLUCRADA ANTES DE ==>
                else{
                    if(in.hasNext()){
                    palabra4=in.next(); // DEBERÍA SER FLECHA 
                    //COMPROBAMOS SI LA ==> ESTÁ EN LA cuarta POSICIÓN
                    mat = pat2.matcher(palabra4);
                    if(mat.matches()){
                        if(in.hasNext()){
                        palabra5=in.next();
                        dimInvolucradas.add(almacenaAnterior.get(2));
                        String dimension=consultaPalabra(almacenaAnterior.get(2));
                        dimInvolucradas.add(palabra5);
                        
                        palabra5=consultaPalabra(palabra5);
                        palabra6=in.next();
                        palabra7=in.next();
                        numXregla10= Integer.parseInt((almacenaAnterior.get(3)));
                        numYregla10= Integer.parseInt((palabra6));
                        porcentaje=(numXregla10*100)/total;    
                        porcentaje2=(numYregla10*100)/total;
                        conf10=consultaConfianza(palabra7);
                         
                        frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión Competencias Parentales adquiere un valor igual a "+valorDim2+"  junto con la dimensión " + dimension + ", esto ocurre una cantidad de "+numXregla10+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión "+ palabra5 + " una cantidad de "+palabra6 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf10+"% de las veces.\n");    
                            almacenaRetorno.add(frase1);
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            System.out.println("LOS VALORES DE LA REGLA 1 SON: "+ numXregla10 + numYregla10);
                            
                            reglasEncontradas regla10 = new reglasEncontradas();
                            regla10.setContenido(frase1);
                            regla10.setValorX(numXregla10);
                            regla10.setValorY(numYregla10);
                            regla10.setNumRegla(10);
                            reglas.add(regla10);
                                  
                            
                        }   
                    }
                    }  
                }
                    }
                }}
             
                //BLOQUE 2
                //ACÁ SE COMPRUEBA SI SE ENCUENTRA LA DIMENSIÓN 2 EN SEGUNDA POSICIÓN           
                if(in.hasNext()){
                palabra2=in.next(); // 
                if(in.hasNext()){
                palabra3=in.next(); //               
                //GUARDAMOS LO LEÍDO
                almacenaAnterior.add(palabra2);
                almacenaAnterior.add(palabra3);              
                mat = pat2.matcher(palabra3);              
                // SI LA PALABRA 3 ES UNA FLECHA, ENTONCES HAY SOLO UNA DIMENSIÓN INVOLUCRADA
                if (mat.matches()) {              
                if(in.hasNext()){
                palabra4=in.next();  
                
                // DESPUES DE LA ==> ESTÁ INVOLUCRADA LA DIM2 ?
                mat = pat.matcher(palabra4);
                if(mat.matches()){
                    
                    palabra5=in.next();
                    palabra6=in.next();
                    String valorDim2=consultaValor(palabra4);
                    String dimension=consultaPalabra(almacenaAnterior.get(1));
                    numXregla10= Integer.parseInt((palabra5));
                    numYregla10= Integer.parseInt((almacenaAnterior.get(2)));
                    porcentaje=(numXregla10*100)/total;
                    porcentaje2=(numYregla10*100)/total;
                    conf10=consultaConfianza(palabra6);
                     frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + ", junto con la dimensión "+palabra5+ ", una cantidad de "+numXregla10+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales adquiere un valor igual a " +valorDim2+ ", una cantidad de "+numYregla10 +" veces ("+porcentaje2+"%)(Y). \n Es decir esta regla se cumple el "+conf10+"% de las veces.\n");
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2 
                    //System.out.println(frase1); 
                    almacenaRetorno.add(frase1); // CAMINO FELIZ DIM2 EN POSICIÓN 2  
                  //  band=1;
                    numVeces.add(1,palabra5+" "+almacenaAnterior.get(2));
                    
                    System.out.println("ENTRAMOS ACÁ"+ numXregla10 + numYregla10);
                    reglasEncontradas regla10 = new reglasEncontradas();
                            regla10.setContenido(frase1);
                            regla10.setValorX(numXregla10);
                            regla10.setValorY(numYregla10);
                            regla10.setNumRegla(10);
                            reglas.add(regla10);
                    
                            
                }               
                }
                }               
                else{                   
                    mat = pat.matcher(palabra2);
                    if(mat.matches()){
                        String valorDim2=consultaValor(palabra2);
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        if(in.hasNext()){ 
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            palabra5=consultaPalabra(palabra5);
                            palabra6=in.next();
                            palabra7=in.next();
                            numXregla10= Integer.parseInt((palabra3));
                            numYregla10= Integer.parseInt((palabra6));
                            conf10=consultaConfianza(palabra7);
                            
                            porcentaje=(numXregla10*100)/total;
                            porcentaje2=(numYregla10*100)/total;
                          
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión  Competencias Parentales adquiere un valor igual a " +valorDim2+ " junto con la dimensión " + dimension + ", una cantidad de "+numXregla10+" veces ("+porcentaje+"%) (X). Esto afecta a la dimensión " + palabra5 + " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf10+"% de las veces.\n");
                            
                            numVeces.add(1,palabra3+" "+palabra6);
                            reglasEncontradas regla10 = new reglasEncontradas();
                            regla10.setContenido(frase1);
                            regla10.setValorX(numXregla10);
                            regla10.setValorY(numYregla10);
                            regla10.setNumRegla(10);
                            reglas.add(regla10);
                                                
                            almacenaRetorno.add(frase1);;
                          //  band=1;
                        }                      
                        }                       
                        }                   
                    }                   
                    //NO HAY DIMENSIÓN 2 NI EN LA PRIMERA NI EN LA SEGUNDA POSICIÓN 
                    else {                  
                        if(in.hasNext()){
                        palabra4=in.next();
                        if(in.hasNext()){
                        palabra5=in.next();
                        
                        if(in.hasNext()){                           
                            mat = pat.matcher(palabra5);
                            if(mat.matches()){
                            palabra6=in.next();
                            palabra7=in.next();
                             String valorDim2=consultaValor(palabra5);
                            String dimension=consultaPalabra(almacenaAnterior.get(1));
                            String dimension2=consultaPalabra(almacenaAnterior.get(2));
                            
                            numXregla10= Integer.parseInt((almacenaAnterior.get(3)));
                            numYregla10= Integer.parseInt((palabra6));
                            conf10=consultaConfianza(palabra7);
                            porcentaje=(numXregla10*100)/total;
                            porcentaje2=(numYregla10*100)/total;
                            
                            frase1=("De un total de "+total+" NCFAS, se cumple que la dimensión " + dimension + " junto con la dimensión " + dimension2 + " , una cantidad de " + numXregla10+ " veces ("+porcentaje+"%) (X). Esto afecta a la dimensión Competencias Parentales la cual adquiere un valor igual a "+valorDim2+ " , una cantidad de " + palabra6 + " veces ("+porcentaje2+"%)(Y).\n Es decir esta regla se cumple el "+conf10+"% de las veces.\n");
                            numVeces.add(1,almacenaAnterior.get(3)+" "+palabra6);
                            
                            reglasEncontradas regla10 = new reglasEncontradas();
                            regla10.setContenido(frase1);
                            regla10.setValorX(numXregla10);
                            regla10.setValorY(numYregla10);
                            regla10.setNumRegla(10);
                            reglas.add(regla10);                    

                    almacenaRetorno.add(frase1);
                    //band=1;
                            }     
                        }
                        }
                        }   
                    }      
                }
                }}}}
            
                
                
        }// while (in.hasNext())
	 
 

 
 
 }  catch (FileNotFoundException e) {
	 //System.out.println("Error abriendo el fichero "+nomFich);
        
	 } finally {
	 if (in!=null){
	 in.close();
         
         vaciarDataSet();
         
         
         
         }
	 } // try
       
    //GUARDO LO GENERADO Y LUEGO LO RETORNO
return reglas;
}



}
