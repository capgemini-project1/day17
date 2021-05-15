package labAssignment5;


import java.util.Scanner;

public class SalaryValidation {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary:");
		double sal=sc.nextDouble();
		if(sal<3000)
		{
			try {
				throw new EmployeeException("Not a valid salary.");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Your salary is "+sal);
		}
		sc.close();
	}
}
