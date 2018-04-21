package com.qtpselenium.core.hybrid.core_hybrid_util;

import java.util.Hashtable;

public class DataUtil {

	public static Object[][] getData(Xls_Reader xls,String testName){
		//Xls_Reader xls = new Xls_Reader("D:\\DataSheet.xlsx");
		//String testCaseName="TestC";
		String sheetName ="Data";
		int testStartRowNum=1;
		while(!xls.getCellData(sheetName,0,testStartRowNum).equals(testName)){
			testStartRowNum++;
		}
		System.out.println("Test starts from rows "+testStartRowNum);
		int colStartRowNum =testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		//Calculate row of data
		int rows =0;
		
		while(!xls.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")){
			rows++;
		}		
		System.out.println("Total number of rows# "+rows);
		//Calcuate Number of colums 
		int cols =0;
		while(!xls.getCellData(sheetName, cols, colStartRowNum).equals("")){
			cols++;
		}
		System.out.println("Total number of column# "+cols);
		
		Object[][] data = new Object[rows][1];//1- is consider that hashtble have only 1 column for key value pai
		int dataRow=0;
		//Hashtable<String,String> table = new Hashtable<String,String>(); this is wrong
	   Hashtable<String,String> table =null;
		
		//Read data from excel sheet
		for (int rNum =dataStartRowNum;rNum<dataStartRowNum+rows;rNum++){
			table= new Hashtable<String,String>();//we have initiallize every time 
			for(int cNum =0; cNum<cols;cNum++){
				String key = xls.getCellData(sheetName, cNum,colStartRowNum );
				String value= xls.getCellData(sheetName, cNum, rNum);
				System.out.println("Value of key "+key);
				System.out.println("Value of value "+value);
				table.put(key, value);
			///data[dataRow][cNum]=xls.getCellData(sheetName, cNum, rNum);
				//System.out.println(xls.getCellData(sheetName, cNum, rNum));
				//	System.out.println("value of data row #"+dataRow);
				//	System.out.println("value of cNum #"+cNum);
				}
			data[dataRow][0]=table;//assigne value in 2D array
				dataRow++;// increase dataRow depends on rNum
				//System.out.println("value of data row outside#"+dataRow);
			}
		
		return data;
	}
	
	public static boolean isRunnable(Xls_Reader xls, String testName){
		int rows = xls.getRowCount(DefaultConstant.TESTCASE_SHEET);
		for(int rNum=2;rNum<=rows;rNum++){
			String testcaseid = xls.getCellData(DefaultConstant.TESTCASE_SHEET, DefaultConstant.TCID_COL, rNum);
			if(testcaseid.equals(testName)){
				String Runmode =xls.getCellData(DefaultConstant.TESTCASE_SHEET, DefaultConstant.RunMode_COL, rNum);
				if(Runmode.equals("Y")){
					return false;
				}else
					return true;
			}
		}
		
		return true;
//In this function true mean we skip testcase and false mean we are consider testcase should be run		
		
	}
}
