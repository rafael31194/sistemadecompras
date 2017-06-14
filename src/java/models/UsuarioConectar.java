package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioConectar {

    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    
    private ArrayList<UsuarioModel> arreglo;
    private ArrayList<RolModel> arregloRol;
    
    private ArrayList<UnidadModel> arregloUni;
    private ArrayList<InstitucionModel> arregloIns;
    
    public UsuarioConectar() {
        this.server = "localhost:3307";
        this.user = "root";
        this.pass = "admin";
        this.bd = "controldecompras";        
    }
    
    public void con() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://" + this.server + "/" + this.bd, this.user, this.pass);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void desconectar() throws SQLException {
        this.con.close();
    }
      
    public ArrayList<UsuarioModel> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new UsuarioModel(datos.getInt("usu_id"), datos.getString("usu_usuario"), datos.getString("usu_contrasenia"), 
                    datos.getString("usu_nombre"), datos.getString("usu_correo"), datos.getString("rol_descripcion"), 
                    datos.getString("uni_nombre"), datos.getString("ins_nombre")));        
        }
        return this.arreglo;
        
    }
        
    public ArrayList<RolModel> getDataRoles(String sql) throws SQLException {
        
        this.arregloRol = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloRol.add(new RolModel(datos.getInt("rol_id"), datos.getString("rol_descripcion")));  
        }
        return this.arregloRol;
        
    }
    
    public ArrayList<UnidadModel> getDataUnidades(String sql) throws SQLException {
        
        this.arregloUni = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloUni.add(new UnidadModel(datos.getInt("uni_id"), datos.getString("uni_nombre")));  
        }
        return this.arregloUni;
        
    }    
    
    public ArrayList<InstitucionModel> getDataInstituciones(String sql) throws SQLException {
        
        this.arregloIns = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloIns.add(new InstitucionModel(datos.getInt("ins_id"), datos.getInt("mun_id"), datos.getString("ins_nombre"),
                datos.getString("ins_telefono"), datos.getString("ins_direccion")));  
        }
        return this.arregloIns;
        
    }    
    
    public void setData(String sql) throws SQLException {
       
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();  
        
    }
    
    public void deleteData(String sql) throws SQLException {
       
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.consulta.executeUpdate();  
        
    }
    
    public ResultSet getDataForm(String sql) throws SQLException  { //metodo para extraer datos q se mostraran en el form al editar
       
        this.con();
        this.consulta=this.con.prepareStatement(sql);
        this.datos=this.consulta.executeQuery();          
        return this.datos;
        
    }
    
    public void updateData(String sql)  throws SQLException {
        
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.consulta.executeUpdate();  
        
    }      

}
