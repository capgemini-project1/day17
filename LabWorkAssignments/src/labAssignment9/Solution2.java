package labAssignment9;

	import java.io.File;
	import java.util.Scanner;

	public class Solution2 {

		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name");
			String fileName = sc.next();
			File f = new File(fileName);
			System.out.println("File Exixts: "+f.exists());
			System.out.println("File is readable: "+f.canRead());
			System.out.println("File is writable: "+f.canWrite());
			System.out.println("Is File: "+f.isFile());
			System.out.println("Length in bytes: "+f.length());
			sc.close();
		}

	}

