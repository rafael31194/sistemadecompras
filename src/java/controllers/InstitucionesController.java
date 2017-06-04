
package controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import sv.edu.ues.bad115.entity.InsInstitucion;
import sv.edu.ues.bad115.entity.InstitucionOperaciones;

public class InstitucionesController extends ActionSupport{
    
    private ArrayList<InsInstitucion> datos;
    private InstitucionOperaciones op;
    private InsInstitucion ins;

    public ArrayList<InsInstitucion> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<InsInstitucion> datos) {
        this.datos = datos;
    }

    public InstitucionOperaciones getOp() {
        return op;
    }

    public void setOp(InstitucionOperaciones op) {
        this.op = op;
    }

    public InsInstitucion getIns() {
        return ins;
    }

    public void setIns(InsInstitucion ins) {
        this.ins = ins;
    }
    
    
    
    @Override
    public String execute() throws Exception {
        this.op = new InstitucionOperaciones();
        this.datos = this.op.getInstitucion();
        
        return SUCCESS;
    }
    
}
