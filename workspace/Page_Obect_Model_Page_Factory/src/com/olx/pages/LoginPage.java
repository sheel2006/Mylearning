package com.olx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		
	
	public MainLandingPage dologin(String username,String password){
		
		driver.get("https://www.olx.in/");
		loginlink.click();
		LoginPage.username.sendKeys("yashilu2001@yahoo.co.in");
		LoginPage.password.sendKeys("285849");
		MainLandingPage landingpage= PageFactory.initElements(driver, MainLandingPage.class);
		return landingpage;
		
	}

}
