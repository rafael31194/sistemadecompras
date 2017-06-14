package models;

public class UsuarioModel {
    
    private int usu_id;
    private String usu_usuario, usu_contrasenia, usu_nombre, usu_correo, rol_descripcion, uni_nombre, ins_nombre;
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

    public UsuarioModel(int usu_id, String usu_usuario, String usu_contrasenia, String usu_nombre, String usu_correo, String rol_descripcion, String uni_nombre, String ins_nombre) {
        this.usu_id = usu_id;
        this.usu_usuario = usu_usuario;
        this.usu_contrasenia = usu_contrasenia;
        this.usu_nombre = usu_nombre;
        this.usu_correo = usu_correo;
        this.rol_descripcion = rol_descripcion;
        this.uni_nombre = uni_nombre;
        this.ins_nombre = ins_nombre;
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

    public String getRol_descripcion() {
        return rol_descripcion;
    }

    public void setRol_descripcion(String rol_descripcion) {
        this.rol_descripcion = rol_descripcion;
    }

    public String getUni_nombre() {
        return uni_nombre;
    }

    public void setUni_nombre(String uni_nombre) {
        this.uni_nombre = uni_nombre;
    }

    public String getIns_nombre() {
        return ins_nombre;
    }

    public void setIns_nombre(String ins_nombre) {
        this.ins_nombre = ins_nombre;
    }

    public int getUsu_activo() {
        return usu_activo;
    }

    public void setUsu_activo(int usu_activo) {
        this.usu_activo = usu_activo;
    }
    
}
