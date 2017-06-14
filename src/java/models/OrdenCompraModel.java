
package models;

public class OrdenCompraModel {
    
    private int ord_id;
    private int est_id;
    private int tco_id;
    private int sol_id;
    private int pro_id;
    private String ord_fecha;
    private String ord_descripcion;
    private float ord_total;

    public OrdenCompraModel() {
    }

    public OrdenCompraModel(int ord_id, int est_id, int tco_id, int sol_id, int pro_id, String ord_fecha, String ord_descripcion, float ord_total) {
        this.ord_id = ord_id;
        this.est_id = est_id;
        this.tco_id = tco_id;
        this.sol_id = sol_id;
        this.pro_id = pro_id;
        this.ord_fecha = ord_fecha;
        this.ord_descripcion = ord_descripcion;
        this.ord_total = ord_total;
    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public int getTco_id() {
        return tco_id;
    }

    public void setTco_id(int tco_id) {
        this.tco_id = tco_id;
    }

    public int getSol_id() {
        return sol_id;
    }

    public void setSol_id(int sol_id) {
        this.sol_id = sol_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getOrd_fecha() {
        return ord_fecha;
    }

    public void setOrd_fecha(String ord_fecha) {
        this.ord_fecha = ord_fecha;
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
