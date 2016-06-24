package com.test;
/* 
* @(#) CipherUtility.java
* 
* This source is part of the Oracle FLEXCUBE Private Banking Software Product.
* Copyright © 2007, 2015, Oracle and/or its affiliates.  All rights reserved.
*
* No part of this work may be reproduced, stored in a retrieval system, adopted
* or transmitted in any form or by any means, electronic, mechanical,
* photographic, graphic, optic recording or otherwise, translated in any
* language or computer language, without the prior written permission of
* Oracle and/or its affiliates.
*
* Oracle Financial Services Software Limited.
* Oracle Park, Off Western Express Highway,
* Goregaon (East),
* Mumbai - 400 063, India.
*
*/

 



import java.security.InvalidKeyException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


public class CipherUtility {
  private static KeyGenerator keygenerator;
  private static SecretKey myDesKey;		    
  private static Cipher desCipher;
  
  static{
  	try{
     	 keygenerator = KeyGenerator.getInstance("AES");
    	keygenerator.init(128);
     	 myDesKey     = keygenerator.generateKey();
     	 desCipher    = Cipher.getInstance("AES");
     	}catch (Exception e) {
 			 
 		}
  }
 
  
  public static byte[] encrypt(byte[] input){
  	byte[] byteEncrypted = null;
  	try {    		
			    desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);			
				byteEncrypted = desCipher.doFinal(input);				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
  	return byteEncrypted;
  }
  
  public static byte[] decrypt(byte[] input){
  	byte[] byteDecrypted = null;
  	try {
			
  		desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
			byteDecrypted = desCipher.doFinal(input);			
  	} catch (Exception e) {
			 
			e.printStackTrace();
		}
  	return byteDecrypted;
  }
  
  public static void main(String[] args) throws Exception, BadPaddingException{
  	String message="Windows9!";
  	
  	byte[] input = message.getBytes();
  	byte[] encrypted=CipherUtility.encrypt(input);
  	byte[] byteDecrypted=CipherUtility.decrypt(encrypted);
  	String decrypass = new String(byteDecrypted);
  	System.out.println("decrypted string: " + decrypass);
  	
  	
  } 
}