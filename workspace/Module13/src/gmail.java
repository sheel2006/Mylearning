import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("xxx");
		String text = driver.findElement(By.id("Email")).getText();
		//get text give value if text is visible on page
		System.out.println("Get text value--"+text);
		String val =driver.findElement(By.id("Email")).getAttribute("value");
		System.out.println("Get attributes value "+val);
		
		String text1 = driver.findElement(By.xpath("//div[@class='banner']/h1")).getText();
		System.out.println("value of visable text "+text1);
		driver.close();
	
		
		
		
		
	}

}
