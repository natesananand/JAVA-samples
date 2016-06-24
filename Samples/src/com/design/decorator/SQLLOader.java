package com.design.decorator;

import java.io.IOException;

public class SQLLOader {
	
	public static void main(String args[]){
		StringBuilder command=new StringBuilder();
		 command.append("sqlldr fcpb_1203/connect1203@fcpbdevdb SKIP=0 ERRORS=10000 ROWS=10 ");
		 command.append("control=D:\\work\\FCPBREL12.0.3.0.0_SUSTENANCE\\PBBATCHSERVER\\FeedFiles\\in\\control_file\\OPTN_MS.ctl _display_exitcode=true ");
				 command.append("readsize=1301000 bindsize=1301000 log=D:\\work\\FCPBREL12.0.3.0.0_SUSTENANCE\\PBBATCHSERVER\\FeedFiles\\in\\logs\\OPTN_MS.log ");
						 command.append("bad=D:\\work\\FCPBREL12.0.3.0.0_SUSTENANCE\\PBBATCHSERVER\\FeedFiles\\in\\bad\\OPTN_MS.bad ");
						 
						 
					
						 
						 System.out.println(command.toString());
						 
						 
					//	 String command1 =command.toString();
					//	 
						 //command1.replaceAll("\\\\", "\\");
		
						 
						 
					//	  String path_separator = "Path separator is: " + System.getProperty("path.separator");
						//  
						//  String file_separator = "file separator is: " + System.getProperty("file.separator");
						  
						//	 System.out.println(path_separator);
							// System.out.println(file_separator);
						 
						 String[] command1=command.toString().split(" ");
						 
						 System.out.println(command1);
		try {
			Process process = Runtime.getRuntime().exec(command1);
			 
			 byte[] write = new byte[1000];
	            int ch=0;
	            while(ch != -1){
	                ch = process.getInputStream().read(write);
	            }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 
		
		
		
	}
	
	

}
