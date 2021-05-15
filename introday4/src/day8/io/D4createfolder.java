package day8.io;

import java.io.File;

public class D4createfolder {
	public static void main(String[] args) {
		demo();
	}
     static void demo() {
    	 String pathname =  "C:\\Users\\P SUNIL\\Downloads\\sunil111\\babu.txt";
    	 File file = new File(pathname);
    	 file.mkdir();
    	 System.out.println("created folder successfully");
     }
   
} 
