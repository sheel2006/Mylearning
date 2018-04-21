import java.io.IOException;
import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class redif_2_SpecificLinks {
 static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		String xpath1=".//*[@id='popular_cat']/h3[";
		String xpath2="]/a";
		
		int i=1;
		while(isElementPresent(xpath1+i+xpath2)){
			String url=driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
			System.out.println("Text in URL ==="+url);
			String URL= driver.findElement(By.xpath(xpath1+i+xpath2)).getAttribute("href");
			System.out.println("values of URL  --"+URL);
			getresponcecode(URL);
			driver.findElement(By.xpath(xpath1+i+xpath2)).click();
			driver.navigate().back();
			i++;
		}
		driver.close();
		
	}
	public static boolean isElementPresent(String path){
	List<WebElement> links = driver.findElements(By.xpath(path));
	if(links.size()==0)
		return false;
	else
		return true;
	}
	
	
	public static boolean getresponcecode(String url){
		int resp_code =0;
		try {
			int resp_code1 = Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("Get responce Code =="+resp_code1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(resp_code==200)
			return true;
			else
				return false;
		
	}

}
