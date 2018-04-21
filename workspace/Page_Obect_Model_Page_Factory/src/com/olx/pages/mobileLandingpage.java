package com.olx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mobileLandingpage {

	@FindBy(xpath=".//*[@id='headerLogo']")
	public WebElement olxhome;
	@FindBy(xpath=".//*[@id='cat-1411']/span")
	public WebElement olxmobilelink;
	@FindBy(xpath=".//*[@id='cat-1453']")
	public WebElement olxmobile;
	
	public void gotohomeprofile(){
		olxhome.click();
		olxmobilelink.click();
		olxmobile.click();
	}
}
