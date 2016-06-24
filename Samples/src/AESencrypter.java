/*
 * @(#)AesEncrypter.java
 *
 * 
 * This source is part of the Oracle FLEXCUBE Private Banking Software System and is copyrighted by Oracle Financial Services Software Limited.
 *
 * All rights reserved. No part of this work may be reproduced, stored in a retrieval system, 
 * adopted or transmitted in any form or by any means, electronic, mechanical,
 * photographic, graphic, optic recording or otherwise, translated in any language or
 * computer language, without the prior written permission of Oracle Financial Services Software Limited. 
 *
 * Oracle Financial Services Software Limited.
 * 10-11, SDF I, SEEPZ, Andheri (East),
 * Mumbai - 400 096. 
 * India  
 * 
 * Copyright © 2008-2011 Oracle Financial Services Software Limited. All rights reserved. 
 * 
 */



import org.springframework.stereotype.Component;
import java.util.ResourceBundle;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import sun.misc.BASE64Encoder; 
import sun.misc.BASE64Decoder;

 
public class AESencrypter {

	//String message="pssst ... don’t tell anyøne!";
	ResourceBundle resourceBundle = ResourceBundle.getBundle("IntegrationParams");
	String keystr ="1234567899876543";
	Cipher c;
	Cipher c1;
	
	
	 public AESencrypter() {
		 try {
			 SecretKeySpec skey= new SecretKeySpec(keystr.getBytes(), "AES");
			 c = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			 c.init(Cipher.ENCRYPT_MODE, skey);

			 c1 = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			 c1.init(Cipher.DECRYPT_MODE, skey);
		 }catch (Exception ex) {
	        	ex.printStackTrace()
	           
	        }
	 }

	  public String encrypt(String str) {
	        try {
	        	byte[] encrypted = c.doFinal(str.getBytes());
	        	String encryptedValue = new BASE64Encoder().encode(encrypted);
	            return encryptedValue;
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        	return null;
	        }
	    }
	    
	    public String decrypt(String str) {
		    try {
		    	 byte[] encValue = new BASE64Decoder().decodeBuffer(str);
		    	 byte[] decrypted = c1.doFinal(encValue);
				 String decrypass = new String(decrypted);
				 return decrypass;
		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    	return null;
		    }
	    }

	
}
