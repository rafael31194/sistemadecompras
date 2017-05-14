package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PanPantalla generated by hbm2java
 */
public class PanPantalla  implements java.io.Serializable {


     private int panId;
     private String panNombre;
     private Set panRolPantallasPorRoleses = new HashSet(0);

    public PanPantalla() {
    }

	
    public PanPantalla(int panId, String panNombre) {
        this.panId = panId;
        this.panNombre = panNombre;
    }
    public PanPantalla(int panId, String panNombre, Set panRolPantallasPorRoleses) {
       this.panId = panId;
       this.panNombre = panNombre;
       this.panRolPantallasPorRoleses = panRolPantallasPorRoleses;
    }
   
    public int getPanId() {
        return this.panId;
    }
    
    public void setPanId(int panId) {
        this.panId = panId;
    }
    public String getPanNombre() {
        return this.panNombre;
    }
    
    public void setPanNombre(String panNombre) {
        this.panNombre = panNombre;
    }
    public Set getPanRolPantallasPorRoleses() {
        return this.panRolPantallasPorRoleses;
    }
    
    public void setPanRolPantallasPorRoleses(Set panRolPantallasPorRoleses) {
        this.panRolPantallasPorRoleses = panRolPantallasPorRoleses;
    }




}

