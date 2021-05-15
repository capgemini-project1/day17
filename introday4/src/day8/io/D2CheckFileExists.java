package day8.io;

import java.io.File;
import java.io.IOException;

public class D2CheckFileExists {

	public static void main(String[] args) throws IOException {
		demo();

	}
	static void  demo1() throws IOException {
		 String pathname = "C:\\Users\\P SUNIL\\Downloads\\Demo11";
		 File file = new File(pathname);
		 if(file.exists()) {
			 System.out.println("already exists");
			 
		 }
		 else{
			 file.createNewFile();
			 System.out.println("created successfully");
			 
		 }	 }

 static void  demo() throws IOException {
	 String pathname = "C:\\Users\\P SUNIL\\Downloads\\Demo12";
	 File file = new File(pathname);
	 if(file.exists()) {
		 System.out.println("already exists");
		 
	 }
	 else{
		 file.createNewFile();
		 System.out.println("created successfully");
		 
	 }
	 
	 
	 
 }
}
