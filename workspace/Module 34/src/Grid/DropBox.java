package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DropBox {

	
	@Test(dataProvider="getdata")
	public void Dropbox(String username,String pwd,String email,String browsername) throws MalformedURLException{
		
		
		System.out.println("browser name "+browsername);
		DesiredCapabilities cap = null;
		if(browsername.equals("firefox")){
			cap= DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);}
		else if(browsername.equals("chrome")){
			cap= DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);}
		else if(browsername.equals("Iexplore")){
			cap= DesiredCapabilities.internetExplorer();
			cap.setBrowserName("Iexplore");
			cap.setPlatform(Platform.ANY);}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("https://www.dropbox.com/");
		driver.findElement(By.xpath(".//*[@id='pyxl7035']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='pyxl7038']")).sendKeys(email);
		driver.findElement(By.xpath(".//*[@id='pyxl7041']")).sendKeys(pwd);
		driver.quit();
	}
	
	@DataProvider(parallel=true)
	public Object[][] getdata(){
	
     Object data[][] = new Object[2][4];
     
     data[0][0] = "U1";
     data[0][1] = "P1";
     data[0][2] = "S1@gmail.com";
     data[0][3] = "firefox";
     
     data[1][0] = "U2";
     data[1][1] = "P2";
     data[1][2] = "S2@gmail.com";
     data[1][3] = "chrome";
     
     return data;
     
}
}