package pac1.shanu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterRepo {

	String url = "jdbc:mysql://localhost:3306/javaDB";
	String username = "root";
	String password = "123456";
	
	String query = "insert into users values(?, ?, ?)";

	public void reg(String name, String email,  String psw) throws ClassNotFoundException {
		
		// JDBC 2nd step -> Load & Register the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			
			// JDBC 3rd step -> Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			// JDBC 4th step -> Create a Statement
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, psw);
			
			// JDBC 5th & 6th step -> Create a Result Set and execute Query
			st.execute();
			
			st.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
//		return rs.next();
		
	}
	
}
