/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.service;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.edu.ues.bad115.entity.*;
import sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo;

/**
 *
 * @author EduardoRAFAEL
 */
public class Usuarios {
    private PreparedStatement consulta;
     private ArrayList<PanPantalla> arregloPantallas;
    private ResultSet datos;
    
    
    
    
    public void login(String usu, String pass) throws SQLException{
        Conexion con =new Conexion();
        String query="CALL `sp_getUsuarioLogin`('"+usu+"', '"+pass+"')";
        this.datos=con.getData(query);
        PanPantalla pan;
        this.arregloPantallas=new ArrayList<PanPantalla>();
        boolean tieneDatosband=false;
      
          while(this.datos.next())
            {
                tieneDatosband=true;
                pan=new PanPantalla();
                pan.setPanNombre(datos.getString("pan_nombre"));
                this.arregloPantallas.add(pan);
                  
        
            
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setCorreo(datos.getString("usu_correo"));
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdUsuario(datos.getInt("usu_id"));
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setNombre(datos.getString("usu_nombre"));
             
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdRol(datos.getInt("rol_id"));
             
            }
            if(tieneDatosband==false){
            sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setCorreo("no existe");
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdUsuario(-1);
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setNombre("No Existe");
             
             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdRol(0);
             
        }
          sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setArregloPantallas(arregloPantallas);
    }
//    private Conexion con=new Conexion();
//        
//    
//        public ArrayList<UsuUsuario> getData(String sql) throws SQLException
//    {
//        this.arregloPantallas=new ArrayList<>();
//        this.con.conectar();
//        this.consulta=(PreparedStatement) this.con.prepareStatement(sql);
//        this.datos=this.consulta.executeQuery();
//            while(this.datos.next())
//            {
//                this.arreglo.add(new Usuario(datos.getInt("equ_id"),datos.getString("equ_nombre"),datos.getString("equ_modelo"),datos.getString("equ_marca")));
//            }
//        return this.arreglo;
//    }
//    
//      public void setData(String sql) throws SQLException
//    {
//        this.con.con();
//        this.consulta=(PreparedStatement) this.con.prepareStatement(sql);
//        this.datos=this.consulta.executeQuery();
//    }
    
    
//      while(this.datos.next())
//            {
//                this.arreglo.add(new Usuario(datos.getInt("equ_id"),datos.getString("equ_nombre"),datos.getString("equ_modelo"),datos.getString("equ_marca")));
//            }
    public ArrayList<UsuUsuario> getUsuarios()
    {
        SessionFactory sesion=HibernateUtil.getSessionFactory();
        Session session =sesion.openSession();
        Transaction tx=session.beginTransaction();
            //acá hacemos la magia
                ArrayList<UsuUsuario> arreglo=new ArrayList<UsuUsuario>();
                Query q=session.createQuery("from usu_usuario");
                List<UsuUsuario> lista=q.list();
                Iterator<UsuUsuario> iter=lista.iterator();
            //acá termina la magia
        tx.commit();
        session.close();
        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
        while(iter.hasNext())
        {
            UsuUsuario noti = (UsuUsuario) iter.next();
            arreglo.add(noti);
        }
        
        return arreglo;
        
    }
    
    public void deleteUsuario(int id)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class, id);
        session.delete(user);
        tx.commit();
        session.close();
                
    }
    
     public UsuUsuario getUsuarioPorId(int id)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class, id);
        
        tx.commit();
        session.close();
        return user;
                
    }
    
    public void updateUsuario(int id,String nombre, String correo)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class, id);
        user.setUsuCorreo(correo);
        user.setUsuNombre(nombre);
        session.update(user);
        tx.commit();
        session.close();
                
    }
    
        
    public void addUsuario(UsuUsuario user)
    {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(user);
        tx.commit();
        session.close();
                
    }

//    public UsuUsuario getUsuarioLogin(String usuario, String password) {
////        
//        UsuUsuario usuRecuperado=new UsuUsuario();
//        UsuarioActivo use=new UsuarioActivo();
//        try {
//            
//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session session=factory.openSession();
//        Transaction tx=session.beginTransaction();
//        //UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class,);
//        
//         //acá hacemos la magia
//                ArrayList<UsuUsuario> arreglo=new ArrayList<UsuUsuario>();
//                String query=" SELECT usuId,usuUsuario,usuNombre,usuCorreo FROM UsuUsuario WHERE usuContrasenia=SHA('"+password+"') and usuUsuario='"+usuario+"' ";
//                Query q=session.createQuery(query);
//                List<UsuUsuario> lista=q.list();
//                Iterator<UsuUsuario> iter=lista.iterator();
//            //acá termina la magia
//        
////         Query q=session.createQuery(query);
////         List<UsuUsuario> lista = new ArrayList<UsuUsuario>();//=q.list();
          
//         
//         for(Iterator it=q.iterate();it.hasNext();){
//            
//             Object[] row = (Object[]) it.next();
//            usuRecuperado.setUsuId(Integer.parseInt(row[0].toString()));//      System.out.println("ID: " + row[0]);
//            usuRecuperado.setUsuUsuario((row[1].toString()));
//            usuRecuperado.setUsuNombre((row[2].toString()));
//            usuRecuperado.setUsuCorreo((row[3].toString()));
//            
//             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setCorreo(usuRecuperado.getUsuCorreo());
//             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdUsuario(usuRecuperado.getUsuId());
//             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setNombre(usuRecuperado.getUsuNombre());
//             RolRol rol=(new UsuariosPorRoles()).getRolPorIdUsuario(usuRecuperado.getUsuId());
//             sv.edu.ues.bad115.global.SessionSistema.UsuarioActivo.setIdRol(rol.getRolId());
//             
//             }
//        
//        tx.commit();
//        session.close();
//            
//        } catch (Exception e) {
//            System.out.println("******************************************************\n");
//            System.out.println("\n\n ERROR AL RECUPERAR USUARIO\n\n");
//            System.out.println("******************************************************\n");
//            System.out.println(e.getMessage());
//            return null;
//        }
//        return usuRecuperado;
//    }
    
    
}
