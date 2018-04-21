import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AnnaUniversity {
    public static WebDriver driver =null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		System.out.println(System.getProperty("users.dir"));
		driver.get("https://www.annauniv.edu/");
		WebElement dept = driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td[5]/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(dept).click().build().perform();
		WebElement deptcvil= driver.findElement(By.xpath(".//*[@id='link3']/strong"));
		act.moveToElement(deptcvil).build().perform();
		System.out.println("Title of the page  "+driver.getTitle());
		getscreenshot();
		WebElement occeanxpath = driver.findElement(By.xpath(".//*[@id='menuItemHilite32']"));
		act.moveToElement(occeanxpath).click().build().perform();
		System.out.println("Title of the page  "+driver.getTitle());
		WebElement resthemes = driver.findElement(By.xpath(".//*[@id='link3']"));
		act.moveToElement(resthemes).build().perform();
		WebElement costalpol= driver.findElement(By.xpath(".//*[@id='menuItemHilite13']"));
		act.moveToElement(costalpol).click().build().perform();
		
	}
public static void getscreenshot() throws IOException{
	 Date currentdate = new Date();
	 String screenShotname = currentdate.toString().replace(":","_");
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile, new File(System.getProperty("users.dir")+"\\ScreenPrint\\"+screenShotname+".png"));
}
	 
	 
	 
	
}

