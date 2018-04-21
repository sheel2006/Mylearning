package CertificateError;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class CertificateError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //define certicate error handle in firefox
		FirefoxProfile prof =new  FirefoxProfile();
		//FirefoxProfile is class
        prof.setAcceptUntrustedCertificates(true);
        prof.setAssumeUntrustedCertificateIssuer(true);
         
        
		WebDriver driver = new FirefoxDriver();
	      driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	      
	   //   use below commands to avoid certicate error in IE
	  //    driver.navigate().to("javascript:document.getElementByid('overridelink').click()");
	      
	}

}
