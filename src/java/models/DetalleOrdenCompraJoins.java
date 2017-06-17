
package models;

public class DetalleOrdenCompraJoins {
    private int ord_dtl_id;
    private int ord_id;
    private String equ_nombre;
    private float ord_dtl_precio;
    private String ord_dtl_codigoInventario;

    public DetalleOrdenCompraJoins() {
    }

    public DetalleOrdenCompraJoins(int ord_dtl_id, int ord_id, String equ_nombre, float ord_dtl_precio, String ord_dtl_codigoInventario) {
        this.ord_dtl_id = ord_dtl_id;
        this.ord_id = ord_id;
        this.equ_nombre = equ_nombre;
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

    public String getEqu_nombre() {
        return equ_nombre;
    }

    public void setEqu_nombre(String equ_nombre) {
        this.equ_nombre = equ_nombre;
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
