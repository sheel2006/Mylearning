package com.qtpselenium.util;

public class TestUtil {
// Function to check  Run mode of a Test Suite - isSuiteRunnable
// using three excel sheet from com.qtpselenium.xls	
  
public static boolean isSuitableRunnable(Xls_Reader xls,String suiteName )

//"Test suite" tab name in excel sheet "Suite". "TSID","RunMode" column name in Suite.xlsx
	 {
		 boolean isExecutable= false;
		 	for(int i=2;i<=xls.getRowCount("Test suite");i++){
		 		String suite 	= xls.getCellData("Test suite", "TSID", i);
		 		String runmode	= xls.getCellData("Test suite", "RunMode", i);
				if(suite.equalsIgnoreCase(suiteName))
				{
					if (runmode.equalsIgnoreCase("Y"))
					{
						isExecutable = true;
					}else
						{
							isExecutable = false;
					    }
				}
			}
		 			xls = null; //remove memory  
		return isExecutable;
		 
	 }

//function to check Run mode of a Test Case in Test Suite--isTestCaseRunnable
/* "TestCases" tab name always refer from Test case sheet like A suite.xlsx or B suite.xlsx or C suite.xlsx */
/*"TCID" & "Runmode" are column name in */
public static boolean isTestCaseRunnable(Xls_Reader xls, String testcase){
	boolean isRunnable = false;
	for(int i =2; i<=xls.getRowCount("TestCases");i++){
		String tcid = xls.getCellData("TestCases", "TCID", i);
		String runmode = xls.getCellData("TestCases", "Runmode", i);
		if(tcid.equalsIgnoreCase(testcase)){
			if(runmode.equalsIgnoreCase("Y")){
				isRunnable=true;
			}else{
				isRunnable=false;
			}
		}
	}
	xls = null;
	return isRunnable;
	
}
	
//This will return test data from excel sheet
public static Object[][] getdata (Xls_Reader xls, String testcasename){
		//Checking that sheet present or not
		if(!xls.isSheetExist(testcasename)){
			xls=null;
			return new Object[1][0];
			//Here sheet is not present, still we are execute test
		}
		
		int row =  xls.getRowCount(testcasename);
		int cols = xls.getColumnCount(testcasename);
		Object [][] dataarray = new Object[row-1][cols-3];
		//Array is defined to store extract data from excel sheet  
		//System.out.println(row+"------"+cols);
		for(int rowNum=2;rowNum<=xls.getRowCount(testcasename);rowNum++){
			for(int colNum=0;colNum<xls.getColumnCount(testcasename)-3;colNum++){
			//	System.out.print(xls.getCellData(testcasename, colNum, rowNum));
				dataarray[rowNum-2][colNum]=xls.getCellData(testcasename, colNum, rowNum);	
				// This dataarray store excel data in array
			}
			 }
		
		
		return dataarray;
	
		
	}

//This method will be update result(pass/fail) in excel sheet for particular data set
public static void reportDatasetResults(Xls_Reader xls,String testCaseName,int rownum,String results){
		xls.setCellData(testCaseName, "Results", rownum, results);
		
		//"Results" is column name in suite ,A suite ,B suite, C suite 
		
	}

//checks Run mode for dataSet
public static String[] getDataSetRunmodes(Xls_Reader xlsFile,String sheetName){
			String[] runmodes=null;
			if(!xlsFile.isSheetExist(sheetName)){
				xlsFile=null;
				sheetName=null;
				runmodes = new String[1];
				runmodes[0]="Y";
				xlsFile=null;
				sheetName=null;
				return runmodes;
			}
			runmodes = new String[xlsFile.getRowCount(sheetName)-1];
			for(int i=2;i<=runmodes.length+1;i++){
				runmodes[i-2]=xlsFile.getCellData(sheetName, "Runmode", i);
			}
			xlsFile=null;
			sheetName=null;
			return runmodes;
			
		}


//Check Row Number from test

public static int getRownum(Xls_Reader xls,String id){
	for(int i =2; i<=xls.getRowCount("TestCases");i++){
		String tcid = xls.getCellData("TestCases", "TCID", i);
	 if(tcid.equals(id)){
		 xls =null;
		 return i;
	 }
}
	return -1;
}
}


