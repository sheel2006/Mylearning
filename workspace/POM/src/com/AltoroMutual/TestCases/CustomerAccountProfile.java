package com.AltoroMutual.TestCases;

import com.AltoroMutual.Base.Page;
import com.AltoroMutual.Util.TestUtil;
import com.AltoroMutual.pages.CustomerAccount.CustomerAccount;
import com.AltoroMutual.pages.CustomerAccount.TopMenu;
import com.AltoroMutual.pages.CustomerLogin.CustLoginPage;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class CustomerAccountProfile
{

    @Test
    public void CustomertSavingprofileTest()
    {
        if(!TestUtil.isTestExecutable("CustomerAccountProfile", Page.xls))
            throw new SkipException("RunMode Set as No for TestCase");
        	CustomerAccount custaccpage = null;
           if(!Page.isLoggedIn)
        { // System.out.println("Test begin ");
            CustLoginPage loginpage = new CustLoginPage();
            custaccpage = loginpage.dologin();
        } else
        {
        	System.out.println("Control Here");
            custaccpage = Page.topmenu.gotolandingpage();
        }
       String Title = custaccpage.Savingaccountprofile();
    //   Page.timeoutthread();
       Assert.assertEquals(Title, Page.or.getProperty("expectedSaving"),"Saving Account validation failed in CustomertSavingprofileTest");
       
        Page.isLoggedIn = true;
       
    }
    
    @Test(dependsOnMethods ="CustomertSavingprofileTest")
    public void CustomertCheckingprofileTest() throws Throwable
    {
        if(!TestUtil.isTestExecutable("CustomerAccountProfile", Page.xls))
            throw new SkipException("RunMode Set as No for TestCase");
        	CustomerAccount custaccpage = null;
        	System.out.println("Page.isLoggedIn   "+Page.isLoggedIn);
           if(!Page.isLoggedIn)
        { // System.out.println("CustomertCheckingprofileTest begin ");
            CustLoginPage loginpage = new CustLoginPage();
            custaccpage = loginpage.dologin();
        } else   {
        System.out.println("CustomertCheckingprofileTest page top menu");
        custaccpage = Page.topmenu.gotolandingpage();
          }
       String checkingacctno = custaccpage.Checkingaccountprofile();
       Assert.assertEquals(checkingacctno, Page.or.getProperty("expectedChecking"), "Checking Account validation failed in CustomertCheckingprofileTest");
       custaccpage.ViewRecentTrxPage();  // This address of next page .. 
    }
    
    
}
