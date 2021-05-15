package labAssignment1;

public class Exercise6 {

	public static int calculateDifference(int n){
	      int a = (n * (n + 1) * (2 * n + 1)) / 6;
	      int b= (n * (n + 1)) / 2;
	       b= b*b;
	       int sum= Math.abs(a- b);
	      return sum;
	    		 
	   }
	   public static void main(String args[]){
	      System.out.println("Number: " + calculateDifference(10));
	   }
}


