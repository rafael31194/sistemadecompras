package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * ResRestriccion generated by hbm2java
 */
public class ResRestriccion  implements java.io.Serializable {


     private int resId;
     private InsInstitucion insInstitucion;
     private ProProveedor proProveedor;
     private long resMontolimite;
     private Integer resCantidadcompras;
     private String resDescripcion;

    public ResRestriccion() {
    }

	
    public ResRestriccion(int resId, InsInstitucion insInstitucion, ProProveedor proProveedor, long resMontolimite) {
        this.resId = resId;
        this.insInstitucion = insInstitucion;
        this.proProveedor = proProveedor;
        this.resMontolimite = resMontolimite;
    }
    public ResRestriccion(int resId, InsInstitucion insInstitucion, ProProveedor proProveedor, long resMontolimite, Integer resCantidadcompras, String resDescripcion) {
       this.resId = resId;
       this.insInstitucion = insInstitucion;
       this.proProveedor = proProveedor;
       this.resMontolimite = resMontolimite;
       this.resCantidadcompras = resCantidadcompras;
       this.resDescripcion = resDescripcion;
    }
   
    public int getResId() {
        return this.resId;
    }
    
    public void setResId(int resId) {
        this.resId = resId;
    }
    public InsInstitucion getInsInstitucion() {
        return this.insInstitucion;
    }
    
    public void setInsInstitucion(InsInstitucion insInstitucion) {
        this.insInstitucion = insInstitucion;
    }
    public ProProveedor getProProveedor() {
        return this.proProveedor;
    }
    
    public void setProProveedor(ProProveedor proProveedor) {
        this.proProveedor = proProveedor;
    }
    public long getResMontolimite() {
        return this.resMontolimite;
    }
    
    public void setResMontolimite(long resMontolimite) {
        this.resMontolimite = resMontolimite;
    }
    public Integer getResCantidadcompras() {
        return this.resCantidadcompras;
    }
    
    public void setResCantidadcompras(Integer resCantidadcompras) {
        this.resCantidadcompras = resCantidadcompras;
    }
    public String getResDescripcion() {
        return this.resDescripcion;
    }
    
    public void setResDescripcion(String resDescripcion) {
        this.resDescripcion = resDescripcion;
    }




}

