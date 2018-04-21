package Popup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Jobserver_windowpop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	      
	      Set<String>id = driver.getWindowHandles();
	      driver.navigate().to("http://www.jobserve.com/in/en/Job-Search/");
	      Iterator<String> winid= id.iterator();
	      System.out.println("Print main window id ==="+winid.next());
	      
	     
	      driver.findElement(By.xpath(".//*[@id='mainfooter']/div[4]/a")).click();
	      id= driver.getWindowHandles();// again call set id
	      winid=id.iterator();// call iterator
	      
	      String Mainwindow_id= winid.next();
	      System.out.println("Mainwindow id"+Mainwindow_id);
	      String MainSubWindow_id = winid.next();
	      System.out.println("MainSubwindow id"+MainSubWindow_id);
	      driver.switchTo().window(MainSubWindow_id);
	      driver.close();
	      
	}

}
