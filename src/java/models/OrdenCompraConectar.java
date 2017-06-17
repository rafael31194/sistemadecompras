
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrdenCompraConectar {
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    
    private ArrayList<OrdenCompraJoins> arreglo;
    private ArrayList<EstadoModel> arrayEst;
    private ArrayList<TipoContratacionModel> arrayTipo;
    private ArrayList<SolicitudModel> arraySol;
    private ArrayList<ProveedorModel> arrayPro;
    
    
    public OrdenCompraConectar() {
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
      
    public ArrayList<OrdenCompraJoins> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new OrdenCompraJoins(datos.getInt("ord_id"),datos.getString("est_estado"), datos.getString("tco_descripcion"),datos.getString("sol_descripcion"),datos.getString("pro_nombre"),
                    datos.getString("ord_fecha"), datos.getString("ord_descripcion"), datos.getFloat("ord_total")));        
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

    public ArrayList getEstado(String sql) throws SQLException {
        
        this.arrayEst = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while(this.datos.next()){
            this.arrayEst.add(new EstadoModel(datos.getInt("est_id"),datos.getString("est_estado")));
        }
        return arrayEst;
        
    }
    
    public ArrayList getSol(String sql) throws SQLException {
        
        this.arraySol = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while(this.datos.next()){
            this.arraySol.add(new SolicitudModel(datos.getInt("sol_id"),datos.getInt("cat_id"),datos.getInt("uni_id"),datos.getInt("est_id"),datos.getInt("sol_id_usu"),
                    datos.getInt("sol_tipo"),datos.getString("sol_fecha"),datos.getString("sol_descripcion")));
        } 
        return arraySol;
        
    }
    
    public ArrayList getTipo(String sql) throws SQLException {
        
        this.arrayTipo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while(this.datos.next()){
            this.arrayTipo.add(new TipoContratacionModel(datos.getInt("tco_id"),datos.getString("tco_descripcion")));
        }
        return arrayTipo;
        
    }
    
    public ArrayList getPro(String sql) throws SQLException {
        
        this.arrayPro = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while(this.datos.next()){
            this.arrayPro.add(new ProveedorModel(datos.getInt("pro_id"),datos.getInt("mun_id"),datos.getString("pro_nombre"),
                    datos.getString("pro_direccion"),datos.getInt("pro_id_usu")));
        }
        return arrayPro;
        
    }
}
