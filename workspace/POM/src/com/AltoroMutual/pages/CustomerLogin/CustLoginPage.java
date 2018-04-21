package com.AltoroMutual.pages.CustomerLogin;

import com.AltoroMutual.Base.Page;
import com.AltoroMutual.Util.ErrorUtil;
import com.AltoroMutual.pages.CustomerAccount.CustomerAccount;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustLoginPage extends Page
{

    public CustomerAccount dologin(String username, String password)
    {
    	driver.get(prop.getProperty("Testurl"));
    	input("Username", username);
        input("Password", password);
        click("LoginButton");
        try{
        	Assert.assertEquals(or.getProperty("ActualTitle"),driver.getTitle());
            }catch(Throwable t){
        	ErrorUtil.addVerificationFailure(t);
        	takescreenshot("login.jpg");
        }
        if(isElementPresent("TitlePage"))
            return new CustomerAccount();
        else
            return null;
    }

    public CustomerAccount dologin()// Method OverLoading here 
    {  
     return dologin(prop.getProperty("defaultusername"), prop.getProperty("defaultpassword"));
    }
}
