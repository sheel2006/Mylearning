package TestRough;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderDate {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
	     driver = new FirefoxDriver();
	     driver.get("http://in.rediff.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.findElement(By.xpath(".//*[@id='homewrapper']/div[5]/a[3]/div/u")).click();
	     driver.findElement(By.xpath(" .//*[@id='wrapper']/div[2]/ul/li[2]/a")).click();
	     driver.findElement(By.xpath(".//*[@id='useremail']")).sendKeys("sheel2006@gmail.com");
	     //JavascriptExecutor js = (JavascriptExecutor)driver;
	    // js.executeScript("arguments[0].click();", driver.findElement(By.xpath(".//*[@id='emailsubmit']")));
	     driver.findElement(By.xpath(".//*[@id='emailsubmit']")).click();
	     driver.findElement(By.xpath(".//*[@id='userpass']")).sendKeys("helpdesk");
	     driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
	     driver.findElement(By.xpath(".//*[@id='addStock']")).click();
	     driver.findElement(By.xpath(".//*[@id='addstockname']")).sendKeys("Asahi India Glass Ltd.");
	     driver.findElement(By.xpath(".//*[@id='stockPurchaseDate']")).click();
	     dateselector("15/06/2014");

	}
	
	public static void dateselector(String date){
		WebElement nextyear		 = driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[5]/button"));
		WebElement prviousyear   = driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[1]/button"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		System.out.println("DateSelector--");
		String dateselect[]=date.split("/");
		int year = Integer.parseInt(dateselect[2])- Calendar.getInstance().get(Calendar.YEAR);
		if(year!=0){
			if(year>0){
				for(int i =1;i<=year;i++){
					js.executeScript("arguments[0].click();", nextyear);
					System.out.println("year>0");
				}
			}
			else if(year<0){
				for(int i =1;i<=year*(-1);i++){
					js.executeScript("arguments[0].click();", prviousyear);
					System.out.println("year<0");
				}
			}
			WebElement  nextmonth = driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button"));
			WebElement  previousmonth = driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button"));
			int month = Integer.parseInt(dateselect[1])- Calendar.getInstance().get(Calendar.MONTH);
			if(month!=0){
				if(month>0){
					for(int i =1;i<=month;i++){
						js.executeScript("arguments[0].click();", nextmonth);
						System.out.println("month>0");
					}
				}
				else if(month<0){
					for(int i =1;i<=month*(-1);i++){
						js.executeScript("arguments[0].click();", prviousyear);
	// if we dont use Javascript we get below error message
	//Element not found in the cache - perhaps the page has changed since it was looked up
						System.out.println("month<0");
			
					}
				}
			
		}
	//	List<WebElement>alldays = driver.findElements(By.xpath(""))
			
		}
	}
		
		
	

}
