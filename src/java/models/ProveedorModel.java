package models;

public class ProveedorModel {
    
    private int pro_id, mun_id;
    private String pro_nombre, pro_direccion;
    private int pro_id_usu;

    public ProveedorModel() {
    }

    public ProveedorModel(int pro_id, int mun_id, String pro_nombre, String pro_direccion, int pro_id_usu) {
        this.pro_id = pro_id;
        this.mun_id = mun_id;
        this.pro_nombre = pro_nombre;
        this.pro_direccion = pro_direccion;
        this.pro_id_usu = pro_id_usu;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getMun_id() {
        return mun_id;
    }

    public void setMun_id(int mun_id) {
        this.mun_id = mun_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_direccion() {
        return pro_direccion;
    }

    public void setPro_direccion(String pro_direccion) {
        this.pro_direccion = pro_direccion;
    }

    public int getPro_id_usu() {
        return pro_id_usu;
    }

    public void setPro_id_usu(int pro_id_usu) {
        this.pro_id_usu = pro_id_usu;
    }
}
