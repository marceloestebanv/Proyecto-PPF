/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.NCFAS;

import Model.NCFAS.Item;
import Model.NCFAS.Ncfas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author Marcelo Verdugo
 */
public class ItemDao extends DAO{
    
    
   // private Object servletContext;
  //  public void ItemDao(){}

   /* public void eliminarNcfas(int idncfasEliminar) throws Exception{
    
     System.err.println("llegamos a eliminar");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIOno los items por el ncfas
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("DROP * from item WHERE ncfas_idncfas=?");
            stmt3.setInt(1,idncfasEliminar);
           rs2=stmt3.executeQuery();
    
    
    
    }*/

  
    
    
    
public void obtenerIdNcfas() throws Exception{
           
         Connection con = null;
        Statement stmt2 = null;
        ResultSet rs = null;
        try {
            int retorno ;
            this.Conectar();
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               Ncfas tempNcfas = new Ncfas();
               retorno =  rs.getInt(1);
                /*tempNcfas.setIdncfas((int) rs.getObject(1));*/
                System.out.println(retorno);
            } 
        } catch (SQLException e) {
           
        }  finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (SQLException e) {
            }
        
            
        }
    
}

 public void actualizarItems1(int valor,int count) throws IOException  {
 
     System.err.println("llegamos a la dimension 1");
     Statement stmt2 = null;

     //ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
      //String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,1);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD
        



        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
           
            
        } 
    }
 
public void actualizarItems2(int valor,int count) throws IOException  {
     

     
      count=count-7;
     System.err.println("llegamos a la dimension 2");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,2);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD



        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            
            
        } 
    }

public void actualizarItems3(int valor,int count) throws IOException  {
     

     FileWriter fichero = null; 
     PrintWriter pw = null;
      count=count-15;
     System.err.println("llegamos a la dimension 3");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,3);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
          
            
        }
    }

public void actualizarItems4(int valor,int count) throws IOException  {
     

    
      count=count-23;
     System.err.println("llegamos a la dimension 4");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,4);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
          
            
        }
    }

public void actualizarItems5(int valor,int count) throws IOException  {
     

      count=count-31;
     System.err.println("llegamos a la dimension 5");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,5);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            
            
        }
    }

public void actualizarItems6(int valor,int count) throws IOException  {
     

      count=count-38;
     System.err.println("llegamos a la dimension 6");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,6);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            
            
        }
    }

public void actualizarItems7(int valor,int count) throws IOException  {
     

      count=count-44;
     System.err.println("llegamos a la dimension 7");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,7);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            
            
        }
    }

public void actualizarItems8(int valor,int count) throws IOException  {
     
   /* ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
     
    String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"
     FileWriter fichero = null; 
     PrintWriter pw = null;
     */
    count=count-50;
     System.err.println("llegamos a la dimension 8");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
            //OBTENGO LOS ID DE LOS ITEMS DE LA DIMENSION 1
            PreparedStatement stmt3 = null;
            stmt3 = con.prepareStatement("SELECT iditem from item WHERE ncfas_idncfas=? and dimension=?");
            stmt3.setInt(1,retorno);
            stmt3.setInt(2,8);
           rs2=stmt3.executeQuery();
 
            
            
            if (rs2.relative(count)) {
               iditem =  rs2.getInt(1);
                System.out.println(iditem);
            } 
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE item SET valor=? WHERE iditem=?");
        stmt.setInt(1,valor);
        stmt.setInt(2,iditem);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS EL ITEM CUYO ID ES:" +iditem);
        
    
       /* acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD
fichero = new FileWriter(pathArchivos+"DataSetSimulado.arff",true); 
pw = new PrintWriter(fichero);

if(bandera==1){
    System.out.println("llegamos a insertar en el archivo arff");
    pw.print(valor);
    pw.println("");
}*/
        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            //fichero.close();
            
        }
    }

public void insertarEnArff(int valor1,int valor2,int valor3,int valor4,int valor5,int valor6,int valor7,int valor8) throws IOException  {
     
    ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
      String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"
     FileWriter fichero = null; 
     PrintWriter pw = null;
     
     System.err.println("llegamos a insertar los numeros al arff");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        fichero = new FileWriter(pathArchivos+"DataSetSimulado.arff",true);
        pw = new PrintWriter(fichero);
        System.out.println("llegamos a insertar en el archivo arff");
        pw.print(valor1);
        pw.print("  ");
        pw.print(valor2);
        pw.print("  ");
        pw.print(valor3);
        pw.print("  ");
        pw.print(valor4);
        pw.print("  ");
        pw.print(valor5);
        pw.print("  ");
        pw.print(valor6);
        pw.print("  ");
        pw.print(valor7);
        pw.print("  ");
        pw.print(valor8);
    pw.println("");
    fichero.close();
    }

public void actualizarObs(String obs) throws IOException  {
     
    
      
     System.err.println("llegamos ingrsar la obs");
     Statement stmt2 = null;
     
        ResultSet rs = null;
        ResultSet rs2 = null;
        int retorno = 0;
        int iditem=0;
        try{
            this.Conectar();
            
            //SELECCIONO EL ULTIMO ID INGRESADO
            
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
            
         
           PreparedStatement stmt = null;         
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("UPDATE ncfas SET observacion=? WHERE idncfas=?");
            
        stmt.setString(1,obs);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        System.out.println("ACTUALIZAMOS el ncfas cuyo id  es:" +retorno);
        
   
        }
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
 
        }finally { 
            this.Cerrar();
            
            
        }
    }


public void ingresarItems1(int valor) throws IOException  {
     
   
     System.err.println("llegasmos a la dimension 1");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,1,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
           
            
        }
    } 
 
 public void ingresarItems2(int valor) throws IOException  {
     
   
     System.err.println("llegasos a la dimension 2");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,2,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
            
            
        }
    }
 
 public void ingresarItems3(int valor) throws IOException  {
     
    
    
     System.err.println("llegasos a la dimension 3");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,3,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
            
            
        }
    }
 
 public void ingresarItems4(int valor) throws IOException  {
     
      
     System.err.println("llegasos a la dimension 4");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,4,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
            
            
        }
    }
 
 public void ingresarItems5(int valor) throws IOException  {
     
    
    
     System.err.println("llegasos a la dimension 5");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,5,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

        } catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
           
            
        }
    }
 
 public void ingresarItems6(int valor) throws IOException  {
     
    
   
     System.err.println("llegasos a la dimension 6");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,6,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
           
            
        }
    }
 
 public void ingresarItems7(int valor) throws IOException  {
     
    
    
     System.err.println("llegasos a la dimension 7");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,7,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
           
            
        }
    }
 
 public void ingresarItems8(int valor) throws IOException  {
     
    
     
     System.err.println("llegasos a la dimension 8");
     Statement stmt2 = null;
        ResultSet rs = null;
        int retorno = 0;
        try{
            this.Conectar();
            PreparedStatement stmt = null;
            stmt2 = con.createStatement();
            rs = stmt2.executeQuery("SELECT MAX(idncfas) as idncfas from ncfas");
            if (rs.next()) {
               retorno =  rs.getInt(1);
                System.out.println(retorno);
            } 
           /* for(int i=0;i<=respuestas.length;i++){*/
            stmt = con.prepareStatement("INSERT INTO item (valor,dimension,ncfas_idncfas)"
                    + " values (?,8,?)");
        stmt.setInt(1,valor);
        stmt.setInt(2,retorno);
        stmt.executeUpdate();
        
        
       // acá escribimos en el archivo de texto lo mismo que escrcibimos en la BD

}
       catch (SQLException sqle) {
            System.out.println("SQLState: "
                    + sqle.getSQLState());
            System.out.println("SQLErrorCode: "
                    + sqle.getErrorCode());
            sqle.printStackTrace();
        } finally { 
            this.Cerrar();
            
            
        }
    }
 
 
 
  
    
    
    public List<Item> mostrarListItem() {
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

       List<Item> lista= new ArrayList();

        try {
            
           this.Conectar();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM ncfas");

            while (rs.next()) {
               Item tempItem = new Item();
                tempItem.setDimension((int) rs.getObject(1));
                tempItem.setValor((int)rs.getObject(2));
                
                lista.add(tempItem);
            } 

        } catch (SQLException e) {
           
        }  finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (SQLException e) {
            }
        }

        return lista;

    }
    
    public Integer[] obtenerPuntajesDim1(int dim,int id) throws DAOException {
        int i=1;
        Integer[] listaValores;
        listaValores = new Integer[9];
        
        System.err.println("llegasos a la dimension 1 a obtener los valores ");
        //Statement stmt2 = null;
        ResultSet rs = null;
        try{
            this.Conectar();
            
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt.setInt(1,dim);
            stmt.setInt(2,id);
            rs=stmt.executeQuery();
        System.out.println("query hecha");
                while(rs.next()){
                    listaValores[i]=rs.getInt("valor");
                    i++;
                }

        } catch (SQLException ex) {
            Logger.getLogger(DimensionesDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        this.Cerrar();   
        return listaValores;
    }
    
    public Integer[] obtenerPuntajesItemsGenerales(int id) throws DAOException {
        int i=1;
        int j=1;
        int k=1;
        int l=1;
        int m=1;
        int n=1;
        int o=1;
        int p=1;
        
        Integer[] listaValores;
        listaValores = new Integer[8];
        Integer[] listaValores2;
        listaValores2 = new Integer[9];
        Integer[] listaValores3;
        listaValores3 = new Integer[9];
        Integer[] listaValores4;
        listaValores4 = new Integer[9];
        Integer[] listaValores5;
        listaValores5 = new Integer[9];
        Integer[] listaValores6;
        listaValores6 = new Integer[9];
        Integer[] listaValores7;
        listaValores7 = new Integer[9];
        Integer[] listaValores8;
        listaValores8 = new Integer[9];
        
        Integer[] listaValoresFinales;
        listaValoresFinales = new Integer[9];
        
        System.err.println("llegasos a obtener todos los items generales ");
        //Statement stmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;
        ResultSet rs6 = null;
        ResultSet rs7 = null;
        ResultSet rs8 = null;
        try{
            this.Conectar();
            
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt.setInt(1,1);
            stmt.setInt(2,id);
            rs=stmt.executeQuery();
        System.out.println("query hecha");
                while(rs.next()){
                    listaValores[i]=rs.getInt("valor");
                    if(i==7){
                        listaValoresFinales[1]=listaValores[i];
                    }
                    i++;
                }
                
             PreparedStatement stmt2 = null;
            stmt2 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt2.setInt(1,2);
            stmt2.setInt(2,id);
            rs2=stmt2.executeQuery();
        System.out.println("query hecha");
                while(rs2.next()){
                    listaValores2[j]=rs2.getInt("valor");
                    if(j==8){
                        listaValoresFinales[2]=listaValores2[j];
                    }
                    j++;
                }
                
             PreparedStatement stmt3 = null;   
            stmt3 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt3.setInt(1,3);
            stmt3.setInt(2,id);
            rs3=stmt3.executeQuery();
        System.out.println("query hecha");
                while(rs3.next()){
                    listaValores3[k]=rs3.getInt("valor");
                    if(i==8){
                        listaValoresFinales[3]=listaValores3[k];
                    }
                    k++;
                }
                
             PreparedStatement stmt4 = null;   
            stmt4 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt4.setInt(1,4);
            stmt4.setInt(2,id);
            rs4=stmt4.executeQuery();
        System.out.println("query hecha");
                while(rs4.next()){
                    listaValores4[l]=rs4.getInt("valor");
                    if(l==8){
                        listaValoresFinales[4]=listaValores4[l];
                    }
                    l++;
                }
                
            PreparedStatement stmt5 = null;    
            stmt5 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt5.setInt(1,5);
            stmt5.setInt(2,id);
            rs5=stmt5.executeQuery();
        System.out.println("query hecha");
                while(rs5.next()){
                    listaValores5[m]=rs5.getInt("valor");
                    if(m==7){
                        listaValoresFinales[5]=listaValores5[m];
                    }
                    m++;
                }
                
             PreparedStatement stmt6 = null;  
            stmt6 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt6.setInt(1,6);
            stmt6.setInt(2,id);
            rs6=stmt6.executeQuery();
        System.out.println("query hecha");
                while(rs6.next()){
                    listaValores6[n]=rs6.getInt("valor");
                    if(n==6){
                        listaValoresFinales[6]=listaValores6[n];
                    }
                    n++;
                }
            PreparedStatement stmt7 = null;   
            stmt7 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt7.setInt(1,7);
            stmt7.setInt(2,id);
            rs7=stmt7.executeQuery();
        System.out.println("query hecha");
                while(rs7.next()){
                    listaValores7[o]=rs7.getInt("valor");
                    if(o==6){
                        listaValoresFinales[7]=listaValores7[o];
                    }
                    o++;
                }
                
            PreparedStatement stmt8 = null;
            stmt8 = con.prepareStatement("SELECT valor FROM item where dimension= ? and ncfas_idncfas= ?");
            stmt8.setInt(1,8);
            stmt8.setInt(2,id);
            rs8=stmt8.executeQuery();
        System.out.println("query hecha");
                while(rs8.next()){
                    listaValores8[p]=rs8.getInt("valor");
                    if(p==8){
                        listaValoresFinales[8]=listaValores8[p];
                    }
                    p++;
                }

        } catch (SQLException ex) {
            Logger.getLogger(DimensionesDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        this.Cerrar();   
        return listaValoresFinales;
    }
    
    
    public List<Ncfas> mostrarNcfas() throws Exception{
         
        List<Ncfas> lista;
        ResultSet rs=null;
        
         
        try {
                
                this.Conectar(); 
                
                
                PreparedStatement stmt = null;
                lista=new ArrayList();
                System.out.println("llegamos acá");
                rs=stmt.executeQuery("SELECT * FROM ncfas");
                System.out.println("query hecha");
                while(rs.next()){
                    Ncfas tempNcfas = new Ncfas();
                    tempNcfas.setIdncfas(rs.getInt("idncfas"));
                    tempNcfas.setNombrefamilia(rs.getString("nombrefamilia"));
                    lista.add(tempNcfas);
                    System.out.println("llegamos acá");
                } 
            } catch (SQLException e) {
           throw e;
        }finally{
                this.Cerrar();   
        }
            
        return lista;
        }

    public String obtenerFecha(int id) throws DAOException {
        int i=1;
        Integer[] listaValores;
        listaValores = new Integer[9];
        String fecha;
        fecha="";
        System.err.println("llegasos obtener la FECHA ");
        //Statement stmt2 = null;
        ResultSet rs = null;
        try{
            this.Conectar();
            
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("SELECT fecha from ncfas where idncfas= ?");
            stmt.setInt(1,id);
            rs=stmt.executeQuery();
        System.out.println("query hecha");
                while(rs.next()){
                    fecha=rs.getString("fecha");
                }

        } catch (SQLException ex) {
            Logger.getLogger(DimensionesDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        this.Cerrar();   
        return fecha;
    }
    
    
    public void insertaPuntajesItemsGenerales() throws DAOException, IOException {
        
        
     ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
     String pathArchivos=(String) servletContext.getRealPath("/")+"/archivosVarios/"; // Sustituye "/" por el directorio ej: "/upload"
     FileWriter fichero = null; 
     PrintWriter pw = null;
        
     fichero = new FileWriter(pathArchivos+"DataSetSimulado.arff",true);        
                
        pw = new PrintWriter(fichero);
        
        int i=1;
        int j=1;
        int k=1;
        int l=1;
        int m=1;
        int n=1;
        int o=1;
        int p=1;
        List<Integer> listaValoresGeneralesDim1= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim2= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim3= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim4= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim5= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim6= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim7= new ArrayList() ;
            List<Integer> listaValoresGeneralesDim8= new ArrayList() ;
        int generales=1;
        
        
        /*Integer[] listaValores;
        listaValores = new Integer[8];
        Integer[] listaValores2;
        listaValores2 = new Integer[9];
        Integer[] listaValores3;
        listaValores3 = new Integer[9];
        Integer[] listaValores4;
        listaValores4 = new Integer[9];
        Integer[] listaValores5;
        listaValores5 = new Integer[9];
        Integer[] listaValores6;
        listaValores6 = new Integer[9];
        Integer[] listaValores7;
        listaValores7 = new Integer[9];
        Integer[] listaValores8;
        listaValores8 = new Integer[9];
        */
       
        
        System.err.println("llegasos a obtener todos los items generales a la BASE DE DATOS ");
        //Statement stmt2 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;
        ResultSet rs6 = null;
        ResultSet rs7 = null;
        ResultSet rs8 = null;
        try{
            this.Conectar();
            
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("SELECT valor FROM item where dimension= ?");
            stmt.setInt(1,1);
            
            rs=stmt.executeQuery();
        System.out.println("query1 hecha");
        
        PreparedStatement stmt2 = null;
            stmt2 = con.prepareStatement("SELECT valor FROM item where dimension= ? ");
            stmt2.setInt(1,2);
            rs2=stmt2.executeQuery();      
            System.out.println("query2 hecha");
 
        PreparedStatement stmt3 = null;   
            stmt3 = con.prepareStatement("SELECT valor FROM item where dimension= ?");
            stmt3.setInt(1,3);
            rs3=stmt3.executeQuery();
        System.out.println("query3 hecha");
        
        PreparedStatement stmt4 = null;   
            stmt4 = con.prepareStatement("SELECT valor FROM item where dimension= ? ");
            stmt4.setInt(1,4);
            rs4=stmt4.executeQuery();
        System.out.println("query4 hecha");
        
        PreparedStatement stmt5 = null;    
            stmt5 = con.prepareStatement("SELECT valor FROM item where dimension= ?");
            stmt5.setInt(1,5);
            
            rs5=stmt5.executeQuery();
        System.out.println("query5 hecha");
        
         PreparedStatement stmt6 = null;  
            stmt6 = con.prepareStatement("SELECT valor FROM item where dimension= ?");
            stmt6.setInt(1,6);
            
            rs6=stmt6.executeQuery();
        System.out.println("query6 hecha");
        
        PreparedStatement stmt7 = null;   
            stmt7 = con.prepareStatement("SELECT valor FROM item where dimension= ? ");
            stmt7.setInt(1,7);
            
            rs7=stmt7.executeQuery();
        System.out.println("query7 hecha");
        
        PreparedStatement stmt8 = null;
            stmt8 = con.prepareStatement("SELECT valor FROM item where dimension= ?");
            stmt8.setInt(1,8);
            
            rs8=stmt8.executeQuery();
        System.out.println("query8 hecha");
        
        
        while(rs.next()){         
        if(i==7){   
        //pw = new PrintWriter(fichero);
        //System.out.println("llegamos a insertar en el primer itemgeneral");
        //pw.print(rs.getInt("valor"));
        listaValoresGeneralesDim1.add(rs.getInt("valor"));
            System.out.println(rs.getInt("valor"));
        i=0;             
        }
        i++;
        }
                
             
        while(rs2.next()){            
        if(j==8){
        listaValoresGeneralesDim2.add(rs2.getInt("valor"));
        
        j=0;
                    }
                    j++;
                }
                
             
                while(rs3.next()){
                    
                    if(k==8){
                       
        listaValoresGeneralesDim3.add(rs3.getInt("valor"));
                    k=0;    
                    }
                    k++;
                }
                
             
                while(rs4.next()){
                    
                    if(l==8){
                        
        listaValoresGeneralesDim4.add(rs4.getInt("valor"));
        l=0;
                    }
                    l++;
                }
                
            
                while(rs5.next()){
                    
                    if(m==7){
                        
        listaValoresGeneralesDim5.add(rs5.getInt("valor"));
        m=0;
                    }
                    m++;
                }
                
            
                while(rs6.next()){
                    
                    if(n==6){
                        
         listaValoresGeneralesDim6.add(rs6.getInt("valor"));
        n=0;
                    }
                    n++;
                }
            
                while(rs7.next()){
                    
                    if(o==6){
                       
        listaValoresGeneralesDim7.add(rs7.getInt("valor"));
        o=0;
                    }
                    o++;
                }
                
            
                while(rs8.next()){
                    System.out.println("EL RESULTADO DE LA QUERY DE LA DIMENSION 8 ES ");
                    System.out.println(rs8.getInt("valor"));
                    if(p==8){    
        listaValoresGeneralesDim8.add(rs8.getInt("valor"));
        p=0;
                    }
                    p++;
                }
                
     
        /*System.out.println(listaValoresGeneralesDim1.size());
        System.out.println(listaValoresGeneralesDim2.size());
        System.out.println(listaValoresGeneralesDim3.size());
        System.out.println(listaValoresGeneralesDim4.size());
        System.out.println(listaValoresGeneralesDim5.size());
        System.out.println(listaValoresGeneralesDim6.size());
        System.out.println(listaValoresGeneralesDim7.size());
        System.out.println(listaValoresGeneralesDim8.size());
        System.out.println(listaValoresGeneralesDim1.get(3));
        System.out.println(listaValoresGeneralesDim2.get(2));
        System.out.println(listaValoresGeneralesDim3.get(1));
        System.out.println(listaValoresGeneralesDim4.get(0));
        System.out.println(listaValoresGeneralesDim5.get(3));
        System.out.println(listaValoresGeneralesDim6.get(2));
        System.out.println(listaValoresGeneralesDim7.get(1));
        System.out.println(listaValoresGeneralesDim8.get(0));*/
        
        for(int h=0;listaValoresGeneralesDim1.size()>h;h++){
        System.out.println("llegamos a insertar los items generales AL ARFF");
        
        pw.print(listaValoresGeneralesDim1.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim2.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim3.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim4.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim5.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim6.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim7.get(h));
        pw.print("  ");
        pw.print(listaValoresGeneralesDim8.get(h));
        pw.println("");
        }
       // for(int h=0;listaValoresGeneralesDim1.size()>h;h++){
        //System.out.println("llegamos a insertar los items generales AL ARFF");
       // }
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(DimensionesDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        this.Cerrar();
        fichero.close();
        
        
    }

}
