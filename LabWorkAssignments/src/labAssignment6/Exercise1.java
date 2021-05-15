package labAssignment6;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




public class Exercise1 {
	
	public static void main(String args[]) {
		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("panda", 1);
		map.put("teddy",4);
		map.put("zoozoo", 2);
		map.put("monion",3);
		map.put("dog",5);

		List<Entry<String,Integer>> list=new LinkedList<Entry<String,Integer>>(map.entrySet());

		//sort by value
		Collections.sort(list, new Comparator<Entry<String,Integer>>()
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});

		for(Entry<String,Integer> item: list) {
			System.out.println(item);
		}

		//sort by key
		Collections.sort(list, new Comparator<Entry<String,Integer>>()
		{

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getKey().compareToIgnoreCase(o2.getKey());
			}
			
		});
		System.out.println("-----list the map sort by key------");

		for(Entry<String,Integer> item: list) {
			System.out.println(item);
		}

		}	
}

