package labAssignment5;


	public class EmptyException extends Exception {
		EmptyException()
		{
			System.out.println("One of the names is empty. Please check.");
		}
		EmptyException(String message)
		{
			super(message);
		}

}
