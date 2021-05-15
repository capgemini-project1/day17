package day5;

import java.util.*;

public class AssignmentAdditionMain {

	public static void main(String[] args) {
		AssignmentAddition obj = new AssignmentAddition();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Operation");
		String operation =sc.nextLine();
		System.out.println("Enter number of inputs to calculate");
		int n =sc.nextInt();
		
		switch(operation) {
		
		case "+":
			int sum = 0;
			for(int i= 0; i<n; i++) {
				System.out.println("Enter input values");
				int n1 =sc.nextInt();
				sum = obj.addition(n1);
			}
			System.out.println("The Result is " + sum);
			break;
			
		default:
			System.out.println("Invalid Operation");
		
		}
				
		sc.close();
	}
}