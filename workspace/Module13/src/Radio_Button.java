import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radio_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement>all_radio = driver.findElements(By.name("group1"));
		
		System.out.println("Total no of Radio button -"+all_radio.size());
		System.out.println("Selected Radio button "+all_radio.get(0).getAttribute("checked"));
		System.out.println("Selected Radio button "+all_radio.get(1).getAttribute("checked"));
		System.out.println("Selected Radio button "+all_radio.get(2).getAttribute("checked"));
		all_radio.get(0).click();
		System.out.println("Selected Radio button "+all_radio.get(0).getAttribute("checked"));
		System.out.println("Selected Radio button "+all_radio.get(1).getAttribute("checked"));
		System.out.println("Selected Radio button "+all_radio.get(2).getAttribute("checked"));
		driver.close();
		}
	}


