package com.qtpselenium.suiteB;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtpselenium.suiteA.TestSuiteBase;
import com.qtpselenium.util.TestUtil;

public class TestCase_B2 extends TestSuiteBase {
 
	@BeforeTest
	public void checkTestSkip(){
		if(!TestUtil.isTestCaseRunnable(suiteBxls, this.getClass().getSimpleName())){
			APP_LOGS.debug("Skipping Test case"+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			throw new SkipException("Skipping Test case "+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			}
		}
	@Test
	public void testcaseB2(){
		System.out.println(" Inside Test case testcaseB2");
	 
 }
	
/* No TestData is present for testcaseB2 so we are not using data provider.
 * so we can read the data from excel sheet
 */
	
}
