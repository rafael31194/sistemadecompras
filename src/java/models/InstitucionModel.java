
package models;

public class InstitucionModel {
    private int ins_id;
    private int mun_id;
    private String mun_nombre;
    private String ins_nombre,ins_telefono,ins_direccion;

    public InstitucionModel() {
    }

    public InstitucionModel(int ins_id, int mun_id, String mun_nombre, String ins_nombre, String ins_telefono, String ins_direccion) {
        this.ins_id = ins_id;
        this.mun_id = mun_id;
        this.mun_nombre = mun_nombre;
        this.ins_nombre = ins_nombre;
        this.ins_telefono = ins_telefono;
        this.ins_direccion = ins_direccion;
    }

    public InstitucionModel(int ins_id, int mun_id, String ins_nombre, String ins_telefono, String ins_direccion) {
        this.ins_id = ins_id;
        this.mun_id = mun_id;
        this.ins_nombre = ins_nombre;
        this.ins_telefono = ins_telefono;
        this.ins_direccion = ins_direccion;
    }
    
    public String getMun_nombre() {
        return mun_nombre;
    }

    public void setMun_nombre(String mun_nombre) {
        this.mun_nombre = mun_nombre;
    }

       
    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getMun_id() {
        return mun_id;
    }

    public void setMun_id(int mun_id) {
        this.mun_id = mun_id;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public String getIns_telefono() {
        return ins_telefono;
    }

    public void setIns_telefono(String ins_telefono) {
        this.ins_telefono = ins_telefono;
    }

    public String getIns_direccion() {
        return ins_direccion;
    }

    public void setIns_direccion(String ins_direccion) {
        this.ins_direccion = ins_direccion;
    }

    
}
