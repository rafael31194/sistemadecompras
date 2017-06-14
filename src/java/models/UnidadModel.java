package models;

public class UnidadModel {
    
    private int uni_id;
    private String uni_nombre;

    public UnidadModel() {
    }

    public UnidadModel(int uni_id, String uni_nombre) {
        this.uni_id = uni_id;
        this.uni_nombre = uni_nombre;
    }

    public int getUni_id() {
        return uni_id;
    }

    public void setUni_id(int uni_id) {
        this.uni_id = uni_id;
    }

    public String getUni_nombre() {
        return uni_nombre;
    }

    public void setUni_nombre(String uni_nombre) {
        this.uni_nombre = uni_nombre;
    }

}
