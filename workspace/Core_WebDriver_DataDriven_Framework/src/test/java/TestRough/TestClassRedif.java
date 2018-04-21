package TestRough;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassRedif {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      driver = new FirefoxDriver();
     driver.get("http://in.rediff.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.xpath(".//*[@id='homewrapper']/div[5]/a[3]/div/u")).click();
     driver.findElement(By.xpath(" .//*[@id='wrapper']/div[2]/ul/li[2]/a")).click();
     driver.findElement(By.xpath(".//*[@id='useremail']")).sendKeys("sheel2006@gmail.com");
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//*[@id='emailsubmit']")));

    // driver.findElement(By.xpath(".//*[@id='emailsubmit']")).click();
     driver.findElement(By.xpath(".//*[@id='userpass']")).sendKeys("helpdesk");
     driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
     String xpath1="//div[@id='stockdiv']/table/tbody/tr[";
     String xpath2="]/td[2]/span/a";
     String xpath11="//div[@id='stockdiv']/table/tbody/tr[";
     String xpath12="]/td[10]/span";
     
     String mfxpath1="//div[@id='mfdiv']/table/tbody/tr[";
     String mfxpath2="]/td[2]/span/a";
     String mfxpath11="//div[@id='mfdiv']/table/tbody/tr[";
     String mfxpath22="]/td[9]/span";
     
     boolean x= isElementtext(xpath1,xpath2,"hello india");
     System.out.println("value of x  "+x);
    /// isElementtext(xpath11,xpath12);
     //isElementtext(mfxpath1,mfxpath2);
     //isElementtext(mfxpath11,mfxpath22);
             
     }
	
	public static boolean isElementPresent(String xpath){
		int count = driver.findElements(By.xpath(xpath)).size();
		if(count==0)
			return false;
		else 
			return true;
	}
	
	public static boolean isElementtext(String xpath1,String xpath2, String instance){
		int i =1;
		//boolean company_name = false;
	     while(isElementPresent(xpath1+i+xpath2)){
	    	String company_text = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
	    	if(company_text.contains(instance)){
	    		System.out.println("with true");
	    		return true;}
	    		else
	    			System.out.println("with false");
	    			return false;
	    	
	    	}
	    	 i++;
	    	// System.out.println("company_name   "+company_name);
	    	
	     
		return true;
	  
	}

	    
	}
	


