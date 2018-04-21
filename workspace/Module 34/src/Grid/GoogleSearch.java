package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	@Parameters("browser")
	@Test
	public void testsearch(String b) throws MalformedURLException {
		System.out.println("value of bowswer  "+b);
		DesiredCapabilities cap = null;
		if(b.equals("firefox")){
			// Set capabilities 
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");//it can be chrome or IE
			cap.setPlatform(Platform.ANY);}//set the OS here it can be window or linux	
		else if(b.equals("chrome")){
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");//we are not define chromedriver.exe because it define we node was decleare as below
/* java -Dwebdriver.chrome.driver=C:\chromedriver.exe -jar selenium-server-standalone-2.52.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5556 -browser browserName=firefox,maxInstances=1 -browser browserName=chrome,maxInstances=1 -browser browserName=iexplore, -maxSession 4			
 */			cap.setPlatform(Platform.ANY);}//set the OS here it can be window or linux
		else if (b.equals("iexplore")){
			cap = DesiredCapabilities.internetExplorer();
			cap.setBrowserName("iexplore");//we are not define chromedriver.exe because it define we node was decleare as below
/* java -Dwebdriver.chrome.driver=C:\internetexplore.exe -jar selenium-server-standalone-2.52.0.jar -role webdriver -hub http://localhost:4444/grid/register -port 5556 -browser browserName=firefox,maxInstances=1 -browser browserName=chrome,maxInstances=1 -browser browserName=iexplore, -maxSession 4			
 */			cap.setPlatform(Platform.WINDOWS);}//set the OS here it can be window or linux
				
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		// http://localhost:4444 address of hub...in real time ip address of hub
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.quit();
					
		
		
	}

	

}
