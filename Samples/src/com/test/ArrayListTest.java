package com.test;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListTest {
	public static void main(String args[]){
		List a=new ArrayList(5);
		
		System.out.println(a.size());
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		 
		a.add("6");
		a.add("7");
		
		
		Object[] b=a.toArray();
		System.out.println(b.length);
		
		
		
		
	}

}
