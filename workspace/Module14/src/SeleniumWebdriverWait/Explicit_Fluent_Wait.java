package SeleniumWebdriverWait;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_Fluent_Wait {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    //This will be global wait time to load page 15 seconds after that "NoSuchElement found exception found"
    
    driver.get("http://www.makemytrip.com/holidays/international/search?depCity=&isDestHoliday=true&selectedTabName=&dest=Thailand&channel=ONSITE&intid=OBTLP_row3b_OBT_Thailand");
	driver.findElement(By.xpath(".//*[@id='depCity_overlay_dynamic_interstitial']/div[2]/div/input")).sendKeys("Bangalore");
	driver.findElement(By.id("selectCity_btn_inter")).click();
	
	//Webdriver wait(imporatant) and Fluent wait
	//.//*[@id='package_section_18315']/div[1]/div/a
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='package_section_18315']/div[1]/div/a")));
	
	/* Fluent wait
	FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
	fwait.wait(10);
	fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='package_section_18315']/div[1]/div/a")));
		*/
	/*
	 * Thread.sleep()
	 */
	 */
	}

}
