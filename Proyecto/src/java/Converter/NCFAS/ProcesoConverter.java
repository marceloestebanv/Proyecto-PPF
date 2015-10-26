package Converter.NCFAS;

import com.google.common.primitives.UnsignedBytes;
import javax.faces.component.UIComponent;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;
import javax.faces.context.FacesContext;

/**
 *
 * @author Marcelo Verdugo
 */
@FacesConverter("procesoConverter")
public class ProcesoConverter implements Converter{
  
    
@Override
public String getAsString(FacesContext context, UIComponent component, Object value){
int parteproceso;
String parteprocesostring="";
    
    if(value!=null){
    parteproceso = (int)value;
        switch(parteproceso){
            case 1:
                parteprocesostring="Inicial";
                break;
            case 2:
                parteprocesostring="Porceso";
                break;
            case 3:
                parteprocesostring="Final";
                break;
            case 130: 
                parteprocesostring="Abandono de hogar";
                break;
            case 131:
                parteprocesostring="Adolecente embarazada (incl Intento de aborto)";
                break;
            case 132:
                parteprocesostring="Deserción Escolar";
                break;
            case 133:
                parteprocesostring="Ejerce bullying en contra de otras/as niños/as o adolescentes";
                break;
            case 134:
                parteprocesostring="Indocumentado";
                break;
            case 135:
                parteprocesostring="Inhabilidad de uno o ambos padres";
                break;
            case 136:
                parteprocesostring="Interacción conflictiva con la escuela";
                break;    
            case 137:
                parteprocesostring="Interacción conflictiva con los padres o adultos a cargo";
                break;    
            case 138:
                parteprocesostring="Invitación de actores comunitarios";
                break;    
            case 139:
                parteprocesostring="Invitación directa del equipo";
                break;    
            case 140:
                parteprocesostring="Lactante con madre recluida en recinto penitenciario";
                break;    
            case 141:
                parteprocesostring="Medida de juez para resolver sobre vida futura (art234)";
                break;    
            case 142:
                parteprocesostring="Niña/o vive en sector de exclusión social";
                break;    
            case 143:
                parteprocesostring="Niño o niña de la calle";
                break;    
            case 144:
                parteprocesostring="Niño o niña en la calle";
                break;    
             case 145:
                parteprocesostring="Niño/a en peores formas de trabajo infantil";
                break;   
            case 146:
                parteprocesostring="Ocupación menor en act prohibidas(ar62)";
                break;    
            case 147:
                parteprocesostring="Padre o madre ceden al niño para adopción";
                break;    
            case 148:
                parteprocesostring="Padres o adulto a cargo no pueden cuidar al niño(a)";
                break;    
            case 149:
                parteprocesostring="Padres o tutor declaran incompetentes para cuidarlo";
                break;    
            case 150:
                parteprocesostring="Peligro material o moral del niño(a) o adolescente";
                break;    
            case 151:
                parteprocesostring="Problema de vivienda";
                break;    
             case 152:
                parteprocesostring="Protección (según  orden del tribunal) solo cuando no especifica mater";
                break;   
            case 153:
                parteprocesostring="Solicitud de niño(a) o adolescente";
                break;    
            case 154:
                parteprocesostring="Testigo de violencia intrafamiliar";
                break;    

        }
    }
    return parteprocesostring;
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
