package test.encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AccountSummary {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.altoromutual.com/bank/login.aspx");
    driver.findElement(By.xpath(".//*[@id='uid']")).sendKeys("jsmith");
    driver.findElement(By.xpath(".//*[@id='passw']")).sendKeys("Demo1234");
    driver.findElement(By.xpath(".//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
    driver.findElement(By.xpath(".//*[@id='listAccounts']")).click();
    WebElement Element =driver.findElement(By.xpath(".//*[@id='listAccounts']/option[2]"));
    Actions act = new Actions(driver);
    act.moveToElement(Element).doubleClick().build().perform();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//*[@id='btnGetAccount']")).sendKeys(Keys.ENTER);
    
	}

}
