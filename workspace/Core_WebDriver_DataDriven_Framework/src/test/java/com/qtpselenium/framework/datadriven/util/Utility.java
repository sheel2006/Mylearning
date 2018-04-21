package com.qtpselenium.framework.datadriven.util;

import java.util.Hashtable;

import com.qtpselenium.framework.datadriven.TestBase;


public class Utility {

	/* To check that Test suite runmode is Y or N */
	public static boolean isSuitableRunnable(String suiteName,Xls_Reader xls){
		boolean isExecutable= false;
		TestBase.Application_logs.debug("Step#1.2 : Validating  method isSuitableRunnable--"+suiteName);
		int rows = xls.getRowCount(Constants.SUITE_NAME);
		//"SUITE" is tab in excelsheet name
		//"Suite" name tab in excel sheet 
		for(int rNum =2 ; rNum<=rows;rNum++){
			String data = xls.getCellData(Constants.SUITE_NAME,Constants.SUITENAME_COL, rNum);
			//SuiteName and Runmode column name in Suite tab.
			if (data.equalsIgnoreCase(suiteName)){
				String runmode = xls.getCellData(Constants.SUITE_NAME, Constants.RUNMODE_COL, rNum);
				if(runmode.equalsIgnoreCase(Constants.RUNMODE_YES)){
					isExecutable = true;
				}
				else 
					isExecutable = false;
				}
			}
		xls = null; //remove memory  
		return isExecutable;
	}
	/* To check that Test suite runmode is Y or N */
	public static boolean isTestCaseRunnable(String testcase,Xls_Reader xls){
		boolean isExecutable= false;
		TestBase.Application_logs.debug("Step#1.3 : Validating  method isSuitableRunnable--"+testcase);
		int rows = xls.getRowCount(Constants.TESTCASE_SHEET);
		//"TestCases" tab name in excel sheet 
		for(int rNum =2 ; rNum<=rows;rNum++){
			String testnamexls = xls.getCellData(Constants.TESTCASE_SHEET, Constants.TESTCASE_COL, rNum);
			// 1st "TestCases" represent as tab name and 2nd "TestCases" column name
			//SuiteName and Runmode column name in Suite tab.
			if (testnamexls.equalsIgnoreCase(testcase)){
				String runmode = xls.getCellData(Constants.TESTCASE_SHEET, Constants.RUNMODE_COL, rNum);
				if(runmode.equalsIgnoreCase(Constants.RUNMODE_YES)){
					isExecutable = true;
				}
				else 
					isExecutable = false;
				}
			}
		xls = null; //remove memory  
		return isExecutable;
	}
	public static Object[][] getData(String testName,Xls_Reader xls){
		TestBase.Application_logs.debug("Step#1.6 : Calling getData for "+testName);
		int rowcount = xls.getRowCount(Constants.DATASHEET_NAME);
	 	System.out.println("Total number of rows "+rowcount);
	 	//row number for test case
	 	int testcaserownum=1;
	    for(testcaserownum=1;testcaserownum<rowcount;testcaserownum++){
		 String testnamexls = xls.getCellData(Constants.DATASHEET_NAME, 0, testcaserownum);
		 // 0 has taken because in data sheet no index 
		 if(testnamexls.equalsIgnoreCase(testName))
			 break;
	    } 
     System.out.println(" Test Satrt from row number "+testcaserownum);
     int dataStartrowNum = testcaserownum+2;
     int colStartrowNum = testcaserownum+1;
     
  // find data positions in rows(eg.C11,C12,C13)d lopping loop when space comes in excel sheet that mean no data and stop loop
     int testrows=1;
     while(!xls.getCellData(Constants.DATASHEET_NAME,0, dataStartrowNum+testrows).equals("")){
    	 testrows++;
     }
     System.out.println("Total rows of data are "+testrows);
     // find data positions in column(eg.C11,C22,C33) and stopping loop when space comes in excel sheet that mean no data and stop loop
     int testcol=0;
     while(!xls.getCellData(Constants.DATASHEET_NAME,testcol,colStartrowNum).equals("")){
    	 testcol++;
     }
     System.out.println("Total column of data are "+testcol);
   // Display data value in test suite
     Object [][] data = new Object[testrows][1];
     // Array have only column to use Hash table concept
     int r=0;
     for(int rNum=dataStartrowNum;rNum<(dataStartrowNum+testrows);rNum++){
    	Hashtable<String,String> table = new Hashtable<String,String>();
    	 // Hastable used to avoid parameter in main test
    	 // we are storing array values in Hashtable
    	 // Every rows has new hashtable 
    	 for(int cNum=0;cNum<testcol;cNum++){
    		 System.out.println(xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum));
    		// data[r][cNum] = xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum);
    	 table.put(xls.getCellData(Constants.DATASHEET_NAME, cNum, colStartrowNum), xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum));
    	 //(xls.getCellData(Constants.DATASHEET_NAME, cNum, colStartrowNum) == This will return key value as "Runmode","Result,"Col1",Col2 etc
    	 // (xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum)== This will back value againest key("Runmode")as --> Y
    		
    	 }
    	 // here we are putting hashtable inside every rows
    	 data[r][0]=table;
    			 r++;
     }
     return data;
	 
    }
}
