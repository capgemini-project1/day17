package day8.io;

import java.io.File;

public class D3deletefile {
	public static void main(String[] args) {
		demo();
	}
	static void demo() {
		String pathname= "C:\\Users\\P SUNIL\\Downloads\\Demo12";
		File file = new File(pathname);
		if(file.exists()) {
			file.delete();
			System.out.println("deleted succesfully");
		}else {
			System.out.println("file not found");
		}

	}
	
}
