
import java.io.*;

public class BinaryAddition{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter first number:");
int num1=Integer.parseInt(br.readLine());
System.out.print("Enter second number:");
int num2=Integer.parseInt(br.readLine());


String bin1="1";
String bin2="1";
String sum=findSum(bin1, bin2);
System.out.println("Binary of "+num1+" is "+bin1);
System.out.println("Binary of "+num2+" is "+bin2);
 
}


}