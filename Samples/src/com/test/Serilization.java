package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Serilization implements Serializable {
	 
    private static final Serilization INSTANCE = new Serilization();
 
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
        oos.writeObject(INSTANCE);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
        Serilization test = (Serilization) ois.readObject();
        ois.close();
        System.out.println(test == INSTANCE);
    }
 
    private Object readResolve() throws ObjectStreamException {
      return INSTANCE;
   };
}
