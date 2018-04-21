package com.olx.util;

public class TestUtil {

	public static boolean isTestExecutable(String testName,Xls_Reader xls){
		for(int rownum =2 ; rownum<=xls.getRowCount("Test Cases");rownum++){
			if(xls.getCellData("Test Cases", "TCID", rownum).equals(testName)){
				if(xls.getCellData("Test Cases", "RunMode", rownum).equals("Y")){
				//	System.out.println(xls.getCellData("Test Cases", "TCID", rownum));
					return true;
				}else 
					return false;
			}
		}
		return false;
		
	}
}
