package WebTable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	
public class WebTablewithRedif {
	static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* tr tag represent as rows
 * td tag represent cells
 * table[@class='datatable']                      complete table
 * table[@class='datatable']/tbody/td[2]/tr[3]    2nd rows and 3 cell
 * table[@class='datatable']/tbody/td[2] 		  each cell od 2nd rows
 * table[@class='datatable']/tbody/tr        --	  All rows of table
 * table[@class='datatable']/tbody/tr/td          All the cell of table
 * ====================================================================== 
 * CSS selector
 * table[class='datatable']
 * table[class='datatable'] tbody td:nth-child(2) tr:nth-child(3)
 * table[class='datatable'] tbody td:nth-child(3)
 */
		  driver = new FirefoxDriver();
	     // driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	      driver.navigate().to("http://money.rediff.com/gainers");
	      List<WebElement>companyname=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	      List<WebElement>listprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	     for(int i =0; i<companyname.size();i++){
	    	 System.out.println("companyname --"+companyname.get(i).getText()+"========"+"Price value--"+listprice.get(i).getText());
	     break;
	     }
	     int rows = getRowsColumncoun("10.18");
	     System.out.println("Present in Rows--"+rows);
	     
	     }
 public static int getRowsColumncoun(String data){
	int rows =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	int col =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size(); 
	System.out.println("Total Rows--"+rows);
	System.out.println("Total col--"+col);
	
	for(int rNum=1;rNum<=rows;rNum++){
	List<WebElement> rowcell=	driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+rNum+"]/td"));
	//	System.out.println("Total cell value "+rowcell.size());
	for(int cNum=0;cNum<rowcell.size();cNum++){
	    	String text = rowcell.get(cNum).getText();
	    	if(text.equals(data))
	    		return rNum;
	    	  }
		System.out.println("");
		}
	return 0;
	 }
	  }
 


