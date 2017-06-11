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
public class BitacoraModel {
    private int bit_id, ins_id, inv_dtl_id;
    private String bit_fechaproxima, bit_comentarios, inv_dtl_nombre_equipo, ins_nombre;

    public BitacoraModel(int bit_id, int ins_id, int inv_dtl_id, String bit_fechaproxima, String bit_comentarios, String inv_dtl_nombre_equipo, String ins_nombre) {
        this.bit_id = bit_id;
        this.ins_id = ins_id;
        this.inv_dtl_id = inv_dtl_id;
        this.bit_fechaproxima = bit_fechaproxima;
        this.bit_comentarios = bit_comentarios;
        this.inv_dtl_nombre_equipo = inv_dtl_nombre_equipo;
        this.ins_nombre = ins_nombre;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public String getInv_dtl_nombre_equipo() {
        return inv_dtl_nombre_equipo;
    }

    public void setInv_dtl_nombre_equipo(String inv_dtl_nombre_equipo) {
        this.inv_dtl_nombre_equipo = inv_dtl_nombre_equipo;
    }

    public BitacoraModel() {
    }

    public int getBit_id() {
        return bit_id;
    }

    public void setBit_id(int bit_id) {
        this.bit_id = bit_id;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getInv_dtl_id() {
        return inv_dtl_id;
    }

    public void setInv_dtl_id(int inv_dtl_id) {
        this.inv_dtl_id = inv_dtl_id;
    }

    public String getBit_fechaproxima() {
        return bit_fechaproxima;
    }

    public void setBit_fechaproxima(String bit_fechaproxima) {
        this.bit_fechaproxima = bit_fechaproxima;
    }

    public String getBit_comentarios() {
        return bit_comentarios;
    }

    public void setBit_comentarios(String bit_comentarios) {
        this.bit_comentarios = bit_comentarios;
    }
    
    
}
