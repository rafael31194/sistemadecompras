package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * ManSolMantenimientosolicitud generated by hbm2java
 */
public class ManSolMantenimientosolicitud  implements java.io.Serializable {


     private int manSolId;
     private SolSolicitud solSolicitud;
     private String manSolDescripcion;

    public ManSolMantenimientosolicitud() {
    }

	
    public ManSolMantenimientosolicitud(int manSolId, SolSolicitud solSolicitud) {
        this.manSolId = manSolId;
        this.solSolicitud = solSolicitud;
    }
    public ManSolMantenimientosolicitud(int manSolId, SolSolicitud solSolicitud, String manSolDescripcion) {
       this.manSolId = manSolId;
       this.solSolicitud = solSolicitud;
       this.manSolDescripcion = manSolDescripcion;
    }
   
    public int getManSolId() {
        return this.manSolId;
    }
    
    public void setManSolId(int manSolId) {
        this.manSolId = manSolId;
    }
    public SolSolicitud getSolSolicitud() {
        return this.solSolicitud;
    }
    
    public void setSolSolicitud(SolSolicitud solSolicitud) {
        this.solSolicitud = solSolicitud;
    }
    public String getManSolDescripcion() {
        return this.manSolDescripcion;
    }
    
    public void setManSolDescripcion(String manSolDescripcion) {
        this.manSolDescripcion = manSolDescripcion;
    }




}


