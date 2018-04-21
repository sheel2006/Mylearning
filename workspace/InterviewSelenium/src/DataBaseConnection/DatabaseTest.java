package DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseTest {

	static String url = "jdbc:mysql://localHost:3306/";
	static String dname = "test";
	static String username="root";
	static String password = "password";
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = 	DriverManager.getConnection(url+dname,username,password);
		Statement st 	=	conn.createStatement();
		ResultSet rt	=	st.executeQuery("Select * from users");
		ArrayList<String>list = new ArrayList<String>();
		while (rt.next()){
		//	System.out.println(rt.getString("City"));
			list.add(rt.getString("City"));
		}
		System.out.println(list);
	}

}
