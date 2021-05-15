package labAssignment6;

import java.util.ArrayList;
import java.util.*;

public class Exercise5 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Small s = new Small();
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("The second smallest"+s.getSmallestElement(a));
		sc.close();
	}
}
class Small
{
	public int getSmallestElement(int[] a)
	{
		List<Integer> list2 = new ArrayList<Integer>();
	      for(int n :a) {
	         list2.add(n);
	      }
	      Collections.sort(list2);
	      int n = list2.get(1);
	      return n;
	}
}
