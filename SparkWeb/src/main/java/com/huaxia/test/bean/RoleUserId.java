package com.huaxia.test.bean;
// Generated 2017-2-27 17:02:28 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoleUserId generated by hbm2java
 */
@Embeddable
public class RoleUserId  implements java.io.Serializable {


     private int roleId;
     private int userId;

    public RoleUserId() {
    }

    public RoleUserId(int roleId, int userId) {
       this.roleId = roleId;
       this.userId = userId;
    }
   

    @Column(name="role_id", nullable=false)
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RoleUserId) ) return false;
		 RoleUserId castOther = ( RoleUserId ) other; 
         
		 return (this.getRoleId()==castOther.getRoleId())
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRoleId();
         result = 37 * result + this.getUserId();
         return result;
   }   


}


