package pac1.shanu.db;

// JDBC 1st step -> import the package
import java.sql.*;

public class LoginRepo {
	
	// Declaring globally for better perception
	String url = "jdbc:mysql://localhost:3306/javaDB";
	String username = "root";
	String password = "123456";
	
	String query = "select * from users where username=? and psw=?";

	public boolean check(String name, String psw) throws ClassNotFoundException {
		
		// JDBC 2nd step -> Load & Register the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
			
			// JDBC 3rd step -> Establish the Connection
			Connection con = DriverManager.getConnection(url, username, password);
			
			// JDBC 4th step -> Create a Statement
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name);
			st.setString(2, psw);
			
			// JDBC 5th & 6th step -> Create a Result Set and execute Query
			ResultSet rs = st.executeQuery();
			rs.next(); // because the pointer is on the 1st row where the column name present. So we have to move the pointer
			
			
			if(rs.next()) {
				return true;
			}
			
			st.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
		
//		return rs.next();
		
	}
		
}
