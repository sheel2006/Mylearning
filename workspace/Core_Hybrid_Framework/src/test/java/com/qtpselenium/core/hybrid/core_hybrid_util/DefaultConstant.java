package com.qtpselenium.core.hybrid.core_hybrid_util;

public class DefaultConstant {
	
	public static final String SUITEA_XLS = System.getProperty("user.dir")+"//data//SuiteA.xlsx";
	public static final String KEYWORDS_SHEET = "Keywords";//Name of Sheet in SuiteA.xlsx
	public static final String TCID_COL = "TCID";//TCID is column name in excel sheet SuiteA under keywords sheet
	public static final String KEYWORD_COL="Keyword";//Keyword is column name in excel sheet SuiteA under keywords sheet
	public static final String OBJECT_COL = "Object";//Object is column name in excel sheet SuiteA under keywords sheet
	public static final String DATA_COL  = "Data";
	public static final String REPORT_PATH= System.getProperty("user.dir")+"\\Extent_Reports\\report.html";
	public static final String TESTCASE_SHEET="TestCases";
	public static final String RunMode_COL="Runmode";
	public static final String SCREENSHOT_PATH=System.getProperty("user.dir")+"//Screenshot";
	public static final String PASS="Pass";
	public static final String FAIL="Fail";
	}
