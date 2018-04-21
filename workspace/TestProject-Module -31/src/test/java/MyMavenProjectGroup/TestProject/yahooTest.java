package MyMavenProjectGroup.TestProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class yahooTest {

	@Test
	public void yahootestlogin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.quit();
		
	}
	}

