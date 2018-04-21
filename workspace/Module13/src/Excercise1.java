import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Excercise1 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.americangolf.co.uk/golf-clubs/fairway-woods");
    String path1 =".//*[@id='secondary']/div[1]/div[3]/div/ul/li[";
    String path2 ="]/a/span[@class='refinement-count']";
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    int i =1;
    while(isElementpresent(path1+i+path2)){
     String str = driver.findElement(By.xpath(path1+i+path2)).getText();
     System.out.println(str);
     i++;
    }
    driver.close();
    
    
	}
  public static boolean isElementpresent(String path){
  System.out.println("value of xpath----"+path);
	List<WebElement> link = driver.findElements(By.xpath(path));
	System.out.println("Size of path---"+link.size());
	if(link.size()==0)
		return false;
	else
		return true;
				
  }
  
}
