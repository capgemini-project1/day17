package labAssignment6;

	import java.util.*;
	public class Exercise3 {
		
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			hashapex h = new hashapex();
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
			System.out.println(h.getSquare(a));
			sc.close();
		}
	}
	class hashapex
	{
		public HashMap<Integer,Integer> getSquare(int[] a)
		{
			HashMap<Integer,Integer> hash_map = new HashMap<Integer,Integer>();
			for(int i=0;i<a.length;i++)
			{
				hash_map.put(a[i], a[i]*a[i]);
			}
			return hash_map;
		}

	}


