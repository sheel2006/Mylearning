package com.qtpselenium.core.hybrid.Core_Hybrid_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import com.qtpselenium.core.hybrid.core_hybrid_util.DefaultConstant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenericKeywords {

	// GenericKeywords hold actions which are common to any websites like open browserm click, navigation
	
	public WebDriver driver;
	public Properties prop;
	ExtentTest  test;
	/*
	public GenericKeywords(ExtentTest test){//Create this construtor to capture log and error 
		this.test=test;
	}*/
	
/********************************************************	
*Implementation steps for this package
*1. define Open bowser- Webdriver
*2. Define property files --Prop to read data from propertiy file
*3. Create common locator funtion name as WebElement to excess elememt from webpage
*4. Define common function like click/ navigate/input text
*5. Create data folder at C:\Sheel\workspace\Core_Hybrid_Framework and kept excel sheet like suiteA,SuiteB..
*6. Copy xls_reader file in util pakage and define object in keyword.java to call keywords from excel
*7. Create Constant.java to store Excel path
*8. Implement Extent Reports in Project and copy ReportsConfig.xml also create ExtentManager.class
*9. Copy data provider in Gmail Login test to read data from xls
*10 Define Application Keywords and Genric keywords for thta Create AppkeyWords.java which is extention of GenricKeywords.java
*11 AppkeyWords.java will hold only Application related methods
*12 *******Always remember to add any validation in test case, we add in KeyWords.java under executeKeywords methods**
*13 Incorporate Ant and genrate xlst report in Test
*14 Download Ant and set enviroment variable like ANT_HOME and edit path then type ant in cmd 
*15
*
*
*
**********************************************************/	
	public GenericKeywords(ExtentTest  test){
		this.test=test;
		prop = new Properties();
		try {
			FileInputStream fs  = new FileInputStream(System.getProperty("user.dir")+"//src//test//resource//project.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			test.log(LogStatus.FAIL, "Elements not found #FileNotFoundException");
			System.out.println("File Not present");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			test.log(LogStatus.FAIL, "Elements not found #IOException");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/*********************************************************/
 public String openBrowser(String browserType){
		test.log(LogStatus.INFO, "Opening Browser");
		if(browserType.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Jars\\geckodriver.exe");
			driver =new FirefoxDriver(); }
		else if(browserType.equals("IE")){
			System.setProperty("webdriver.ie.driver", "");
			driver = new InternetExplorerDriver();	}
		else if(browserType.equals("chrome")){
		System.setProperty("driver.chrome.driver","D:\\Jars\\chromedriver");		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  
		return DefaultConstant.PASS;
 }
/*********************************************************/

	public String navigate(String urlkey){
		test.log(LogStatus.INFO, "Url value "+prop.getProperty(urlkey));
		//System.out.println("Url value "+prop.getProperty(urlkey));
		//driver.get(url);
		driver.get(prop.getProperty(urlkey));
		return DefaultConstant.PASS;
	}
/*********************************************************/
	
	public String click(String locatorkey){
		test.log(LogStatus.INFO, "Click on locatorKey");
		WebElement e = getElement(locatorkey);
		e.click();
		return DefaultConstant.PASS;
	}
/*********************************************************/
	public String inputtext(String locator,String data){
		System.out.println("Type on input="+prop.getProperty(locator)+"--Value of data="+data);
		test.log(LogStatus.INFO, "Type on input="+prop.getProperty(locator)+"--Value of data="+data);
		WebElement e = getElement(locator);
		e.sendKeys(data);
		return DefaultConstant.PASS;
	}
/*********************Validation Key************************/
	public String verifyText(String locator,String expectedText){
		WebElement element = getElement(locator);
		String actualtext= element.getText();
		if(actualtext.equals(expectedText))
				return DefaultConstant.PASS;
		else
			return DefaultConstant.FAIL;
	}
	
	public String verifyElementPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(result)
			return DefaultConstant.PASS;
		else 
			return DefaultConstant.FAIL+"-Could not find elements -:" +locatorKey;
	}
/***********************************************************/	
	public String verifyElementNotPresent(String locatorKey){
		boolean result= isElementPresent(locatorKey);
		if(!result)
			return DefaultConstant.PASS;
		else 
			return DefaultConstant.FAIL+"-Could find elements -:" +locatorKey;
	}
/***********************************************************/
	public String closeBrowser(){
		test.log(LogStatus.INFO,"closeBrowser");
		System.out.println("closeBrowser");
		//driver.quit();
		return DefaultConstant.PASS;
	}
/**************************Utility Function*******************/
	public WebElement getElement(String locatorkey){
	 WebElement element = null;
	 //System.out.println("Inside Webelement method");
		try{
			if(locatorkey.endsWith("_id")){
				element=driver.findElement(By.id(prop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_xpath")){
				element=driver.findElement(By.xpath(prop.getProperty(locatorkey)));	
				}
			else if(locatorkey.endsWith("_name")){
				element=driver.findElement(By.name(prop.getProperty(locatorkey)));
			}	
		}
			catch(Exception ex){
				reportfailure("Fail in Element Extraction" + locatorkey);
				Assert.fail("Fail in Element Extraction" + locatorkey);
			}
		return element;
		}
	
	public boolean isElementPresent(String locatorkey){
		List<WebElement>al  =null;
		
		if(locatorkey.endsWith("_id"))
			al=driver.findElements(By.id(prop.getProperty(locatorkey)));
		else if(locatorkey.endsWith("_xpath"))
			al=driver.findElements(By.xpath(prop.getProperty(locatorkey)));	
		else if(locatorkey.endsWith("_name"))
			al=driver.findElements(By.name(prop.getProperty(locatorkey)));
		
		if(al.size()==0)
			return false ;
		else 
			return true;
		
	}
	
/***************************Reporting Function****************/
	public void reportfailure(String failureMessage){
		takescreenShot();
		test.log(LogStatus.FAIL, failureMessage);
	}
	public void takescreenShot(){
		Date d = new Date();
		String ScreenshotFile= d.toString().replace(":","_").replace(" ","_")+".png";
		String path= DefaultConstant.SCREENSHOT_PATH+ScreenshotFile;
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try {
					FileUtils.copyFile(srcFile, new File(path));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		test.log(LogStatus.INFO, test.addScreenCapture(path));
		
	}
	}
