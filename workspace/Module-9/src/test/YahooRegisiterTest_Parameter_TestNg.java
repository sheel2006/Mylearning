package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegisiterTest_Parameter_TestNg {
	
	
	@Test(dataProvider="regisiterdata")//regisiterdata will be provide value to testregisiter
	public void testregisiter(String username,String password,
			                  String email,String city){
		// function have to same parameter as Array elements
		
		System.out.println(username+"---------"+password+"--------"+email+"--------"+city);
	}
		
	@DataProvider
	// This TestNG annotation return 2D Object array
	public Object[][] regisiterdata(){
		//rows - Number of times test has to be repeat(Object[3])
		//Col -  No of parameter in testregisiter((Object[4]))
		Object[][] data = new Object[3][4];
		//1st row
		data[0][0] = "user1";
		data[0][1] = "Pass1";
		data[0][2] = "email1";
		data[0][3] = "city1";
		//second row
		data[1][0] = "user2";
		data[1][1] = "Pass2";
		data[1][2] = "email2";
		data[1][3] = "city2";
		//Third row
		data[2][0] = "user2";
		data[2][1] = "Pass2";
		data[2][2] = "email2";
		data[2][3] = "city2";
		
		return data; 
		
			
		}
		
	}


