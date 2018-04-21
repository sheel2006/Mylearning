import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Frame {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 driver = new FirefoxDriver();
		driver.get("https://www.borro.com/");
		WebElement ele = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/ul/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		String xpath1 ="html/body/div[2]/div/div[1]/ul/li[3]/ul/li[";
		String xpath2="]/a";
		int i = 1;
		while(IselementPresent(xpath1+i+xpath2)){
			String text = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println(text);
		}
		
		}
		
public static boolean IselementPresent(String xpath){
	boolean path =driver.findElement(By.xpath("xpath")).isDisplayed();
	if(path){
		return true;
	}else 
		return false;
	
	
	
	return false;
	
	}

}
