package day5InheitanceDemo3;

public class Main {
 public static void main(String[] args) {
	  CurrentAccount ca = new CurrentAccount();
	 ca.getAccountName();
	   ca.getfeatures();
	   System.out.println(ca.getAccountName());
	   SavingsAccount sa = new SavingsAccount();
	   sa.getfeatures();
	   System.out.println(sa.getAccountName());	  
	   System.out.println(sa.getAccountNumber());
	   
	   
	
}
}
