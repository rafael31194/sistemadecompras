/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class InstitucionOperaciones {
    
    public ArrayList<InsInstitucion> getInstitucion(){
        
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx =  session.beginTransaction();
        ArrayList<InsInstitucion> arreglo = new ArrayList <>();
        Query q = session.createQuery("from InsInstitucion");
        List <InsInstitucion> lista = q.list();
        Iterator <InsInstitucion> iter = lista.iterator();
        tx.commit();
        session.close();
        while (iter.hasNext()){
            InsInstitucion noti = (InsInstitucion) iter.next();
            arreglo.add(noti);
            
        }
        return arreglo;
    }
    
}
