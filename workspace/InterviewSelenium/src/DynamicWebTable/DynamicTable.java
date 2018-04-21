package DynamicWebTable;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class DynamicTable {
static WebDriver driver;

@Test
public void webtable(){
 	driver = new FirefoxDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.w3schools.com/html/html_tables.asp");
	String expetedName ="Jill Smith";
	String xpathfirst1 =".//*[@id='main']/table[1]/tbody/tr[";
	String xpathfirst2 ="]/td[2]";	
	//String xpathlast1 =".//*[@id='main']/table[1]/tbody/tr[";
	//String xpathlast2 ="]/td[3]";
	int i = 2;
	 while(isElementPresent(xpathfirst1+i+xpathfirst2)){
	 String firsttext = driver.findElement(By.xpath(xpathfirst1+i+xpathfirst2)).getText();
	 String lasttext  = driver.findElement(By.xpath(xpathfirst1+i+xpathfirst2.replace("/td[2]", "/td[3]"))).getText();
	String ActualName = firsttext+" "+lasttext;
	System.out.println(ActualName);
	 //System.out.println("  ");
	 //System.out.println(lasttext);
//	Assert.assertEquals(ActualName, expetedName);
	 i++;} }	
public static boolean isElementPresent(String xpath){
	
	int path = driver.findElements(By.xpath(xpath)).size();
	
	if(path ==1)
		return true;
	else
		return false;}}