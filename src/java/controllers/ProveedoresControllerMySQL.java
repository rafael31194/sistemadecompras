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
    
    private int pro_id, mun_id, id_mun, pro_id_usu, id_usu;
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

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
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
        this.datos = con.getData("select p.pro_id, m.mun_nombre, p.pro_nombre, p.pro_direccion, u.usu_usuario from pro_proveedor p inner join mun_municipio m on p.mun_id = m.mun_id inner join usu_usuario u on p.pro_id_usu = u.usu_id");
        
        this.datosMun = new ArrayList<>();
        this.datosMun = con.getDataMunicipios("select * from mun_municipio");
        
        this.datosUsu = new ArrayList<>();
        this.datosUsu = con.getDataUsuario("select * from usu_usuario");
          
        return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con = new ProveedorConectar();      
        this.datosMun = new ArrayList<>();
        this.datosMun = con.getDataMunicipios("select * from mun_municipio");
        
        this.datosUsu = new ArrayList<>();
        this.datosUsu = con.getDataUsuario("select * from usu_usuario");
               
        if (this.pro_id == 0)       
            con.setData("CALL `sp_insert_pro_proveedor`('"+this.id_mun+"', '"+this.pro_nombre+"', '"+this.pro_direccion+"', '"+this.id_usu+"')");
        else 
            con.updateData("update pro_proveedor set mun_id="+this.id_mun+", pro_nombre="+this.pro_nombre+", pro_direccion='"+this.pro_direccion+"', pro_id_usu='"+this.id_usu+"' where pro_id="+this.pro_id+"");

        this.pro_id = 0;
        this.mun_id = 0;
        this.pro_nombre = null;
        this.pro_direccion = null;
        this.pro_id_usu = 0;

        this.datos = new ArrayList<>();
        this.datos = con.getData("select p.pro_id, m.mun_nombre, p.pro_nombre, p.pro_direccion, u.usu_usuario from pro_proveedor p inner join mun_municipio m on p.mun_id = m.mun_id inner join usu_usuario u on p.pro_id_usu = u.usu_id");

        return SUCCESS;
    }

    public String eliminar() throws Exception {
        this.con = new ProveedorConectar();      
        this.datosMun = new ArrayList<>();
        this.datosMun = con.getDataMunicipios("select * from mun_municipio");
        
        this.datosUsu = new ArrayList<>();
        this.datosUsu = con.getDataUsuario("select * from usu_usuario");
        
        con.deleteData("delete from pro_proveedor where pro_id="+this.pro_id+"");
        this.datos = new ArrayList<>();
        this.datos = con.getData("select p.pro_id, m.mun_nombre, p.pro_nombre, p.pro_direccion, u.usu_usuario from pro_proveedor p inner join mun_municipio m on p.mun_id = m.mun_id inner join usu_usuario u on p.pro_id_usu = u.usu_id");
        
        return SUCCESS;        
    }

    public String llenarFormulario() throws Exception{
        this.con = new ProveedorConectar();      
        this.datosMun = new ArrayList<>();
        this.datosMun = con.getDataMunicipios("select * from mun_municipio");
        
        this.datosUsu = new ArrayList<>();
        this.datosUsu = con.getDataUsuario("select * from usu_usuario");   
        
        this.dato = con.getDataForm("select * from pro_proveedor where pro_id="+this.pro_id+"");
        while(this.dato.next()){
            
        this.pro_id = dato.getInt("pro_id");
        this.id_mun = dato.getInt("mun_id");
        this.pro_nombre = dato.getString("pro_nombre");
        this.pro_direccion = dato.getString("pro_direccion");
        this.id_usu = dato.getInt("pro_id_usu");    

        }
        this.datos = new ArrayList<>();
        this.datos = con.getData("select p.pro_id, m.mun_nombre, p.pro_nombre, p.pro_direccion, u.usu_usuario from pro_proveedor p inner join mun_municipio m on p.mun_id = m.mun_id inner join usu_usuario u on p.pro_id_usu = u.usu_id");
        
        return SUCCESS;       
    }    

}
