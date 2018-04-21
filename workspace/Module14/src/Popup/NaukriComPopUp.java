package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriComPopUp {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver= new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		getWindowTitles(mainWindow);
		
		
	}
	public static String getMainWindowHandle(WebDriver driver){
		return driver.getWindowHandle();
		
	}
	public static String getCurrentWindowTitle(){
		String title = driver.getTitle();
		return title;
		
	}
	public static boolean getWindowTitles(String openWindowHandle){
		Set<String>allwindows = driver.getWindowHandles();
		for(String currentwindowHandle:allwindows){
			if(!currentwindowHandle.equals(allwindows)){
				driver.switchTo().window(currentwindowHandle);
				String PopupURL = driver.getCurrentUrl();
				System.out.println("PopupURL--"+PopupURL);
				driver.get(PopupURL);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
			driver.switchTo().window(openWindowHandle);
			if(driver.getWindowHandles().size()==1)
				return true;
			else
				return false;
			
	}
}
