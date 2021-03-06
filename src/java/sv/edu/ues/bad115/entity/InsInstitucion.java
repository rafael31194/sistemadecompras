package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * InsInstitucion generated by hbm2java
 */
public class InsInstitucion  implements java.io.Serializable {


     private int insId;
     private MunMunicipio munMunicipio;
     private String insNombre;
     private String insTelefono;
     private String insDireccion;
     private Integer insIdMun;
     private Set resRestriccions = new HashSet(0);
     private Set invInventarios = new HashSet(0);
     private Set uniUnidads = new HashSet(0);

    public InsInstitucion() {
    }

	
    public InsInstitucion(int insId, MunMunicipio munMunicipio, String insNombre) {
        this.insId = insId;
        this.munMunicipio = munMunicipio;
        this.insNombre = insNombre;
    }
    public InsInstitucion(int insId, MunMunicipio munMunicipio, String insNombre, String insTelefono, String insDireccion, Integer insIdMun, Set resRestriccions, Set invInventarios, Set uniUnidads) {
       this.insId = insId;
       this.munMunicipio = munMunicipio;
       this.insNombre = insNombre;
       this.insTelefono = insTelefono;
       this.insDireccion = insDireccion;
       this.insIdMun = insIdMun;
       this.resRestriccions = resRestriccions;
       this.invInventarios = invInventarios;
       this.uniUnidads = uniUnidads;
    }
   
    public int getInsId() {
        return this.insId;
    }
    
    public void setInsId(int insId) {
        this.insId = insId;
    }
    public MunMunicipio getMunMunicipio() {
        return this.munMunicipio;
    }
    
    public void setMunMunicipio(MunMunicipio munMunicipio) {
        this.munMunicipio = munMunicipio;
    }
    public String getInsNombre() {
        return this.insNombre;
    }
    
    public void setInsNombre(String insNombre) {
        this.insNombre = insNombre;
    }
    public String getInsTelefono() {
        return this.insTelefono;
    }
    
    public void setInsTelefono(String insTelefono) {
        this.insTelefono = insTelefono;
    }
    public String getInsDireccion() {
        return this.insDireccion;
    }
    
    public void setInsDireccion(String insDireccion) {
        this.insDireccion = insDireccion;
    }
    public Integer getInsIdMun() {
        return this.insIdMun;
    }
    
    public void setInsIdMun(Integer insIdMun) {
        this.insIdMun = insIdMun;
    }
    public Set getResRestriccions() {
        return this.resRestriccions;
    }
    
    public void setResRestriccions(Set resRestriccions) {
        this.resRestriccions = resRestriccions;
    }
    public Set getInvInventarios() {
        return this.invInventarios;
    }
    
    public void setInvInventarios(Set invInventarios) {
        this.invInventarios = invInventarios;
    }
    public Set getUniUnidads() {
        return this.uniUnidads;
    }
    
    public void setUniUnidads(Set uniUnidads) {
        this.uniUnidads = uniUnidads;
    }




}


