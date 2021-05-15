package day8.io;

import java.io.File;

public class D1Createfile {
	public static void main (String[] args) throws Exception {
		  demo();
	}
  static void demo() throws Exception {
	  String Pathname = "C:\\Users\\P SUNIL\\Downloads\\Demo11";
	  File file = new File(Pathname);
	  file.createNewFile();
	  System.out.println("File created successfully");
  }
  static void demo1() {
	  try {
			String pathname = "C:\\Users\\P SUNIL\\Downloads\\Demo11\\";

			File file = new File(pathname);
			file.createNewFile();
			
			System.out.println("File Created successflly!");
		} catch (Exception e) {
			e.printStackTrace();
  }
  }
}

