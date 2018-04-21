import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;


public class BBC_Link_CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
;	  //driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[3]/a")).click();
		//same elememnt present by xpath and CSS selector
		driver.findElement(By.cssSelector("div[id='orb-nav-links'] ul li:nth-child(3) a")).click();
		driver.close();
		
	}

}
