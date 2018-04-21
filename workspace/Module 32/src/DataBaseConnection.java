
import java.sql.*;
public class DataBaseConnection {

	
	static final String url 	 ="jdbc:mysql://localHost:3306/";//This is database url in real time we use ip address of database 
	static final String dbname   ="test";
	static final String driver   ="com.mysql.jdbc.Driver";// This "Driver" clase will connect java to database
	static final String username ="root";
	static final String password ="password";
	
	public static void main(String[] args)  {
		//Here we are using MySQL and we have download MySQL jar
        // Connection is interface
		Connection conn =null;
		Statement st =null;
		
	    try{
	    	  Class.forName(driver);// This will create object of Driver class
		      conn= DriverManager.getConnection(url+dbname,username,password);
		      System.out.println("DataBase connection established");
		      // connection will be established
		      st=conn.createStatement();
		      // Connection inteface give reference of Statement interface and send SQL to DB and statement interface
		      System.out.println("creating a statement..");
		      ResultSet rs = st.executeQuery("select * from users;");
		      //ResultSet is interface and reference from Statement interface
		      while(rs.next()){
		    	  System.out.println("value of 1st col : "+rs.getString("Employee_id")+"value of 2nd col : "+rs.getString("Employee_Name")+"value of 3rd col : "+rs.getString("Address")+"value of 4th col : "+rs.getString("City"));
		      		}
		      rs.close();
		      st.close();
		      conn.close();
	        }
		    catch(SQLException e){
		    	  e.printStackTrace();  
		    						}
	        catch (Exception e) {
		    	    // TODO: handle exception for class.forName
		            e.printStackTrace();
	        					}
	         finally{ 
		    	  //closing the resources..STEP 7
		            try {
		                if (st != null)
		                    st.close();
		            } catch (SQLException e2) {
		                e2.printStackTrace();
		            }try {
		                if (conn != null) {
		                    conn.close();
		                }
		            } catch (SQLException e2) {
		                e2.printStackTrace();
		            }
		        }
		        System.out.println("Closing the resources for DataBase");
		    }
}

	   
	
