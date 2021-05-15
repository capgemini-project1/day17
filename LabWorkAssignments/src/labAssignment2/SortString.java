package labAssignment2;


	import java.util.*;

	public class SortString {
		public static String[] sortString(String s[]) {
			for(int i=0;i<s.length;i++) {
				String temp=s[i];
				System.out.println(temp.length()/2);
				if(temp.length()%2!=0) {
					int len= (temp.length()/2)+1;
					String upper=temp.substring(0,len).toUpperCase();
					String lower=temp.substring(len).toLowerCase();
					s[i]=upper+lower;
				}
				else {
					int len= (temp.length()/2);
					String upper=temp.substring(0,len).toUpperCase();
					String lower=temp.substring(len).toLowerCase();
					s[i]=upper+lower;
				}
			}
			Arrays.sort(s);  
			return s;
		}
		
		
		public static void main(String avgs[]) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter array size");
			int n=sc.nextInt();
			String s[]=new String[n];
			sc.nextLine();
			for(int i=0;i<n;i++) {
				s[i]=sc.nextLine();
			}
			String ans[]=SortString.sortString(s);
			System.out.println("After Performing Sort String Function");
			for(String res:ans) {
				
				System.out.println(res);
				sc.close();
			}
		}

	}

