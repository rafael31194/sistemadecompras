/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.edu.ues.bad115.entity.*;

/**
 *
 * @author EduardoRAFAEL
 */
public class UsuariosPorRoles {
//        public ArrayList<UsuUsuario> getUsuarios()
//    {
//        SessionFactory sesion=HibernateUtil.getSessionFactory();
//        Session session =sesion.openSession();
//        Transaction tx=session.beginTransaction();
//            //acá hacemos la magia
//                ArrayList<UsuUsuario> arreglo=new ArrayList<UsuUsuario>();
//                Query q=session.createQuery("from usu_usuario");
//                List<UsuUsuario> lista=q.list();
//                Iterator<UsuUsuario> iter=lista.iterator();
//            //acá termina la magia
//        tx.commit();
//        session.close();
//        //acá ya terminados todo y solo tomamos la lista y la pasamos a una arraylist
//        while(iter.hasNext())
//        {
//            UsuUsuario noti = (UsuUsuario) iter.next();
//            arreglo.add(noti);
//        }
//        
//        return arreglo;
//        
//    }
    
//    public void deleteUsuario(int id)
//    {
//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session session=factory.openSession();
//        Transaction tx=session.beginTransaction();
//        UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class, id);
//        session.delete(user);
//        tx.commit();
//        session.close();
//                
//    }
    
     public RolRol getRolPorIdUsuario(int id)
    {
      int rolUsuario=0;
      RolRol rol=new RolRol();
        try 
                 
        {
                SessionFactory factory=HibernateUtil.getSessionFactory();
                Session session=factory.openSession();
                Transaction tx=session.beginTransaction();
                //UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class,);
                String query=" SELECT * FROM UsuRolUsuariosPorRol WHERE usuUsuario="+id;
                 Query q=session.createQuery(query);
                 List<RolRol> lista=q.list();
                Iterator<RolRol> iter=lista.iterator();
                 
                  
                 for(Iterator it=q.iterate();it.hasNext();){

                     Object[] row = (Object[]) it.next();
                        rol.setRolId(Integer.parseInt(row[0].toString()));//      System.out.println("ID: " + row[0]);
                        rolUsuario=rol.getRolId();
                     }
                
                tx.commit();
                session.close();
            
        } catch (Exception e) {
            System.out.println("******************************************************\n");
            System.out.println("\n\n ERROR AL RECUPERAR USUARIO\n\n");
            System.out.println("******************************************************\n");
            System.out.println(e.getMessage());
            return null;
        }
       return rol;
   // }
                
    }
    
//    public void updateUsuario(int id,int idRol, int idUsuario)
//    {
//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session session=factory.openSession();
//        Transaction tx=session.beginTransaction();
//        UsuRolUsuariosPorRol user=(UsuRolUsuariosPorRol)session.get(UsuRolUsuariosPorRol.class, id);
////        user.setUsuRolId(idRol);
//        
////        user.setUsuCorreo(correo);
////        user.setUsuNombre(nombre);
//        session.update(user);
//        tx.commit();
//        session.close();
//                
//    }
    
        
//    public void addUsuario(UsuUsuario user)
//    {
//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session session=factory.openSession();
//        Transaction tx=session.beginTransaction();
//        
//        session.save(user);
//        tx.commit();
//        session.close();
//                
//    }
//
//    public UsuUsuario getUsuarioLogin(String usuario, String password) {
//        
//        SessionFactory factory=HibernateUtil.getSessionFactory();
//        Session session=factory.openSession();
//        Transaction tx=session.beginTransaction();
//        //UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class,);
//        String query=" SELECT usuId FROM UsuUsuario WHERE usuContrasenia=SHA('"+password+"') and usu_usuario='"+usuario+"' ";
//         Query q=session.createQuery(query);
//         List<UsuUsuario> lista = new ArrayList<UsuUsuario>();//=q.list();
//          UsuUsuario usuRecuperado=new UsuUsuario();
//         for(Iterator it=q.iterate();it.hasNext();){
//            
//             Object[] row = (Object[]) it.next();
//            usuRecuperado.setUsuId(Integer.parseInt(row[0].toString()));//      System.out.println("ID: " + row[0]);
//                              
//             }
//        UsuUsuario user=(UsuUsuario)session.get(UsuUsuario.class, usuRecuperado.getUsuId());
//        tx.commit();
//        session.close();
//        return user;
//    }
}
