package com.qtpselenium.framework.datadriven.PortFolio;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import com.qtpselenium.framework.datadriven.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class Test4 extends TestBase{

	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="PortFolioDataProvider")
	public void test4(Hashtable<String,String> table){

		validateRunmodes("Test4",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
	    table.get(Constants.RUNMODE_COL);	
	}
			
	}

