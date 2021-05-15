package day7;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class C2demo {
	public static void main(String[] args) {
		demo2();
	}
	static void demo() {
		LinkedList<String> str = new LinkedList<>();
		str.add("kolkata");
		str.add("delhi");
		str.add("mumbai");
		System.out.println(str);
		str.remove("mumbai");
		System.out.println(str);
		str.add("hyd");
		System.out.println(str);
		Collections.sort(str);
		System.out.println(str);
		Collections.reverse(str);
		System.out.println(str);
		
	}
	static void demo2() {
		HashSet<Integer> id = new  HashSet<>();
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(40);
		id.add(50);
		System.out.println(id);
		id.remove(20);
		System.out.println(id);
		
		
	}
}
