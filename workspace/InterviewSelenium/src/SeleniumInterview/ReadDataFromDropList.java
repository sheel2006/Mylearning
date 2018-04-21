package SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadDataFromDropList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("http://timesofindia.indiatimes.com/");
    WebElement elememt =driver.findElement(By.xpath(".//*[@id='nav-life']/a"));
    
    Actions act = new Actions(driver);
    act.moveToElement(elememt).build().perform();
    
   String value =  driver.findElement(By.xpath(".//*[@id='29895695']/a")).getAttribute("title");
    System.out.println(value);
	}

}
