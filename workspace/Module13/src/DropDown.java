import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown {
// select , count,print,find the select
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://qtpselenium.com/home/contact_trainer");
		WebElement droplist = driver.findElement(By.name("country_id"));
		droplist.sendKeys("Angola");	
		
		List<WebElement> links = driver.findElements(By.tagName("option"));
		System.out.println(links.size());
		for(int i =1; i<links.size();i++){
			System.out.println(links.get(i).getText());
		
		//Print the selected opetions
			System.out.println(links.get(i).getAttribute("selected"));
		}
	}

}
