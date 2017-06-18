
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import models.InstitucionModel;
import models.conectar;
import java.sql.ResultSet;
import models.MunicipiosModel;

public class InstitucionesControllerMySQL extends ActionSupport{
    
    private conectar con;
    private ArrayList<InstitucionModel> datos;
    private ArrayList<MunicipiosModel> datosMun;
    private ArrayList<String> select;
    private ResultSet dato;
    private int rol;
    
    
    private int mun_id,ins_id,id;
    private String ins_nombre,ins_telefono,ins_direccion,municipios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public ArrayList<MunicipiosModel> getDatosMun() {
        return datosMun;
    }

    public void setDatosMun(ArrayList<MunicipiosModel> datosMun) {
        this.datosMun = datosMun;
    }
    
    

    public String getMunicipios() {
        return municipios;
    }

    public void setMunicipios(String municipios) {
        this.municipios = municipios;
    }
    
    

    public ArrayList<String> getSelect() {
        return select;
    }

    public void setSelect(ArrayList<String> select) {
        this.select = select;
    }
    
    

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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
    
    @Override
    public String execute() throws Exception {  
        
        this.rol=1;
        this.con=new conectar();
        this.datos=new ArrayList<>();
        this.datosMun=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        //this.select=con.getNomMunicipios("select m.mun_nombre from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        this.datosMun=new ArrayList<>();
        this.datosMun=con.getNomMunicipios("select * from mun_municipio");
          
        return SUCCESS;
    }
    
  
    public String recibirDatos() throws Exception {
        this.con=new conectar();
        this.datosMun=new ArrayList<>();
        this.datosMun=con.getNomMunicipios("select * from mun_municipio");             
        if (this.ins_id==0){        
        con.setData("CALL `sp_insert_ins_institucion`('"+this.id+"', '"+this.ins_nombre+"', '"+this.ins_telefono+"', '"+this.ins_direccion+"')");
        } else {
        con.updateData("update ins_institucion set mun_id="+this.id+",ins_nombre='"+this.ins_nombre+"',ins_telefono='"+this.ins_telefono+"',ins_direccion='"+this.ins_direccion+"' where ins_id="+this.ins_id+"");
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
        this.datosMun=new ArrayList<>();
        this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        con.deleteData("delete from ins_institucion where ins_id="+this.ins_id+"");
        this.ins_id=0;
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;        
    }
    
    public String llenarFormulario() throws Exception{
        this.con=new conectar();
        this.datosMun=new ArrayList<>();
        this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        this.dato=con.getDataForm("select * from ins_institucion where ins_id="+this.ins_id+"");
        while(this.dato.next()){
        this.ins_id=dato.getInt("ins_id");
        this.id=dato.getInt("mun_id");
        this.ins_nombre=dato.getString("ins_nombre");
        this.ins_telefono=dato.getString("ins_telefono");
        this.ins_direccion=dato.getString("ins_direccion");
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select i.ins_id,i.mun_id,m.mun_nombre,i.ins_nombre,i.ins_telefono,i.ins_direccion from ins_institucion i inner join mun_municipio m on i.mun_id=m.mun_id");
        return SUCCESS;
                
    }
}
