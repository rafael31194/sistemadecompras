/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Hassel
 */
public class CategoriaEquipoModel {
    private int cat_id;
    private String cat_descripcion;

    public CategoriaEquipoModel() {
    }

    public CategoriaEquipoModel(int cat_id, String cat_descripcion) {
        this.cat_id = cat_id;
        this.cat_descripcion = cat_descripcion;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_descripcion() {
        return cat_descripcion;
    }

    public void setCat_descripcion(String cat_descripcion) {
        this.cat_descripcion = cat_descripcion;
    }
    
    
}
