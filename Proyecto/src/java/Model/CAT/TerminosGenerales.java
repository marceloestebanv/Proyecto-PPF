/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CAT;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jean
 */
public class TerminosGenerales implements Serializable{
    
    String termino;
   int frecuencia;
   int total;
    private static final long serialVersionUID = 1L;

    public TerminosGenerales(String termino, int frecuencia) {
        this.termino = termino;
        this.frecuencia = frecuencia;
    }

    public TerminosGenerales(String termino, int frecuencia, int total) {
        this.termino = termino;
        this.frecuencia = frecuencia;
        this.total = total;
    }
    
    

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
    

    @Override
    public boolean equals(Object o){
    if(o instanceof TerminosGenerales){
        TerminosGenerales toCompare = (TerminosGenerales) o;
        
        return this.termino.equals(toCompare.termino);
       
    }
    return false;
}
  
    
    

 @Override
    public int hashCode(){
        return Objects.hashCode(this.termino);
    }
   
    
}
