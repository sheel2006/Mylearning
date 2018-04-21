import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BBC_Links_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.bbc.com");
		//driver.findElement(By.xpath(".//*[@id='orb-nav-links']/ul/li[1]/a")).click();
		//"Shop" or "Sport" link name in webpage
		String URL = driver.findElement(By.linkText("Sport")).getAttribute("href");
		System.out.println("URL value  -->"+URL);
		
		driver.findElement(By.linkText("Sport")).click();
		//driver.findElement(By.xpath("//a[text()='News']")).click();
		//driver.findElement(By.partialLinkText("jungle")).click();
		//partialLinkText will search"jungle" on webpage and case sentitive and if page have mutilple "jungle"
		//then webdriver will click on 1st "jungle" and cant print second jungle
		driver.close();
	}

}
