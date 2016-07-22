package recursive;

import java.io.File;
import java.io.IOException;

public class RecursiveFileSearch {
	
	final static File f=new File("test.txt");
	
	public static void main(String[] args) {
		File currentDir = new File("C://"); // current directory
		
		
		//try {
			//System.out.println(" file:" + f.getCanonicalPath());
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		displayDirectoryContents(currentDir);
		
	}

	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			if(files !=null &&files.length>0){
			for (File file : files) {
				if (file!=null &&file.isDirectory()) {
					//System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				}
				else{
						if(f.getName().equals(file.getName())){
					System.out.println(" filematched:" + file.getAbsolutePath());
					
					break;
						}
					
				}
			}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
