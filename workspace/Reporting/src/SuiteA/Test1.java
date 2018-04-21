package SuiteA;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

	@Test(dataProvider = "getdata" )
	public void test1(String x,String b){
		if(x.equals("U1")){
			Assert.fail("Fail 1st Set");
// Here Test1 have to run for two data set, for 1 data set its should be passed and for second data set.
// it should failed and captured by Listener in report, To Handle this we use Report function in listiner

		}
	}
	@DataProvider 
	public Object[][] getdata(){
		Object[][] data = new Object[2][2];
		data[0][0] = "U1";
		data[0][1] = "P1";
		
		data[1][0] = "U2";
		data[1][1] = "P2";
		
		
		
		return data;
		
		
	}
}
