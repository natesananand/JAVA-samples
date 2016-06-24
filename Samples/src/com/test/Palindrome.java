package com.test;

public class Palindrome {
	
	public static void main(String args[]){
		
		
		String s="madama";
		if(s.equals(Palindrome.reverse(s))){
			System.out.println("Plaindrome");
		}
		else
			
		System.out.println("Not Plaindrome");
		
	}
	
	static String reverse(String a){
		String r="";
		
		for(int i=a.length()-1;i>=0;i--){
			r=r+a.charAt(i);
			
			
		}
		return r;
		
	}
	

}
