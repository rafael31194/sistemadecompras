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
public class EquipoConectar {
    
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    private ArrayList<EquipoModel> equipos;
    
    public EquipoConectar() {
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
    
    //******************************************************************* Métodos Equipo *****************************************************************//
    public ArrayList<EquipoModel> getDataEquipos(String sql) throws SQLException{
        this.equipos = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.equipos.add(new EquipoModel(datos.getInt("equ_id"), datos.getInt("pro_id"), datos.getInt("cat_id"), datos.getInt("equ_anio"),
                    datos.getString("equ_nombre"), datos.getString("equ_marca"), datos.getString("equ_modelo"),
                    datos.getString("equ_especificaciongarantia"), datos.getString("equ_imagen"), datos.getFloat("equ_capacidad_btu"), datos.getFloat("equ_potencia")));
        }
        return this.equipos;
    }
//    
//    public ArrayList getDataInvDtl(String sql) throws SQLException {
//        
//        this.arregloInvDtl = new ArrayList<>();
//        this.con();
//        this.consulta = this.con.prepareStatement(sql);
//        this.datos = this.consulta.executeQuery();
//        while (this.datos.next()) {
//            this.arregloInvDtl.add(new InventarioDetalleModel(datos.getInt("ins_id"), datos.getInt("inv_id"), datos.getInt("inv_dtl_id"),datos.getInt("equ_id"),
//                     datos.getInt("inv_dtl_cantidad"), datos.getString("inv_dtl_nombre_equipo"),datos.getString("inv_dtl_codigoinventario"), datos.getString("equ_nombre"))); 
//        }
//        return this.arregloInvDtl;
//        
//    }
    
    
}
