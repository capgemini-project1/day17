package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//first in first out
public class D6queue {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		qu.add("mumbai");
		qu.add("london");
		qu.add("kolkata");
		qu.add("chennai");
		System.out.println(qu);
		qu.remove();
		System.out.println(qu);
		 qu.removeAll(qu);
		 System.out.println(qu);
		  boolean checklist =qu.contains("kashmir");
		 System.out.println(checklist);

}
}
