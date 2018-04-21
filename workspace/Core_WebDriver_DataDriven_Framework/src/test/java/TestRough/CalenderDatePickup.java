package TestRough;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CalenderDatePickup {
	static WebDriver driver;
	@Test
	public static void main(String[] args) {
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
		
		String expecteddate = "8/04/2013";
	    System.out.println("PurchaseDate "+expecteddate);
	    Date currentdate = new Date();
	      //String expecteddate= "";
	    SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/yyyy");
	    Date dateToBeselected = null;
	      try {
			 dateToBeselected = formatdate.parse(expecteddate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	     System.out.println(currentdate);
	     System.out.println(dateToBeselected);
	     System.out.println(currentdate.after(dateToBeselected));
	      
	      String month = new SimpleDateFormat("MMMM").format(dateToBeselected);
	      Calendar cal = Calendar.getInstance();
	      cal.setTime(dateToBeselected);
	      int year = cal.get(Calendar.YEAR);
	      int day = cal.get(Calendar.DAY_OF_MONTH);// Select date form PurchaseDate
	      String month_year_expected = month+" "+year;
	      System.out.println("month_year_expected =" +month_year_expected);
	      while(true){
	    	  String month_year_Displayed = driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[3]/div")).getText();                 
	       	  if(month_year_Displayed.equals(month_year_expected))
	    		  break;//correct month
	    	  if(currentdate.after(dateToBeselected))
	    		  driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button")).click();
	    	  else
	    		  driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button")).click();
	    		  
	      }
	     driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
	     driver.findElement(By.xpath(".//*[@id='addstockqty']")).sendKeys("10");
	     driver.findElement(By.xpath(".//*[@id='addstockprice']")).sendKeys("20");
	     try{
	    	 
	     driver.findElement(By.id("addStockButton")).click();
	     //Actions act = new Actions(driver);
	     //act.moveToElement(xyz).sendKeys(Keys.ENTER);
	     System.out.println(" clicking on button");
	     }catch(Exception e){
	    	 System.out.println("Failed to click");
	    	 
	     }
	   
	     
	}

}
