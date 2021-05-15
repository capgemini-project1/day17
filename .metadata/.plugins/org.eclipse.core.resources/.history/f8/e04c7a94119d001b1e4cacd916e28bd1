package introday4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class dateformatteerD2 {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Date in dd-MM-yyyy format");
			String str = scanner.next();
			
			DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

			LocalDate parsedDate = LocalDate.parse(str, formatter);
			System.out.println(parsedDate);
			
			scanner.close();
		}

	}


