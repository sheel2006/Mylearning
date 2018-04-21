package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://ksrtc.in/");
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[8]/a")).click();
	Alert at = driver.switchTo().alert();
	System.out.println(at.getText());
	at.accept();
	
	

	}

}
