
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.DetalleOrdenCompraConectar;
import models.DetalleOrdenCompraModel;

public class DetalleOrdenCompraController extends ActionSupport{
    private DetalleOrdenCompraConectar con;
    private ArrayList<DetalleOrdenCompraModel> datos;
    private ResultSet dato;
    
    private int ord_id;
    private int ord_dtl_id;
    private int equ_id;
    private float ord_dtl_precio;
    private String ord_dtl_codigoInventario;

    public DetalleOrdenCompraConectar getCon() {
        return con;
    }

    public void setCon(DetalleOrdenCompraConectar con) {
        this.con = con;
    }

    public ArrayList<DetalleOrdenCompraModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<DetalleOrdenCompraModel> datos) {
        this.datos = datos;
    }

    public ResultSet getDato() {
        return dato;
    }

    public void setDato(ResultSet dato) {
        this.dato = dato;
    }

    public int getOrd_id() {
        return ord_id;
    }

    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;
    }

    public int getOrd_dtl_id() {
        return ord_dtl_id;
    }

    public void setOrd_dtl_id(int ord_dtl_id) {
        this.ord_dtl_id = ord_dtl_id;
    }

    public int getEqu_id() {
        return equ_id;
    }

    public void setEqu_id(int equ_id) {
        this.equ_id = equ_id;
    }

    public float getOrd_dtl_precio() {
        return ord_dtl_precio;
    }

    public void setOrd_dtl_precio(float ord_dtl_precio) {
        this.ord_dtl_precio = ord_dtl_precio;
    }

    public String getOrd_dtl_codigoInventario() {
        return ord_dtl_codigoInventario;
    }

    public void setOrd_dtl_codigoInventario(String ord_dtl_codigoInventario) {
        this.ord_dtl_codigoInventario = ord_dtl_codigoInventario;
    }
    
    @Override
    public String execute() throws Exception {    
        this.con=new DetalleOrdenCompraConectar();
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_dtl_ordendetalle");

    return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con=new DetalleOrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");     
        DetalleOrdenCompraModel ordid = new DetalleOrdenCompraModel();
        this.ord_id=1;
        if (this.ord_dtl_id==0){        
        con.setData("CALL `sp_insert_ord_dtl_ordenDetalle`('"+this.ord_id+"', '"+this.equ_id+"', '"+this.ord_dtl_precio+"', '"+this.ord_dtl_codigoInventario+"')");
        } else {
        con.updateData("update ord_dtl_ordendetalle set ord_id="+this.ord_id+",equ_id='"+this.equ_id+"',ord_dtl_precio='"+this.ord_dtl_precio+"',ord_dtl_codigoInventario='"+this.ord_dtl_codigoInventario+"' where ord_dtl_id="+this.ord_dtl_id+"");
        }
        /*this.ins_id=0;
        this.mun_id=0;
        this.ins_nombre=null;
        this.ins_telefono=null;
        this.ins_direccion=null;*/
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_dtl_ordendetalle");
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con=new DetalleOrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        this.dato=con.getDataForm("select * from ord_dtl_ordendetalle where ord_dtl_id="+this.ord_dtl_id+"");
        while(this.dato.next()){
        this.ord_dtl_id=dato.getInt("ord_dtl_id");
        this.ord_id=dato.getInt("ord_id");
        this.equ_id=dato.getInt("equ_id");
        this.ord_dtl_precio=dato.getFloat("ord_dtl_precio");
        this.ord_dtl_codigoInventario=dato.getString("ord_dtl_codigoInventario");
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_dtl_ordendetalle");
        return SUCCESS;
                
    }
    
    public String eliminar() throws Exception {
        this.con=new DetalleOrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        con.deleteData("delete from ord_dtl_ordendetalle where ord_dtl_id="+this.ord_dtl_id+"");
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_dtl_ordendetalle");
        return SUCCESS;        
    }
    
}
