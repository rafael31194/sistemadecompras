
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.DetalleOrdenCompraConectar;
import models.DetalleOrdenCompraJoins;
import models.DetalleOrdenCompraModel;
import models.EquipoModel;

public class DetalleOrdenCompraController extends ActionSupport{
    private DetalleOrdenCompraConectar con;
    private ArrayList<DetalleOrdenCompraJoins> datos2;
    private ArrayList<EquipoModel> datosEqu;
    private ResultSet dato;
    
    private int ord_id,ordid,ord_idd;
    private int ord_dtl_id;
    private int equ_id,equid;
    private float ord_dtl_precio;
    private String ord_dtl_codigoInventario;

    public int getEquid() {
        return equid;
    }

    public void setEquid(int equid) {
        this.equid = equid;
    }

    public ArrayList<EquipoModel> getDatosEqu() {
        return datosEqu;
    }

    public void setDatosEqu(ArrayList<EquipoModel> datosEqu) {
        this.datosEqu = datosEqu;
    }

    public int getOrd_idd() {
        return ord_idd;
    }

    public void setOrd_idd(int ord_idd) {
        this.ord_idd = ord_idd;
    }

    public int getOrdid() {
        return ordid;
    }

    public void setOrdid(int ordid) {
        this.ordid = ordid;
    }
    

    public DetalleOrdenCompraConectar getCon() {
        return con;
    }

    public void setCon(DetalleOrdenCompraConectar con) {
        this.con = con;
    }

    public ArrayList<DetalleOrdenCompraJoins> getDatos2() {
        return datos2;
    }

    public void setDatos2(ArrayList<DetalleOrdenCompraJoins> datos2) {
        this.datos2 = datos2;
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
        this.datos2=new ArrayList<>();        
        this.datos2=con.getData("select od.ord_dtl_id,o.ord_id,e.equ_nombre,od.ord_dtl_precio,od.ord_dtl_codigoInventario\n" +
                                "from ord_dtl_ordendetalle od\n" +
                                "join equ_equipo e on e.equ_id=od.equ_id\n" +
                                "join ord_ordendecompra o on od.ord_id=o.ord_id\n" +
                                "where o.ord_id="+this.ordid+"");
        this.datosEqu=new ArrayList<>();
        this.datosEqu=con.getEqu("select * from equ_equipo");

    return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con=new DetalleOrdenCompraConectar();
      
        if(this.ordid==0){
            this.ord_id=this.ord_idd;
        } else{
            this.ord_id=this.ordid;
        }
        if (this.ord_dtl_id==0){        
        con.setData("CALL `sp_insert_ord_dtl_ordenDetalle`('"+this.ord_id+"', '"+this.equid+"', '"+this.ord_dtl_precio+"', '"+this.ord_dtl_codigoInventario+"')");
        this.ord_idd=this.ord_id;
        } else {
        con.updateData("update ord_dtl_ordendetalle set ord_id="+this.ord_id+",equ_id='"+this.equid+"',ord_dtl_precio='"+this.ord_dtl_precio+"',ord_dtl_codigoInventario='"+this.ord_dtl_codigoInventario+"' where ord_dtl_id="+this.ord_dtl_id+"");
        this.ord_idd=this.ord_id;
        }        
        this.datos2=new ArrayList<>();        
        this.datos2=con.getData("select od.ord_dtl_id,o.ord_id,e.equ_nombre,od.ord_dtl_precio,od.ord_dtl_codigoInventario\n" +
                                "from ord_dtl_ordendetalle od\n" +
                                "join equ_equipo e on e.equ_id=od.equ_id\n" +
                                "join ord_ordendecompra o on od.ord_id=o.ord_id\n" +
                                "where o.ord_id="+this.ord_id+"");
        this.datosEqu=new ArrayList<>();
        this.datosEqu=con.getEqu("select * from equ_equipo");
        this.equ_id=1;
        this.ord_dtl_id=0;
        this.ord_dtl_precio=0;
        this.ord_dtl_codigoInventario=null;
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
        this.equid=dato.getInt("equ_id");
        this.ord_dtl_precio=dato.getFloat("ord_dtl_precio");
        this.ord_dtl_codigoInventario=dato.getString("ord_dtl_codigoInventario");
        }
        
        this.datos2=new ArrayList<>();        
        this.datos2=con.getData("select od.ord_dtl_id,o.ord_id,e.equ_nombre,od.ord_dtl_precio,od.ord_dtl_codigoInventario\n" +
                                "from ord_dtl_ordendetalle od\n" +
                                "join equ_equipo e on e.equ_id=od.equ_id\n" +
                                "join ord_ordendecompra o on od.ord_id=o.ord_id\n" +
                                "where o.ord_id="+this.ord_id+"");
        this.datosEqu=new ArrayList<>();
        this.datosEqu=con.getEqu("select * from equ_equipo");
        return SUCCESS;
                
    }
    
    public String eliminar() throws Exception {
        this.con=new DetalleOrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio");  
        con.deleteData("delete from ord_dtl_ordendetalle where ord_dtl_id="+this.ord_dtl_id+"");
        this.datos2=new ArrayList<>();        
        this.datos2=con.getData("select od.ord_dtl_id,o.ord_id,e.equ_nombre,od.ord_dtl_precio,od.ord_dtl_codigoInventario\n" +
                                "from ord_dtl_ordendetalle od\n" +
                                "join equ_equipo e on e.equ_id=od.equ_id\n" +
                                "join ord_ordendecompra o on od.ord_id=o.ord_id\n" +
                                "where o.ord_id="+this.ord_id+"");
        this.datosEqu=new ArrayList<>();
        this.datosEqu=con.getEqu("select * from equ_equipo");
        this.equ_id=0;
        this.ord_dtl_id=0;
        this.ord_dtl_precio=0;
        this.ord_dtl_codigoInventario=null;
        return SUCCESS;        
    }
    
}
