package day7;

import java.util.ArrayList;
import java.util.Collections;

public class C3demo {
	public static void main(String[] args) {
		
	
	ArrayList<Student> std = new ArrayList<>();
	Student list = new Student( 1, "sunil");
	Student list1 = new Student( 2, "chinu");
	std.add(list);
	std.add(list1);
	System.out.println(list);
	System.out.println(list1);
	Collections.sort(list);
	
	
    

	 
	  
	}

}
