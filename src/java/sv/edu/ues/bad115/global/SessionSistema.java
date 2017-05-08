/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ues.bad115.global;

import java.util.ArrayList;
import sv.edu.ues.bad115.entity.PanPantalla;

/**
 *
 * @author EduardoRAFAEL
 */
public class SessionSistema {
    
    public static class UsuarioActivo extends SessionSistema{
        
    public static int idUsuario;
    public static int idRol;
    public static String nombre;
    public static String correo;
    public static  ArrayList<PanPantalla> arregloPantallas;

        public static ArrayList<PanPantalla> getArregloPantallas() {
            return arregloPantallas;
        }

        public static void setArregloPantallas(ArrayList<PanPantalla> arregloPantallas) {
            UsuarioActivo.arregloPantallas = arregloPantallas;
        }
    
    
    public UsuarioActivo() {
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        UsuarioActivo.idUsuario = idUsuario;
    }

    public static int getIdRol() {
        return idRol;
    }

    public static void setIdRol(int idRol) {
        UsuarioActivo.idRol = idRol;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        UsuarioActivo.nombre = nombre;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        UsuarioActivo.correo = correo;
    }
    
        
    }
    
    
}
