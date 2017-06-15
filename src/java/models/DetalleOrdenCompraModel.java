
package models;

public class DetalleOrdenCompraModel {
    
    public int ord_id;
    private int ord_dtl_id;
    private int equ_id;
    private float ord_dtl_precio;
    private String ord_dtl_codigoInventario;

    public DetalleOrdenCompraModel() {
    }

    public DetalleOrdenCompraModel(int ord_id, int ord_dtl_id, int equ_id, float ord_dtl_precio, String ord_dtl_codigoInventario) {
        this.ord_id = ord_id;
        this.ord_dtl_id = ord_dtl_id;
        this.equ_id = equ_id;
        this.ord_dtl_precio = ord_dtl_precio;
        this.ord_dtl_codigoInventario = ord_dtl_codigoInventario;
    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public int getOrd_dtl_id() {
        return ord_dtl_id;
    }

    public void setOrd_dtl_id(int ord_dtl_id) {
        this.ord_dtl_id = ord_dtl_id;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public float getOrd_dtl_precio() {
        return ord_dtl_precio;
    }

    public void setOrd_dtl_precio(float ord_dtl_precio) {
        this.ord_dtl_precio = ord_dtl_precio;
    }

    public String getOrd_dtl_codigoInventario() {
        return ord_dtl_codigoInventario;
    }

    public void setOrd_dtl_codigoInventario(String ord_dtl_codigoInventario) {
        this.ord_dtl_codigoInventario = ord_dtl_codigoInventario;
    }
    
    
    
}
