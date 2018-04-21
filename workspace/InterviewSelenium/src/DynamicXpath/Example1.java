package DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		//driver.get("https://wordpress.com/wp-login.php");
		driver.get("https://www.borro.com/");
//Single Attribute
			//driver.findElement(By.xpath("//*[@name='log']")).sendKeys("Test");
			//driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			//driver.findElement(By.xpath("//a[@title='WordPress.com']")).getText();
//Multple Attributes
		
		//driver.findElement(By.xpath("//input[@name='log'][@id='user_login']")).sendKeys("Test");
		

//Or in Xpath
		
    	//driver.findElement(By.xpath("//input[@id='user_login' OR @name='log']")).sendKeys("Test");
	

// And in Xpath	
	
		//driver.findElement(By.xpath("//input[@id='user_login' and @name='log']")).sendKeys("Test");

// Contains in xpath
	
//	driver.findElement(By.xpath("a//[contains(@class,'chzn-container chzn-container-single chzn-container-single-nosearch')][text()='Select Asset Type']")).click();
	
//text() method	
	
		driver.findElement(By.xpath("//*[text()='Appraisals']")).click();
	
	}
}
