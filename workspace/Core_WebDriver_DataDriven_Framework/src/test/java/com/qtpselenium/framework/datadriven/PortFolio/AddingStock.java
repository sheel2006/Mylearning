package com.qtpselenium.framework.datadriven.PortFolio;

import java.util.Hashtable;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





import com.qtpselenium.framework.datadriven.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class AddingStock extends TestBase {
	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="PortFolioDataProvider")
	public void test3(Hashtable<String,String> table) throws Throwable{

		 validateRunmodes("AddingStock",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		    Application_logs.debug("Step#2.0 : Executing Test2 from LeastPerAssetTest");
		    table.get(Constants.RUNMODE_COL);	
		    dologindefault(table.get(Constants.Browser_Col));	
	}
	
}
