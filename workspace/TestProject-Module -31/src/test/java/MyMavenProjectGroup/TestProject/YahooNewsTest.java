package MyMavenProjectGroup.TestProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class YahooNewsTest {
  
  @BeforeTest
  public void xyz() {
	  System.out.println("In YahooNewsTest-beforeTest");
	 // throw new SkipException("Skip this Test");
	  // This is way to Skip test batch by using exception
  }
  @Test
  public void TestNews() {
	  //Selenium Code
	  // expected value and actual value or link is present
	  // If any assertion failed, after that no assertion executed 
	  // for example assertEquals failed control will not move to assertTrue or assertfalse,
	  // To handle the control use try and catch block to continue our test
	  System.out.println("Before asseration");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.google.com");
	 driver.quit();
	  
  }
// Now we want to run YahooNewsTest and YahooTest in a Batch so we will use testng.xml
}
