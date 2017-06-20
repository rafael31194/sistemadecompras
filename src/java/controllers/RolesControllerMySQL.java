package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.RolConectar;
import models.RolModel;

public class RolesControllerMySQL extends ActionSupport{
    
    private RolConectar con;
    private ArrayList<RolModel> datos;
    private ArrayList<String> select;
    private ResultSet dato;
    
    private int rol_id,loginError;
    private String rol_descripcion;

    public int getLoginError() {
        return loginError;
    }

    public void setLoginError(int loginError) {
        this.loginError = loginError;
    }

    public RolConectar getCon() {
        return con;
    }

    public void setCon(RolConectar con) {
        this.con = con;
    }

    public ArrayList<RolModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<RolModel> datos) {
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

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    

    public String getRol_descripcion() {
        return rol_descripcion;
    }

    public void setRol_descripcion(String rol_descripcion) {
        this.rol_descripcion = rol_descripcion;
    }

    
 
    @Override
    public String execute() throws Exception {     
        this.con = new RolConectar();
        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from rol_rol");
        
        return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con = new RolConectar();      
              
        if (this.rol_id == 0)       
            con.setData("CALL `sp_insert_rol_rol`('"+this.rol_descripcion+"')");
        else 
            con.updateData("update rol_rol set rol_descripcion="+this.rol_descripcion+" where rol_id="+this.rol_id+"");

        this.rol_id = 0;
        this.rol_descripcion = null;
        

        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from rol_rol");

        return SUCCESS;
    }

    public String eliminar() throws Exception {
        this.con = new RolConectar();      
        
        try{
            loginError=0;
            con.deleteData("delete from rol_rol where rol_id="+this.rol_id+"");
            this.rol_id=0;
        }catch(SQLException ex){
            loginError=1;
            this.rol_id=0;
        }
        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from rol_rol");
        
        return SUCCESS;        
    }

    public String llenarFormulario() throws Exception{
        this.con = new RolConectar();      
           
        
        this.dato = con.getDataForm("select * from rol_rol where rol_id="+this.rol_id+"");
        while(this.dato.next()){
            
        this.rol_id = dato.getInt("rol_id");
        this.rol_descripcion = dato.getString("rol_descripcion");
        ;    

        }
        this.datos = new ArrayList<>();
        this.datos = con.getData("select * from rol_rol");
        
        return SUCCESS;       
    }    

}
