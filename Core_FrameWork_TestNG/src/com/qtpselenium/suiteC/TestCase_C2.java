package com.qtpselenium.suiteC;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtpselenium.util.TestUtil;

public class TestCase_C2 extends TestSuiteBase{
	
	@BeforeTest
	public void checkTestSkip(){
		if(!TestUtil.isTestCaseRunnable(suiteCxls, this.getClass().getSimpleName())){
			APP_LOGS.debug("Skipping Test case"+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			throw new SkipException("Skipping Test case "+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			}
		}
	@Test
	public void testcaseC2(){
		System.out.println(" Inside Test case testcaseC2");
	 
 }

}
