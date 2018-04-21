package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DatabaseConnection {

	static final String URL = "jdbc:mysql://localHost:3306/";
	static final String dname = "test";
	static final String username="root";
	static final String password ="password";
	
	public static void main(String[] args) throws Throwable {
	  
		//Step 1 -- Resister jdbc driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//Step 2.. estabilise connection
		Connection conn= DriverManager.getConnection(URL+dname, username, password);
		
		//Step3 Create Statement for writing SQL
		
		Statement st =conn.createStatement();
		
		ResultSet rt = st.executeQuery("select * from users;");// rt return as Set interface
		
		while(rt.next()){
			System.out.println(rt.getString("Employee_id"));
			
		}
		
		rt.close();
		
		
		

	}

}
