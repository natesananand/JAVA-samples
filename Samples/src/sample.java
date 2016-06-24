import java.io.*;

public class sample {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    int i=0;
    
    String args1[] = new String[2];
    while ((s = in.readLine()) != null) {
      //System.out.println(s);
     args1[i]=s;
      i=i+1;
      if(i>1)
    	  break;
    }
    
    System.out.println(args1[0]+"  "+args1[1]);
  
    String sum=findSum(args1[0], args1[1]) ;
    System.out.println("sum"+sum);
  }
  
  public static String findSum(String bin1, String bin2){
	  String sum=new String();
	  int carry=0, i;
	  if(bin1.length()<bin2.length()){
	  while(bin1.length()<bin2.length())
	  bin1=0+bin1;
	  }
	  else if(bin2.length()<bin1.length()){
	  while(bin2.length()<bin1.length())
	  bin2=0+bin2;
	  }
	  for(i=bin1.length()-1;i>=0;i--){
	  if(bin1.charAt(i)=='0' && bin2.charAt(i)=='0'){
	  sum=carry+sum;
	  carry=0;
	  }
	  else if(bin1.charAt(i)=='1' && bin2.charAt(i)=='1'){
	  if(carry==0)
	  sum='0'+sum;
	  else
	  sum='1'+sum;
	  carry=1;
	  }
	  else if(bin1.charAt(i)=='1' || bin2.charAt(i)=='1'){
	  if(carry==0)
	  sum='1'+sum;
	  else{
	  sum='0'+sum;
	  carry=1;
	  }
	  }
	  }
	  if(carry==1)
	  sum='1'+sum;
	  return sum;
	  }
}