package labAssignment9;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.Scanner;

	public class Solution {

		public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name");
			String fileName = sc.next();
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			int i=1;
			while(line != null) {
				System.out.println(i+" "+line);
				line = br.readLine();
				i++;
			}
			br.close();
			sc.close();
		}

	}
