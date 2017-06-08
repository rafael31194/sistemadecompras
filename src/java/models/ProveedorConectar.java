package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProveedorConectar {
    
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    
    private ArrayList<ProveedorModel> arreglo;
    private ArrayList<MunicipiosModel> arregloMun;
    private ArrayList<MunicipiosModel> array1;
    
    private ArrayList<UsuarioModel> arregloUsu;
    private ArrayList<UsuarioModel> array2;
    
    public ProveedorConectar() {
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
      
    public ArrayList<ProveedorModel> getData(String sql) throws SQLException {
        
        this.arreglo = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arreglo.add(new ProveedorModel(datos.getInt("pro_id"), datos.getString("mun_nombre"), 
                    datos.getString("pro_nombre"), datos.getString("pro_direccion"), datos.getString("usu_usuario")));        
        }
        return this.arreglo;
        
    }

    public ArrayList<MunicipiosModel> getDataMunicipios(String sql) throws SQLException {
        
        this.arregloMun = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloMun.add(new MunicipiosModel(datos.getInt("mun_id"), datos.getInt("dep_id"), datos.getString("mun_nombre")));  
        }
        return this.arregloMun;
        
    }
    
    public ArrayList<UsuarioModel> getDataUsuario(String sql) throws SQLException {
        
        this.arregloUsu = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arregloUsu.add(new UsuarioModel(datos.getInt("usu_id"), datos.getString("usu_usuario"), datos.getString("usu_contrasenia"),
            datos.getString("usu_nombre"), datos.getString("usu_correo"), datos.getInt("usu_activo")));  
        }
        return this.arregloUsu;
        
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
