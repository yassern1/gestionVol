/***********************************************************************
 * Module:  Vol.java
 * Author:  Toshiba
 * Purpose: Defines the Class Vol
 ***********************************************************************/

import java.util.*;

/** @pdOid 0e1d71c7-7378-4272-8372-15147a94057e */
public class Vol {
   /** @pdOid a2b4213d-8014-47d9-9a65-4bb92d986908 */
   private String idVol;
   public Vol(){
	   
   }
   public Vol(String id){
	   this.idVol=id;
   }
  public String getIdVol() {
	return idVol;
  }
  public void setIdVol(String idVol) {
	this.idVol = idVol;
  }
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "objet vol"+" id:"+ this.idVol;
}
   

}