package Popup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Redif_window_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
      driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
      
      //Window 1
      Set<String> windowids =driver.getWindowHandles();
      // driver.getWindowHandles() return SET of window ids which are opened in current session by selenium
      System.out.println("Total window opened =="+windowids.size());
      Iterator<String> ids = windowids.iterator();
      System.out.println("window id ---"+ids.next());
          
      System.out.println("-----------------");
      driver.navigate().to("http://in.rediff.com");
     //popup
      windowids =driver.getWindowHandles();
      System.out.println("Total window opened==="+windowids.size());
      ids= windowids.iterator();
      String Mainwindow_id = ids.next();
      System.out.println("Mainwindow id ---"+Mainwindow_id);
      String Popupwindow_id = ids.next();
      System.out.println("Popupwindow id ---"+Popupwindow_id);
      // Move Control to popup window
      driver.switchTo().window(Popupwindow_id);
     // driver.switchTo().activeElement(); use this for IE to switch control
      driver.close();
	}
	
}
