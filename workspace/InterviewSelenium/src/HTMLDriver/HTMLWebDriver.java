package HTMLDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://google.com");
		driver.findElement(arg0)
		System.out.println("Title of print :"+driver.getTitle());
	}

}
