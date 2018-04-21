package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olx.pages.mobileLandingpage;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath =".//*[@id='my-account-link']/div")
	public WebElement loginlink;
	@FindBy(xpath=".//*[@id='userEmail']")
	public static WebElement username;
	@FindBy(xpath=".//*[@id='userPass']")
	public static WebElement password;
	
	public LoginPage(WebDriver dr){
		//Construtor 
		driver=dr;
	}
		
	
	public mobileLandingpage dologin(String username,String password){
	    driver.get("https://www.olx.in/");
		Actions act = new Actions(driver);
		act.moveToElement(loginlink).click().build().perform();
		LoginPage.username.sendKeys("yashilu2001@yahoo.co.in");
		LoginPage.password.sendKeys("285849");
		mobileLandingpage landingpage= PageFactory.initElements(driver, mobileLandingpage.class);
	    landingpage.gotohomeprofile();
		return landingpage;
	}

}
