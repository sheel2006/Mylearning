package Core_WebDriver_DataDriven_Framework.TestReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestReports  extends capturescreenshot{

	static ExtentReports report;
	static ExtentTest    logger;
	static WebDriver     driver;
	@Test
	public void verifytitle(){
		
		report = new ExtentReports(System.getProperty("user.dir")+"\\TestReport\\Test.html");
		logger = report.startTest("verifytitle");
		driver = new FirefoxDriver();
		logger.log(LogStatus.INFO, "Broswer starts");
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=HsndVt6MDPTI8Ael-rSQBA&gws_rd=ssl");
		logger.log(LogStatus.INFO, "Application  starts");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Hello"));
		logger.log(LogStatus.PASS, "Title verified");
		driver.close();
		
	}

	
	@AfterMethod
	public static void screenshot(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path = capturescreenshots(driver,result.getName());
			String image_path = logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, "Title verification",image_path);
		}
		report.endTest(logger);
		report.flush();
		driver.get("C:\\Sheel\\workspace\\TestReports\\TestReport\\Test.html");
		}

	}


