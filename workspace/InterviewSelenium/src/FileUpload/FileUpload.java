package FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com/pdf-word");
		driver.findElement(By.name("clientUpload")).click();
		StringSelection  st = new StringSelection ("C:\\Users\\Lenovo\\Desktop");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		driver.getWindowHandles().size();
		
		

	}

}
