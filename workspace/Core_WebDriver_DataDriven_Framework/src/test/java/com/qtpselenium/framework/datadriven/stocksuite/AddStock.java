package com.qtpselenium.framework.datadriven.stocksuite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.framework.datadriven.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class AddStock extends TestBase {
	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	 
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="StockSuiteDataProvider")
	public void AddStock(Hashtable<String,String> table) throws Throwable{

		 validateRunmodes("AddStock",Constants.SECOND_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		    Application_logs.debug("Step#2.0 : Executing from Stock Suite ");
		    table.get(Constants.RUNMODE_COL);	
		    dologindefault(table.get(Constants.Browser_Col));
		    Actions act = new Actions(driver);
		    WebElement addstock = driver.findElement(By.xpath(".//*[@id='addStock']"));
		    act.moveToElement(addstock).click().build().perform();
		    // click("addstock");
		    Application_logs.debug("Step#2.1 : Click on addStock ");
		    input("stockname_xpath",table.get("Stock Name"));
		    Application_logs.debug("Step#2.2 : extract value from calender ");
		    click("stockcalender_xpath");
		    String expecteddate = table.get("PurchaseDate");
		    System.out.println("PurchaseDate "+expecteddate);
		    Date currentdate = new Date();
		      //String expecteddate= "8/04/2013";
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
		    	  String month_year_Displayed = getText("monthAndYearText_xpath");
		       	  if(month_year_Displayed.equals(month_year_expected))
		    		  break;//correct month
		    	  if(currentdate.after(dateToBeselected))
		    		  click("calenderBack_xpath");
		    	  else
		    		  click("calenderFront_xpath");
		    		  
		      }
		     driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
		     
		     input("stockQuantity_xpath",table.get("Quantity"));
		     Application_logs.debug("Control in Quantity");
		     input("stockPurchaseprice_xpath",table.get("PurchasePrice"));
		     Application_logs.debug("Control in PurchasePrice");
		     click("Stock_add");
		     Application_logs.debug("Control in Stock_add");
		     // JavascriptExecutorclick("stockaddbutton_xpath");
		     //click("stockaddbutton_xpath");
		    // driver.findElement(By.xpath(".//*[@id='addStockButton']")).click();
		     //WebElement addstocked = driver.findElement(By.xpath("html/body/b/div[6]/form/div[2]/div/div[1]/div[6]/div/input"));
			// act.moveToElement(addstocked).click().build().perform();
	}
	
	
}
