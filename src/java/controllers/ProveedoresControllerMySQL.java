package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.MunicipiosModel;
import models.UsuarioModel;
import models.ProveedorConectar;
import models.ProveedorModel;

public class ProveedoresControllerMySQL extends ActionSupport{
    
    private ProveedorConectar con;
    private ArrayList<ProveedorModel> datos;
    private ArrayList<MunicipiosModel> datosMun;
    private ArrayList<UsuarioModel> datosUsu;
    private ArrayList<String> select;
    private ResultSet dato;
    
    private int pro_id, mun_id, usu_id, id_mun, pro_id_usu;
    private String pro_nombre, pro_direccion;

    public ProveedorConectar getCon() {
        return con;
    }

    public void setCon(ProveedorConectar con) {
        this.con = con;
    }

    public ArrayList<ProveedorModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<ProveedorModel> datos) {
        this.datos = datos;
    }

    public ArrayList<MunicipiosModel> getDatosMun() {
        return datosMun;
    }

    public void setDatosMun(ArrayList<MunicipiosModel> datosMun) {
        this.datosMun = datosMun;
    }

    public ArrayList<UsuarioModel> getDatosUsu() {
        return datosUsu;
    }

    public void setDatosUsu(ArrayList<UsuarioModel> datosUsu) {
        this.datosUsu = datosUsu;
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

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getMun_id() {
        return mun_id;
    }

    public void setMun_id(int mun_id) {
        this.mun_id = mun_id;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getId_mun() {
        return id_mun;
    }

    public void setId_mun(int id_mun) {
        this.id_mun = id_mun;
    }

    public int getPro_id_usu() {
        return pro_id_usu;
    }

    public void setPro_id_usu(int pro_id_usu) {
        this.pro_id_usu = pro_id_usu;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_direccion() {
        return pro_direccion;
    }

    public void setPro_direccion(String pro_direccion) {
        this.pro_direccion = pro_direccion;
    }
 
    @Override
    public String execute() throws Exception {     
        this.con = new ProveedorConectar();
        this.datos = new ArrayList<>();
        this.datosMun = new ArrayList<>();
        this.datosUsu = new ArrayList<>();
        this.datos = con.getData("select p.pro_id, m.mun_nombre, p.pro_nombre, p.pro_direccion, u.usu_usuario from pro_proveedor p inner join mun_municipio m on p.pro_id = m.mun_id inner join usu_usuarios u on p.pro_id = u.usu_id");
        
        this.datosMun = new ArrayList<>();
        this.datosMun = con.getDataMunicipios("select * from mun_municipio");
        
        this.datosUsu = new ArrayList<>();
        this.datosUsu = con.getDataUsuario("select * from usu_usuarios");
          
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
