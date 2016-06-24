package com.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class String1 {

	
	

		

	
	public static void main(String args[]){
		
		Map m=new HashMap();
		m.put(null,null);
		
		Map m1=new Hashtable();
		 m1.put(1,1);
		
		String s="anand";
		String s1="anand";
		String s2=new String("anand");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}	
		
		
}
