package labAssignment5;


import java.util.Scanner;

public class NameValidation {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name:");
		String fname=sc.next();
		System.out.println("Enter your last name:");
		String lname=sc.next();
		try {
			if(fname.length()==0 | lname.length()==0)
			{
				EmptyException ee=new EmptyException("The name should not be empty.");
				throw ee;
			}
			else
				System.out.println("Your name is "+fname+" "+lname);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Thank You");
		}
		sc.close();
	}

}

