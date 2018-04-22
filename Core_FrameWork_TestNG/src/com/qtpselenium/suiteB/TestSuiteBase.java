package com.qtpselenium.suiteB;

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
		// this (TestUtil.isTestCaseRunnable(suiteXls, "A suite") will be returned as true if executable is set as "Y" if return false then control will be move
		// we want to check here test suite skipped or not 
		initialize();// we have use this always
		APP_LOGS.debug("Step-7 : Checking RunMode of suite B");
				if(!TestUtil.isSuitableRunnable(suiteXls, "B Suite")){
					APP_LOGS.debug("Step-8 : RunMode of Suite B is set as 'No'");	
						throw new SkipException("RunMode of Suite B set as no,So skipping all test in suite B") ;
		}
}
}

