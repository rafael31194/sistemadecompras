package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * ComSolComprasolicitud generated by hbm2java
 */
public class ComSolComprasolicitud  implements java.io.Serializable {


     private int comSolId;
     private SolSolicitud solSolicitud;
     private Integer comSolCodFactura;
     private String comSolDescripcion;

    public ComSolComprasolicitud() {
    }

	
    public ComSolComprasolicitud(int comSolId, SolSolicitud solSolicitud) {
        this.comSolId = comSolId;
        this.solSolicitud = solSolicitud;
    }
    public ComSolComprasolicitud(int comSolId, SolSolicitud solSolicitud, Integer comSolCodFactura, String comSolDescripcion) {
       this.comSolId = comSolId;
       this.solSolicitud = solSolicitud;
       this.comSolCodFactura = comSolCodFactura;
       this.comSolDescripcion = comSolDescripcion;
    }
   
    public int getComSolId() {
        return this.comSolId;
    }
    
    public void setComSolId(int comSolId) {
        this.comSolId = comSolId;
    }
    public SolSolicitud getSolSolicitud() {
        return this.solSolicitud;
    }
    
    public void setSolSolicitud(SolSolicitud solSolicitud) {
        this.solSolicitud = solSolicitud;
    }
    public Integer getComSolCodFactura() {
        return this.comSolCodFactura;
    }
    
    public void setComSolCodFactura(Integer comSolCodFactura) {
        this.comSolCodFactura = comSolCodFactura;
    }
    public String getComSolDescripcion() {
        return this.comSolDescripcion;
    }
    
    public void setComSolDescripcion(String comSolDescripcion) {
        this.comSolDescripcion = comSolDescripcion;
    }




}


