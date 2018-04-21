package DropList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropListSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/");
		WebElement  element =driver.findElement(By.xpath(".//*[@id='nav_grp']/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		driver.findElement(By.xpath(".//*[@id='nav_grp']/li[3]/div[2]/ul/li[1]/ul/li[4]/a")).getText();
	}

}
