package com.test;

import java.util.ArrayList;
import java.util.List;

public class generic {
	
	
	void setList(List<? super dog> list){
		
		list.add(new dog("raja1"));
	 
		
	}
	
	<T> void setList1(List<T> tlist){		
		 
	 System.out.println(tlist);		 
	}
	
	
	
	public static void main(String args[]){
		
		List<? super dog> dlist=new ArrayList<dog>();
		
		dlist.add(new animal());
		
		List<animal> dlist1=new ArrayList<animal>();
		
		dlist1.add(new animal());
		
		new generic().setList(dlist);
		new generic().setList1(dlist);
		
		
		List<Integer> dlist2=new ArrayList<Integer>();
		dlist2.add(2);
		dlist2.add(3);
		new generic().setList1(dlist2);
		
	}

}


class animal{
	
}

class dog extends animal{
	
	String name;
	dog(String s){
		this.name=s;
		
	}
	dog(){
		}
	}

	
	class notty extends dog{
		
		 
			
		}

