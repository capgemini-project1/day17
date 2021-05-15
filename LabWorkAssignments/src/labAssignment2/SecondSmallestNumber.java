package labAssignment2;


	import java.util.Scanner;

	public class SecondSmallestNumber {

		public static int getSecondSmallest(int a[]) {
			int temp;  
			for (int i = 0; i < a.length; i++)   
			        {  
			            for (int j = i + 1; j < a.length; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			return a[a.length-2];
		}
		public static void main(String avg[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of elements");
			int n=sc.nextInt();
			System.out.println("Enter "+n+" elements");
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Second largest number = "+SecondSmallestNumber.getSecondSmallest(a));
			sc.close();
		}
	}

