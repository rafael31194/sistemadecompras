
package controllers;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.InstitucionModel;
import models.InventarioConectar;
import models.InventarioModel;


public class InventarioController extends ActionSupport{
    private InventarioConectar con;
    private ArrayList<InstitucionModel> datosIns;
    private ArrayList<InventarioModel> datosInv;
    private int insid;

    public InventarioConectar getCon() {
        return con;
    }

    public void setCon(InventarioConectar con) {
        this.con = con;
    }

    public ArrayList<InstitucionModel> getDatosIns() {
        return datosIns;
    }

    public void setDatosIns(ArrayList<InstitucionModel> datosIns) {
        this.datosIns = datosIns;
    }

    public ArrayList<InventarioModel> getDatosInv() {
        return datosInv;
    }

    public void setDatosInv(ArrayList<InventarioModel> datosInv) {
        this.datosInv = datosInv;
    }

    public int getIns_id() {
        return insid;
    }

    public void setIns_id(int insid) {
        this.insid = insid;
    }
    
    @Override
    public String execute() throws Exception {  
              
        this.con=new InventarioConectar();
        this.datosIns=new ArrayList<>();        
        this.datosIns=con.getIns("CALL `sp_select_all_ins_instituciones`()");  
        if (this.insid!=0){
        this.datosInv=new ArrayList<>();        
        this.datosInv=con.getInv("CALL `sp_select_all_ins_instituciones`("+this.insid+")");
        }
        
        return SUCCESS;
    }
   
}
