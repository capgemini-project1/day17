package day5;
import java.util.Scanner;


public class Exceptiondemo1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String name =  "capgemini";
			System.out.println("enter the index");
			int index = sc.nextInt();
			System.out.println(name.charAt(index));
			sc.close();
		}catch(Exception e) {
			System.out.println("invalid index");
		
		}
	}
}
