package com.qtpselenium.core.hybrid.Core_Hybrid_Framework;

import java.util.Hashtable;

import com.qtpselenium.core.hybrid.core_hybrid_util.DefaultConstant;
import com.relevantcodes.extentreports.ExtentTest;

public class AppKeyWords extends GenericKeywords{
 /*This class will hold validation of application 
 * specfie keywords like login verify email 
 * 
 */
	public AppKeyWords(ExtentTest test) {
		super(test);
		// TODO Auto-generated constructor stub
	}
	
 public String verifyLoginDetails(Hashtable<String, String> testData){
	String expectedName = testData.get("Name");
	String expectedId= testData.get("Username");
	return DefaultConstant.PASS;
	
}
	
	
	

	

}
