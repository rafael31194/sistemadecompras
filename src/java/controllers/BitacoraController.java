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
import models.EquipoModel;

/**
 *
 * @author Hassel
 */
public class BitacoraController extends ActionSupport {

    private BitacoraConectar con;
    private ArrayList<BitacoraModel> datos;
    private ArrayList<EquipoModel> datosEqui;
    private ResultSet dato, select;

    private int bit_id, inv_dtl_id, id1, id2;
    private String bit_fecha_inicio,bit_fecha_fin,bit_hora_inicio,bit_hora_fin,bit_nombre_personal,bit_comentarios;

    @Override
    public String execute() throws Exception {
        this.con = new BitacoraConectar();
        
        this.datosEqui = new ArrayList<>();
        this.datosEqui = this.con.getDataInvDtl("CALL `sp_select_inv_dtl_equ_equiposByInventario`()");
        
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataBitacora("CALL `sp_select_all_bit_bitacoramanto`()");
        System.out.println("Bitácora: \n");
        System.out.println(this.datos);
        
        return SUCCESS;
    }

    public String guardar() throws Exception {
        this.con = new BitacoraConectar();
        
        if (this.bit_id == 0) {
            this.con.setData("CALL `sp_insert_bit_bitacoramanto`('"+this.id1+"', '"+this.bit_fecha_inicio+"', '"+this.bit_fecha_fin+"',"
                            + " '"+this.bit_hora_inicio+"', '"+this.bit_hora_fin+"', '"+this.bit_nombre_personal+"', '"+this.bit_comentarios+"')");
        }
        else {
            con.updateData("CALL `sp_update_bit_bitacoramanto`('"+this.bit_id+"', '"+this.id1+"', '"+this.bit_fecha_inicio+"', '"+this.bit_fecha_fin+"', "
                            + "'"+this.bit_hora_inicio+"', '"+this.bit_hora_fin+"', '"+this.bit_nombre_personal+"', '"+this.bit_comentarios+"')");
        }
        this.id1 = 0;
        this.bit_fecha_inicio = null;
        this.bit_fecha_fin = null;
        this.bit_hora_inicio = null;
        this.bit_hora_fin = null;
        this.bit_nombre_personal = null;
        this.bit_comentarios = null;
        
        execute();
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con = new BitacoraConectar();
        this.dato = con.getDataForm("CALL `sp_select_sol_bitacoraById`('"+this.bit_id+"')");
        while (this.dato.next()) {            
            this.id1 = dato.getInt("inv_dtl_id");
            this.bit_fecha_inicio = dato.getString("bit_fecha_inicio");
            this.bit_fecha_fin = dato.getString("bit_fecha_fin");
            this.bit_hora_inicio = dato.getString("bit_hora_inicio");
            this.bit_hora_fin = dato.getString("bit_hora_fin");
            this.bit_nombre_personal = dato.getString("bit_nombre_personal");
            this.bit_comentarios = dato.getString("bit_comentarios");
        }
        execute();
        return SUCCESS;
    }
    
    public String eliminar() throws Exception{
        this.con = new BitacoraConectar();
        this.datos = new ArrayList<>();
        con.deleteData("delete from bit_bitacoramantenimiento where bit_id = "+this.bit_id+"");
        this.bit_id = 0;
        execute();
        return SUCCESS;
    }        
    

    //******************************************************************* Getters & Setters ************************************************************//
     public BitacoraConectar getCon() {
        return con;
    }

    public void setCon(BitacoraConectar con) {
        this.con = con;
    }

    public ArrayList<BitacoraModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<BitacoraModel> datos) {
        this.datos = datos;
    }

    public ArrayList<EquipoModel> getDatosEqui() {
        return datosEqui;
    }

    public void setDatosEqui(ArrayList<EquipoModel> datosEqui) {
        this.datosEqui = datosEqui;
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

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }
    
    
    
}
