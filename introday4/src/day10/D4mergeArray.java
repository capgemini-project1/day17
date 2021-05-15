package day10;

import java.util.ArrayList;
import java.util.List;

public class D4mergeArray {
public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	list1.add("sunil");
	list1.add("babu");
	List<String> list2 = new ArrayList<>();
	list2.add("varun");
	list2.add("babu");
	list1.addAll(list2);
	System.out.println(list1);
}
}
