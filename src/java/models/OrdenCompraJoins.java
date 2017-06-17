
package models;

public class OrdenCompraJoins {
    private int ord_id;
    private String est_estado;
    private String tco_descripcion;
    private String sol_descripcion;
    private String pro_nombre;
    private String ord_fecha;
    private String ord_descripcion;
    private float ord_total;

    public OrdenCompraJoins() {
    }

    public OrdenCompraJoins(int ord_id, String est_estado, String tco_descripcion, String sol_descripcion, String pro_nombre, String ord_fecha, String ord_descripcion, float ord_total) {
        this.ord_id = ord_id;
        this.est_estado = est_estado;
        this.tco_descripcion = tco_descripcion;
        this.sol_descripcion = sol_descripcion;
        this.pro_nombre = pro_nombre;
        this.ord_fecha = ord_fecha;
        this.ord_descripcion = ord_descripcion;
        this.ord_total = ord_total;
    }

    public String getOrd_fecha() {
        return ord_fecha;
    }

    public void setOrd_fecha(String ord_fecha) {
        this.ord_fecha = ord_fecha;
    }


    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public String getEst_estado() {
        return est_estado;
    }

    public void setEst_estado(String est_estado) {
        this.est_estado = est_estado;
    }

    public String getTco_descripcion() {
        return tco_descripcion;
    }

    public void setTco_descripcion(String tco_descripcion) {
        this.tco_descripcion = tco_descripcion;
    }

    public String getSol_descripcion() {
        return sol_descripcion;
    }

    public void setSol_descripcion(String sol_descripcion) {
        this.sol_descripcion = sol_descripcion;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getOrd_descripcion() {
        return ord_descripcion;
    }

    public void setOrd_descripcion(String ord_descripcion) {
        this.ord_descripcion = ord_descripcion;
    }

    public float getOrd_total() {
        return ord_total;
    }

    public void setOrd_total(float ord_total) {
        this.ord_total = ord_total;
    }
    
}
