package day10;

import java.util.HashSet;
import java.util.Set;

public class D2Hashset {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("mumbai");
		set.add("london");
	System.out.println(set);
	set.remove("london");
	System.out.println(set);
	set.clear();
	System.out.println(set);
 boolean checklist = 	set.contains("mumbai");
	System.out.println(checklist);
	}

}
