package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

import com.olx.pages.mobileLandingpage;

public class LoginTest {
	
	public static void main(String[] args) {
//		System.getProperty("webdriver.chrome.driver","C:/Selenium Grid/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		mobileLandingpage landingPage= lp.dologin("xx", "yyy");
		landingPage.gotohomeprofile();
	}

}
