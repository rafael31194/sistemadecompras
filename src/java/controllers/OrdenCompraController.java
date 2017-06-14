
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.DetalleOrdenCompraModel;
import models.OrdenCompraConectar;
import models.OrdenCompraModel;

public class OrdenCompraController extends ActionSupport{
    
    private OrdenCompraConectar con;
    private ArrayList<OrdenCompraModel> datos;
    private ResultSet dato;
    
    private int ord_id;
    private int est_id;
    private int tco_id;
    private int sol_id;
    private int pro_id;
    private String ord_fecha;
    private String ord_descripcion;
    private float ord_total;

    public OrdenCompraConectar getCon() {
        return con;
    }

    public void setCon(OrdenCompraConectar con) {
        this.con = con;
    }

    public ArrayList<OrdenCompraModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<OrdenCompraModel> datos) {
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

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public int getTco_id() {
        return tco_id;
    }

    public void setTco_id(int tco_id) {
        this.tco_id = tco_id;
    }

    public int getSol_id() {
        return sol_id;
    }

    public void setSol_id(int sol_id) {
        this.sol_id = sol_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getOrd_fecha() {
        return ord_fecha;
    }

    public void setOrd_fecha(String ord_fecha) {
        this.ord_fecha = ord_fecha;
    }

    public String getOrd_descripcion() {
        return ord_descripcion;
    }

    public void setOrd_descripcion(String ord_descripcion) {
        this.ord_descripcion = ord_descripcion;
    }

    public float getOrd_total() {
        return ord_total;
    }

    public void setOrd_total(float ord_total) {
        this.ord_total = ord_total;
    }
    
    
    
    @Override
    public String execute() throws Exception {    
        this.con=new OrdenCompraConectar();
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_ordendecompra");

    return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con=new OrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");             
        if (this.ord_id==0){        
        con.setData("CALL `sp_insert_ord_ordenCompra`('"+this.est_id+"', '"+this.sol_id+"', '"+this.pro_id+"', '"+this.ord_fecha+"', '"+this.ord_descripcion+"', '"+this.ord_total+"', '"+this.tco_id+"')");
        } else {
        con.updateData("update ord_ordendecompra set est_id="+this.est_id+",tco_id='"+this.tco_id+"',sol_id='"+this.sol_id+"',pro_id='"+this.pro_id+"',ord_fecha='"+this.ord_fecha+"',ord_descripcion='"+this.ord_descripcion+"',ord_total='"+this.ord_total+"' where ord_id="+this.ord_id+"");
        }
        /*this.ins_id=0;
        this.mun_id=0;
        this.ins_nombre=null;
        this.ins_telefono=null;
        this.ins_direccion=null;*/
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_ordendecompra");
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con=new OrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        this.dato=con.getDataForm("select * from ord_ordendecompra where ord_id="+this.ord_id+"");
        while(this.dato.next()){
        this.ord_id=dato.getInt("ord_id");
        this.est_id=dato.getInt("est_id");
        this.tco_id=dato.getInt("tco_id");
        this.sol_id=dato.getInt("sol_id");
        this.pro_id=dato.getInt("pro_id");
        this.ord_fecha=dato.getString("ord_fecha");
        this.ord_descripcion=dato.getString("ord_descripcion");
        this.ord_total=dato.getFloat("ord_total");
        }
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_ordendecompra");
        return SUCCESS;
                
    }
    
    public String eliminar() throws Exception {
        this.con=new OrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        con.deleteData("delete from ord_ordendecompra where ord_id="+this.ord_id+"");
        this.datos=new ArrayList<>();
        this.datos=con.getData("select * from ord_ordendecompra");
        return SUCCESS;        
    }
    
    public String detalleOrdenCompra() throws Exception
    {
        DetalleOrdenCompraModel ordid = new DetalleOrdenCompraModel();
        ordid.setOrd_id(this.ord_id);
        return SUCCESS;
    }
}
