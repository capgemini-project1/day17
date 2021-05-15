package labAssignment5;



import java.util.Scanner;

public class AgeValidation {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
			if(age<=15)
			{
				AgeException ae=new AgeException("Not valid.");
				throw ae;
			
			}
			else
			{
				System.out.println("Valid age.");
			}
		}
		catch(AgeException a)
		{
			System.out.println(a);
		}
		finally {
			System.out.println("--------- Thank You -----------");
		}
		sc.close();
	}
}



