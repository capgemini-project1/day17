package day9;

public class Hellolamda {

	public static void main(String[] args) {
		 FirstInterface fi = new Firstclass();
		 System.out.println(fi.hello("mumbai"));
	
	//with lamda
	  FirstInterface fi1  = (name)-> "hello"+name;
	 
		System.out.println(fi1.hello("mumbai"));
		
	}
}