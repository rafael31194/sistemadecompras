/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hassel
 */
public class SolicitudConectar {
    
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    private ArrayList<SolicitudModel> solicitudes;
    private ArrayList<CategoriaEquipoModel> categorias;
    private ArrayList<UnidadModel> unidades;
    private ArrayList<UsuarioModel> users;
    private ArrayList<TipoSolModel> tipoSol;
    
    public SolicitudConectar() {
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
    
    //******************************************************************* Métodos Solicitud *****************************************************************//
    public ArrayList<SolicitudModel> getDataSolicitud(String sql) throws SQLException{
        this.solicitudes = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.solicitudes.add(new SolicitudModel(datos.getInt("sol_id"), datos.getInt("cat_id"), datos.getInt("uni_id"),
            datos.getInt("est_id"), datos.getString("sol_fecha"), datos.getString("tipoSol"), datos.getString("unidad"), datos.getString("categoriaEqui")
            , datos.getString("usuario"), datos.getString("sol_descripcion"), datos.getString("estado")));
        }
        
        return this.solicitudes;
    }  
    
    public ArrayList<CategoriaEquipoModel> getDataCatEquipo(String sql) throws SQLException{
        this.categorias = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.categorias.add(new CategoriaEquipoModel(datos.getInt("cat_id"), datos.getString("cat_descripcion")));
        }
        
        return this.categorias;
    }  
    
    public ArrayList<UnidadModel> getDataUnidades(String sql) throws SQLException{
        this.unidades = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.unidades.add(new UnidadModel(datos.getInt("uni_id"), datos.getString("uni_nombre")));
        }
        
        return this.unidades;
    } 
    public ArrayList<UsuarioModel> getDataUsuario(String sql) throws SQLException {
        
        this.users = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.users.add(new UsuarioModel(datos.getInt("usu_id"), datos.getString("usu_usuario"), datos.getString("usu_contrasenia"),
            datos.getString("usu_nombre"), datos.getString("usu_correo"), datos.getInt("usu_activo")));  
        }
        return this.users;
        
    }   
    
    public ArrayList<TipoSolModel> getTipoSol() throws SQLException{
        this.tipoSol = new ArrayList<>();        
       
            this.tipoSol.add(new TipoSolModel(1,"Compra"));
            this.tipoSol.add(new TipoSolModel(2,"Mantenimiento"));
        
         
        
        
        return this.tipoSol;
    } 
}
