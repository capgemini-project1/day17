package labAssignment5;

	public class AgeException extends Exception{
		AgeException()
		{
			System.out.println("The age should be above 15 years.");
		}
		AgeException(String message)
		{
			super(message);
		}

	}

