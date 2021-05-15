package day8;

public class Equalitydemo {
	public static void main(String[] args) {
		demo1();
	}
	
	
	static void demo1() {
		Person p1 = new Person(100, "Rahul");
		Person p2 = new Person(100, "Rahul");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// SINCE UDD
		// Object Comparing / Equality Check for UDD;
		if(p1.equals(p2)) {
			System.out.println("Objects are equal!");
		} else {
			System.out.println("Objects are not equal!!");
		}
		
		
	}

	static void demo() {
		String str1 = "Sunil";
		String str2 = "Sunil";
		if (str1.contentEquals(str2))
			
		{
			System.out.println("both are equals");
		}else
		{
			System.out.println("not equals");
		}
	}

}
