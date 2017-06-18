
package models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InventarioConectar {
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server, user, bd, pass;
    private ArrayList<InstitucionModel> arrayIns;
    private ArrayList<InventarioModel> arrayInv;
    
    public InventarioConectar() {
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
    
    public ArrayList<InstitucionModel> getIns(String sql) throws SQLException {
        
        this.arrayIns = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arrayIns.add(new InstitucionModel(datos.getInt("ins_id"), datos.getInt("mun_id"), datos.getString("mun_nombre"), datos.getString("ins_nombre"), datos.getString("ins_telefono"), datos.getString("ins_direccion")));
            
        }
        return this.arrayIns;
        
    }
    
    public ArrayList<InventarioModel> getInv(String sql) throws SQLException {
        
        this.arrayInv = new ArrayList<>();
        this.con();
        this.consulta = this.con.prepareStatement(sql);
        this.datos = this.consulta.executeQuery();
        while (this.datos.next()) {
            this.arrayInv.add(new InventarioModel(datos.getString("ins_nombre"), datos.getString("cat_descripcion"), datos.getString("equ_nombre"), datos.getString("equ_marca"), datos.getString("equ_modelo"), datos.getString("equ_anio"),datos.getString("inv_dtl_codigoinventario")));
            
        }
        return this.arrayInv;
        
    }
}
