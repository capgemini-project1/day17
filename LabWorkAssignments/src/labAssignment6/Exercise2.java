package labAssignment6;


	import java.util.*;

	public class Exercise2 {

		public static void main(String args[])
		{
			Charc c = new Charc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the characters: ");
			char[] ch = sc.nextLine().toCharArray();
			System.out.println(c.getCharCount(ch));
			sc.close();
		}
	}
	class Charc
	{
		public HashMap<Character,Integer> getCharCount(char[] ch)
		{
			HashMap<Character,Integer> hash_map = new HashMap<Character,Integer>();
			for (char c : ch)
	        {
	            if(hash_map.containsKey(c))
	            {
	                hash_map.put(c, hash_map.get(c)+1);
	            }
	            else
	            {
	            	hash_map.put(c, 1);
	            }
	        }
			return hash_map;
		}
	}


