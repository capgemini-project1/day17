package day7;
import java.util.ArrayList;

import java.util.Collections;



public class C1Arraylist {

	public static void main(String[] args) {
		demo2();

	}
	static void demo1() {
		 ArrayList<String> str = new ArrayList<>();
		 str.add("kolkata");
		 str.add("mumbai");
		 str.add("chennai");
		 System.out.println("before sorting"+str);
		 Collections.sort(str);
		 System.out.println("After sorting"+str);
		 str.remove(0);
		 System.out.println(str);
	}
          static void demo2() {
        	  ArrayList<Integer> id = new ArrayList<>();
        	  id.add(100);
        	  id.add(20);
        	  id.add(301);
        	  id.add(40);
        	  id.add(40);
        	  id.add(50);
        	  System.out.println("Before Sort:"+id);
        	  Collections.sort(id);
        	  System.out.println("After Sort:"+id);
        	  id.remove(3);
        	  System.out.println(id);
        	  }
}
