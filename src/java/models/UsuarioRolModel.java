package models;

public class UsuarioRolModel {
    
    private int usu_rol_id, usu_id, rol_id;

    public UsuarioRolModel() {
    }

    public UsuarioRolModel(int usu_rol_id, int usu_id, int rol_id) {
        this.usu_rol_id = usu_rol_id;
        this.usu_id = usu_id;
        this.rol_id = rol_id;
    }

    public int getUsu_rol_id() {
        return usu_rol_id;
    }

    public void setUsu_rol_id(int usu_rol_id) {
        this.usu_rol_id = usu_rol_id;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }
  
}
