import edu.emory.mathcs.backport.java.util.Arrays;


public class MyArrayList {
	
	Object[] objectArray;
	int actSize=0;
	
	MyArrayList(){
		objectArray=new Object[10];
		
	}
	
	
	public void  add(Object object){		
		if(objectArray.length < actSize){
			objectArray=Arrays.copyOf(objectArray, objectArray.length*2);		
		}
		objectArray[actSize++]=object;
			
			
	}
	
	public Object get(int i) {
		if(actSize<i)
			throw new ArrayIndexOutOfBoundsException();
		else
		return 	objectArray[i];
		
		
	}
		
		
			
		
	

}
