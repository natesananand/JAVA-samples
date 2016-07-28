import java.util.HashMap;
import java.util.Map;

public class MemoryLeak1 {
	
public final String key;
    
    public MemoryLeak1(String key) {
        this.key =key;
    }
    
    public static void main(String args[]) {
        try {
            Map map1 = new HashMap();
            System.out.println( map1.size());
           
            for(;;) {
            	// if(map1.size()<10){
                map1.put(new MemoryLeak1("Aannd"), "value");
               System.out.println( map1.size());
            	// } 
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    	/*String s="nand";
 
    	System.out.println(new MemoryLeak1("anand").hashCode());
     	System.out.println(new MemoryLeak1("anand").hashCode());
     	System.out.println(new MemoryLeak1("anand").hashCode());*/
    }
}


