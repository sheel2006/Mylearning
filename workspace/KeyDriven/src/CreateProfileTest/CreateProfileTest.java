package CreateProfileTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateProfileTest {

@Test
public void CreateProfileTest(){
	WebDriver driver = null;
	driver = new FirefoxDriver();
	driver.get("http://money.rediff.com/index.html");
	driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
	driver.findElement(By.xpath(".//*[@id='useremail']")).sendKeys("sheel2006@gmail.com");
	driver.findElement(By.xpath(".//*[@id='emailsubmit']")).click();
	driver.findElement(By.xpath("//input[@id='userpass'] or [@name='passwd'] or [@class='input']")).sendKeys("helpdesk");
	driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
	driver.findElement(By.xpath(".//*[@id='createPortfolio']")).click();
	driver.findElement(By.xpath(".//*[@id='create']")).sendKeys("TestPortfolio");
	
	
	
}

}
