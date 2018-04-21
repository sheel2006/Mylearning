import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.chrome.driver","D:\\Chrome");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		//driver.findElement(By.xpath(".//*[@id='gmail-sign-in']")).submit();
	    
		WebElement email= driver.findElement(By.xpath(".//*[@id='Email']"));
				email.sendKeys("Sheel");
				//email.clear();
				System.out.println(email.getLocation().x);
				System.out.println(email.getLocation().y);
				System.out.println(email.getSize().getHeight());
				WebElement att = driver.findElement(By.xpath(".//*[@id='next']"));
				WebElement att1 = driver.findElement(By.xpath(".//*[@id='link-signup']/a"));
				System.out.println(att.getAttribute("value"))	;
				System.out.println(att1.getAttribute("value"))	;
				
				
				
				
	}

}
