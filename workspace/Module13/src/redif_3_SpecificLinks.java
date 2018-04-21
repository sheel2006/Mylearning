import java.io.IOException;
import java.util.List;

import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class redif_3_SpecificLinks {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		//*[@id='popular_cat']/h3[1]/a
		//*[@id='popular_cat']/h3[2]/a
		//*[@id='popular_cat']/h3[3]/a
		//*[@id='popular_cat']/h3[14]/a
		// we can use below xpath to get all values
		/*//a represent all the link in webpage
		 * */
		
		List<WebElement>links = driver.findElements(By.xpath(".//*[@id='popular_cat']/h3/a"));
		System.out.println(links.size());
		for(int i =0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			//Now click on every webpage and get titile.After that back to main page
			links.get(i).click();
			System.out.println(driver.getTitle());
			// StaleElementReferenceException: Element not found in the cache -- this error will be comes 
			// because webpage is not avilable in cache memory.
			// Next two lines code handle cache memory problem 
			 driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon"); 
			 links = driver.findElements(By.xpath(".//*[@id='popular_cat']/h3/a"));
			}
		driver.close();
		
	}
	
	// To check URL is working or not we have to use fluent-hc-4.2.1 jars
	

}
