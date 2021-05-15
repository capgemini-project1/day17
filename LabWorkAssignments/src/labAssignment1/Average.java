package labAssignment1;

	public class Average {

		public static void main(String[] args) {
			int[] arr = {7,17,27,37,47};
			int k=0;
			for(int i=0;i<arr.length;i++) {
				k=k+arr[i];
			}
			int avg=k/arr.length;
			System.out.println("Average is: "+ avg);
		}

	}


