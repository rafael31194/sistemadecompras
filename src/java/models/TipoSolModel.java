
package models;


public class TipoSolModel {
    private int tipoSol_id;
    private String tipoSol_nombre;

    public TipoSolModel() {
    }

    public TipoSolModel(int tipoSol_id, String tipoSol_nombre) {
        this.tipoSol_id = tipoSol_id;
        this.tipoSol_nombre = tipoSol_nombre;
    }

    public int getTipoSol_id() {
        return tipoSol_id;
    }

    public void setTipoSol_id(int tipoSol_id) {
        this.tipoSol_id = tipoSol_id;
    }

    public String getTipoSol_nombre() {
        return tipoSol_nombre;
    }

    public void setTipoSol_nombre(String tipoSol_nombre) {
        this.tipoSol_nombre = tipoSol_nombre;
    }
    
    
}
