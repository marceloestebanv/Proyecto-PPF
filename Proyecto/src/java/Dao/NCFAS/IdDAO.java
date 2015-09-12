/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.NCFAS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author Marcelo Verdugo
 */
public class IdDAO {

    public IdDAO() {
    }
    
    
    
    
    
    
   public void guardarID(int id) throws Exception{
 
     FileWriter fichero = null; 
     PrintWriter pw = null; 
     //BufferedWriter bw = new BufferedWriter(new FileWriter(pathArchivos+"infoid.txt"));
    //bw.write(id);
     try{
      ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
      String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; 
       System.out.println(pathArchivos+"infoid.txt");
       fichero = new FileWriter(pathArchivos+"infoid.txt");
       pw = new PrintWriter(fichero);
       pw.println(id);
       pw.println("");
       System.out.println("biiieennntoo");
       
    }catch(Exception e){
        throw e;
    } finally{
        fichero.close();
        }
    
    
}
   
public int retornarID() throws DAOException{
        

      
int retorno=0;
 try{
ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/";      
BufferedReader bf = new BufferedReader(new FileReader(pathArchivos+"infoid.txt"));
String linea1=bf.readLine();
/*String temp="";
String[] lineas;
lineas = new String[30];*/

int i=0;
retorno=Integer.parseInt(linea1);
/*while(temp!=null){
    
    temp = bf.readLine();
    if(temp==null)
        break;    
    retorno = Integer.parseInt(temp);
    i++;
} */ 

 }catch (IOException | NumberFormatException ex) {
            Logger.getLogger(DimensionesDao.class.getName()).log(Level.SEVERE, null, ex);
        }        

 System.out.println("estamos retornando esto -->"+retorno);
return retorno;

}

}