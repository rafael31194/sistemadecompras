/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Hassel
 */
public class EquipoModel {
    private int equ_id, pro_id,cat_id, equ_anio;
    private String equ_nombre, equ_marca, equ_modelo, equ_especificaciongarantia, equ_imagen, equ_estado, proveedor, catEquipo;
    private float equ_capacidad_btu, equ_potencia;

    public EquipoModel(int equ_id, int pro_id, int cat_id, int equ_anio, String equ_nombre, String equ_marca, String equ_modelo, String equ_especificaciongarantia, String equ_imagen, String equ_estado, float equ_capacidad_btu, float equ_potencia) {
        this.equ_id = equ_id;
        this.pro_id = pro_id;
        this.cat_id = cat_id;
        this.equ_anio = equ_anio;
        this.equ_nombre = equ_nombre;
        this.equ_marca = equ_marca;
        this.equ_modelo = equ_modelo;
        this.equ_especificaciongarantia = equ_especificaciongarantia;
        this.equ_imagen = equ_imagen;
        this.equ_estado = equ_estado;
        this.equ_capacidad_btu = equ_capacidad_btu;
        this.equ_potencia = equ_potencia;
    }

    public EquipoModel(int equ_id, int pro_id, int cat_id, int equ_anio, String equ_nombre, String equ_marca, String equ_modelo, String equ_especificaciongarantia, String equ_imagen, String equ_estado, String proveedor, String catEquipo, float equ_capacidad_btu, float equ_potencia) {
        this.equ_id = equ_id;
        this.pro_id = pro_id;
        this.cat_id = cat_id;
        this.equ_anio = equ_anio;
        this.equ_nombre = equ_nombre;
        this.equ_marca = equ_marca;
        this.equ_modelo = equ_modelo;
        this.equ_especificaciongarantia = equ_especificaciongarantia;
        this.equ_imagen = equ_imagen;
        this.equ_estado = equ_estado;
        this.proveedor = proveedor;
        this.catEquipo = catEquipo;
        this.equ_capacidad_btu = equ_capacidad_btu;
        this.equ_potencia = equ_potencia;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCatEquipo() {
        return catEquipo;
    }

    public void setCatEquipo(String catEquipo) {
        this.catEquipo = catEquipo;
    }

    public String getEqu_estado() {
        return equ_estado;
    }

    public void setEqu_estado(String equ_estado) {
        this.equ_estado = equ_estado;
    }

    public EquipoModel() {
    }
    
    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getEqu_anio() {
        return equ_anio;
    }

    public void setEqu_anio(int equ_anio) {
        this.equ_anio = equ_anio;
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

    public String getEqu_especificaciongarantia() {
        return equ_especificaciongarantia;
    }

    public void setEqu_especificaciongarantia(String equ_especificaciongarantia) {
        this.equ_especificaciongarantia = equ_especificaciongarantia;
    }

    public String getEqu_imagen() {
        return equ_imagen;
    }

    public void setEqu_imagen(String equ_imagen) {
        this.equ_imagen = equ_imagen;
    }

    public float getEqu_capacidad_btu() {
        return equ_capacidad_btu;
    }

    public void setEqu_capacidad_btu(float equ_capacidad_btu) {
        this.equ_capacidad_btu = equ_capacidad_btu;
    }

    public float getEqu_potencia() {
        return equ_potencia;
    }

    public void setEqu_potencia(float equ_potencia) {
        this.equ_potencia = equ_potencia;
    }
    
}
