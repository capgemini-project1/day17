package introday4;

public class Stringdemo2 {
	 String str1;
	 String str3;

	public static void main(String[] args) {
		 String str1 = new String("HELO");
		  String str2 = str1+" SUNIL";
   System.out.println(str2);
   System.out.println(str2.toLowerCase());
   System.out.println(str2.length());
     String str3=str2.toLowerCase();
  // System.out.println(str3);
   //System.out.println(str3.toString());
   System.out.println(str3.replace("HE", "SM"));
  // System.out.println(str);
	}

}
