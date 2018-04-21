package com.qtpselenium.framework.datadriven.util;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.qtp.selenium.framework.datadriven.DataDrivenFramework.TestBase;

public class TestDataProvider extends TestBase {

	@DataProvider(name="suiteADataProvider")
	//Method m reflection class concept
	public static Object[][] getDataSuiteA(Method m){
		TestBase.init();
		Xls_Reader xls = new Xls_Reader(prop.getProperty("xlsfilelocation")+Constants.FIRST_SUITE);
		return Utility.getData(m.getName(), xls);
		 // m.getName() will return back ..test1 or Test1 name from SuiteA  
		
		
	}
	
	@DataProvider(name="suiteBDataProvider")
	//Method m reflection class concept
	public static Object[][] getDataSuiteB(Method m){
		TestBase.init();
		Xls_Reader xls = new Xls_Reader(prop.getProperty("xlsfilelocation")+Constants.SECOND_SUITE);
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
