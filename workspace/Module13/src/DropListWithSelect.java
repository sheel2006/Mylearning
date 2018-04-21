import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropListWithSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver  driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://qtpselenium.com/home/contact_trainer");
		WebElement droplist = driver.findElement(By.name("country_id"));
		Select sel = new Select(droplist);
		sel.selectByValue("Angola");
	}

}
