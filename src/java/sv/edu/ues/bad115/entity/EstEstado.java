package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EstEstado generated by hbm2java
 */
public class EstEstado  implements java.io.Serializable {


     private int estId;
     private String estEstado;
     private Set solSolicituds = new HashSet(0);
     private Set ordOrdendecompras = new HashSet(0);

    public EstEstado() {
    }

	
    public EstEstado(int estId, String estEstado) {
        this.estId = estId;
        this.estEstado = estEstado;
    }
    public EstEstado(int estId, String estEstado, Set solSolicituds, Set ordOrdendecompras) {
       this.estId = estId;
       this.estEstado = estEstado;
       this.solSolicituds = solSolicituds;
       this.ordOrdendecompras = ordOrdendecompras;
    }
   
    public int getEstId() {
        return this.estId;
    }
    
    public void setEstId(int estId) {
        this.estId = estId;
    }
    public String getEstEstado() {
        return this.estEstado;
    }
    
    public void setEstEstado(String estEstado) {
        this.estEstado = estEstado;
    }
    public Set getSolSolicituds() {
        return this.solSolicituds;
    }
    
    public void setSolSolicituds(Set solSolicituds) {
        this.solSolicituds = solSolicituds;
    }
    public Set getOrdOrdendecompras() {
        return this.ordOrdendecompras;
    }
    
    public void setOrdOrdendecompras(Set ordOrdendecompras) {
        this.ordOrdendecompras = ordOrdendecompras;
    }




}


