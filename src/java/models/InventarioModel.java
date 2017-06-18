
package models;


public class InventarioModel {
    private String ins_nombre,cat_descripcion,equ_nombre,equ_marca,equ_modelo,equ_anio,inv_dtl_codigoinventario;

    public InventarioModel() {
    }

    public InventarioModel(String ins_nombre, String cat_descripcion, String equ_nombre, String equ_marca, String equ_modelo, String equ_anio, String inv_dtl_codigoinventario) {
        this.ins_nombre = ins_nombre;
        this.cat_descripcion = cat_descripcion;
        this.equ_nombre = equ_nombre;
        this.equ_marca = equ_marca;
        this.equ_modelo = equ_modelo;
        this.equ_anio = equ_anio;
        this.inv_dtl_codigoinventario = inv_dtl_codigoinventario;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public String getCat_descripcion() {
        return cat_descripcion;
    }

    public void setCat_descripcion(String cat_descripcion) {
        this.cat_descripcion = cat_descripcion;
    }

    public String getEqu_nombre() {
        return equ_nombre;
    }

    public void setEqu_nombre(String equ_nombre) {
        this.equ_nombre = equ_nombre;
    }

    public String getEqu_marca() {
        return equ_marca;
    }

    public void setEqu_marca(String equ_marca) {
        this.equ_marca = equ_marca;
    }

    public String getEqu_modelo() {
        return equ_modelo;
    }

    public void setEqu_modelo(String equ_modelo) {
        this.equ_modelo = equ_modelo;
    }

    public String getEqu_anio() {
        return equ_anio;
    }

    public void setEqu_anio(String equ_anio) {
        this.equ_anio = equ_anio;
    }

    public String getInv_dtl_codigoinventario() {
        return inv_dtl_codigoinventario;
    }

    public void setInv_dtl_codigoinventario(String inv_dtl_codigoinventario) {
        this.inv_dtl_codigoinventario = inv_dtl_codigoinventario;
    }
    
    
}
