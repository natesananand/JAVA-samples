package com.test;

class C implements A, B
{

    public void test() 
    {
        System.out.println("abc");
    }
public static void main(String[] args){

   A a = new C();
   a.test();
   B b = new C();
   b.test();
   
}
}
   
   