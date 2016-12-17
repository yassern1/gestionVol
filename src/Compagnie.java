/***********************************************************************
 * Module:  Compagnie.java
 * Author:  Toshiba
 * Purpose: Defines the Class Compagnie
 ***********************************************************************/

import java.util.*;

/** @pdOid b03fc586-6774-427d-bf85-4bcb60d78292 */
public class Compagnie {
   /** @pdOid 8b8969e9-99e9-4162-8090-c6539fbc4577 */
   private String idCompagnie;
   /** @pdOid 36887492-71c4-4f48-b571-3f97cb274d2a */
   private String nomCompagnie;
   
   public Compagnie(){
	   
   }
   public Compagnie(String id, String nom){
	   this.idCompagnie=id;
	   this.nomCompagnie=nom;
   }
public String getIdCompagnie() {
	return idCompagnie;
}
public void setIdCompagnie(String idCompagnie) {
	this.idCompagnie = idCompagnie;
}
public String getNomCompagnie() {
	return nomCompagnie;
}
public void setNomCompagnie(String nomCompagnie) {
	this.nomCompagnie = nomCompagnie;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "objet compagnie "+"id:"+this.getIdCompagnie()+", nom:"+this.getNomCompagnie();
}
   
   

}