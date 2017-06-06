package models;

public class RestriccionModel {
    
    private int res_id;
    private String ins_nombre, pro_nombre;
    private double res_montolimite;
    private int res_cantidadcompras;
    private String res_descripcion;
    private int res_EsInstalacion = 0;

    public RestriccionModel() {
    }

    public RestriccionModel(int res_id, String ins_nombre, String pro_nombre, double res_montolimite, int res_cantidadcompras, String res_descripcion, int res_EsInstalacion) {
        this.res_id = res_id;
        this.ins_nombre = ins_nombre;
        this.pro_nombre = pro_nombre;
        this.res_montolimite = res_montolimite;
        this.res_cantidadcompras = res_cantidadcompras;
        this.res_descripcion = res_descripcion;
        this.res_EsInstalacion = res_EsInstalacion;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public double getRes_montolimite() {
        return res_montolimite;
    }

    public void setRes_montolimite(double res_montolimite) {
        this.res_montolimite = res_montolimite;
    }

    public int getRes_cantidadcompras() {
        return res_cantidadcompras;
    }

    public void setRes_cantidadcompras(int res_cantidadcompras) {
        this.res_cantidadcompras = res_cantidadcompras;
    }

    public String getRes_descripcion() {
        return res_descripcion;
    }

    public void setRes_descripcion(String res_descripcion) {
        this.res_descripcion = res_descripcion;
    }

    public int isRes_EsInstalacion() {
        return res_EsInstalacion;
    }

    public void setRes_EsInstalacion(int res_EsInstalacion) {
        this.res_EsInstalacion = res_EsInstalacion;
    }
}
