package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class D1listdemo {
public static void main(String[] args) {
	demo2();
}
public static void demo1() {
	List<String> list = new ArrayList<>();
	list.add("sunil");
	list.add("sunil");
	list.add("rahul");
	list.add(" babu");
	System.out.println(list);
	
}
public static void demo2() {
	List<String> list = new LinkedList<>();
	list.add("sunil");
	list.add("sunil");
	list.add("rahul");
	list.add(" babu");
	System.out.println(list);
	
}
}

