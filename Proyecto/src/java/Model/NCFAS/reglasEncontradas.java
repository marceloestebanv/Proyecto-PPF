/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.NCFAS;

import java.io.Serializable;

/**
 *
 * @author Marcelo Verdugo
 */
public class reglasEncontradas implements Serializable {
    
   private String contenido;
   private int numRegla;
   private int valorX;
   private int valorY;
   private float confianza;

    public float getConfianza() {
        return confianza;
    }

    public void setConfianza(float confianza) {
        this.confianza = confianza;
    }
   
   
   

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumRegla() {
        return numRegla;
    }

    public void setNumRegla(int numRegla) {
        this.numRegla = numRegla;
    }

    public int getValorX() {
        return valorX;
    }

    public void setValorX(int valorX) {
        this.valorX = valorX;
    }

    public int getValorY() {
        return valorY;
    }

    public void setValorY(int valorY) {
        this.valorY = valorY;
    }
   
 public void reglasEncontradas(){
 
 }
 
 
    
}
