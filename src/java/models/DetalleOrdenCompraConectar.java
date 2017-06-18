
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DetalleOrdenCompraConectar {
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    
    private ArrayList<DetalleOrdenCompraJoins> arreglo;
    private ArrayList<EquipoModel> arrayEqu;
    
    
    public DetalleOrdenCompraConectar() {
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
      
    public ArrayList<DetalleOrdenCompraJoins> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new DetalleOrdenCompraJoins(datos.getInt("ord_dtl_id"),datos.getInt("ord_id"),datos.getString("equ_nombre"),datos.getFloat("ord_dtl_precio"),datos.getString("ord_dtl_codigoInventario")));        
        }
        return this.arreglo;
        
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
    
    public ArrayList getEqu(String sql) throws SQLException {
        
        this.arrayEqu = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while(this.datos.next()){
            this.arrayEqu.add(new EquipoModel(datos.getInt("equ_id"),datos.getInt("pro_id"),datos.getInt("cat_id"),
                    datos.getInt("equ_anio"),datos.getString("equ_nombre"),datos.getString("equ_marca"),datos.getString("equ_modelo"),datos.getString("equ_especificaciongarantia"),datos.getString("equ_imagen"),
                    datos.getFloat("equ_capacidad_btu"),datos.getFloat("equ_potencia")));
        } 
        return arrayEqu;
        
    }
}
