package labAssignment1;

public class Exercise5 {
	
		public int calculateSum (int n) {
			int sum=0;
			for (int i = 0; i < n; i++) {
				if (i%3 ==0 || i%5 ==0) {
					sum+=i;
				}
			}
			return sum;
		}

		public static void main(String[] args) {
			 Exercise5 ex5=new Exercise5();
		      System.out.println("sum " + ex5.calculateSum(10));

		}

	}

