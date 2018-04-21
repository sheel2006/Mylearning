package com.qtpselenium.suiteB;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.suiteA.TestSuiteBase;
import com.qtpselenium.util.TestUtil;

public class TestCase_B1 extends TestSuiteBase {
  String runmode[];
  static int counter=-1;
	@BeforeTest
	public void checkTestSkip(){
		if(!TestUtil.isTestCaseRunnable(suiteBxls, this.getClass().getSimpleName())){
			APP_LOGS.debug("Skipping Test case"+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			throw new SkipException("Skipping Test case "+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			}
		runmode = TestUtil.getDataSetRunmodes(suiteBxls, this.getClass().getSimpleName());
		
		}
	
	@Test(dataProvider = "getTestdata")
	public void testcaseB1(String Col1,	String Col2,String Col3,String Col4){
		
		counter++;
		if(!runmode[counter].equals("Y")){
			throw new SkipException("RunMode for Test data B1 is set as No"+counter);
		}
		
		APP_LOGS.debug("Executing Test case"+  this.getClass().getSimpleName());
		APP_LOGS.debug(Col1+"----"+Col2+"----"+Col3+"----"+Col4);
	 
 }
	@DataProvider	
	   public  Object[][] getTestdata(){
		//this.getClass().getSimpleName() this return current class name
		return TestUtil.getdata(suiteBxls, this.getClass().getSimpleName());
}
}
