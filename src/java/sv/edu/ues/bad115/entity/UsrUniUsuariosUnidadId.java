package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * UsrUniUsuariosUnidadId generated by hbm2java
 */
public class UsrUniUsuariosUnidadId  implements java.io.Serializable {


     private int usuId;
     private int usrUniId;

    public UsrUniUsuariosUnidadId() {
    }

    public UsrUniUsuariosUnidadId(int usuId, int usrUniId) {
       this.usuId = usuId;
       this.usrUniId = usrUniId;
    }
   
    public int getUsuId() {
        return this.usuId;
    }
    
    public void setUsuId(int usuId) {
        this.usuId = usuId;
    }
    public int getUsrUniId() {
        return this.usrUniId;
    }
    
    public void setUsrUniId(int usrUniId) {
        this.usrUniId = usrUniId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsrUniUsuariosUnidadId) ) return false;
		 UsrUniUsuariosUnidadId castOther = ( UsrUniUsuariosUnidadId ) other; 
         
		 return (this.getUsuId()==castOther.getUsuId())
 && (this.getUsrUniId()==castOther.getUsrUniId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUsuId();
         result = 37 * result + this.getUsrUniId();
         return result;
   }   


}

