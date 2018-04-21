package MouseMovement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver  driver = new FirefoxDriver();
     // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      
      driver.navigate().to("http://www.americangolf.co.uk/");
      WebElement golfclub = driver.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a"));
     
      Actions act = new Actions(driver);
      act.moveToElement(golfclub, 10, 20).build().perform();
      
      WebDriverWait wait = new WebDriverWait(driver,100);
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")));
     
      driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[2]/li/ul/li[2]/ul/li[1]/a")).click();
	}

}
