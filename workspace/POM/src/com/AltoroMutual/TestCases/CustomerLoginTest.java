package com.AltoroMutual.TestCases;

import java.util.Hashtable;

import com.AltoroMutual.Base.Page;
import com.AltoroMutual.Util.ErrorUtil;
import com.AltoroMutual.Util.TestUtil;
import com.AltoroMutual.pages.CustomerAccount.CustomerAccount;
import com.AltoroMutual.pages.CustomerLogin.CustLoginPage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerLoginTest
{

   @Test(dataProvider ="getdata")
// This will check run mode in TestSuite level in TestCases 
   public void CustomerLoginTest(Hashtable<String,String> data)
          {
      
// System.out.println(data.get("RunMode")+"--"+data.get("UserName")+"---"+data.get("Password"));
	   
	   if(!TestUtil.isTestExecutable("CustomerLoginTest", Page.xls))
           throw new SkipException("RunMode Set as no for TestCase Sheet");
        
       if(!data.get("RunMode").equals("Y"))
// Data.get("RunMode") mean to extract data from HashTable we use get method and give the Key name
       throw new SkipException("RunMode Set as no in TestData Sheet");
       
       if(Page.isLoggedIn){// This will logout if application is logged in
    	   Page.topmenu.logout();
    	   Page.isLoggedIn =false;
       }
       String testDataType=data.get("Flag"); 
        CustLoginPage loginpage = new CustLoginPage();
        CustomerAccount custacc = loginpage.dologin(data.get("UserName"), data.get("Password"));
        System.out.println(data.get("RunMode")+"--"+data.get("UserName")+"---"+data.get("Password"));
        
        if(testDataType.equals("Y") & (custacc == null)){
        	try{
        	Assert.assertTrue(false, "Unable to login in application");
           }catch(Throwable t){
        	   ErrorUtil.addVerificationFailure(t);
        	   Page.takescreenshot("Login0");	
       	    return; //suppose if we dont want continue test use return here
        	   }
        	Page.isLoggedIn =false;
        }
        	
        else if((!testDataType.equals("Y")) & (custacc != null)){
            try{
        	Assert.assertTrue(false, "Able to login in application with incorrect Data");
            }catch(Throwable t){
            ErrorUtil.addVerificationFailure(t);
         	Page.takescreenshot("Login1");
         	return;// This very important incase application user name and pwd wrong
            }
            Page.isLoggedIn =false;
        }
        
        if(testDataType.equals("Y"))
            Page.isLoggedIn = true;
        else
        	Page.isLoggedIn = false;
          }
        
        
    
    @DataProvider
    	public Object[][] getdata(){
			return TestUtil.getData("CustomerLoginTest", Page.xls);
    	 }
	}
