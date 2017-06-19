/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.CategoriaEquipoModel;
import models.EquipoConectar;
import models.EquipoModel;
import models.ProveedorConectar;
import models.ProveedorModel;
import models.SolicitudConectar;

/**
 *
 * @author Hassel
 */
public class EquipoController extends ActionSupport {

    private EquipoConectar con;
    private ProveedorConectar con_prove;
    private SolicitudConectar con_sol;
    private ArrayList<EquipoModel> datos;
    private ResultSet dato, select;
    private ArrayList<ProveedorModel> datosProvee;
    private ArrayList<CategoriaEquipoModel> datosCatEqui;

    private int equ_id, pro_id, cat_id, equ_anio, id, id_cat;
    private String equ_nombre, equ_marca, equ_modelo, equ_especificaciongarantia, equ_imagen, equ_estado, proveedor, catEquipo;
    private float equ_capacidad_btu, equ_potencia;
    public  int loginError;

    @Override
    public String execute() throws Exception {
        this.con = new EquipoConectar();
        this.con_prove = new ProveedorConectar();
        this.con_sol = new SolicitudConectar();

        this.datosProvee = new ArrayList<>();
        this.datosProvee = this.con_prove.getData("CALL `sp_select_all_pro_proveedores`()");

        this.datosCatEqui = new ArrayList<>();
        this.datosCatEqui = con_sol.getDataCatEquipo("CALL `sp_select_cat_catag_categoriaEquipos`()");

        this.datos = new ArrayList<>();
        this.datos = this.con.getDataEquipos("CALL `sp_select_all_equ_equipo`()");
        System.out.println("Bitácora: \n");
        System.out.println(this.datos);

        return SUCCESS;
    }

    public String guardar() throws Exception {
        this.con = new EquipoConectar();

        if (this.equ_id == 0) {
            this.con.setData("CALL `sp_insert_equ_equipo`('" + this.id + "', '" + this.id_cat + "', '" + this.equ_nombre + "', '" + this.equ_marca + "', '" + this.equ_modelo + "', "
                    + "'" + this.equ_estado + "', '" + this.equ_anio + "', '" + this.equ_capacidad_btu + "', '" + this.equ_potencia + "', '" + this.equ_especificaciongarantia + "')");
        } else {
            con.updateData("CALL `sp_update_equ_equipo`('" + this.equ_id + "', '" + this.id + "', '" + this.id_cat + "', '" + this.equ_nombre + "', "
                    + "'" + this.equ_marca + "', '" + this.equ_modelo + "', '" + this.equ_estado + "', '" + this.equ_anio + "', '" + this.equ_capacidad_btu + "',"
                            + " '" + this.equ_potencia + "', '" + this.equ_especificaciongarantia + "')");
        }
        this.id = 0;
        this.id_cat = 0;
        this.equ_anio = 0;
        this.equ_capacidad_btu = 0;
        this.equ_potencia = 0;
        this.equ_nombre = null;
        this.equ_marca = null;
        this.equ_modelo = null;
        this.equ_estado = null;
        this.equ_especificaciongarantia = null;
        this.equ_imagen = null;

        execute();
        return SUCCESS;
    }

    public String llenarFormulario() throws Exception {
        this.con = new EquipoConectar();
        this.dato = con.getDataForm("CALL `sp_select_equ_equipoById`('"+ this.equ_id +"')");
        while (this.dato.next()) {
            this.id = dato.getInt("pro_id");
            this.id_cat = dato.getInt("cat_id");
            this.equ_anio = dato.getInt("equ_anio");
            this.equ_capacidad_btu = dato.getFloat("equ_capacidad_btu");
            this.equ_potencia = dato.getFloat("equ_potencia");
            this.equ_nombre = dato.getString("equ_nombre");
            this.equ_marca = dato.getString("equ_marca");
            this.equ_modelo = dato.getString("equ_modelo");
            this.equ_estado = dato.getString("equ_estado");
            this.equ_especificaciongarantia = dato.getString("equ_especificaciongarantia");
            this.equ_imagen = dato.getString("equ_imagen");
        }
        execute();
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        this.con = new EquipoConectar();
        this.datos = new ArrayList<>();
        try{
            this.loginError=0;
            con.deleteData("delete from equ_equipo where equ_id = " + this.equ_id + "");
            this.equ_id = 0;
        } catch (SQLException ex){
            this.loginError=1;
            this.equ_id = 0;
        }
        execute();
        return SUCCESS;
    }

    //******************************************************************* Getters & Setters ************************************************************//

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

    public SolicitudConectar getCon_sol() {
        return con_sol;
    }

    public void setCon_sol(SolicitudConectar con_sol) {
        this.con_sol = con_sol;
    }

    public ArrayList<CategoriaEquipoModel> getDatosCatEqui() {
        return datosCatEqui;
    }

    public void setDatosCatEqui(ArrayList<CategoriaEquipoModel> datosCatEqui) {
        this.datosCatEqui = datosCatEqui;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public ProveedorConectar getCon_prove() {
        return con_prove;
    }

    public void setCon_prove(ProveedorConectar con_prove) {
        this.con_prove = con_prove;
    }

    public ArrayList<ProveedorModel> getDatosProvee() {
        return datosProvee;
    }

    public void setDatosProvee(ArrayList<ProveedorModel> datosProvee) {
        this.datosProvee = datosProvee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    
    public int getLoginError() {
        return loginError;
    }

    public void setLoginError(int loginError) {
        this.loginError = loginError;
    }

}
