package com.qtpselenium.suiteC;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.qtpselenium.base.TestBase;
import com.qtpselenium.util.TestUtil;
/* For every test suite we have use inheritance of class TestBase.java
 */
public class TestSuiteBase extends TestBase {
	
	@BeforeSuite
	public void checkSuiteSkip() throws Throwable{
		//suiteXls is object of excel file from TestBase Class which initialized
		// this (TestUtil.isTestCaseRunnable(suiteXls, "C Suite") will be returned as true if executable is set as "Y" if return false then control will be move
		// we want to check here test suite skipped or not 
		initialize();// we have use this always
		APP_LOGS.debug("Step-9 : Checking RunMode of suite C");
				if(!TestUtil.isSuitableRunnable(suiteXls, "C Suite")){
					APP_LOGS.debug("Step-10 : RunMode of suite C is set as 'No'");	
						throw new SkipException("RunMode of Suite C set as no,So skipping all test in suite C") ;
		}
}
}
