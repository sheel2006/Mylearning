package MouseMovement;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RandomLinkClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
	     // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      
	      driver.navigate().to("http://www.americangolf.co.uk/");
	      WebElement golfclub = driver.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a"));
	     
	      // extract element from Box
	      WebElement box= driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]"));
	      List<WebElement> links = box.findElements(By.tagName("a"));
	      System.out.println(links.size());
	      Random rum = new Random();
	      int randomnum= rum.nextInt(links.size());
	     WebElement elem = links.get(randomnum);
	     System.out.println(elem.getText()	);
	}

}
