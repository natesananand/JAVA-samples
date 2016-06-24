package serlization;

import java.io.Serializable;
 
public class Address implements Serializable{
 
	   private static final long serialVersionUID = 3222L;
	
	   String street1;
	   String country;
 
	   public void setStreet(String street){
		   this.street1 = street;
	   }
 
	   public void setCountry(String country){
		   this.country = country;
	   }
 
	   public String getStreet1(){
		   return this.street1;
	   }
 
	   public String getCountry(){
		   return this.country;
	   }
 
	   @Override
	   public String toString() {
    	   return new StringBuffer(" Street : ")
    	   .append(this.street1)
    	   .append(" Country : ")
    	   .append(this.country).toString();
	   }
}