package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampletest {

	@Test(priority =1,dataProviderClass = Data_Provider.class,dataProvider = "regtest2Dataprovider")
	public void testlogin(String user,String parameter1,String Parameter2){
		//Assert.assertEquals("Good", "Bad");
		//This test will fail becasue actual value not equal to expected value
		System.out.println("Login to Application");
		//(priority =1) is mean this test execute 1st
	}
	@Test(priority =2,dependsOnMethods ="testlogin")// This test case depends on "testlogin" if this will pass then control will execute it
	public void changepassword(){
		System.out.println("Change password");
	}
	@Test(priority =3,dependsOnMethods ="changepassword")// This test case depends on "changepassword" if this will pass then control will execute it
	//@Test(priority =3,dependsOnMethods ="changepassword","testlogin")// 
	public void logout(){
		System.out.println("Logout from application");
	}
}
