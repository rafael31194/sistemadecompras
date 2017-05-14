package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EquEquipo generated by hbm2java
 */
public class EquEquipo  implements java.io.Serializable {


     private int equId;
     private CatCategoriaequipo catCategoriaequipo;
     private ProProveedor proProveedorByProProId;
     private ProProveedor proProveedorByProId;
     private String equNombre;
     private String equMarca;
     private String equModelo;
     private Integer equAnio;
     private Long equCapacidadBtu;
     private Long equPotencia;
     private String equEspecificaciongarantia;
     private Set ordDtlOrdendetalles = new HashSet(0);
     private Set invDtlInventarioDetalles = new HashSet(0);

    public EquEquipo() {
    }

	
    public EquEquipo(int equId, CatCategoriaequipo catCategoriaequipo, ProProveedor proProveedorByProProId, ProProveedor proProveedorByProId, String equNombre, String equMarca, String equModelo) {
        this.equId = equId;
        this.catCategoriaequipo = catCategoriaequipo;
        this.proProveedorByProProId = proProveedorByProProId;
        this.proProveedorByProId = proProveedorByProId;
        this.equNombre = equNombre;
        this.equMarca = equMarca;
        this.equModelo = equModelo;
    }
    public EquEquipo(int equId, CatCategoriaequipo catCategoriaequipo, ProProveedor proProveedorByProProId, ProProveedor proProveedorByProId, String equNombre, String equMarca, String equModelo, Integer equAnio, Long equCapacidadBtu, Long equPotencia, String equEspecificaciongarantia, Set ordDtlOrdendetalles, Set invDtlInventarioDetalles) {
       this.equId = equId;
       this.catCategoriaequipo = catCategoriaequipo;
       this.proProveedorByProProId = proProveedorByProProId;
       this.proProveedorByProId = proProveedorByProId;
       this.equNombre = equNombre;
       this.equMarca = equMarca;
       this.equModelo = equModelo;
       this.equAnio = equAnio;
       this.equCapacidadBtu = equCapacidadBtu;
       this.equPotencia = equPotencia;
       this.equEspecificaciongarantia = equEspecificaciongarantia;
       this.ordDtlOrdendetalles = ordDtlOrdendetalles;
       this.invDtlInventarioDetalles = invDtlInventarioDetalles;
    }
   
    public int getEquId() {
        return this.equId;
    }
    
    public void setEquId(int equId) {
        this.equId = equId;
    }
    public CatCategoriaequipo getCatCategoriaequipo() {
        return this.catCategoriaequipo;
    }
    
    public void setCatCategoriaequipo(CatCategoriaequipo catCategoriaequipo) {
        this.catCategoriaequipo = catCategoriaequipo;
    }
    public ProProveedor getProProveedorByProProId() {
        return this.proProveedorByProProId;
    }
    
    public void setProProveedorByProProId(ProProveedor proProveedorByProProId) {
        this.proProveedorByProProId = proProveedorByProProId;
    }
    public ProProveedor getProProveedorByProId() {
        return this.proProveedorByProId;
    }
    
    public void setProProveedorByProId(ProProveedor proProveedorByProId) {
        this.proProveedorByProId = proProveedorByProId;
    }
    public String getEquNombre() {
        return this.equNombre;
    }
    
    public void setEquNombre(String equNombre) {
        this.equNombre = equNombre;
    }
    public String getEquMarca() {
        return this.equMarca;
    }
    
    public void setEquMarca(String equMarca) {
        this.equMarca = equMarca;
    }
    public String getEquModelo() {
        return this.equModelo;
    }
    
    public void setEquModelo(String equModelo) {
        this.equModelo = equModelo;
    }
    public Integer getEquAnio() {
        return this.equAnio;
    }
    
    public void setEquAnio(Integer equAnio) {
        this.equAnio = equAnio;
    }
    public Long getEquCapacidadBtu() {
        return this.equCapacidadBtu;
    }
    
    public void setEquCapacidadBtu(Long equCapacidadBtu) {
        this.equCapacidadBtu = equCapacidadBtu;
    }
    public Long getEquPotencia() {
        return this.equPotencia;
    }
    
    public void setEquPotencia(Long equPotencia) {
        this.equPotencia = equPotencia;
    }
    public String getEquEspecificaciongarantia() {
        return this.equEspecificaciongarantia;
    }
    
    public void setEquEspecificaciongarantia(String equEspecificaciongarantia) {
        this.equEspecificaciongarantia = equEspecificaciongarantia;
    }
    public Set getOrdDtlOrdendetalles() {
        return this.ordDtlOrdendetalles;
    }
    
    public void setOrdDtlOrdendetalles(Set ordDtlOrdendetalles) {
        this.ordDtlOrdendetalles = ordDtlOrdendetalles;
    }
    public Set getInvDtlInventarioDetalles() {
        return this.invDtlInventarioDetalles;
    }
    
    public void setInvDtlInventarioDetalles(Set invDtlInventarioDetalles) {
        this.invDtlInventarioDetalles = invDtlInventarioDetalles;
    }




}

