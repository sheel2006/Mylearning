package FileDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=7qgZV-ncKdCL8QepwbLQBA&gws_rd=ssl");
		driver.findElement(By.id("lst-ib")).sendKeys("Java download");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Download Free Java Software")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/a/span")).click();
		/// This is important during download that window pop up opened,Always use Robot api.
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
