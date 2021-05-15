package labAssignment2;

	import java.util.Arrays;
	import java.util.Scanner;

	public class SortNumbersArray {

		public static int[] getSorted(int s[]) {
			for(int i=0;i<s.length;i++) {
				String temp=String.valueOf(s[i]);
				StringBuilder in = new StringBuilder();
				in.append(temp); 
				in.reverse();
				temp=String.valueOf(in);
				
				s[i]=Integer.parseInt(temp);
						
			}
			Arrays.sort(s);
			return s;
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
			int res[]=SortNumbersArray.getSorted(s);
			System.out.println("After Performing Sort String Function");
			for (int i=0;i<n;i++) {
				System.out.println(res[i]);
				sc.close();
			}
		}

	}
