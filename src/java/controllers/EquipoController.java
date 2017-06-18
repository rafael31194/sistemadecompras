/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.BitacoraConectar;
import models.BitacoraModel;
import models.EquipoConectar;
import models.EquipoModel;

/**
 *
 * @author Hassel
 */
public class EquipoController extends ActionSupport {
    
    private EquipoConectar con;
    private ArrayList<EquipoModel> datos;
    private ResultSet dato, select;
    
    private int equ_id, pro_id,cat_id, equ_anio;
    private String equ_nombre, equ_marca, equ_modelo, equ_especificaciongarantia, equ_imagen;
    private float equ_capacidad_btu, equ_potencia;
    
    @Override
    public String execute() throws Exception {
        this.con = new EquipoConectar();
        
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataEquipos("CALL `sp_select_all_equ_equipo`()");
        System.out.println("Bitácora: \n");
        System.out.println(this.datos);
        
        return SUCCESS;
    }
    
    //******************************************************************* Getters & Setters ************************************************************//

    public EquipoConectar getCon() {
        return con;
    }

    public void setCon(EquipoConectar con) {
        this.con = con;
    }

    public ArrayList<EquipoModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<EquipoModel> datos) {
        this.datos = datos;
    }

    public ResultSet getDato() {
        return dato;
    }

    public void setDato(ResultSet dato) {
        this.dato = dato;
    }

    public ResultSet getSelect() {
        return select;
    }

    public void setSelect(ResultSet select) {
        this.select = select;
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
