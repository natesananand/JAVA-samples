package com.test;

public class Fib {
	static int x=0;
	static  int y=1;
	public static void main(String args[]){
	 
		System.out.println(x);
		System.out.println(y);
		
		Fib.finnoaci(5);
		
	}
	
	public static void finnoaci(int i){
		int temp=0;
		
		for(int j=0;j<=i-2;j++){
			temp=x+y;
            System.out.println(temp);
            x=y;  
            y=temp;
			
			
		}
		
		
	}

}
