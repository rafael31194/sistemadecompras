
package models;


public class TipoContratacionModel {
    private int tco_id;
    private String tco_descripcion;

    public TipoContratacionModel() {
    }

    public TipoContratacionModel(int tco_id, String tco_descripcion) {
        this.tco_id = tco_id;
        this.tco_descripcion = tco_descripcion;
    }

    public int getTco_id() {
        return tco_id;
    }

    public void setTco_id(int tco_id) {
        this.tco_id = tco_id;
    }

    public String getTco_descripcion() {
        return tco_descripcion;
    }

    public void setTco_descripcion(String tco_descripcion) {
        this.tco_descripcion = tco_descripcion;
    }
    
    
    
}
