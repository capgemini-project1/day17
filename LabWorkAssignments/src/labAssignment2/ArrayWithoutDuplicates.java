package labAssignment2;



	import java.util.*;

	public class ArrayWithoutDuplicates {

		public static int[] modifyArray(int s[]) {
			Arrays.sort(s);
			int n= s.length;
			int[] temp = new int[n]; 
	        
	        int j = 0; 
	        for (int i=0; i<n-1; i++) 
	            if (s[i] != s[i+1]) 
	                temp[j++] = s[i]; 
	          
	       temp[j++] = s[n-1];  
	       int res[]=new int[j];
	       int k=0;
			for(int i=j-1;i>=0;i--) {
				res[k]=temp[i];
				k++;
			}
			return res;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter array size");
			int n = sc.nextInt();
			int s[] = new int[n];
			System.out.println("Enter " + n + " elements");
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
			}
			int res[]=ArrayWithoutDuplicates.modifyArray(s);
			System.out.println("After Modifying Array");
			for (int i=0;i<res.length;i++) {
				System.out.println(res[i]);
				sc.close();
			}
		}
	}

