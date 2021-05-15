package labAssignment6;


import java.util.*;

public class Exercise4 {
	public static void main(String args[])
	{
		Eligible e = new Eligible();
		HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int regno = sc.nextInt();
			int marks = sc.nextInt();
			hash1.put(regno, marks);
		}
		System.out.println(e.getStudent(hash1));
		sc.close();
	}
}
class Eligible
{
	public HashMap<Integer,String> getStudent(HashMap<Integer,Integer> hash1)
	{
		HashMap<Integer,String> hash2 = new HashMap<Integer,String>();
		
		for (int i : hash1.keySet()) 
		{
			if(hash1.get(i)>=90)
			{
				hash2.put(i, "GOLD");
			}
			else if(hash1.get(i)<90 && hash1.get(i)>=80)
			{
				hash2.put(i, "SILVER");
			}
			else if(hash1.get(i)<80 && hash1.get(i)>=70)
			{
				hash2.put(i, "BRONZE");
			}
			else
			{
				hash2.put(i, "NOT ELIGIBLE");
			}
		}
		return hash2;
	}

}

