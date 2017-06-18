package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.RolModel;
import models.UnidadModel;
import models.InstitucionModel;
import models.UsuarioConectar;
import models.UsuarioModel;

public class UsuariosControllerMySQL extends ActionSupport{

    private UsuarioConectar con;
    private ArrayList<UsuarioModel> datos;
    private ArrayList<RolModel> datosRol;
    private ArrayList<UnidadModel> datosUni;
    private ArrayList<InstitucionModel> datosIns;
    private ArrayList<String> select;
    private ResultSet dato;
    
    private int usu_id, rol_id, uni_id, ins_id, id_rol, id_uni, id_ins, usu_rol_id, usr_uni_id, id_ur, id_uu;
    private String usu_usuario, usu_contrasenia, usu_nombre, usu_correo, rol_descripcion;

    public UsuarioConectar getCon() {
        return con;
    }

    public void setCon(UsuarioConectar con) {
        this.con = con;
    }

    public ArrayList<UsuarioModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<UsuarioModel> datos) {
        this.datos = datos;
    }

    public ArrayList<RolModel> getDatosRol() {
        return datosRol;
    }

    public void setDatosRol(ArrayList<RolModel> datosRol) {
        this.datosRol = datosRol;
    }

    public ArrayList<UnidadModel> getDatosUni() {
        return datosUni;
    }

    public void setDatosUni(ArrayList<UnidadModel> datosUni) {
        this.datosUni = datosUni;
    }

    public ArrayList<InstitucionModel> getDatosIns() {
        return datosIns;
    }

    public void setDatosIns(ArrayList<InstitucionModel> datosIns) {
        this.datosIns = datosIns;
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

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_uni() {
        return id_uni;
    }

    public void setId_uni(int id_uni) {
        this.id_uni = id_uni;
    }

    public int getId_ins() {
        return id_ins;
    }

    public void setId_ins(int id_ins) {
        this.id_ins = id_ins;
    }

    public int getUsu_rol_id() {
        return usu_rol_id;
    }

    public void setUsu_rol_id(int usu_rol_id) {
        this.usu_rol_id = usu_rol_id;
    }

    public int getUsr_uni_id() {
        return usr_uni_id;
    }

    public void setUsr_uni_id(int usr_uni_id) {
        this.usr_uni_id = usr_uni_id;
    }

    public int getId_ur() {
        return id_ur;
    }

    public void setId_ur(int id_ur) {
        this.id_ur = id_ur;
    }

    public int getId_uu() {
        return id_uu;
    }

    public void setId_uu(int id_uu) {
        this.id_uu = id_uu;
    }

    public String getUsu_usuario() {
        return usu_usuario;
    }

    public void setUsu_usuario(String usu_usuario) {
        this.usu_usuario = usu_usuario;
    }

    public String getUsu_contrasenia() {
        return usu_contrasenia;
    }

    public void setUsu_contrasenia(String usu_contrasenia) {
        this.usu_contrasenia = usu_contrasenia;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_correo() {
        return usu_correo;
    }

    public void setUsu_correo(String usu_correo) {
        this.usu_correo = usu_correo;
    }

    public String getRol_descripcion() {
        return rol_descripcion;
    }

    public void setRol_descripcion(String rol_descripcion) {
        this.rol_descripcion = rol_descripcion;
    }

    @Override
    public String execute() throws Exception {     
        this.con = new UsuarioConectar();
        this.datos = new ArrayList<>();
        this.datosRol = new ArrayList<>();
        this.datosUni = new ArrayList<>();
        this.datosIns = new ArrayList<>();
        this.datos = con.getData("select u.usu_id, u.usu_usuario, u.usu_contrasenia, u.usu_nombre, u.usu_correo, r.rol_descripcion, un.uni_nombre, i.ins_nombre from rol_rol r join usu_rol_usuarios_por_rol ur on r.rol_id = ur.rol_id join usu_usuario u on ur.usu_id = u.usu_id join usr_uni_usuarios_unidad uu on u.usu_id = uu.usu_id join ins_institucion i on uu.ins_id = i.ins_id join uni_unidad un on uu.uni_id = un.uni_id");
        
        this.datosRol = new ArrayList<>();
        this.datosRol = con.getDataRoles("select * from rol_rol");
        
        this.datosUni = new ArrayList<>();
        this.datosUni = con.getDataUnidades("select * from uni_unidad");
          
        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");
        
        return SUCCESS;
    }
  
    public String recibirDatos() throws Exception {
        this.con = new UsuarioConectar();     
        this.datosRol = new ArrayList<>();
        this.datosRol = con.getDataRoles("select * from rol_rol");
        
        this.datosUni = new ArrayList<>();
        this.datosUni = con.getDataUnidades("select * from uni_unidad");

        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");
        
        if (this.usu_id == 0)       
            con.setData("CALL `sp_insert_usu_usuarioConRol`('"+this.usu_usuario+"', '"+this.usu_contrasenia+"', '"+this.usu_nombre+"', '"+this.usu_correo+"', '"+this.id_rol+"', '"+this.id_uni+"', '"+this.id_ins+"')");
        else 
            con.updateData("update usu_usuario u, usu_rol_usuarios_por_rol ur, usr_uni_usuarios_unidad uu set u.usu_usuario = '"+this.usu_usuario+"', u.usu_contrasenia = 'sha("+this.usu_contrasenia+")', u.usu_nombre = '"+this.usu_nombre+"', u.usu_correo = '"+this.usu_correo+"', ur.rol_id = "+this.id_rol+", uu.uni_id = "+this.id_uni+", uu.ins_id = "+this.id_ins+" where u.usu_id = "+this.usu_id+" and ur.usu_rol_id = "+this.id_ur+" and uu.usr_uni_id = "+this.id_uu+"");
        
        this.usu_id = 0;

        this.usu_usuario = null;
        this.usu_contrasenia = null;
        this.usu_nombre = null;
        this.usu_correo = null;
        this.usu_rol_id = 0;    
        this.rol_id = 0;
        this.usr_uni_id = 0;
        this.uni_id = 0;
        this.ins_id = 0;

        this.datos = new ArrayList<>();
        this.datos = con.getData("select u.usu_id, u.usu_usuario, u.usu_contrasenia, u.usu_nombre, u.usu_correo, r.rol_descripcion, un.uni_nombre, ins_nombre from rol_rol r join usu_rol_usuarios_por_rol ur on r.rol_id = ur.rol_id join usu_usuario u on ur.usu_id = u.usu_id join usr_uni_usuarios_unidad uu on u.usu_id = uu.usu_id join ins_institucion i on uu.ins_id = i.ins_id join uni_unidad un on uu.uni_id = un.uni_id");
        
        return SUCCESS;
    }
    
    public String eliminar() throws Exception {
        this.con = new UsuarioConectar();     
        this.datosRol = new ArrayList<>();
        this.datosRol = con.getDataRoles("select * from rol_rol");
        
        this.datosUni = new ArrayList<>();
        this.datosUni = con.getDataUnidades("select * from uni_unidad");

        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");
        
        con.deleteData("delete from usu_usuario where usu_id = "+this.usu_id+"");
        this.datos = new ArrayList<>();
        this.datos = con.getData("select u.usu_id, u.usu_usuario, u.usu_contrasenia, u.usu_nombre, u.usu_correo, r.rol_descripcion, un.uni_nombre, ins_nombre from rol_rol r join usu_rol_usuarios_por_rol ur on r.rol_id = ur.rol_id join usu_usuario u on ur.usu_id = u.usu_id join usr_uni_usuarios_unidad uu on u.usu_id = uu.usu_id join ins_institucion i on uu.ins_id = i.ins_id join uni_unidad un on uu.uni_id = un.uni_id");
        
        return SUCCESS;        
    }

    public String llenarFormulario() throws Exception{
        this.con = new UsuarioConectar();     
        this.datosRol = new ArrayList<>();
        this.datosRol = con.getDataRoles("select * from rol_rol");
        
        this.datosUni = new ArrayList<>();
        this.datosUni = con.getDataUnidades("select * from uni_unidad");

        this.datosIns = new ArrayList<>();
        this.datosIns = con.getDataInstituciones("select * from ins_institucion");
        
        this.dato = con.getDataForm("select u.usu_id, u.usu_usuario, u.usu_contrasenia, u.usu_nombre, u.usu_correo, ur.usu_rol_id, ur.rol_id, uu.usr_uni_id, uu.uni_id, uu.ins_id from usu_usuario u join usu_rol_usuarios_por_rol ur on u.usu_id = ur.usu_id join usr_uni_usuarios_unidad uu on u.usu_id = uu.usu_id where u.usu_id = "+this.usu_id+"");
        while(this.dato.next()){
        
        this.usu_id = dato.getInt("usu_id");
        this.usu_usuario = dato.getString("usu_usuario");
        this.usu_contrasenia = dato.getString("usu_contrasenia");
        this.usu_nombre = dato.getString("usu_nombre");
        this.usu_correo = dato.getString("usu_correo");
        this.id_ur = dato.getInt("usu_rol_id");
        this.id_rol = dato.getInt("rol_id");
        this.id_uu = dato.getInt("usr_uni_id");
        this.id_uni = dato.getInt("uni_id");
        this.id_ins = dato.getInt("ins_id");

        }
        this.datos = new ArrayList<>();
        this.datos = con.getData("select u.usu_id, u.usu_usuario, u.usu_contrasenia, u.usu_nombre, u.usu_correo, r.rol_descripcion, un.uni_nombre, ins_nombre from rol_rol r join usu_rol_usuarios_por_rol ur on r.rol_id = ur.rol_id join usu_usuario u on ur.usu_id = u.usu_id join usr_uni_usuarios_unidad uu on u.usu_id = uu.usu_id join ins_institucion i on uu.ins_id = i.ins_id join uni_unidad un on uu.uni_id = un.uni_id");
        
        return SUCCESS;       
    }    
    
}