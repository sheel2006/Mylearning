package SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SetWindowSize {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.co.in/?gfe_rd=cr&ei=l-01V6CZF8GL8QeE2o3ACA&gws_rd=ssl");
		//  Dimension dim = new Dimension(500,600);
		  //driver.manage().window().setSize(dim);
		  
		  Point pi = new Point(50,10);
		  driver.manage().window().setPosition(pi);
		 WebElement element = driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]"));
		  Actions act = new Actions(driver);
		  act.moveToElement(element, 500, 200).doubleClick().build().perform();
		
	}

}
