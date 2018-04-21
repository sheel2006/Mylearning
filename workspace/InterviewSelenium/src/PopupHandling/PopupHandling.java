package PopupHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver dri = new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set s = dri.getWindowHandles();
		Iterator it =s.iterator();
		System.out.println("Main Window Id --"+it.next());
		dri.navigate().to("http://www.vodafone.in/home-mumbai");
		String text =dri.findElement(By.xpath(".//*[@id='ctl00_PlaceHolderMain_Home_dvMobilePromo']/div[1]/img")).getAttribute("title");
		System.out.println(text);
	}

}
