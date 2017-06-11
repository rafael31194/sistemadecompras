package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.InstitucionModel;
import models.ProveedorModel;
import models.RestriccionConectar;
import models.RestriccionModel;

public class RestriccionesControllerMySQL extends ActionSupport{
    
    private RestriccionConectar con;
    private ArrayList<RestriccionModel> datos;
    private ArrayList<InstitucionModel> datosIns;
    private ArrayList<ProveedorModel> datosPro;
    private ArrayList<String> select;
    private ResultSet dato;
    
    private int res_id, ins_id, pro_id, id_ins, id_pro, res_cantidadcompras;
    private String res_descripcion;
    private double res_montolimite;
    private int res_EsInstalacion;

    public RestriccionConectar getCon() {
        return con;
    }

    public void setCon(RestriccionConectar con) {
        this.con = con;
    }

    public ArrayList<RestriccionModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<RestriccionModel> datos) {
        this.datos = datos;
    }

    public ArrayList<InstitucionModel> getDatosIns() {
        return datosIns;
    }

    public void setDatosIns(ArrayList<InstitucionModel> datosIns) {
        this.datosIns = datosIns;
    }

    public ArrayList<ProveedorModel> getDatosPro() {
        return datosPro;
    }

    public void setDatosPro(ArrayList<ProveedorModel> datosPro) {
        this.datosPro = datosPro;
    }

    public ArrayList<String> getSelect() {
        return select;
    }

    public void setSelect(ArrayList<String> select) {
        this.select = select;
    }

    public ResultSet getDato() {
        return dato;
    }

    public void setDato(ResultSet dato) {
        this.dato = dato;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getId_ins() {
        return id_ins;
    }

    public void setId_ins(int id_ins) {
        this.id_ins = id_ins;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getRes_cantidadcompras() {
        return res_cantidadcompras;
    }

    public void setRes_cantidadcompras(int res_cantidadcompras) {
        this.res_cantidadcompras = res_cantidadcompras;
    }

    public String getRes_descripcion() {
        return res_descripcion;
    }

    public void setRes_descripcion(String res_descripcion) {
        this.res_descripcion = res_descripcion;
    }

    public double getRes_montolimite() {
        return res_montolimite;
    }

    public void setRes_montolimite(double res_montolimite) {
        this.res_montolimite = res_montolimite;
    }

    public int getRes_EsInstalacion() {
        return res_EsInstalacion;
    }

    public void setRes_EsInstalacion(int res_EsInstalacion) {
        this.res_EsInstalacion = res_EsInstalacion;
    }

    @Override
    public String execute() throws Exception {     
        this.con = new RestriccionConectar();
        this.datos = new ArrayList<>();
        this.datosIns = new ArrayList<>();
        this.datosPro = new ArrayList<>();
        this.datos = con.getData("select r.res_id, i.ins_nombre, p.pro_nombre, r.res_montolimite, r.res_cantidadcompras, r.res_descripcion, r.res_EsInstalacion from res_restriccion r inner join ins_institucion i on r.ins_id = i.ins_id inner join pro_proveedor p on r.pro_id = p.pro_id");
        
        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");
        
        this.datosPro = new ArrayList<>();
        this.datosPro = con.getDataProveedores("select * from pro_proveedor");
          
        return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con = new RestriccionConectar();        
        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");         
        
        this.datosPro = new ArrayList<>();
        this.datosPro = con.getDataProveedores("select * from pro_proveedor");
               
        if (this.res_id == 0)       
            con.setData("CALL `sp_insert_res_restriccion`('"+this.id_ins+"', '"+this.id_pro+"', '"+this.res_montolimite+"', '"+this.res_cantidadcompras+"', '"+this.res_descripcion+"', '"+this.res_EsInstalacion+"')");
        else 
            con.updateData("update res_restriccion set ins_id="+this.id_ins+", pro_id="+this.id_pro+", res_montolimite='"+this.res_montolimite+"', res_cantidadcompras='"+this.res_cantidadcompras+"', res_descripcion='"+this.res_descripcion+"', res_EsInstalacion='"+this.res_EsInstalacion+"' where res_id="+this.res_id+"");

        this.res_id = 0;
        this.ins_id = 0;
        this.pro_id = 0;
        this.res_montolimite = 0;
        this.res_cantidadcompras = 0;
        this.res_descripcion = null;
        this.res_EsInstalacion = 0;

        this.datos = new ArrayList<>();
        this.datos = con.getData("select r.res_id, i.ins_nombre, p.pro_nombre, r.res_montolimite, r.res_cantidadcompras, r.res_descripcion, r.res_EsInstalacion from res_restriccion r inner join ins_institucion i on r.ins_id = i.ins_id inner join pro_proveedor p on r.pro_id = p.pro_id");
        
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        this.con = new RestriccionConectar();        
        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");         
        
        this.datosPro = new ArrayList<>();
        this.datosPro = con.getDataProveedores("select * from pro_proveedor");
        
        con.deleteData("delete from res_restriccion where res_id="+this.res_id+"");
        this.datos = new ArrayList<>();
        this.datos = con.getData("select r.res_id, i.ins_nombre, p.pro_nombre, r.res_montolimite, r.res_cantidadcompras, r.res_descripcion, r.res_EsInstalacion from res_restriccion r inner join ins_institucion i on r.ins_id = i.ins_id inner join pro_proveedor p on r.pro_id = p.pro_id");
        
        return SUCCESS;        
    }

    public String llenarFormulario() throws Exception{
        this.con = new RestriccionConectar();
        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");         
        
        this.datosPro = new ArrayList<>();
        this.datosPro = con.getDataProveedores("select * from pro_proveedor");        
        
        this.dato = con.getDataForm("select * from res_restriccion where res_id="+this.res_id+"");
        while(this.dato.next()){
        this.res_id = dato.getInt("res_id");
        this.id_ins = dato.getInt("ins_id");
        this.id_pro = dato.getInt("pro_id");
        this.res_montolimite = dato.getDouble("res_montolimite");
        this.res_cantidadcompras = dato.getInt("res_cantidadcompras");
        this.res_descripcion = dato.getString("res_descripcion");
        this.res_EsInstalacion = dato.getInt("res_EsInstalacion");
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select r.res_id, i.ins_nombre, p.pro_nombre, r.res_montolimite, r.res_cantidadcompras, r.res_descripcion, r.res_EsInstalacion from res_restriccion r inner join ins_institucion i on r.ins_id = i.ins_id inner join pro_proveedor p on r.pro_id = p.pro_id");
        
        return SUCCESS;       
    }
    
}
