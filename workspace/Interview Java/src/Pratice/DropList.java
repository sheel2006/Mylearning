package Pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.w3schools.com/html/html_tables.asp");
	List<WebElement>ls = driver.findElements(By.xpath(".//*[@id='main']/table[1]/tbody/tr/th[1]"));
	for(int i=2;i<ls.size();i++){
		System.out.println(ls.get(i).getText());
	}
	}

}
