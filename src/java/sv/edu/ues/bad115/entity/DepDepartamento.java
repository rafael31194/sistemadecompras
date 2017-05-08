package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DepDepartamento generated by hbm2java
 */
public class DepDepartamento  implements java.io.Serializable {


     private int depId;
     private String depNombre;
     private Set munMunicipios = new HashSet(0);
     private Set munMunicipios_1 = new HashSet(0);

    public DepDepartamento() {
    }

	
    public DepDepartamento(int depId) {
        this.depId = depId;
    }
    public DepDepartamento(int depId, String depNombre, Set munMunicipios, Set munMunicipios_1) {
       this.depId = depId;
       this.depNombre = depNombre;
       this.munMunicipios = munMunicipios;
       this.munMunicipios_1 = munMunicipios_1;
    }
   
    public int getDepId() {
        return this.depId;
    }
    
    public void setDepId(int depId) {
        this.depId = depId;
    }
    public String getDepNombre() {
        return this.depNombre;
    }
    
    public void setDepNombre(String depNombre) {
        this.depNombre = depNombre;
    }
    public Set getMunMunicipios() {
        return this.munMunicipios;
    }
    
    public void setMunMunicipios(Set munMunicipios) {
        this.munMunicipios = munMunicipios;
    }
    public Set getMunMunicipios_1() {
        return this.munMunicipios_1;
    }
    
    public void setMunMunicipios_1(Set munMunicipios_1) {
        this.munMunicipios_1 = munMunicipios_1;
    }




}


