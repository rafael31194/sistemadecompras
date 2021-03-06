package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * InvInventario generated by hbm2java
 */
public class InvInventario  implements java.io.Serializable {


     private InvInventarioId id;
     private InsInstitucion insInstitucion;
     private String invDescripcion;
     private int invAnio;
     private Set comCompras = new HashSet(0);
     private Set invDtlInventarioDetalles = new HashSet(0);

    public InvInventario() {
    }

	
    public InvInventario(InvInventarioId id, InsInstitucion insInstitucion, String invDescripcion, int invAnio) {
        this.id = id;
        this.insInstitucion = insInstitucion;
        this.invDescripcion = invDescripcion;
        this.invAnio = invAnio;
    }
    public InvInventario(InvInventarioId id, InsInstitucion insInstitucion, String invDescripcion, int invAnio, Set comCompras, Set invDtlInventarioDetalles) {
       this.id = id;
       this.insInstitucion = insInstitucion;
       this.invDescripcion = invDescripcion;
       this.invAnio = invAnio;
       this.comCompras = comCompras;
       this.invDtlInventarioDetalles = invDtlInventarioDetalles;
    }
   
    public InvInventarioId getId() {
        return this.id;
    }
    
    public void setId(InvInventarioId id) {
        this.id = id;
    }
    public InsInstitucion getInsInstitucion() {
        return this.insInstitucion;
    }
    
    public void setInsInstitucion(InsInstitucion insInstitucion) {
        this.insInstitucion = insInstitucion;
    }
    public String getInvDescripcion() {
        return this.invDescripcion;
    }
    
    public void setInvDescripcion(String invDescripcion) {
        this.invDescripcion = invDescripcion;
    }
    public int getInvAnio() {
        return this.invAnio;
    }
    
    public void setInvAnio(int invAnio) {
        this.invAnio = invAnio;
    }
    public Set getComCompras() {
        return this.comCompras;
    }
    
    public void setComCompras(Set comCompras) {
        this.comCompras = comCompras;
    }
    public Set getInvDtlInventarioDetalles() {
        return this.invDtlInventarioDetalles;
    }
    
    public void setInvDtlInventarioDetalles(Set invDtlInventarioDetalles) {
        this.invDtlInventarioDetalles = invDtlInventarioDetalles;
    }




}


