package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * UsrUniUsuariosUnidad generated by hbm2java
 */
public class UsrUniUsuariosUnidad  implements java.io.Serializable {


     private UsrUniUsuariosUnidadId id;
     private UniUnidad uniUnidad;
     private UsuUsuario usuUsuario;
     private Integer usrUniNivelautorizacion;

    public UsrUniUsuariosUnidad() {
    }

	
    public UsrUniUsuariosUnidad(UsrUniUsuariosUnidadId id, UniUnidad uniUnidad, UsuUsuario usuUsuario) {
        this.id = id;
        this.uniUnidad = uniUnidad;
        this.usuUsuario = usuUsuario;
    }
    public UsrUniUsuariosUnidad(UsrUniUsuariosUnidadId id, UniUnidad uniUnidad, UsuUsuario usuUsuario, Integer usrUniNivelautorizacion) {
       this.id = id;
       this.uniUnidad = uniUnidad;
       this.usuUsuario = usuUsuario;
       this.usrUniNivelautorizacion = usrUniNivelautorizacion;
    }
   
    public UsrUniUsuariosUnidadId getId() {
        return this.id;
    }
    
    public void setId(UsrUniUsuariosUnidadId id) {
        this.id = id;
    }
    public UniUnidad getUniUnidad() {
        return this.uniUnidad;
    }
    
    public void setUniUnidad(UniUnidad uniUnidad) {
        this.uniUnidad = uniUnidad;
    }
    public UsuUsuario getUsuUsuario() {
        return this.usuUsuario;
    }
    
    public void setUsuUsuario(UsuUsuario usuUsuario) {
        this.usuUsuario = usuUsuario;
    }
    public Integer getUsrUniNivelautorizacion() {
        return this.usrUniNivelautorizacion;
    }
    
    public void setUsrUniNivelautorizacion(Integer usrUniNivelautorizacion) {
        this.usrUniNivelautorizacion = usrUniNivelautorizacion;
    }




}


