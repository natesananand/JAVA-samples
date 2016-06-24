package com.test;

public class fib1 {
	
	public static void main(String args[]){
		
		int x=0;
		int y=1;
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<6-2;i++){
			

			int temp=x+y;
			x=y;
			y=temp;
			System.out.println(temp);
			
			
			
			
			
		}
		
		
	
	}

}
