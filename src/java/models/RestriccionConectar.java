package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RestriccionConectar {
    
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    
    private ArrayList<RestriccionModel> arreglo;
    private ArrayList<InstitucionModel> arregloIns;
    
    private ArrayList<ProveedorModel> arregloPro;

    public RestriccionConectar() {
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
      
    public ArrayList<RestriccionModel> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new RestriccionModel(datos.getInt("res_id"), datos.getString("ins_nombre"), datos.getString("pro_nombre"),
                    datos.getDouble("res_montolimite"), datos.getInt("res_cantidadcompras"), datos.getString("res_descripcion"), 
                    datos.getBoolean("res_EsInstalacion")));        
        }
        return this.arreglo;
        
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
    
    public ArrayList<ProveedorModel> getDataProveedores(String sql) throws SQLException {
        
        this.arregloPro = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloPro.add(new ProveedorModel(datos.getInt("pro_id"), datos.getInt("mun_id"), datos.getString("pro_nombre"),
                datos.getString("pro_direccion"), datos.getInt("pro_id_usu")));  
        }
        return this.arregloPro;
        
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
