package demoOfSingtonpattern;

public class SpringDemo {
public static void main(String[] args) {
	     sunil();
}
public static void step() {
	DBUtil obj1 = new DBUtil();
	DBUtil obj2 = new DBUtil();
	System.out.println(obj1);
	System.out.println(obj2);
	
}





   public static void sunil() {
       DBUtil obj1 = DBUtil.method2();
       System.out.println(obj1);
       DBUtil obj2 = DBUtil.method2();
       System.out.println(obj2);
}
}
