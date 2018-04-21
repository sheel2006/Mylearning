package com.qtpselenium.framework.datadriven.suiteA;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtp.selenium.framework.datadriven.DataDrivenFramework.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.ErrorUtil;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class Test1 extends TestBase{
 
    @BeforeTest
    public void initLogs(){
    	initLogs(this.getClass());
    
    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="suiteADataProvider")
	// Data read from suiteADataProvider, suiteADataProvider hold Testdata for suiteA 
	public static void test1(Hashtable<String,String> table){
		Application_logs.debug("Step#1.0 : Executing Test1 from SuiteA");
		/*
	Xls_Reader xls = new Xls_Reader("C:\\Sheel\\workspace\\DataDrivenFramework\\src\\test\\java\\com\\qtpselenium\\framework\\datadriven\\Xlsx\\Suite.xlsx");
    System.out.println(Utility.isSuitableRunnable("SuiteA", xls));
    Xls_Reader xls1 = new Xls_Reader("C:\\Sheel\\workspace\\DataDrivenFramework\\src\\test\\java\\com\\qtpselenium\\framework\\datadriven\\Xlsx\\SuiteA.xlsx");
    System.out.println(Utility.isTestCaseRunnable("Test1", xls1));*/
    validateRunmodes("Test1",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
    table.get(Constants.RUNMODE_COL);
    try{
    	Assert.assertEquals("A1", "B1");
    }catch(Throwable t){
    ErrorUtil.addVerificationFailure(t);	
    }
    try{
    	Assert.assertEquals("A2","A");	
    }catch(Throwable t){
        ErrorUtil.addVerificationFailure(t);	
        }
    
    
	}
	
	}
