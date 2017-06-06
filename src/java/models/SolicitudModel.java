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
public class SolicitudModel {
    private int sol_id, cat_id, uni_id, est_id, sol_id_usu, sol_tipo;
    private String sol_fecha;
    private String sol_descripcion, est_estado;

    public SolicitudModel() {
    }

    public SolicitudModel(int sol_id, int cat_id, int uni_id, int est_id, int sol_id_usu, int sol_tipo, String sol_fecha, String sol_descripcion, String est_estado) {
        this.sol_id = sol_id;
        this.cat_id = cat_id;
        this.uni_id = uni_id;
        this.est_id = est_id;
        this.sol_id_usu = sol_id_usu;
        this.sol_tipo = sol_tipo;
        this.sol_fecha = sol_fecha;
        this.sol_descripcion = sol_descripcion;
        this.est_estado = est_estado;
    }

    public int getSol_id() {
        return sol_id;
    }

    public void setSol_id(int sol_id) {
        this.sol_id = sol_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public int getSol_id_usu() {
        return sol_id_usu;
    }

    public void setSol_id_usu(int sol_id_usu) {
        this.sol_id_usu = sol_id_usu;
    }

    public int getSol_tipo() {
        return sol_tipo;
    }

    public void setSol_tipo(int sol_tipo) {
        this.sol_tipo = sol_tipo;
    }

    public String getSol_fecha() {
        return sol_fecha;
    }

    public void setSol_fecha(String sol_fecha) {
        this.sol_fecha = sol_fecha;
    }

    public String getSol_descripcion() {
        return sol_descripcion;
    }

    public void setSol_descripcion(String sol_descripcion) {
        this.sol_descripcion = sol_descripcion;
    }

    public String getEst_estado() {
        return est_estado;
    }

    public void setEst_estado(String est_estado) {
        this.est_estado = est_estado;
    }

    
}
