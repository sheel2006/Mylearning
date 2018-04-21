package com.qtpselenium.framework.datadriven.suiteA;

import java.util.Hashtable;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtp.selenium.framework.datadriven.DataDrivenFramework.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class Test2 extends TestBase{
   
	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="suiteADataProvider")
	public void test2(Hashtable<String,String> table){

		 validateRunmodes("Test2",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		    table.get(Constants.RUNMODE_COL);	
	}
}
