package day8.io;

import java.io.File;

public class D7foldercheck {

	public static void main(String[] args) {
		
		String pathname =  "C:\\Users\\P SUNIL\\Downloads\\sunil111";
	   	 File file = new File(pathname);
	   	 if(file.isDirectory()) {
	   		 System.out.println("folder found");
	   	 }else {
	   		 System.out.println("file not found");
	   	 }
	}

}
