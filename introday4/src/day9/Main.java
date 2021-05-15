package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
	     demo();
}
  public static void demo() {
	  List<Person> list= new ArrayList<>();

		list.add(new Person(11, "rohit"));

		list.add(new Person(61, "sunil"));

		list.add(new Person(5, "munna"));

		list.add(new Person(22, "arun"));
	       Collections.sort(list,Comparator.comparing(Person::getId));
	       System.out.println(list);
  }
}
