package introday4;
import java.util.Scanner;
public  class AdditionScannerdemo {
	int n1;
	public static void main(String[] args) {
		
	Scanner scanner =  new Scanner(System.in);
	 System.out.println("enter the value of n1:");
	  int n1 =  scanner.nextInt();
	  System.out.println("enter the value of n2:");
	  int n2= scanner.nextInt();
	  int sum = n1+n2;
	  System.out.println("the sum is "+sum);
	  scanner.close();
	}
	 
	

}
