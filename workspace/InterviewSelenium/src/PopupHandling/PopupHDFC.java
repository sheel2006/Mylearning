package PopupHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHDFC {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hdfcbank.com/");
		Set se =driver.getWindowHandles();
		Iterator it =se.iterator();
		System.out.println( "Main Window id "+it.next());
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		se =driver.getWindowHandles();
		it =se.iterator();
		it.next();
		String popupid= it.next().toString();
		System.out.println("Popup id   "+popupid);
		driver.switchTo().window(popupid);
		String text = driver.getTitle();
		System.out.println( text);
		
		

	}

}
