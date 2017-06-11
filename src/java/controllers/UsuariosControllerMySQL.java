package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.UsuarioModel;
import models.UsuarioConectar;

public class UsuariosControllerMySQL extends ActionSupport{
    
    private UsuarioConectar con;
    private ArrayList<UsuarioModel> datos;
    private ArrayList<String> select;
    private ResultSet dato;
    
    private int usu_id;
    private String usu_usuario,usu_contrasenia,usu_nombre,usu_correo;
    private int usu_activo = 1;

    
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

    
    public int getUsu_activo() {
        return usu_activo;
    }

    
    public void setUsu_activo(int usu_activo) {
        this.usu_activo = usu_activo;
    }

  

    @Override
    public String execute() throws Exception {     
        this.con = new UsuarioConectar();
        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from usu_usuarios");
        
          
        return SUCCESS;
    }
    
   public String recibirDatos() throws Exception {
        this.con = new UsuarioConectar();        
        this.datos = new ArrayList<>();      
        if (this.usu_id == 0)       
            con.setData("CALL `sp_insert_usu_usuarios`("+this.usu_usuario+"', '"+this.usu_contrasenia+"', '"+this.usu_nombre+"', '"+this.usu_correo+"', '"+this.usu_activo+"')");
        else 
            con.updateData("update usu_usuarios set usu_usuario="+this.usu_usuario+", usu_contrasenia="+this.usu_contrasenia+", usu_nombre='"+this.usu_nombre+"', usu_correo='"+this.usu_correo+"', usu_activo='"+this.usu_activo+"' where usu_id="+this.usu_id+"");

        this.usu_id = 0;
        this.usu_usuario=null;
        this.usu_contrasenia=null;
        this.usu_nombre=null;
        this.usu_correo=null;
        this.usu_activo = 0;

        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from usu_usuarios");
        return SUCCESS;
    }

    public String eliminar() throws Exception {
        this.con = new UsuarioConectar();        
         
        con.deleteData("delete from usu_usuarios where usu_id="+this.usu_id+"");
        this.datos = new ArrayList<>();
        this.datos=con.getData("select * from usu_usuarios");
        
        return SUCCESS;        
    }

    public String llenarFormulario() throws Exception{
        this.con = new UsuarioConectar();
         
        this.dato = con.getDataForm("select * from usu_usuarios where usu_id="+this.usu_id+"");
        while(this.dato.next()){
        this.usu_id = dato.getInt("usu_id");
        this.usu_usuario = dato.getString("usu_usuario");
        this.usu_contrasenia = dato.getString("usu_contrasenia");
        this.usu_nombre = dato.getString("usu_nombre");
        this.usu_correo = dato.getString("usu_correo");
        this.usu_activo = dato.getInt("usu_activo");
        
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from usu_usuarios");
        
        return SUCCESS;       
    }
    
 }


