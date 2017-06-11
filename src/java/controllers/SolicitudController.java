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
import models.SolicitudModel;
import models.conectar;

/**
 *
 * @author Hassel
 */
public class SolicitudController extends ActionSupport{
    private conectar con;
    private ArrayList<SolicitudModel> datos;
    private ResultSet dato, select;
    private ArrayList<String> tipos;
    
    private int sol_id, cat_id, uni_id, est_id, sol_id_usu, sol_tipo;
    private String sol_fecha;
    private String sol_descripcion;
    
    @Override
    public String execute() throws Exception{
        this.con = new conectar();
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataSolicitud("select s.sol_id, s.cat_id, s.uni_id, s.est_id, s.sol_tipo, s.sol_fecha, s.sol_id_usu, "
                                               + "s.sol_descripcion, e.est_estado from sol_solicitud s inner join est_estado e on s.est_id = e.est_id;");
        System.out.println("Datos de solicitudes");
        System.out.println(this.datos);
        return SUCCESS;
    }
    
    public String guardar() throws Exception{
        this.con = new conectar();
        this.tipos = new ArrayList<>();
        this.tipos.add("1");
        this.tipos.add("2");
        if (this.sol_id == 0) {
            con.setData("CALL `sp_insert_sol_crearSolicitud`('"+this.cat_id+"', '"+this.uni_id+"', '"+this.est_id+"', '"+this.sol_id_usu+"', "
                        + "'"+this.sol_tipo+"','"+this.sol_fecha+"', '"+this.sol_descripcion+"')");
        } else {
            con.updateData("update sol_solicitud set cat_id = "+this.cat_id+", uni_id = "+this.uni_id+", est_id = "+this.est_id+", sol_id_usu = "+this.sol_id_usu+", sol_fecha= '"+this.sol_fecha+"', \n" +
                            "sol_descripcion = '"+this.sol_descripcion+"', sol_tipo = "+this.sol_tipo+" where sol_id = "+this.sol_id+"");
        }
        
        this.cat_id = 0;
        this.uni_id = 0;
        this.est_id = 0;
        this.sol_id_usu = 0;
        this.sol_tipo = 0;
        this.sol_fecha = null;
        this.sol_descripcion = null;
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataSolicitud("select s.sol_id, s.cat_id, s.uni_id, s.est_id, s.sol_tipo, s.sol_fecha, s.sol_id_usu, "
                                               + "s.sol_descripcion, e.est_estado from sol_solicitud s inner join est_estado e on s.est_id = e.est_id;");
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con = new conectar();
        this.dato = con.getDataForm("select * from sol_solicitud where sol_id = "+this.sol_id+" ");
        while (this.dato.next()) {    
            this.sol_id = dato.getInt("sol_id");
            this.cat_id = dato.getInt("cat_id");
            this.uni_id = dato.getInt("uni_id");
            this.sol_fecha = dato.getString("sol_fecha");
            this.sol_id_usu = dato.getInt("sol_id_usu");
            this.sol_tipo = dato.getInt("sol_tipo");
            this.sol_descripcion = dato.getString("sol_descripcion");
            this.est_id = dato.getInt("est_id");
        }
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataSolicitud("select s.sol_id, s.cat_id, s.uni_id, s.est_id, s.sol_tipo, s.sol_fecha, s.sol_id_usu, "
                                               + "s.sol_descripcion, e.est_estado from sol_solicitud s inner join est_estado e on s.est_id = e.est_id;");
        return SUCCESS;
    }
   
    public String eliminar() throws Exception{
        this.con = new conectar();
        con.deleteData("delete from sol_solicitud where sol_id="+this.sol_id+"");
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataSolicitud("select s.sol_id, s.cat_id, s.uni_id, s.est_id, s.sol_tipo, s.sol_fecha, s.sol_id_usu, "
                                               + "s.sol_descripcion, e.est_estado from sol_solicitud s inner join est_estado e on s.est_id = e.est_id;");
        return SUCCESS;
    }
    
    //******************************************************************* Getters & Setters ************************************************************//

    public conectar getCon() {
        return con;
    }

    public void setCon(conectar con) {
        this.con = con;
    }

    public ArrayList<SolicitudModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<SolicitudModel> datos) {
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
    
    
}
