package com.qtpselenium.framework.datadriven.suiteA;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.qtp.selenium.framework.datadriven.DataDrivenFramework.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;

public class Test5 extends TestBase {

	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="suiteADataProvider")
	public void test5(Hashtable<String,String> table){
		validateRunmodes("Test5",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
	    table.get(Constants.RUNMODE_COL);	
	}
}
