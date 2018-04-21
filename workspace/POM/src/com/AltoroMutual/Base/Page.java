package com.AltoroMutual.Base;

import com.AltoroMutual.Util.Xls_Reader;
import com.AltoroMutual.pages.CustomerAccount.TopMenu;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page
{
		public static WebDriver driver = null;
		public static WebDriverWait wait = null;
		public static Properties prop = null;
		public static Properties or = null;
		public static boolean isLoggedIn =false ;
		public static Xls_Reader xls = new Xls_Reader((new StringBuilder(String.valueOf(System.getProperty("user.dir")))).append("\\src\\com\\AltoroMutual\\Util\\TestSceanrios.xlsx").toString());
		public static TopMenu topmenu = null;
    public Page()
    {
        if(driver == null)
        {
            prop = new Properties();
            or = new Properties();
            try
            {
                FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\config\\config.properties");
                FileInputStream ors = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\config\\OR.properties");
                try
                {
                    prop.load(fis);
                    or.load(ors);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
            if(prop.getProperty("browser").equals("Mozila"))
                driver = new FirefoxDriver();
            else
            if(prop.getProperty("browser").equals("IE"))
            {
                System.setProperty("WebDriver.InternetExplore.driver", "Path of IE.exe");
                driver = new InternetExplorerDriver();
            } else
            if(prop.getProperty("browser").equals("Chrome"))
            {
                System.setProperty("WebDriver.Chrome.driver", "path of chrome.exe");
                driver = new ChromeDriver();
            }
        }
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        topmenu = new TopMenu();
    }

    public static void click(String xpathkey)
    {
        try
        {
            if(xpathkey.contains("link"))
                driver.findElement(By.linkText(or.getProperty(xpathkey))).click();
            else
                driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void input(String xpathkey, String text)
    {
        try
        {
        	driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
        	driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(text);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void selectdroplist(String xpathkey, String text)
    {
        try
        {
            WebElement element = driver.findElement(By.xpath(or.getProperty(xpathkey)));
            Select sel = new Select(element);
            sel.selectByVisibleText(or.getProperty(text));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(String xpathkey)
    {
        try
        {
            driver.findElement(By.xpath(or.getProperty(xpathkey)));
         //   System.out.println("Element Present");
        }
        catch(Exception e)
        {
            System.out.println("Element Not Present");
            return false;
        }
        return true;
    }

    public void mouseactions(String xpathkey)
    {
        try
        {
            WebElement Element = driver.findElement(By.xpath(or.getProperty(xpathkey)));
            Actions act = new Actions(driver);
            act.moveToElement(Element).doubleClick().build().perform();
            System.out.println("mouseactions Try");
        }
        catch(Exception e)
        {
            System.out.println((new StringBuilder("mouseactions catch   ")).append(xpathkey).toString());
            e.printStackTrace();
        }
    }

    public static void javascriptclick(String xpath)
    {
        WebElement element = driver.findElement(By.xpath(or.getProperty(xpath)));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", element);
    }

   public static String gettext(String xpath){
	   explicitwait(xpath,5);
	   String gettext = driver.findElement(By.xpath(or.getProperty(xpath))).getText();
	   return gettext;
	   }
   
   public static WebElement explicitwait(String xpath ,int timeout){
	   wait= new WebDriverWait(driver,timeout);
	   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(or.getProperty(xpath))));
	return element;
		
   }
    public static void takescreenshot(String testname){
    	File fs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	//FileUtils.copyFile(srcFile, destFile);
    	try {
			FileUtils.copyFile(fs, new File (System.getProperty("user.dir")+"\\ScreenShot\\"+testname));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    }
  
}
