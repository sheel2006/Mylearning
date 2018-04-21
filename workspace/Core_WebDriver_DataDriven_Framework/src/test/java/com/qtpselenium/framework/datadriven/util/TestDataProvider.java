package com.qtpselenium.framework.datadriven.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.qtpselenium.framework.datadriven.TestBase;



public class TestDataProvider extends TestBase {

	@DataProvider(name="PortFolioDataProvider")
	//Method m reflection class concept
	public static Object[][] getDataSuiteA(Method m){
		TestBase.init();
		Xls_Reader xls = new Xls_Reader(prop.getProperty("xlsfilelocation")+Constants.PortFoliosuite);
		return Utility.getData(m.getName(), xls);
		 // m.getName() will return back ..test1 or Test1 name from SuiteA  
		
		
	}
	
	@DataProvider(name="StockSuiteDataProvider")
	//Method m reflection class concept
	public static Object[][] getDataSuiteB(Method m){
		TestBase.init();
		Xls_Reader xls = new Xls_Reader(prop.getProperty("xlsfilelocation")+Constants.StockSuite);
		return Utility.getData(m.getName(), xls);
		 // m.getName() will return back ..test1 or Test1 name from SuiteA  
		
		
	}
	@DataProvider(name="suiteCDataProvider")
	//Method m reflection class concept
	public static Object[][] getDataSuiteC(Method m){
		TestBase.init();
		Xls_Reader xls = new Xls_Reader(prop.getProperty("xlsfilelocation")+Constants.THIRD_SUITE);
		return Utility.getData(m.getName(), xls);
		 // m.getName() will return back ..test1 or Test1 name from SuiteA  
		
		
	}
}
