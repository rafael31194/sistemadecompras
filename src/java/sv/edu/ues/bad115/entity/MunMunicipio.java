package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MunMunicipio generated by hbm2java
 */
public class MunMunicipio  implements java.io.Serializable {


     private int munId;
     private DepDepartamento depDepartamento;
     private String munNombre;
     private Set insInstitucions = new HashSet(0);
     private Set proProveedors = new HashSet(0);
     private Set proProveedors_1 = new HashSet(0);

    public MunMunicipio() {
    }

	
    public MunMunicipio(int munId, DepDepartamento depDepartamento) {
        this.munId = munId;
        this.depDepartamento = depDepartamento;
    }
    public MunMunicipio(int munId, DepDepartamento depDepartamento, String munNombre, Set insInstitucions, Set proProveedors, Set proProveedors_1) {
       this.munId = munId;
       this.depDepartamento = depDepartamento;
       this.munNombre = munNombre;
       this.insInstitucions = insInstitucions;
       this.proProveedors = proProveedors;
       this.proProveedors_1 = proProveedors_1;
    }
   
    public int getMunId() {
        return this.munId;
    }
    
    public void setMunId(int munId) {
        this.munId = munId;
    }
    public DepDepartamento getDepDepartamento() {
        return this.depDepartamento;
    }
    
    public void setDepDepartamento(DepDepartamento depDepartamento) {
        this.depDepartamento = depDepartamento;
    }
    public String getMunNombre() {
        return this.munNombre;
    }
    
    public void setMunNombre(String munNombre) {
        this.munNombre = munNombre;
    }
    public Set getInsInstitucions() {
        return this.insInstitucions;
    }
    
    public void setInsInstitucions(Set insInstitucions) {
        this.insInstitucions = insInstitucions;
    }
    public Set getProProveedors() {
        return this.proProveedors;
    }
    
    public void setProProveedors(Set proProveedors) {
        this.proProveedors = proProveedors;
    }
    public Set getProProveedors_1() {
        return this.proProveedors_1;
    }
    
    public void setProProveedors_1(Set proProveedors_1) {
        this.proProveedors_1 = proProveedors_1;
    }




}

