package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class capturescreenshot {

	public static String capturescreenshots(WebDriver driver ,String screenshotName){
		try{
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String dest = System.getProperty("user.dir")+"\\Screenshot"+screenshotName+".png";
			File destination = new File(dest);
			FileUtils.copyDirectory(source, destination);
			
			return dest;
		}
		catch(Exception e)
		{
			System.out.println("Exception while screenshot"+e.getMessage());
			return e.getMessage();
		}
		
	}
}
