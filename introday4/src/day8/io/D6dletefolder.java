package day8.io;

import java.io.File;

public class D6dletefolder {

	public static void main(String[] args) {
		String pathname =  "C:\\Users\\P SUNIL\\Downloads\\sunil111";
   	 File file = new File(pathname);
   	 if(file.exists()) {
   		 file.delete();
   	   	 System.out.println("deleted successfully");

   	 }
	}

}
