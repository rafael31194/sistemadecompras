package sv.edu.ues.bad115.entity;
// Generated 04-15-2017 04:24:49 PM by Hibernate Tools 4.3.1



/**
 * OrdDtlOrdendetalleId generated by hbm2java
 */
public class OrdDtlOrdendetalleId  implements java.io.Serializable {


     private int ordId;
     private int ordDtlId;

    public OrdDtlOrdendetalleId() {
    }

    public OrdDtlOrdendetalleId(int ordId, int ordDtlId) {
       this.ordId = ordId;
       this.ordDtlId = ordDtlId;
    }
   
    public int getOrdId() {
        return this.ordId;
    }
    
    public void setOrdId(int ordId) {
        this.ordId = ordId;
    }
    public int getOrdDtlId() {
        return this.ordDtlId;
    }
    
    public void setOrdDtlId(int ordDtlId) {
        this.ordDtlId = ordDtlId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrdDtlOrdendetalleId) ) return false;
		 OrdDtlOrdendetalleId castOther = ( OrdDtlOrdendetalleId ) other; 
         
		 return (this.getOrdId()==castOther.getOrdId())
 && (this.getOrdDtlId()==castOther.getOrdDtlId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrdId();
         result = 37 * result + this.getOrdDtlId();
         return result;
   }   


}


