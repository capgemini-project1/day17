package day5;

public class Main {
	public static void main(String[] args) {
		SavingsAccount  sa = new SavingsAccount();
		String acname=sa.getAccountName();
		 
		String acnum = sa.getAccountNumber();
		System.out.println(acname+acnum);
		CurrentAccount ca = new CurrentAccount ();
		String caname= ca.getAccountName();
		String canum= ca.getAccountNumber();
		System.out.println(canum);
		System.out.println(caname);
		
		
		
		

	}
	

}
