package demoOfSingtonpattern;

public class DBUtil {
	
public static DBUtil method1() {
	return null;
}	
private static DBUtil object = null;
public DBUtil() {}
public static DBUtil method2() {
	if(object==null) {
		object = new DBUtil();
	}
	return object;
}
}