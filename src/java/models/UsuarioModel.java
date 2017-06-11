package models;

public class UsuarioModel {
    
    private int usu_id;
    private String usu_usuario, usu_contrasenia, usu_nombre, usu_correo;
    private int usu_activo;

    public UsuarioModel() {
    }

    public UsuarioModel(int usu_id, String usu_usuario, String usu_contrasenia, String usu_nombre, String usu_correo, int usu_activo) {
        this.usu_id = usu_id;
        this.usu_usuario = usu_usuario;
        this.usu_contrasenia = usu_contrasenia;
        this.usu_nombre = usu_nombre;
        this.usu_correo = usu_correo;
        this.usu_activo = usu_activo;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public String getUsu_usuario() {
        return usu_usuario;
    }

    public void setUsu_usuario(String usu_usuario) {
        this.usu_usuario = usu_usuario;
    }

    public String getUsu_contrasenia() {
        return usu_contrasenia;
    }

    public void setUsu_contrasenia(String usu_contrasenia) {
        this.usu_contrasenia = usu_contrasenia;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_correo() {
        return usu_correo;
    }

    public void setUsu_correo(String usu_correo) {
        this.usu_correo = usu_correo;
    }

    public int getUsu_activo() {
        return usu_activo;
    }

    public void setUsu_activo(int usu_activo) {
        this.usu_activo = usu_activo;
    }
    
}
