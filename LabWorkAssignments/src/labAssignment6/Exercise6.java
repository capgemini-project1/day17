package labAssignment6;


import java.util.HashMap;
import java.util.*;

public class Exercise6 {

	public static void main(String args[])
	{
		Eli e = new Eli();
		HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of persons:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the person id & age:");
			int id = sc.nextInt();
			int age = sc.nextInt();
			hash1.put(id, age);
		}
		System.out.println(e.voterList(hash1));
	}
}
class Eli
{
	public List <Integer> voterList(HashMap<Integer,Integer> hash1)
	{
		List<Integer> li = new ArrayList<Integer>();
		for (int i : hash1.keySet()) 
		{
			if(hash1.get(i)>18)
			{
				li.add(i);
			}
		}
		return li;
	}

}
