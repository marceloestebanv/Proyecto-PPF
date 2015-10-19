/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.NCFAS;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Marcelo Verdugo
 */
@ManagedBean
@ViewScoped
public class CounterView implements Serializable {
    
    
 private String obs="Sin Guardar";   
private String dim1="Sin Guardar";
private String dim2="Sin Guardar";
private String dim3="Sin Guardar";
private String dim4="Sin Guardar";
private String dim5="Sin Guardar";
private String dim6="Sin Guardar";
private String dim7="Sin Guardar";
private String dim8="Sin Guardar";

    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public String getDim4() {
        return dim4;
    }

    public void setDim4(String dim4) {
        this.dim4 = dim4;
    }

    public String getDim5() {
        return dim5;
    }

    public void setDim5(String dim5) {
        this.dim5 = dim5;
    }

    public String getDim6() {
        return dim6;
    }

    public void setDim6(String dim6) {
        this.dim6 = dim6;
    }

    public String getDim7() {
        return dim7;
    }

    public void setDim7(String dim7) {
        this.dim7 = dim7;
    }

    public String getDim8() {
        return dim8;
    }

    public void setDim8(String dim8) {
        this.dim8 = dim8;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }



    
}
