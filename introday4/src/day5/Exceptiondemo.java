package day5;

public class Exceptiondemo {
	
	
	public static void main(String[] args) {
		try {
			//String name = null;
			String name = "Capgemini";
			System.out.println(name);
			
			// dummy comment
			System.out.println(name.length());
		} catch(Exception e){
			System.out.println("Something wrong happnes!");
			System.out.println("We will fix it soon!");
			
			// technial message :: about the exception
			System.out.println(e.getMessage());
			
			// detail about the exception
			e.printStackTrace();
		} 
		
	}

}
