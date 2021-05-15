package labAssignment1;

	import java.util.*;
	public class FibonacciNumbers {
		 
		public void usingNonRecursive(int n) {
			int f1=1, f2=1, f3;
			  System.out.println(1+"\n"+1);
			  for(int i=3;i<=n;i++)
			  {
				  f3=f1+f2;
				  System.out.println(f3);
				  f1=f2;
				  f2=f3;
			  }
		}
		static int n1=1,n2=1,n3=0;
		public void usingRecursive(int n) {
			
			if(n>0)
			{
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.println(n3);
				usingRecursive(n-1);
			}

		}
		
		
		

		public static void main(String[] args) {
			
			FibonacciNumbers obj=new FibonacciNumbers();
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("Fibonacci Series Using Non Recursive Function ");
			obj.usingNonRecursive(n);
			System.out.println("Fibonacci Series Using Recursive Function ");
			System.out.println(1+"\n"+1);
			obj.usingRecursive(n-2);
			sc.close();
		}


}
