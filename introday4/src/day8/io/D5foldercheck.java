package day8.io;

import java.io.File;

public class D5foldercheck {

	public static void main(String[] args) {
	
          demo();
	}
	static void demo() {
		String pathname =  "C:\\Users\\P SUNIL\\Downloads\\sunil11\\babu.txt";
   	 File file = new File(pathname);
   	 if(file.exists()) {
   		 System.out.println("already exist folder");
   	 }else {
   		 file.mkdir();
   		 System.out.println("folder created");
   	 }
	}

}
