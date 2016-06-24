package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapTest {
	
    private  String lobId;

    private  String unitId;

    private  String instrAnlGroup;

    private String  bankerId;
	
	public static void main(String args[]){
		
		
		Map m=new HashMap();
		
	Employee e1=new Employee(1,"anand");
	Employee e2=new Employee(2,"vijay");
	
	m.put(e1,e1);
	m.put(e2,e2);
	e2.setEmpName("vijay2");
	
	System.out.println(m);
	System.out.println(e2);
	System.out.println(e2.getEmpName());
	System.out.println(m.get(e2));
	System.out.println(m.keySet());
	System.out.println(m.values());
		
	}

}


