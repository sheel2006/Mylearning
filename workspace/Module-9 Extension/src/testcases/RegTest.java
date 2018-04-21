package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegTest {
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="regtest1Dataprovider")
	public void regisiter(String username,String password,String email){
		System.out.println(username+"------"+password+"------"+email);
		
		/*In this example value is provided by Data_Provider class where all the values stored 
		 * this can be use in framework
		 * dataProviderClass & dataProvider used as parameter
		 */
		
	}
	
	
	
	

}
