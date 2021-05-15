package labAssignment5;


	public class EmployeeException extends Exception {
		EmployeeException()
		{
			System.out.println("Salary entered is wrong.");
		}
		EmployeeException(String message)
		{
			super(message);
		}
		}


