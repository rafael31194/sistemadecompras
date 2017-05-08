/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.service;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sv.edu.ues.bad115.entity.*;

/**
 *
 * @author EduardoRAFAEL
 */
public class Conexion {
    
      private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server,user,bd,pass;
    
    
    public Conexion()
    {
        this.server="localhost";
        this.user="root";
        this.pass="admin";
        this.bd="controldecompras";
    }
    public void con() throws SQLException
    {
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            this.con=(Connection) DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd,this.user,this.pass);
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public void desconectar() throws SQLException
    {
        this.con.close();
    }
    public ResultSet getData(String sql) throws SQLException
    {
        try{
        this.con();
        this.consulta=(PreparedStatement) this.con.prepareStatement(sql);
        this.datos=this.consulta.executeQuery();
          
        return this.datos;
        }
        catch(SQLException ex){
            System.out.println("========================\n\n\n "+ex.getMessage()+"\n\n\n");
            return null;
        }
    }
    
    public void setData(String sql) throws SQLException
    {
        this.con();
        this.consulta=(PreparedStatement) this.con.prepareStatement(sql);
        this.datos=this.consulta.executeQuery();
    }

}
