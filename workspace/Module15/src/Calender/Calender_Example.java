package Calender;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Calender_Example {
  static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.navigate().to("http://www.makemytrip.com/");
	      driver.findElement(By.xpath(".//*[@id='start_date_sec']")).click();
	      selectdate("03/08/2016");
	      
	}
 public static void selectdate(String date) throws Throwable{
	 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	 Date dateToBeSelected = df.parse(date);
	 Date currentDate = new Date();
	 String monthToBeDisplayed = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div")).getText();
	 //this xpath from calender which displays current month and year
	 System.out.println("dateToBeDisplayed--"+monthToBeDisplayed);
	 String month = new SimpleDateFormat("MMMM").format(dateToBeSelected);
	 String year  = new SimpleDateFormat("YYYY").format(dateToBeSelected);
	 String day   = new SimpleDateFormat("d").format(dateToBeSelected);
	 String monthyearToBeSelected = month+" "+year;
	 System.out.println("monthyearToBeSelected----"+monthyearToBeSelected);
	while(true){
		 if(monthyearToBeSelected.equals(monthToBeDisplayed)){
			 //select date in calender
			 driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
			  
			 System.out.println("Found Selected");
			 break;
		 }else{//navigate to correct month, 
			 //if selected date is greater then current date then we have move or click on next month
			 
			 if	(dateToBeSelected.after(currentDate)){
				/* WebDriverWait wait = new WebDriverWait(driver,1000);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a")));
				*/ driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
			 }
			//if selected date is less then current date then we have move back by clicking on month icon
			 else{
				 driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
			 }
				 
		 }
		 monthToBeDisplayed = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div")).getText(); 
		
	}
	
	 
	 
	 	
	 
 }
}
