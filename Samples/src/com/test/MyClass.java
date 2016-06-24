package com.test;

import java.io.*;

class NewClass1   implements Serializable {

    private int i=1000;
    
    int getVal() {
        return i;
    }
    void setVal(int i) {
        this.i=i;
    }
}

class MyClass extends NewClass1 {

    private String s;
   

   /* public NewClass1 getN() {
		n=new NewClass1();
		n.setVal(100);
		
		return n;
		
	}*/



	MyClass(String s) {
        this.s = s;
        
    }

    public String toString() {
        return s + " " + getVal();
    }

    public static void main(String args[]) {
    	NewClass1 m =new  NewClass1();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            oos.writeObject(m); //writing current state
            oos.flush();
            oos.close();
            System.out.print(m); // display current state object value
        } catch (IOException e) {
            System.out.print(e);
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
            NewClass1 o = (NewClass1) ois.readObject(); // reading saved object
            ois.close();
            System.out.print(o.getVal());
           // System.out.print(o.getN().getVal());
            // display saved object state
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}