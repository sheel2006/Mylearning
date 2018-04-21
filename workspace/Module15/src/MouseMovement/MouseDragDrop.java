package MouseMovement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver  driver = new FirefoxDriver();
	     // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      
	      driver.navigate().to("http://www.americangolf.co.uk/golf-clubs/drivers");
	      WebElement drag = driver.findElement(By.xpath(".//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[1]"));
	      Actions act = new Actions(driver);
	      act.dragAndDropBy(drag, 100, 20).build().perform();
	      
		
	}

}
