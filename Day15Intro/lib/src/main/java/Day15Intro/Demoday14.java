package Day15Intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demoday14 {
	public static void main(String[] args) throws Exception {
		System.out.println("hello world");
	 String driver = "org.postgresql.Driver";
	 String url="jdbc:postgresql://localhost:5432/sunil1";
	 String username = "postgres";
		String password = "postgres";
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url,username,password);
		String sql ="INSERT INTO t3(id,name,email,mobile) values(?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setInt(1, 16);
		ps.setString(2, "babu");
		ps.setString(3, "babu@gmail.com");
		ps.setInt(4, 323);
		
		ps.executeUpdate();
	
		connection.close();
		
		System.out.println("Record added!!");
		
}
}

