package day9;

import java.util.ArrayList;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class D1Streamdemo {
	public static void main(String[] args) {
		demo2();
	}
     public static void demo1() {
    	 List<String> list = Arrays.asList("delhi","calucta","mumbai","fhennai","zzzz","aaaaa");
    	 System.out.println(list);
 	    list.stream().map(city-> city.toUpperCase()).sorted()
 	    .forEach(System.out::println);

     }
     public static void demo2() {

 		List<String> list = Arrays.asList("Delhi", "chennai", "calcutta", "mumbai","aaaaa");
 		List<String> upperCaseList = new ArrayList<>();
 		for(String city : list) {
 			System.out.println(city);
 			
 			upperCaseList.add(city.toUpperCase());
 		}

 		System.out.println(upperCaseList);
 		Collections.sort(upperCaseList);
 		System.out.println(upperCaseList);
 		
     } 
}
