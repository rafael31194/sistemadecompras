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
public class InventarioDetalleModel {
    private int ins_id, inv_id, inv_dtl_id, equ_id, inv_dtl_cantidad;
    private String inv_dtl_nombre_equipo, inv_dtl_codigoinventario;

    public InventarioDetalleModel() {
    }

    public InventarioDetalleModel(int ins_id, int inv_id, int inv_dtl_id, int equ_id, int inv_dtl_cantidad, String inv_dtl_nombre_equipo, String inv_dtl_codigoinventario) {
        this.ins_id = ins_id;
        this.inv_id = inv_id;
        this.inv_dtl_id = inv_dtl_id;
        this.equ_id = equ_id;
        this.inv_dtl_cantidad = inv_dtl_cantidad;
        this.inv_dtl_nombre_equipo = inv_dtl_nombre_equipo;
        this.inv_dtl_codigoinventario = inv_dtl_codigoinventario;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getInv_id() {
        return inv_id;
    }

    public void setInv_id(int inv_id) {
        this.inv_id = inv_id;
    }

    public int getInv_dtl_id() {
        return inv_dtl_id;
    }

    public void setInv_dtl_id(int inv_dtl_id) {
        this.inv_dtl_id = inv_dtl_id;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public int getInv_dtl_cantidad() {
        return inv_dtl_cantidad;
    }

    public void setInv_dtl_cantidad(int inv_dtl_cantidad) {
        this.inv_dtl_cantidad = inv_dtl_cantidad;
    }

    public String getInv_dtl_nombre_equipo() {
        return inv_dtl_nombre_equipo;
    }

    public void setInv_dtl_nombre_equipo(String inv_dtl_nombre_equipo) {
        this.inv_dtl_nombre_equipo = inv_dtl_nombre_equipo;
    }

    public String getInv_dtl_codigoinventario() {
        return inv_dtl_codigoinventario;
    }

    public void setInv_dtl_codigoinventario(String inv_dtl_codigoinventario) {
        this.inv_dtl_codigoinventario = inv_dtl_codigoinventario;
    }
    
    
}
