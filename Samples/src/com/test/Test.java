package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 class Test {
	 int i;
	static  int big;
	
	void  printNode(Node node){
		i=i+1;
	if(node==null)
	return;	
	
//	System.out.println("big:"+big);
	System.out.println(node.value);
	//if(big < node.value)
	//big=node.value;
	
	printNode(node.left);
	printNode(node.Right);
	

		 
		 
	 }
	 
	
	public static void main(String args[]){
		
		
			
	Node one=new Node();
	one.value=1;
	Node two=new Node();
	two.value=2;
	Node three=new Node();
	three.value=3;
	Node four=new Node();
	four.value=4;
	Node five=new Node();
	five.value=5;
	Node six=new Node();
	six.value=6;
	Node seven=new Node();
	seven.value=7;
	Node eight=new Node();
	eight.value=8;
	Node nine=new Node();
	nine.value=9;
	
	one.left=two;
	two.left=three;
	two.Right=four;
	four.Right=five;
	
			
	one.Right=six;
	six.Right=seven;
	six.left=eight;
	eight.Right=nine;
Test t=new Test();
t.printNode(one);
System.out.println("big:"+big);
		
		
	}
	
	
	

}
