package introday4;
import java.util.Scanner;

public class Stringformatdemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 String EmployeeKey = "| Employee Details|";
		 System.out.println("enter the Employee Details");
		 
		String firstNameKey="First Name";
		System.out.println("enter the First Name");
		 String firstNameValue=scanner.nextLine();
		 String lastNameKey = "Last Name";
		 System.out.println("enter the Last Name");
		 String lastNameValue=scanner.nextLine();
		 String CandidateKey = "candidate Id";
		 System.out.println("enter the Candidate Id");
		 String CandidateValue =scanner.nextLine();
		 String MobileKey="Mobile Number";
		 System.out.println("enter the Mobile Number");
		 String MobileValue = scanner.nextLine();
		 String formattedEmployeeKey = String.format("%32s",EmployeeKey);
		String formattedFirstNameKey = String.format("|%-22s|",firstNameKey);
		String formattedFirstNameVal = String.format("%-28s|", firstNameValue);
		 
		String formattedLastNameKey = String.format("|%-22s|",lastNameKey);
		String formattedlastNameVal = String.format("%-28s|", lastNameValue);
		String formattedCandidateKey = String.format("|%-22s|",CandidateKey);
		String formattedCandidateValue = String.format("%-28s|",CandidateValue);
		String formattedMobileKey = String.format("|%-22s|",MobileKey);
		String formattedMobileValue= String.format("%-28s|",MobileValue);
		
		
		
		
		System.out.println(formattedEmployeeKey);
		 String dash = "----------------------|----------------------------";
		 System.out.println(String.format("|%-50s|",dash));
		 System.out.println(formattedFirstNameKey + formattedFirstNameVal);
		 System.out.println(String.format("|%-50s|",dash));
		 System.out.println(formattedLastNameKey + formattedlastNameVal);
		 System.out.println(String.format("|%-50s|",dash));
		 System.out.println(formattedCandidateKey + formattedCandidateValue);
		 System.out.println(String.format("|%-50s|",dash));
		 System.out.println(formattedMobileKey + formattedMobileValue);
		 System.out.println(String.format("|%-50s|",dash));
		 
		
		scanner.close();
	}

}
