package com.qtpselenium.framework.datadriven.PortFolio;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.framework.datadriven.TestBase;
import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.TestDataProvider;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class LeastPerAssetTest extends TestBase{
	 @BeforeTest
	    public void initLogs(){
	    	initLogs(this.getClass());
	    
	    }
	
	@Test(dataProviderClass =TestDataProvider.class,dataProvider ="PortFolioDataProvider")
	public void LeastPerAssetTest(Hashtable<String,String> table) throws Throwable{

		 validateRunmodes("LeastPerAssetTest",Constants.FIRST_SUITE_RUN,table.get(Constants.RUNMODE_COL));
		    Application_logs.debug("Step#2.0 : Executing Test2 from LeastPerAssetTest");
		    table.get(Constants.RUNMODE_COL);	
		    dologindefault(table.get(Constants.Browser_Col));
		    Application_logs.debug("Step#2.1 : Executing Test2 from LeastPerAssetTest");
		    String least_performing_assets= getText("Least_Perform_Assets_xpath");
		    System.out.println("leastpertext   "+least_performing_assets);
		    String temp[]      = least_performing_assets.split("\\(");
		    String companyname = temp[0].split("\\.")[0];
		    String percentage  = temp[1].split("\\)")[0].split("\\%")[0];
		    boolean stockcompany =  (check_leaset_performing_asset("stockcompany_xpath","stockcompanyies_xpath",companyname));
		    Application_logs.debug("Step#2.2 : Executing Test2 from LeastPerAssetTest");
		    boolean stockpecentage= (check_leaset_performing_asset("stockcompanypercentage_xpath","stockcompperc_xpath",percentage));
		    Application_logs.debug("Step#2.3 : Executing Test2 from LeastPerAssetTest");
		    boolean mfcompany =     (check_leaset_performing_asset("mfcompant1_xpath","mfcompant2_xpath",companyname));
		    Application_logs.debug("Step#2.4 : Executing Test2 from LeastPerAssetTest");
		    boolean mfpecentage=    (check_leaset_performing_asset("mfpercentage1_xpath","mfpercentage2_xpath",percentage));
		   // System.out.println("stockcompany  -"+stockcompany+"stockpecentage"+stockpecentage);
		    //System.out.println("mfcompany  -"+mfcompany+"mfpecentage"+mfpecentage);
		    Assert.assertTrue(stockcompany||mfcompany, "Comapany in not present in Stock and Mutual"+companyname);
		    Application_logs.debug("Step#2.5 : Executing Test2 from LeastPerAssetTest");
		    Assert.assertTrue(stockpecentage||mfpecentage, "percentage value in not present in Stock or Mutual"+percentage); 
		    Application_logs.debug("Step#2.6 : Executing Test2 from LeastPerAssetTest");
		    
	}
	@AfterMethod
	public void close(){
		driverquit();
	}
}