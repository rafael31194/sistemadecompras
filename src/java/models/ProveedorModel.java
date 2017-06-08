package models;

public class ProveedorModel {
    
    private int pro_id, mun_id;
    private String mun_nombre, pro_nombre, pro_direccion, usu_usuario;
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

    public ProveedorModel(int pro_id, String mun_nombre, String pro_nombre, String pro_direccion, String usu_usuario) {
        this.pro_id = pro_id;
        this.mun_nombre = mun_nombre;
        this.pro_nombre = pro_nombre;
        this.pro_direccion = pro_direccion;
        this.usu_usuario = usu_usuario;
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

    public String getMun_nombre() {
        return mun_nombre;
    }

    public void setMun_nombre(String mun_nombre) {
        this.mun_nombre = mun_nombre;
    }

    public String getUsu_usuario() {
        return usu_usuario;
    }

    public void setUsu_usuario(String usu_usuario) {
        this.usu_usuario = usu_usuario;
    } 
}
