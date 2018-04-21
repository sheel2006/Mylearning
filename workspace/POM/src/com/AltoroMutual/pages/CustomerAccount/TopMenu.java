// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 01-05-2016 12:25:48
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TopMenu.java

package com.AltoroMutual.pages.CustomerAccount;

import com.AltoroMutual.Base.Page;
import java.io.PrintStream;
import java.util.Properties;
import org.openqa.selenium.*;

// Referenced classes of package com.AltoroMutual.pages.CustomerAccount:
//            CustomerAccount

public class TopMenu
{

    public void logout()
    {
    Page.click("Logoutxpath");	
  
    }

    public CustomerAccount gotolandingpage()
    {
        try
        {
            System.out.println("gotolandingpage");
         //   WebElement element = Page.driver.findElement(By.xpath(Page.or.getProperty("MyAccountLink")));
            Page.javascriptclick("MyAccountLink");
            return new CustomerAccount();
        }
        catch(Exception e)
        {
            System.out.println("Exception Raise Here");
            e.printStackTrace();
            return null;
        }
    }
}
