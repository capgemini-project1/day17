package labAssignment8;

public class Ex2 {
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

	class CopyDataThread extends Thread {
		String source;
		String target;

		public CopyDataThread(String source, String target) {
			super();
			this.source = source;
			this.target = target;
		}

		public void run() {
			try {
				FileReader fr = new FileReader(source);
				BufferedReader br = new BufferedReader(fr);
				PrintWriter out = new PrintWriter(target);
				int i = 0;
				int ch;
				while ((ch = br.read()) != -1) {
					char chr = (char) ch;
					out.println(chr);
					i++;
					if (i == 10) {
						System.out.println("10 characters are copied");
						i = 0;
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				fr.close();
				br.close();
				out.flush();
				out.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}

	public class FileProgram {

		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file names");
			String s1 ="C:\\Users\\P SUNIL\\Downloads\\Module-1.zip\\Module-1\\Core Java 8+Database&SQL+JDBC\\LabBook";
			String s2 = "C:\\Users\\P SUNIL\\Downloads\\Module-1.zip\\Module-1\\Core Java 8+Database&SQL+JDBC\\LabBook";
			CopyDataThread cdt = new CopyDataThread(s1, s2);
			Thread t = new Thread(cdt);
			t.start();

		}

	}


