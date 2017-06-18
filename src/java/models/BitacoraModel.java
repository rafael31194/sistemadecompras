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
    private int bit_id, inv_dtl_id;
    private String bit_fecha_inicio,bit_fecha_fin,bit_hora_inicio,bit_hora_fin,bit_nombre_personal,bit_comentarios, equipo, institucion;

    public BitacoraModel(int bit_id, int inv_dtl_id, String bit_fecha_inicio, String bit_fecha_fin, String bit_hora_inicio, String bit_hora_fin, String bit_nombre_personal, String bit_comentarios) {
        this.bit_id = bit_id;
        this.inv_dtl_id = inv_dtl_id;
        this.bit_fecha_inicio = bit_fecha_inicio;
        this.bit_fecha_fin = bit_fecha_fin;
        this.bit_hora_inicio = bit_hora_inicio;
        this.bit_hora_fin = bit_hora_fin;
        this.bit_nombre_personal = bit_nombre_personal;
        this.bit_comentarios = bit_comentarios;
    }

    public BitacoraModel(int bit_id, int inv_dtl_id, String bit_fecha_inicio, String bit_fecha_fin, String bit_hora_inicio, String bit_hora_fin, String bit_nombre_personal, String bit_comentarios, String equipo, String institucion) {
        this.bit_id = bit_id;
        this.inv_dtl_id = inv_dtl_id;
        this.bit_fecha_inicio = bit_fecha_inicio;
        this.bit_fecha_fin = bit_fecha_fin;
        this.bit_hora_inicio = bit_hora_inicio;
        this.bit_hora_fin = bit_hora_fin;
        this.bit_nombre_personal = bit_nombre_personal;
        this.bit_comentarios = bit_comentarios;
        this.equipo = equipo;
        this.institucion = institucion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public BitacoraModel() {
    }

    public int getBit_id() {
        return bit_id;
    }

    public void setBit_id(int bit_id) {
        this.bit_id = bit_id;
    }

    public int getInv_dtl_id() {
        return inv_dtl_id;
    }

    public void setInv_dtl_id(int inv_dtl_id) {
        this.inv_dtl_id = inv_dtl_id;
    }

    public String getBit_fecha_inicio() {
        return bit_fecha_inicio;
    }

    public void setBit_fecha_inicio(String bit_fecha_inicio) {
        this.bit_fecha_inicio = bit_fecha_inicio;
    }

    public String getBit_fecha_fin() {
        return bit_fecha_fin;
    }

    public void setBit_fecha_fin(String bit_fecha_fin) {
        this.bit_fecha_fin = bit_fecha_fin;
    }

    public String getBit_hora_inicio() {
        return bit_hora_inicio;
    }

    public void setBit_hora_inicio(String bit_hora_inicio) {
        this.bit_hora_inicio = bit_hora_inicio;
    }

    public String getBit_hora_fin() {
        return bit_hora_fin;
    }

    public void setBit_hora_fin(String bit_hora_fin) {
        this.bit_hora_fin = bit_hora_fin;
    }

    public String getBit_nombre_personal() {
        return bit_nombre_personal;
    }

    public void setBit_nombre_personal(String bit_nombre_personal) {
        this.bit_nombre_personal = bit_nombre_personal;
    }

    public String getBit_comentarios() {
        return bit_comentarios;
    }

    public void setBit_comentarios(String bit_comentarios) {
        this.bit_comentarios = bit_comentarios;
    }
    
    
    
    
}
