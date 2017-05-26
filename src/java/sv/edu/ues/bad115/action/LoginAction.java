/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import sv.edu.ues.bad115.entity.EquEquipo;
import sv.edu.ues.bad115.entity.PanPantalla;
import sv.edu.ues.bad115.entity.ProProveedor;
import sv.edu.ues.bad115.global.SessionSistema;
import sv.edu.ues.bad115.service.Usuarios;

/**
 *
 * @author EduardoRAFAEL
 */
public class LoginAction extends ActionSupport {
        //=================variables de LOGIN========================
        private ArrayList<PanPantalla> PantallasPorUsuario;
        Usuarios usuarios=new Usuarios();
        private String user;
        private String password;
        private int countLogs=0;
        public  int loginError;
   

    //===================variables para los Proveedores=====================
    public void setDatosProveedores(ArrayList<ProProveedor> datosProveedores) {
        this.datosProveedores = datosProveedores;
    }
        private ArrayList<EquEquipo> datosEquipos;
        private ArrayList<ProProveedor> datosProveedores;
        
        //==================variables de Usuarios=========================
        
        
        
    //======================METODOS DE CLASE=============================    
      
    @Override
    public String execute() throws Exception {
       loginError=0;
        System.out.println("\n\n\n********************");
        System.out.println(getUser());
        System.out.println(getPassword());
        Usuarios usuarios=new Usuarios();
        usuarios.login(getUser(), getPassword());
        int userRol=SessionSistema.UsuarioActivo.getIdRol();
        if(userRol==0)
        {             
                 mostrarMensajeError();
                 countLogs++;
                 if(countLogs>=3) bloquearUsuario();
            
             return "login";
        }    
        if(userRol==5)
        return "proveedor"; //To change body of generated methods, choose Tools | Templates.
        
        
        return "home";
        
    }
    
    public String ordenCompra() throws Exception
    {
        return SUCCESS;
    }
    
    public String institucion() throws Exception
    {
        return SUCCESS;
    }
    
    public String detalleOrdenCompra() throws Exception
    {
        return SUCCESS;
    }
    
    public String restricciones() throws Exception
    {
        return SUCCESS;
    }
    
    public String proveedores() throws Exception
    {
        return SUCCESS;
    }
    
    public String usuarios() throws Exception
    {
        return SUCCESS;
    }
    
    public String roles() throws Exception
    {
        return SUCCESS;
    }
    
      private void mostrarMensajeError() {
        loginError=1;
    }
      
      
       private void bloquearUsuario() {
        
    }

        //=================FIN DE METODOS================================
        
        
        
        
     //======================GETTERS AND SETTERS===============================   
        
    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public ArrayList<PanPantalla> getPantallasPorUsuario() {
        return PantallasPorUsuario;
    }

    public void setPantallasPorUsuario(ArrayList<PanPantalla> PantallasPorUsuario) {
        this.PantallasPorUsuario = PantallasPorUsuario;
    }

    public ArrayList<EquEquipo> getDatosEquipos() {
        return datosEquipos;
    }

    public void setDatosEquipos(ArrayList<EquEquipo> datosEquipos) {
        this.datosEquipos = datosEquipos;
    }

    public ArrayList<ProProveedor> getDatosProveedores() {
        return datosProveedores;
    }

   
  
         
    
    
}
