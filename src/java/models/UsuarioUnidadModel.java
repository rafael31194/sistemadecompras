package models;

public class UsuarioUnidadModel {
    
    private int usu_id, uni_id, usr_uni_id, usr_uni_nivelautorizacion;

    public UsuarioUnidadModel() {
    }

    public UsuarioUnidadModel(int usu_id, int uni_id, int usr_uni_id, int usr_uni_nivelautorizacion) {
        this.usu_id = usu_id;
        this.uni_id = uni_id;
        this.usr_uni_id = usr_uni_id;
        this.usr_uni_nivelautorizacion = usr_uni_nivelautorizacion;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public int getUsr_uni_id() {
        return usr_uni_id;
    }

    public void setUsr_uni_id(int usr_uni_id) {
        this.usr_uni_id = usr_uni_id;
    }

    public int getUsr_uni_nivelautorizacion() {
        return usr_uni_nivelautorizacion;
    }

    public void setUsr_uni_nivelautorizacion(int usr_uni_nivelautorizacion) {
        this.usr_uni_nivelautorizacion = usr_uni_nivelautorizacion;
    }
    
}
