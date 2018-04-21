package Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFrame {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame(arg0);
		List<WebElement>ls = driver.findElements(By.tagName("frame"));
		for(int i = 0 ; i<ls.size();i++){
			System.out.println(ls.get(i).getSize());
			
			Select sl = new Select(null);
			driver.findElement(By.)
		}
		
	}

}
