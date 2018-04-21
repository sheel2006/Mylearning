import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TakingScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
        File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile, new File("d:\\bbc.png"));
        
	}

}
