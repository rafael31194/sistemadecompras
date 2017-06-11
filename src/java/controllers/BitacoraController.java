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
import models.BitacoraModel;
import models.conectar;

/**
 *
 * @author Hassel
 */
public class BitacoraController extends ActionSupport {

    private conectar con;
    private ArrayList<BitacoraModel> datos;
    private ResultSet dato, select;

    private int bit_id, ins_id, inv_id, inv_dtl_id;
    private String bit_fechaproxima, bit_comentarios, inv_dtl_nombre_equipo;

    @Override
    public String execute() throws Exception {
        this.con = new conectar();
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataBitacora("select b.bit_id, b.ins_id, b.inv_dtl_id, b.bit_fechaproxima, b.bit_comentarios, i.ins_nombre, id.inv_dtl_nombre_equipo from bit_bitacoramantenimiento b \n"
                + "join inv_dtl_inventario_detalle id\n"
                + "on b.inv_dtl_id = id.inv_dtl_id \n"
                + "join ins_institucion i \n"
                + "on b.ins_id = i.ins_id order by bit_id;");
        System.out.println("Bitácora: \n");
        System.out.println(this.datos);
        return SUCCESS;
    }

    public String guardar() throws Exception {
        this.con = new conectar();
        if (this.bit_id == 0) {
            this.con.setData("CALL `sp_insert_bit_bitacoramanto`('"+this.ins_id+"', '"+this.inv_dtl_id+"', '"+this.bit_fechaproxima+"', '"+this.bit_comentarios+"')");
        }
        else {
            con.updateData("update bit_bitacoramantenimiento set ins_id = "+this.ins_id+", inv_dtl_id = "+this.inv_dtl_id+", bit_fechaproxima = '"+this.bit_fechaproxima+"', \n" +
                            "bit_comentarios = '"+this.bit_comentarios+"' where bit_id = "+this.bit_id+";");
        }
        this.ins_id = 0;
        this.inv_dtl_id = 0;
        this.bit_fechaproxima = null;
        this.bit_comentarios = null;
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataBitacora("select b.bit_id, b.ins_id, b.inv_dtl_id, b.bit_fechaproxima, b.bit_comentarios, i.ins_nombre, id.inv_dtl_nombre_equipo from bit_bitacoramantenimiento b \n"
                + "join inv_dtl_inventario_detalle id\n"
                + "on b.inv_dtl_id = id.inv_dtl_id \n"
                + "join ins_institucion i \n"
                + "on b.ins_id = i.ins_id order by bit_id;");
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con = new conectar();
        this.dato = con.getDataForm("select * from bit_bitacoramantenimiento where bit_id = "+this.bit_id+"");
        while (this.dato.next()) {            
            this.ins_id = dato.getInt("ins_id");
            this.inv_dtl_id = dato.getInt("inv_dtl_id");
            this.bit_fechaproxima = dato.getString("bit_fechaproxima");
            this.bit_comentarios = dato.getString("bit_comentarios");
        }
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataBitacora("select b.bit_id, b.ins_id, b.inv_dtl_id, b.bit_fechaproxima, b.bit_comentarios, i.ins_nombre, id.inv_dtl_nombre_equipo from bit_bitacoramantenimiento b \n"
                + "join inv_dtl_inventario_detalle id\n"
                + "on b.inv_dtl_id = id.inv_dtl_id \n"
                + "join ins_institucion i \n"
                + "on b.ins_id = i.ins_id order by bit_id;");
        return SUCCESS;
    }
    
    public String eliminar() throws Exception{
        this.con = new conectar();
        this.datos = new ArrayList<>();
        con.deleteData("delete from bit_bitacoramantenimiento where bit_id = "+this.bit_id+"");        
        this.datos = this.con.getDataBitacora("select b.bit_id, b.ins_id, b.inv_dtl_id, b.bit_fechaproxima, b.bit_comentarios, i.ins_nombre, id.inv_dtl_nombre_equipo from bit_bitacoramantenimiento b \n"
                + "join inv_dtl_inventario_detalle id\n"
                + "on b.inv_dtl_id = id.inv_dtl_id \n"
                + "join ins_institucion i \n"
                + "on b.ins_id = i.ins_id order by bit_id;");
        return SUCCESS;
    }        
    

    //******************************************************************* Getters & Setters ************************************************************//
    public String getInv_dtl_nombre_equipo() {
        return inv_dtl_nombre_equipo;
    }

    public void setInv_dtl_nombre_equipo(String inv_dtl_nombre_equipo) {
        this.inv_dtl_nombre_equipo = inv_dtl_nombre_equipo;
    }

    public conectar getCon() {
        return con;
    }

    public void setCon(conectar con) {
        this.con = con;
    }

    public ArrayList<BitacoraModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<BitacoraModel> datos) {
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
