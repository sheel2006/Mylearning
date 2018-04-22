package com.qtpselenium.core.hybrid.core_hybrid_testcases;


import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.core.hybrid.Core_Hybrid_Framework.Keywords;
import com.qtpselenium.core.hybrid.core_hybrid_util.DataUtil;
import com.qtpselenium.core.hybrid.core_hybrid_util.DefaultConstant;
import com.qtpselenium.core.hybrid.core_hybrid_util.ExtentManager;
import com.qtpselenium.core.hybrid.core_hybrid_util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class GmailLogin {
	
	String testname ="GmailTest";
	ExtentReports report = ExtentManager.getInstance();// Call from ExtentManager
	ExtentTest test = report.startTest(testname);//Call from ExtentManager
	Xls_Reader xls = new Xls_Reader(DefaultConstant.SUITEA_XLS);
	
	@Test(dataProvider="getData")
	public void dologin(Hashtable<String,String>data){
		test=report.startTest(testname);
		test.log(LogStatus.INFO, data.toString());//Print data value in report
		if(DataUtil.isRunnable(xls, testname)||data.get("Runmode").equals("N")){
			test.log(LogStatus.SKIP, "Skipping Test as RunMode set as N");
			throw new SkipException("Skip exception Raise,RunMode set as N");
		}
		test.log(LogStatus.INFO, "Starting Gmail Login");//Call from ExtentManager
		Keywords app = new Keywords(test);
		test.log(LogStatus.INFO, "Executing Keywords");
		app.executeKeywords(testname, xls,data);
		test.log(LogStatus.PASS, "Gmail Login Test Pass");
		app.getGenericKeyWords().reportfailure("Failure in dologin");
		
		
		}
	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testname);

	}
		
	
	@AfterTest
	public void quit(){
		if(report!=null){
		report.endTest(test);
		report.flush();
		}
		
	//This will alway quit test even fail or pass and event will capture in report.
		
	}
}
