package com.qtpselenium.core.hybrid.Core_Hybrid_Framework;

import java.util.Hashtable;

import org.testng.Assert;

import com.qtpselenium.core.hybrid.core_hybrid_util.DefaultConstant;
import com.qtpselenium.core.hybrid.core_hybrid_util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Keywords {
	AppKeyWords app;
	ExtentTest test;// initialize ExtentTest to capture log at Keyword level.
	public Keywords(ExtentTest test) {//this contrautor created when test is passed in this--Keywords app = new Keywords(test);
		this.test=test;
	
	}
	public void executeKeywords(String testUnderExecution,
								Xls_Reader xls,
								Hashtable<String,String> testData){
		
		//String testUnderExecution = "GmailTest";// This one use to make sure only GailTest Run not othesr
		app = new AppKeyWords(test);
		/*apps.openBrowser("FireFox");
		apps.navigate("urlkey");
		apps.click("gmaillink_xpath");
		apps.inputtext("email_id","hellojava");
		apps.click("nextbutton_id");*/
	//	Xls_Reader xls = new Xls_Reader(Constants.SUITEA_XLS);
		int rows = xls.getRowCount("Keywords");
		
		for(int rNum =2;rNum<=rows;rNum++){
			String tcid =xls.getCellData(DefaultConstant.KEYWORDS_SHEET, DefaultConstant.TCID_COL, rNum);
			if(tcid.equals(testUnderExecution)){
			String keyword =xls.getCellData(DefaultConstant.KEYWORDS_SHEET, DefaultConstant.KEYWORD_COL, rNum);
			String object =xls.getCellData(DefaultConstant.KEYWORDS_SHEET, DefaultConstant.OBJECT_COL, rNum);
			String key =xls.getCellData(DefaultConstant.KEYWORDS_SHEET, DefaultConstant.DATA_COL, rNum);
			String data = testData.get(key);//This will read data from Data excel sheet based on Keywords Sheet of data column
			
			test.log(LogStatus.INFO ,tcid+"---"+keyword+"---"+object+"---"+data);

			/* This below funtion where keywords call for validation if we want to add any validation add key here
			 * 
			 */
			String result ="";
			if(keyword.equals("openBrowser"))//keyword value comes from String keyword & 'openBrowser' taken from excelsheet
				result=app.openBrowser(data);// data value from String data
			else if(keyword.equals("navigate"))
				result=app.navigate(object);
			else if(keyword.equals("click"))
				result=app.click(object);
			else if(keyword.equals("inputtext"))
				result=app.inputtext(object, data);
			else if(keyword.equals("click"))
				result=app.click(object);
			else if(keyword.equals("CloseBrowser"))
				result=app.closeBrowser();
			else if(keyword.equals("verifyLoginDetails"))
				result=app.verifyLoginDetails(testData);// testData pass the data from excel sheet..Name column value these value use in AppKeyWords.java
			else if(keyword.equals("verifyElementPresent"))	
				result= app.verifyElementPresent(object);
				if(!result.equals(DefaultConstant.PASS)){//Result will return from pass from each keywords
					app.reportfailure(result);
					Assert.fail(result);
					
						}
					}
				}
			}
		
	public AppKeyWords getGenericKeyWords(){
		return app;
	}

}
