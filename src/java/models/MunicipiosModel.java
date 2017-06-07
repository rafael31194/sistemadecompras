/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author User
 */
public class MunicipiosModel {
    
    
    private int mun_id;
    private int dep_id;
    private String mun_nombre;

    public MunicipiosModel() {
    }

    public MunicipiosModel(int mun_id, int dep_id, String mun_nombre) {
        this.mun_id = mun_id;
        this.dep_id = dep_id;
        this.mun_nombre = mun_nombre;
    }

    public int getMun_id() {
        return mun_id;
    }

    public void setMun_id(int mun_id) {
        this.mun_id = mun_id;
    }

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getMun_nombre() {
        return mun_nombre;
    }

    public void setMun_nombre(String mun_nombre) {
        this.mun_nombre = mun_nombre;
    }
    
    
    
}
