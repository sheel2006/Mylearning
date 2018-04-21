package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class xGoogleSearchSerialRun {

	
	@Test(dataProvider ="getdata")
	public void googlesearch(String searchResult,String browname) throws MalformedURLException{
		/*In this example we are going to talk about java.net.MalformedURLException.
		 * It is a subclass of IOException so it is a checked exception. What you should know is that 
		 * MalformedURLException is an exception that occurs when you are trying to connect to a URL 
		 * from your program but your client cannot parse the URL correctly.
		 */
/*In this example we are running with xtestNG.xml and not using parameter annotition and 
 * use single xml file for mozila and chrome and testcase run serially
 * 		
 */
		System.out.println("browser name "+browname);
		DesiredCapabilities cap = null;
		if(browname.equals("firefox")){
			cap= DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);}
		else if(browname.equals("chrome")){
			cap= DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);}
		else if(browname.equals("Iexplore")){
			cap= DesiredCapabilities.internetExplorer();
			cap.setBrowserName("Iexplore");
			cap.setPlatform(Platform.ANY);}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		// http://localhost:4444 address of hub...in real time ip address of hub
				driver.get("http://www.google.com");
				driver.findElement(By.name("q")).sendKeys(searchResult);
				driver.quit();
		
	}
	@DataProvider
	public Object[][] getdata(){
		Object data[][] = new Object[2][2];
		data[0][0]="java";
		data[0][1]="firefox";
		
		data[1][0]="jasmin";
		data[1][1]="chrome";
		
		return data;
		
		
	}
	
	
}
