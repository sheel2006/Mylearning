package com.qtpselenium.framework.datadriven.PortFolio;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;







import com.qtpselenium.framework.datadriven.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class LoginTest extends TestBase{

	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="PortFolioDataProvider")
	// Data read from suiteADataProvider, suiteADataProvider hold Testdata for suiteA 
	public static void LoginTest(Hashtable<String,String> table) throws Throwable{
		Application_logs.debug("Step#1.0 : Executing Test1 from LoginTest");
		validateRunmodes("LoginTest",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		dologin(table.get(Constants.Browser_Col), table.get(Constants.Username_Col), table.get(Constants.Password_Col));
		// validation on login page
		boolean signoutlink=isElementpresent("signout_xpath");
       if(!(((table.get(Constants.Eexpected_Col).equals("Success"))&& signoutlink)))
    	   Assert.fail("Not able to Login with correct crendentials");
       else if (table.get(Constants.Eexpected_Col).equals("Failure"))
    	   if(signoutlink){
    	   Assert.fail("Logged with wrong crendentials");
    	   driverquit();
     	   }
    	}
	@AfterMethod
	public void close(){
		driverquit();
	}
		}
