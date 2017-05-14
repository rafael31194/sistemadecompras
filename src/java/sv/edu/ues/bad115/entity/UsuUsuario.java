package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UsuUsuario generated by hbm2java
 */
public class UsuUsuario  implements java.io.Serializable {


     private int usuId;
     private String usuUsuario;
     private String usuContrasenia;
     private String usuNombre;
     private String usuCorreo;
     private Set usrUniUsuariosUnidads = new HashSet(0);
     private Set usuRolUsuariosPorRols = new HashSet(0);

    public UsuUsuario() {
    }

	
    public UsuUsuario(int usuId, String usuUsuario, String usuContrasenia, String usuNombre, String usuCorreo) {
        this.usuId = usuId;
        this.usuUsuario = usuUsuario;
        this.usuContrasenia = usuContrasenia;
        this.usuNombre = usuNombre;
        this.usuCorreo = usuCorreo;
    }
    public UsuUsuario(int usuId, String usuUsuario, String usuContrasenia, String usuNombre, String usuCorreo, Set usrUniUsuariosUnidads, Set usuRolUsuariosPorRols) {
       this.usuId = usuId;
       this.usuUsuario = usuUsuario;
       this.usuContrasenia = usuContrasenia;
       this.usuNombre = usuNombre;
       this.usuCorreo = usuCorreo;
       this.usrUniUsuariosUnidads = usrUniUsuariosUnidads;
       this.usuRolUsuariosPorRols = usuRolUsuariosPorRols;
    }
   
    public int getUsuId() {
        return this.usuId;
    }
    
    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }
    public String getUsuUsuario() {
        return this.usuUsuario;
    }
    
    public void setUsuUsuario(String usuUsuario) {
        this.usuUsuario = usuUsuario;
    }
    public String getUsuContrasenia() {
        return this.usuContrasenia;
    }
    
    public void setUsuContrasenia(String usuContrasenia) {
        this.usuContrasenia = usuContrasenia;
    }
    public String getUsuNombre() {
        return this.usuNombre;
    }
    
    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }
    public String getUsuCorreo() {
        return this.usuCorreo;
    }
    
    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }
    public Set getUsrUniUsuariosUnidads() {
        return this.usrUniUsuariosUnidads;
    }
    
    public void setUsrUniUsuariosUnidads(Set usrUniUsuariosUnidads) {
        this.usrUniUsuariosUnidads = usrUniUsuariosUnidads;
    }
    public Set getUsuRolUsuariosPorRols() {
        return this.usuRolUsuariosPorRols;
    }
    
    public void setUsuRolUsuariosPorRols(Set usuRolUsuariosPorRols) {
        this.usuRolUsuariosPorRols = usuRolUsuariosPorRols;
    }




}

