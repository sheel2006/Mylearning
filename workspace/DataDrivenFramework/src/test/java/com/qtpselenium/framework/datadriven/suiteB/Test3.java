package com.qtpselenium.framework.datadriven.suiteB;

import java.util.Hashtable;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qtp.selenium.framework.datadriven.DataDrivenFramework.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;

public class Test3 extends TestBase{

	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="suiteBDataProvider")
	public void test3(Hashtable<String,String> table){

		 validateRunmodes("Test3",Constants.SECOND_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		    table.get(Constants.RUNMODE_COL);	
	}

}
