
package controllers;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.CategoriaEquipoModel;
import models.ProveedorConectar;
import models.SolicitudConectar;
import models.SolicitudModel;
import models.UnidadModel;
import models.UsuarioModel;

public class aprobarController extends ActionSupport{
    private SolicitudConectar con;
    private ProveedorConectar pro_con;
    private ArrayList<SolicitudModel> datos;
    private ResultSet dato, select;
    private ArrayList<String> tipos;
    private ArrayList<CategoriaEquipoModel> datosCatEqui;
    private ArrayList<UnidadModel> datosUnidad;
    private ArrayList<UsuarioModel> datosUser;
    
    private int sol_id, cat_id, uni_id, est_id, sol_id_usu, sol_tipo, id, idUni, idUser;
    private String sol_fecha;
    private String sol_descripcion;
    
    @Override
    public String execute() throws Exception{
        this.con = new SolicitudConectar();
        
        this.datosCatEqui = new ArrayList<>();
        this.datosCatEqui = con.getDataCatEquipo("CALL `sp_select_cat_catag_categoriaEquipos`()");
        
        this.datosUnidad = new ArrayList<>();
        this.datosUnidad = con.getDataUnidades("CALL `sp_select_all_cate_catEquipo`()");
        
        this.datosUser = new ArrayList<>();
        this.datosUser = con.getDataUsuario("CALL `sp_select_all_usu_usuarios`()");
        
        this.datos = new ArrayList<>();
        this.datos = this.con.getDataSolicitud("CALL `sp_select_sol_SolicitudesEnEspera`()");
        System.out.println("Datos de solicitudes");
        System.out.println(this.datos);
        return SUCCESS;
    }
    
    public String guardar() throws Exception{
        this.con = new SolicitudConectar();
        if (this.sol_id == 0) {
            con.setData("CALL `sp_insert_sol_crearSolicitud`('"+this.id+"', '"+this.idUni+"', '"+3+"', '"+this.idUser+"', "
                        + "'"+this.sol_fecha+"','"+this.sol_descripcion+"', '"+this.sol_tipo+"')");          
        } else {
            con.updateData("CALL `sp_update_sol_solicitud`('"+this.id+"', '"+this.idUni+"', '"+3+"', '"+this.idUser+"', "
                            + "'"+this.sol_fecha+"', '"+this.sol_descripcion+"', '"+this.sol_id+"', '"+this.sol_tipo+"')");
        }
        this.id = 0;
        this.idUni = 0;
        this.est_id = 0;
        this.idUser = 0;
        this.sol_tipo = 0;
        this.sol_fecha = null;
        this.sol_descripcion = null;
        execute();
        return SUCCESS;
    }
    
    public String llenarFormulario() throws Exception{
        this.con = new SolicitudConectar();
        this.dato = con.getDataForm("CALL `sp_select_sol_solicitudesById`('"+this.sol_id+"')");
        while (this.dato.next()) {    
//            this.sol_id = dato.getInt("sol_id");
            this.id = dato.getInt("cat_id");
            this.idUni = dato.getInt("uni_id");
            this.sol_fecha = dato.getString("sol_fecha");
            this.idUser = dato.getInt("sol_id_usu");
            this.sol_tipo = dato.getInt("sol_tipo");
            this.sol_descripcion = dato.getString("sol_descripcion");
            this.est_id = dato.getInt("est_id");
        }
        execute();
        return SUCCESS;
    }
   
    public String eliminar() throws Exception{
        this.con = new SolicitudConectar();
        con.deleteData("delete from sol_solicitud where sol_id="+this.sol_id+"");
        this.sol_id = 0;
        execute();
        return SUCCESS;
    }
    
    public String aprobarSol() throws Exception{
        this.con = new SolicitudConectar();
        con.updateData("update sol_solicitud set est_id=4 where sol_id="+this.sol_id+"");
        this.sol_id = 0;
        execute();
        return SUCCESS;
    }
    
    public String denegarSol() throws Exception{
        this.con = new SolicitudConectar();
        con.updateData("update sol_solicitud set est_id=2 where sol_id="+this.sol_id+"");
        this.sol_id = 0;
        execute();
        return SUCCESS;
    }
    
    //******************************************************************* Getters & Setters ************************************************************//

    public ProveedorConectar getPro_con() {
        return pro_con;
    }

    public void setPro_con(ProveedorConectar pro_con) {
        this.pro_con = pro_con;
    }

    public ArrayList<UsuarioModel> getDatosUser() {
        return datosUser;
    }

    public void setDatosUser(ArrayList<UsuarioModel> datosUser) {
        this.datosUser = datosUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    
    
    public ArrayList<UnidadModel> getDatosUnidad() {
        return datosUnidad;
    }

    public void setDatosUnidad(ArrayList<UnidadModel> datosUnidad) {
        this.datosUnidad = datosUnidad;
    }

    public int getIdUni() {
        return idUni;
    }

    public void setIdUni(int idUni) {
        this.idUni = idUni;
    }

    
    
    public ArrayList<CategoriaEquipoModel> getDatosCatEqui() {
        return datosCatEqui;
    }

    public void setDatosCatEqui(ArrayList<CategoriaEquipoModel> datosCatEqui) {
        this.datosCatEqui = datosCatEqui;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public SolicitudConectar getCon() {
        return con;
    }

    public void setCon(SolicitudConectar con) {
        this.con = con;
    }

    public ArrayList<SolicitudModel> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<SolicitudModel> datos) {
        this.datos = datos;
    }

    public ResultSet getDato() {
        return dato;
    }

    public void setDato(ResultSet dato) {
        this.dato = dato;
    }

    public ResultSet getSelect() {
        return select;
    }

    public void setSelect(ResultSet select) {
        this.select = select;
    }

    public ArrayList<String> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
    }

    public int getSol_id() {
        return sol_id;
    }

    public void setSol_id(int sol_id) {
        this.sol_id = sol_id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }

    public int getSol_id_usu() {
        return sol_id_usu;
    }

    public void setSol_id_usu(int sol_id_usu) {
        this.sol_id_usu = sol_id_usu;
    }

    public int getSol_tipo() {
        return sol_tipo;
    }

    public void setSol_tipo(int sol_tipo) {
        this.sol_tipo = sol_tipo;
    }

    public String getSol_fecha() {
        return sol_fecha;
    }

    public void setSol_fecha(String sol_fecha) {
        this.sol_fecha = sol_fecha;
    }

    public String getSol_descripcion() {
        return sol_descripcion;
    }

    public void setSol_descripcion(String sol_descripcion) {
        this.sol_descripcion = sol_descripcion;
    }
}
