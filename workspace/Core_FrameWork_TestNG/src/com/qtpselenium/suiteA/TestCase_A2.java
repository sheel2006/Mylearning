package com.qtpselenium.suiteA;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.util.TestUtil;

/* For every test suite we have use inheritance of class TestSuiteBase.java and this extension of TestBase.java
*/
public class TestCase_A2 extends TestSuiteBase {
    String runmode[];
    static int counter =-1;
	
	//this.getClass().getSimpleName() give class name as "TestCase_A2"
	@BeforeTest
	public void checkTestSkip(){
		if(!TestUtil.isTestCaseRunnable(suiteAxls, this.getClass().getSimpleName())){
			APP_LOGS.debug("Skipping Test case"+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			throw new SkipException("Skipping Test case "+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			}
		runmode = TestUtil.getDataSetRunmodes(suiteAxls, this.getClass().getSimpleName());
		
		}
	
	//Col1,Col2,col3 depends on excel-sheet (A suite) and tab name TestCase_A2
	@Test(dataProvider ="getTestdata")
	public void testcaseA2(String Col1,
						   String Col2,
						   String Col3){
		counter++;
		if(!runmode[counter].equals("Y")){
			throw new SkipException("RunMode for Test data A2 is set as No"+counter);
		}
		APP_LOGS.debug("Executing Test case"+  this.getClass().getSimpleName());
		APP_LOGS.debug(Col1+"----"+Col2+"-----"+Col3);
	 
 }
	@DataProvider
	public Object [][] getTestdata(){
		return TestUtil.getdata(suiteAxls, this.getClass().getSimpleName());
		
	}
	
}
