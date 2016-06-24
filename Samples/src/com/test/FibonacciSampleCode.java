package com.test;

public class FibonacciSampleCode
{
    public static void main(String[] args) 
    {
        FibonacciSampleCode fs = new FibonacciSampleCode();
        fs.fibonacci(); 
    }
    public void fibonacci() 
    {
        int numb1 = 1;
        int numb2 = 1;
        int temp = 0;
 
         
      
 
        System.out.println(numb1);
        System.out.println(numb2);
 
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(numb1 + numb2 + " ");
            temp = numb1;
            numb1 = numb2;
            numb2 = temp + numb2;
        }
    }
}