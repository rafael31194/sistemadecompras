
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import models.InstitucionModel;
import models.conectar;
import java.sql.ResultSet;

public class InstitucionesControllerMySQL extends ActionSupport{
    
    private conectar con;
    private ArrayList<InstitucionModel> datos;
    //private ArrayList<String> select;
    private ResultSet dato,select;
    
    
    private int mun_id,ins_id;
    private String ins_nombre,ins_telefono,ins_direccion;

    public int getIns_id() {
        return ins_id;
    }

    public void setIns_id(int ins_id) {
        this.ins_id = ins_id;
    }

    public int getMun_id() {
        return mun_id;
    }

    public void setMun_id(int mun_id) {
        this.mun_id = mun_id;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public String getIns_telefono() {
        return ins_telefono;
    }

    public void setIns_telefono(String ins_telefono) {
        this.ins_telefono = ins_telefono;
    }

    public String getIns_direccion() {
        return ins_direccion;
    }

    public void setIns_direccion(String ins_direccion) {
        this.ins_direccion = ins_direccion;
    }
    
    

    public conectar getCon() {
        return con;
    }

    public void setCon(conectar con) {
        this.con = con;
    }

    public ArrayList<InstitucionModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<InstitucionModel> datos) {
        this.datos = datos;
    }
    
    
    
    @Override
    public String execute() throws Exception {     
        this.con=new conectar();
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        this.select=con.getNomMunicipios("select m.mun_nombre from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;
    }
    
  
    public String recibirDatos() throws Exception {
        this.con=new conectar();
        if (this.ins_id==0){        
        con.setData("CALL `sp_insert_ins_institucion`('"+this.mun_id+"', '"+this.ins_nombre+"', '"+this.ins_telefono+"', '"+this.ins_direccion+"')");
        } else {
        con.updateData("update ins_institucion set mun_id="+this.mun_id+",ins_nombre='"+this.ins_nombre+"',ins_telefono='"+this.ins_telefono+"',ins_direccion='"+this.ins_direccion+"' where ins_id="+this.ins_id+"");
        }
        this.ins_id=0;
        this.mun_id=0;
        this.ins_nombre=null;
        this.ins_telefono=null;
        this.ins_direccion=null;
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;
    }
    
    public String eliminar() throws Exception {
        this.con=new conectar();
        con.deleteData("delete from ins_institucion where ins_id="+this.ins_id+"");
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;        
    }
    
    public String llenarFormulario() throws Exception{
        this.con=new conectar();
        this.dato=con.getDataForm("select * from ins_institucion where ins_id="+this.ins_id+"");
        while(this.dato.next()){
        this.ins_id=dato.getInt("ins_id");
        this.mun_id=dato.getInt("mun_id");
        this.ins_nombre=dato.getString("ins_nombre");
        this.ins_telefono=dato.getString("ins_telefono");
        this.ins_direccion=dato.getString("ins_direccion");
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;
                
    }
}