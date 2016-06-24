package com.test;

import java.util.HashMap;
import java.util.Map;

public class Wordcount {
	
public static void main(String args[]){
	
	String s="anand vijay anand ramesh anand raj";WW
	
	String [] wordArray=s.split(" ");
	
	Map<String,Integer> wordMap=new HashMap<String,Integer>();
	
	int i=0;
	`
	
	
	for(String word:wordArray){
		if(wordMap.containsKey(word)){
			i=wordMap.get(word);
			i=i+1;
			wordMap.put(word, i);
			
		}
		else
			wordMap.put(word, 1);
			
		
		
	}
	
	System.out.println(wordMap);
	
}

}
