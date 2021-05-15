package day10;

import java.util.ArrayList;
import java.util.List;

public class D3demo {
	

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(10, "sunil", "sunil@gmail.com", "79899499798"));
		
		list.add(new Person(200, "rejhfu", "srebie@gmail.com", "755/888568"));
		// System.out.println(list);
		list.add(0, new Person(26, "aaaa", "aaaa@", "54151221221"));
		
		
		// Removing
		list.remove(0);
		list.remove(new Person(10, "sunil", "sunil@gmail.com", "79899499798"));
		
		System.out.println(list);
		
	}
}

