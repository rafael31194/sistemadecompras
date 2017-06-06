package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class conectar {
    
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    private ArrayList<InstitucionModel> arreglo;
    private ArrayList<SolicitudModel> solicitudes;
    private ArrayList<String> array;
    
    public conectar() {
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
    
    //******************************************************************* Métodos Institucion *****************************************************************//
    public ArrayList<InstitucionModel> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new InstitucionModel(datos.getInt("ins_id"), datos.getInt("mun_id"), datos.getString("mun_nombre"), datos.getString("ins_nombre"), datos.getString("ins_telefono"), datos.getString("ins_direccion")));
            
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
    
    
    public ResultSet getNomMunicipios(String sql) throws SQLException {
        
        //this.array = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        return datos;
        
    }
    
    //******************************************************************* Métodos Solicitud *****************************************************************//
    public ArrayList<SolicitudModel> getDataSolicitud(String sql) throws SQLException{
        this.solicitudes = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.solicitudes.add(new SolicitudModel(datos.getInt("sol_id"), datos.getInt("cat_id"), datos.getInt("uni_id"), datos.getInt("est_id"), 
            datos.getInt("sol_id_usu"), datos.getInt("sol_tipo"), datos.getString("sol_fecha"), datos.getString("sol_descripcion"), datos.getString("est_estado")));
        }
        return this.solicitudes;
    }
}
