import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Bulk_Export_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		WebElement thirdLink = allLinks.get(4);
		System.out.println(thirdLink);
		System.out.println("Text inside links---: "+thirdLink.getText());
		System.out.println(thirdLink.getAttribute("value"));
		int x = thirdLink.getLocation().x;
		System.out.println(x);
		
		for(int i = 0; i<allLinks.size();i++){
			System.out.println(allLinks.get(i).getText());
		// from this output link can be blank, under below condidtions
	    //	1. No text
		//	2. image
		//	3.  or Link is hidden
		 //to check elemnet is hidden or not
			System.out.println(allLinks.get(i).getText()+"========="+allLinks.get(i).isDisplayed());
			
		//	System.out.println(allLinks.get(i).getText()+"========="+allLinks.get(i).isEnabled());
			
		}
		//driver.close();
		
	}

}
