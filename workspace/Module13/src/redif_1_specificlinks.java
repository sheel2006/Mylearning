import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class redif_1_specificlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		WebElement box = driver.findElement(By.xpath(".//*[@id='popular_cat']"));
		List<WebElement>allList = box.findElements(By.tagName("a"));
		for(int i =0;i<allList.size();i++){
		System.out.println(allList.get(i).getText());
		//Now click on every webpage and get titile.After that back to main page
		allList.get(i).click();
		System.out.println(driver.getTitle());
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		// StaleElementReferenceException: Element not found in the cache -- this error will be comes 
		// because webpage is not avilable in cache memory.
		// Next two lines code handle cache memory problem 
		box = driver.findElement(By.xpath(".//*[@id='popular_cat']"));	
		 allList = box.findElements(By.tagName("a"));
		}
	}
}
