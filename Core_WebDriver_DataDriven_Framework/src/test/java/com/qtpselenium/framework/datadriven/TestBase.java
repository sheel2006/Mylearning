package com.qtpselenium.framework.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;

import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

import org.openqa.selenium.JavascriptExecutor;

public class TestBase {

public static WebDriver driver;	
public static Properties prop;
public static JavascriptExecutor js;

public static Logger Application_logs= null;//Logger.getLogger("devpinoyLogger");

public void initLogs(Class<?>class1){
	
	FileAppender appender = new FileAppender();
	appender.setFile(System.getProperty("user.dir")+"//Reporting//Result//"+CustomListener.folderName+"//"+class1.getName()+".log");;
	appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
	appender.setAppend(false);
	appender.activateOptions();
	
	Application_logs= Logger.getLogger(class1);
	Application_logs.setLevel(Level.DEBUG);
	Application_logs.addAppender(appender);
	
}

public static void init(){
	Application_logs.debug(" Step # Control in init method");
		if(prop==null){
			String path =System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties";
			System.out.println(System.getProperty("user.dir"));
		    prop = new Properties();
			try {
				FileInputStream fs = new  FileInputStream(path);
				try {
					prop.load(fs);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			}
			System.out.println(prop.getProperty("xlsfilelocation"));
			}
		}	

public static void validateRunmodes(String testname,String suiteName,String dataRunmode){
	    Application_logs.debug(" Step # Control in validateRunmodes method");
		Application_logs.debug("Step#1.1 : Validating  method validateRunmodes "+testname+ " in suite "+suiteName);
		boolean issuteRunmode = Utility.isSuitableRunnable(suiteName, new Xls_Reader(prop.getProperty("xlsfilelocation")+"Suite.xlsx"));
		//System.out.println("Hello Test----"+prop.getProperty("xlsfilelocation"));
		boolean istestRunmode = Utility.isTestCaseRunnable(testname,  new Xls_Reader(prop.getProperty("xlsfilelocation")+suiteName+".xlsx"));
		boolean datasetRunmode = false;
			if(dataRunmode.equals(Constants.RUNMODE_YES))
					datasetRunmode = true;
			if(!(issuteRunmode && istestRunmode&&datasetRunmode))
				throw new SkipException("Skipping the test"+testname+"inside the suite "+suiteName);
			TestBase.Application_logs.debug("Step#1.5 : Skipping the test"+testname+"inside the suite "+suiteName);
}

public static void openBrowser(String browsername) {
	 Application_logs.debug(" Step # Control in openBrowser method");
	try{
	DesiredCapabilities cap = new DesiredCapabilities();
	if(browsername.equals("Mozilla")){
		cap.setBrowserName("firefox");
		}
	else if (browsername.equals("Chrome")){
		cap.setBrowserName("chrome");
		}
	cap.setPlatform(Platform.WINDOWS);
	try {
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	catch(Exception e){
		Assert.fail("Browser is not opening -"+e.getMessage());
		
	}
}
/*	
if(browsername.equalsIgnoreCase("Mozilla")){
	driver = new FirefoxDriver();
}
else if(browsername.equalsIgnoreCase("Chrome")){
	System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverexe"));
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-extensions");
	driver = new ChromeDriver(options);//use to handle extension popups
	
}*/



public static void navigate(String URLkey){
	 Application_logs.debug(" Step # Control in navigate method");
	driver.navigate().to(prop.getProperty(URLkey));
}

/* this funtion will be handle all kind of selenium locator*/
public static void click(String indetifier){
	 Application_logs.debug(" Step # Control in click method  "+prop.getProperty(indetifier));
	try{
	if(indetifier.endsWith("xpath"))
		driver.findElement(By.xpath(prop.getProperty(indetifier))).click();
	else if (indetifier.endsWith("id"))	
		driver.findElement(By.id(prop.getProperty(indetifier))).sendKeys(Keys.ENTER);
	else if (indetifier.endsWith("name"))  
		driver.findElement(By.name(prop.getProperty(indetifier))).click();
	else if (indetifier.endsWith("cssSelector"))
		driver.findElement(By.cssSelector(prop.getProperty(indetifier))).click();
	else if (indetifier.endsWith("tagName"))
	    driver.findElement(By.tagName(prop.getProperty(indetifier))).click();
}catch(NoSuchElementException e){
	Assert.fail("No such element found -"+indetifier);
}
}
public static void input(String indetifier,String data ){
	 Application_logs.debug(" Step # Control in input method  "+prop.getProperty(indetifier) +"--Data value---"+data);
 try{
	if(indetifier.endsWith("id"))
		driver.findElement(By.id(prop.getProperty(indetifier))).sendKeys(data);
	else if (indetifier.endsWith("xpath"))
		driver.findElement(By.xpath(prop.getProperty(indetifier))).sendKeys(data);
	else if (indetifier.endsWith("tagName"))
		 driver.findElement(By.tagName(prop.getProperty(indetifier))).sendKeys(data);
	
}catch(NoSuchElementException e){
	Assert.fail("No such element found -"+indetifier+data);
	
}
}

public static boolean verifyTitle(String expectedTitleKey){
	 Application_logs.debug(" Step # Control in verifyTitle method  ");
	String expectedtitle = prop.getProperty(expectedTitleKey);
	String actualTitle= driver.getTitle();
	if(expectedtitle.equals(actualTitle))
		return true;
	else
		return false;
}

public static boolean isElementpresent(String elementpath){
	 Application_logs.debug(" Step # Control in isElementpresent method  ");
	int size =0;
	if(elementpath.endsWith("xpath"))
		size = driver.findElements(By.xpath(prop.getProperty(elementpath))).size();
	else if (elementpath.endsWith("id"))
		size = driver.findElements(By.id(prop.getProperty(elementpath))).size();
	else if  (elementpath.endsWith("name"))
		size = driver.findElements(By.name(prop.getProperty(elementpath))).size();
	else if (elementpath.endsWith("tagname"))
	     size = driver.findElements(By.tagName(prop.getProperty(elementpath))).size();
	else  // if element not present in property files
	     size= driver.findElements(By.xpath(elementpath)).size();
    
		if (size>0)
			return true;
		else 
			return false;
}

/*********************Application Sepecific function *****************/
public static void dologin(String bowsername,String username,String password) throws Throwable{
	Application_logs.debug(" Step # Control in dologin method -- "+bowsername);
	//Application_logs.debug("Step#1.7 -dologin : Executing  with bowsername");
	openBrowser(bowsername);
	navigate("testsiteURL");
    Application_logs.debug("Step#1.8-dologin : Executing  with bowsername"+username);
    Assert.assertTrue(isElementpresent("moneylink_xpath"), "webelement for moneylink_xpath not found");
    JavascriptExecutorclick("moneylink_xpath");
   // click("moneylink_xpath"); this is not work so use java script
    click("myportfolio_xpath");
    Assert.assertTrue(verifyTitle("portfolioPage"), "Title do not match.Got title as "+driver.getTitle());;//Verify title of page
    input("loginusername_id",username);
    click("continuelogin_xpath");
    input("loginPassword_xpath",password);
    JavascriptExecutorclick("continuesubmit_xpath");
    //click("continuesubmit_xpath");
	
}

public static void explictwait( int wait_time,String element_path){
	WebDriverWait wait = new WebDriverWait(driver, wait_time);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(prop.getProperty(element_path))));
	
}
public static void JavascriptExecutorclick(String xpathclick){
	//here .click(); and .sendKeys(Keys.ENTER); not working so we use JavascriptExecutor in Selenium Webdriver using java
	// use this links for deatils --http://hiromia.blogspot.in/2015/10/how-to-use-javascriptexecutor-in.html
	Application_logs.debug(" Step # Control in JavascriptExecutorclick method "+prop.getProperty(xpathclick));
	js = (JavascriptExecutor) driver; 
	js.executeScript("arguments[0].click()",driver.findElement(By.xpath(prop.getProperty(xpathclick))) );
	
}
/*********************Application login with default
 * @throws Throwable *****************/
public static void dologindefault(String bowsername) throws Throwable{
	Application_logs.debug("Step # Control in dologindefault method ");
	Application_logs.debug("Step#1.8 : Executing from dologindefault ");
	Application_logs.debug("Step#1.9 : Executing from dologindefault "+ bowsername);
	dologin( bowsername,prop.getProperty("defaultusername"),prop.getProperty("defaultpassword"));
}
// this will quit driver and release memory
public static  void driverquit(){
	if(driver!=null){
		driver.quit();
		driver=null;
	}
}

public String getText(String identifier){
	Application_logs.debug("Step # Control in identifier method ");
	String text ="";
	try {
		if(identifier.endsWith("xpath"))
			text = driver.findElement(By.xpath(prop.getProperty(identifier))).getText();
		else if (identifier.endsWith("id"))
			text = driver.findElement(By.id(prop.getProperty(identifier))).getText();
		else if  (identifier.endsWith("name"))
			text = driver.findElement(By.name(prop.getProperty(identifier))).getText();
		else if (identifier.endsWith("tagname"))
			text = driver.findElement(By.tagName(prop.getProperty(identifier))).getText();
		}catch(NoSuchElementException e){
		Assert.fail("No Element present -"+identifier);
		
	}
	return text;
		
	
}
 // To test Second Test
public static boolean check_leaset_performing_asset(String xpath1,String xpath2, String instance){
	Application_logs.debug("Step#2.01 : Executing Test2 from check_leaset_performing_asset");
	int i =1;
	//boolean company_name = false;
     while(isElementpresent((prop.getProperty(xpath1))+i+(prop.getProperty(xpath2)))){
    	String company_text = driver.findElement(By.xpath((prop.getProperty(xpath1))+i+prop.getProperty(xpath2))).getText();
    	if(company_text.contains(instance)){
    		System.out.println("with true");
    		return true;}
    		else
    			System.out.println("with false");
    			return false;
    	
    	}
    	 i++;
       
	return true;
  
}

}




	
