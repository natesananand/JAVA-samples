package com.test;

import java.math.BigDecimal;

public class Decimal {
	
	public static void main(String args[]){
		
		Double d=new Double(100.60);
		BigDecimal b=new BigDecimal(100.00);
		
		
	 b.setScale(2) ;
		System.out.println(b.setScale(2));
		
		
		System.out.println(d);
		
		
		
	}

}
