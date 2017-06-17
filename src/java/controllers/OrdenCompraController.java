
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.DetalleOrdenCompraConectar;
import models.DetalleOrdenCompraJoins;
import models.DetalleOrdenCompraModel;
import models.EquipoModel;
import models.EstadoModel;
import models.OrdenCompraConectar;
import models.OrdenCompraJoins;
import models.OrdenCompraModel;
import models.ProveedorModel;
import models.SolicitudModel;
import models.TipoContratacionModel;

public class OrdenCompraController extends ActionSupport{
    
    private OrdenCompraConectar con;
    private DetalleOrdenCompraConectar con2;
    private ArrayList<OrdenCompraJoins> datos;
    private ArrayList<DetalleOrdenCompraJoins> datos2;
    private ArrayList<EstadoModel> datosEst;
    private ArrayList<TipoContratacionModel> datosTipo;
    private ArrayList<SolicitudModel> datosSol;
    private ArrayList<ProveedorModel> datosPro;
    private ArrayList<EquipoModel> datosEqu;
    private ResultSet dato;
    
    public int ord_id;
    private int est_id,estid,id;
    private int tco_id,tcoid;
    private int sol_id,solid;
    private int pro_id,proid;
    private String ord_fecha;
    private String ord_descripcion;
    private float ord_total;
    private int ordid;

    public ArrayList<EquipoModel> getDatosEqu() {
        return datosEqu;
    }

    public void setDatosEqu(ArrayList<EquipoModel> datosEqu) {
        this.datosEqu = datosEqu;
    }

    public int getTcoid() {
        return tcoid;
    }

    public void setTcoid(int tcoid) {
        this.tcoid = tcoid;
    }

    public int getSolid() {
        return solid;
    }

    public void setSolid(int solid) {
        this.solid = solid;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public ArrayList<TipoContratacionModel> getDatosTipo() {
        return datosTipo;
    }

    public void setDatosTipo(ArrayList<TipoContratacionModel> datosTipo) {
        this.datosTipo = datosTipo;
    }

    public ArrayList<SolicitudModel> getDatosSol() {
        return datosSol;
    }

    public void setDatosSol(ArrayList<SolicitudModel> datosSol) {
        this.datosSol = datosSol;
    }

    public ArrayList<ProveedorModel> getDatosPro() {
        return datosPro;
    }

    public void setDatosPro(ArrayList<ProveedorModel> datosPro) {
        this.datosPro = datosPro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<EstadoModel> getDatosEst() {
        return datosEst;
    }

    public void setDatosEst(ArrayList<EstadoModel> datosEst) {
        this.datosEst = datosEst;
    }

    public int getEstid() {
        return estid;
    }

    public void setEstid(int estid) {
        this.estid = estid;
    }

    public ArrayList<DetalleOrdenCompraJoins> getDatos2() {
        return datos2;
    }

    public void setDatos2(ArrayList<DetalleOrdenCompraJoins> datos2) {
        this.datos2 = datos2;
    }

    public DetalleOrdenCompraConectar getCon2() {
        return con2;
    }

    public void setCon2(DetalleOrdenCompraConectar con2) {
        this.con2 = con2;
    }

    public int getOrdid() {
        return ordid;
    }

    public void setOrdid(int ordid) {
        this.ordid = ordid;
    }
    
        public OrdenCompraConectar getCon() {
        return con;
    }

    public void setCon(OrdenCompraConectar con) {
        this.con = con;
    }

    public ArrayList<OrdenCompraJoins> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<OrdenCompraJoins> datos) {
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
        this.datos=con.getData("select o.ord_id,e.est_estado,t.tco_descripcion,s.sol_descripcion,p.pro_nombre,o.ord_fecha,o.ord_descripcion,o.ord_total\n" +
                                "from ord_ordendecompra o \n" +
                                "join est_estado e on e.est_id=o.est_id\n" +
                                "join sol_solicitud s on s.sol_id=o.sol_id\n" +
                                "join tco_tipocontratacion t on t.tco_id=o.tco_id\n" +
                                "join pro_proveedor p on p.pro_id=o.pro_id");
        this.datosEst=new ArrayList<>();
        this.datosEst=con.getEstado("select * from est_estado");
        this.datosTipo=new ArrayList<>();
        this.datosTipo=con.getTipo("select * from tco_tipocontratacion");
        this.datosSol=new ArrayList<>();
        this.datosSol=con.getSol("select * from sol_solicitud");
        this.datosPro=new ArrayList<>();
        this.datosPro=con.getPro("select * from pro_proveedor");

    return SUCCESS;
    }
    
    public String recibirDatos() throws Exception {
        this.con=new OrdenCompraConectar();
        //this.datosMun=new ArrayList<>();
        //this.datosMun=con.getNomMunicipios("select * from mun_municipio"); 
        this.datosEst=new ArrayList<>();
        this.datosEst=con.getEstado("select * from est_estado");
        this.datosTipo=new ArrayList<>();
        this.datosTipo=con.getTipo("select * from tco_tipocontratacion");
        this.datosSol=new ArrayList<>();
        this.datosSol=con.getSol("select * from sol_solicitud");
        this.datosPro=new ArrayList<>();
        this.datosPro=con.getPro("select * from pro_proveedor");
        if (this.ord_id==0){        
        con.setData("CALL `sp_insert_ord_ordenCompra`('"+this.estid+"', '"+this.solid+"', '"+this.proid+"', '"+this.ord_fecha+"', '"+this.ord_descripcion+"', '"+this.ord_total+"', '"+this.tcoid+"')");
        } else {
        con.updateData("update ord_ordendecompra set est_id="+this.estid+",tco_id='"+this.tcoid+"',sol_id='"+this.solid+"',pro_id='"+this.proid+"',ord_fecha='"+this.ord_fecha+"',ord_descripcion='"+this.ord_descripcion+"',ord_total='"+this.ord_total+"' where ord_id="+this.ord_id+"");
        }
        this.est_id=0;
        this.sol_id=0;
        this.tco_id=0;
        this.pro_id=0;
        this.ord_fecha=null;
        this.ord_descripcion=null;
        this.ord_id=0;
        this.ord_total=0;
        this.datos=new ArrayList<>();
         this.datos=con.getData("select o.ord_id,e.est_estado,t.tco_descripcion,s.sol_descripcion,p.pro_nombre,o.ord_fecha,o.ord_descripcion,o.ord_total\n" +
                                "from ord_ordendecompra o \n" +
                                "join est_estado e on e.est_id=o.est_id\n" +
                                "join sol_solicitud s on s.sol_id=o.sol_id\n" +
                                "join tco_tipocontratacion t on t.tco_id=o.tco_id\n" +
                                "join pro_proveedor p on p.pro_id=o.pro_id");
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con=new OrdenCompraConectar();
        this.datosEst=new ArrayList<>();
        this.datosEst=con.getEstado("select * from est_estado");  
        this.datosTipo=new ArrayList<>();
        this.datosTipo=con.getTipo("select * from tco_tipocontratacion");
        this.datosSol=new ArrayList<>();
        this.datosSol=con.getSol("select * from sol_solicitud");
        this.datosPro=new ArrayList<>();
        this.datosPro=con.getPro("select * from pro_proveedor");
        this.dato=con.getDataForm("select * from ord_ordendecompra where ord_id="+this.ord_id+"");
        while(this.dato.next()){
        this.ord_id=dato.getInt("ord_id");
        this.estid=dato.getInt("est_id");
        this.tcoid=dato.getInt("tco_id");
        this.solid=dato.getInt("sol_id");
        this.proid=dato.getInt("pro_id");
        this.ord_fecha=dato.getString("ord_fecha");
        this.ord_descripcion=dato.getString("ord_descripcion");
        this.ord_total=dato.getFloat("ord_total");
        }
        this.datos=new ArrayList<>();
         this.datos=con.getData("select o.ord_id,e.est_estado,t.tco_descripcion,s.sol_descripcion,p.pro_nombre,o.ord_fecha,o.ord_descripcion,o.ord_total\n" +
                                "from ord_ordendecompra o \n" +
                                "join est_estado e on e.est_id=o.est_id\n" +
                                "join sol_solicitud s on s.sol_id=o.sol_id\n" +
                                "join tco_tipocontratacion t on t.tco_id=o.tco_id\n" +
                                "join pro_proveedor p on p.pro_id=o.pro_id");
        return SUCCESS;
                
    }
    
    public String eliminar() throws Exception {
        this.con=new OrdenCompraConectar();
        this.datosEst=new ArrayList<>();
        this.datosEst=con.getEstado("select * from est_estado");
        this.datosTipo=new ArrayList<>();
        this.datosTipo=con.getTipo("select * from tco_tipocontratacion");
        this.datosSol=new ArrayList<>();
        this.datosSol=con.getSol("select * from sol_solicitud");
        this.datosPro=new ArrayList<>();
        this.datosPro=con.getPro("select * from pro_proveedor");
        con.deleteData("delete from ord_ordendecompra where ord_id="+this.ord_id+"");
        this.est_id=0;
        this.sol_id=0;
        this.tco_id=0;
        this.pro_id=0;
        this.ord_fecha=null;
        this.ord_descripcion=null;
        this.ord_id=0;
        this.ord_total=0;
        this.datos=new ArrayList<>();
         this.datos=con.getData("select o.ord_id,e.est_estado,t.tco_descripcion,s.sol_descripcion,p.pro_nombre,o.ord_fecha,o.ord_descripcion,o.ord_total\n" +
                                "from ord_ordendecompra o \n" +
                                "join est_estado e on e.est_id=o.est_id\n" +
                                "join sol_solicitud s on s.sol_id=o.sol_id\n" +
                                "join tco_tipocontratacion t on t.tco_id=o.tco_id\n" +
                                "join pro_proveedor p on p.pro_id=o.pro_id");
        return SUCCESS;        
    }
    
    public String detalleOrdenCompra() throws Exception
    {
        
        this.con2=new DetalleOrdenCompraConectar();
        this.datos2=new ArrayList<>();
        this.datos2=con2.getData("select od.ord_dtl_id,o.ord_id,e.equ_nombre,od.ord_dtl_precio,od.ord_dtl_codigoInventario\n" +
                                "from ord_dtl_ordendetalle od\n" +
                                "join equ_equipo e on e.equ_id=od.equ_id\n" +
                                "join ord_ordendecompra o on od.ord_id=o.ord_id\n" +
                                "where o.ord_id="+this.ord_id+"");
        this.datosEqu=new ArrayList<>();
        this.datosEqu=con2.getEqu("select * from equ_equipo");
        return SUCCESS;
    }
    
    
}
