import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMove {
	public static WebDriver driver =null;
	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		System.out.println(System.getProperty("users.dir"));
		driver.get("https://www.annauniv.edu/");
		WebElement dept = driver.findElement(By.xpath(".//*[@id='link3']"));
		Actions act = new Actions(driver);
		act.moveToElement(dept).build().perform();
		Thread.sleep(10000);
		String text=driver.findElement(By.xpath(".//*[@id='menuItemHilite3']")).getText();
		System.out.println(text);
  
	}

}
