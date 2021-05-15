package day8;

import java.util.HashSet;

public class Hashsetdemo {
	public static void main(String[] args) {
	       Demo1();
	       
	}
	static void Demo() {
		HashSet<String> str = new HashSet<>();
		str.add("sunil");
		str.add("babu");
		str.add("babu");str.add("babu");
		str.add("varun");
		System.out.println(str.size());
		System.out.println(str);
		System.out.println(str);
		
	}
	static void Demo1() {
		HashSet<Person> p1 = new HashSet<>();
		HashSet<Person> p2 = new HashSet<>();
		p1.add(new Person(100, "lucky"));
		p2.add(new Person(100, "lucky"));
		p2.add(new Person(100, "lucky"));
		System.out.println(p2.size());
		
		System.out.println(p2);
		if(p1.equals(p2)) {
			System.out.println("both are equalss!!!!!!");
		}else {
			System.out.println("not equals!!!@@!");
		}

	}

}
