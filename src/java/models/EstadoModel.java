
package models;

public class EstadoModel {
    
    private int est_id;
    private String est_estado;

    public EstadoModel() {
    }

    public EstadoModel(int est_id, String est_estado) {
        this.est_id = est_id;
        this.est_estado = est_estado;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public String getEst_estado() {
        return est_estado;
    }

    public void setEst_estado(String est_estado) {
        this.est_estado = est_estado;
    }
    
    
    
}
