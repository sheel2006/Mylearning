package com.qtp.selenium.framework.datadriven.DataDrivenFramework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;

import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.ErrorUtil;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;




public class CustomListener extends TestListenerAdapter implements IInvokedMethodListener,ISuiteListener {
  
	public static Hashtable<String, String> resulttable ;// Intialize Hash table before test Starts
	public static String folderName;// This is use for folder creation
	public static String resultfilepathName= null;
	public static ArrayList<String> keys;//in this array we store key values of HashTable , becasue result comes from HashTable not in Order.So use arraylist
			
	
	
	    public void onTestFailure(ITestResult tr){
	   // result(tr.getName(),  tr.getThrowable().getMessage());
	   List<Throwable> verficationFailure= ErrorUtil.getVerificationFailures();
	   String errmsg="";
	   for(int i=0; i<verficationFailure.size();i++){
		   errmsg= errmsg+"  ["+verficationFailure.get(i).getMessage()+"] - ";
		      }
	   result(tr.getName(),errmsg);
		}
		
		public void onTestSkipped(ITestResult tr) {
		result(tr.getName(),  tr.getThrowable().getMessage());
		}
		
		public void onTestSuccess(ITestResult tr){
			result(tr.getName(),"Passed");
		}
	
		
	
	public void onStart(ISuite suite) {// For 1st suite this will create folder
		// TODO Auto-generated method stub
	System.out.println("Starting of Suite "+suite.getName());
	if(resulttable==null){
		keys = new ArrayList<String>();	
		resulttable = new Hashtable<String, String>(); 
		/* Here we are creating Folder to store results in excel sheet*/
	}
	
	if(folderName==null){
		Date currentdate = new Date();
		folderName = currentdate.toString().replace(":", "_");
		File f = new File(System.getProperty("user.dir")+"//Reporting//Result//"+folderName);
		f.mkdir();// will create new folder
		File source = new File(System.getProperty("user.dir")+"//Reporting//Test Result.xlsx");
		resultfilepathName=System.getProperty("user.dir")+"//Reporting//Result//"+folderName+"//Report.xlsx";
		File target = new File(resultfilepathName);
		
		try {
			FileUtils.copyFile(source, target);// this will copy file in date name folder
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}


	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		if(resulttable!=null){
			System.out.println("onFinish of Suite "+suite.getName());
			System.out.println(resulttable);
			System.out.println("keys value "+keys);
			// after every suite finish it will write result in excel	
		}
		
		resultfilepathName=System.getProperty("user.dir")+"//Reporting//Result//"+folderName+"//Report.xlsx"; 
		if(!suite.getName().equals(Constants.My_Project)){
			Xls_Reader xls= new Xls_Reader(resultfilepathName);
			xls.addSheet(suite.getName());
			// add the result in excel sheet
			
			// create coloum name in excel sheet
			xls.setCellData(suite.getName(), 0, 1, "Test Case");
			xls.setCellData(suite.getName(), 1, 1, "Result");
			
			for(int i=0;i<keys.size();i++){
				String keyvalue=keys.get(i) ;
				String result=resulttable.get(keyvalue);// extract array keys value from hashtable 
			    xls.setCellData(suite.getName(), 0, i+2, keyvalue);//write into excel sheet..
			    xls.setCellData(suite.getName(), 1, i+2, result);
			}
		}
		resulttable=null;
		keys=null;
		
	}


	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		//System.out.println(method.getTestMethod()+ testResult.SUCCESS );
		//System.out.println(method.getTestMethod()+ testResult.FAILURE );
	}

	
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		// This process will invoke when Test case has more than 2 assert conditions in test Case and we dont want to stop flow if assertion failef durning execution
		// still we want to check the other assertion, this method will be invoke to take care it.
		
		Reporter.setCurrentTestResult(result);

		if (method.isTestMethod()) {
			List<Throwable> verificationFailures = ErrorUtil.getVerificationFailures();
			//if there are verification failures...
			if (verificationFailures.size() != 0) {
				//set the test to failed
				result.setStatus(ITestResult.FAILURE);
				
				//if there is an assertion failure add it to verificationFailures
				if (result.getThrowable() != null) {
					verificationFailures.add(result.getThrowable());
				}
 
				int size = verificationFailures.size();
				//if there's only one failure just set that
				if (size == 1) {
					result.setThrowable(verificationFailures.get(0));
				} else {
					//create a failure message with all failures and stack traces (except last failure)
					StringBuffer failureMessage = new StringBuffer("Multiple failures (").append(size).append("):nn");
					for (int i = 0; i < size-1; i++) {
						failureMessage.append("Failure ").append(i+1).append(" of ").append(size).append(":n");
						Throwable t = verificationFailures.get(i);
						String fullStackTrace = Utils.stackTrace(t, false)[1];
						failureMessage.append(fullStackTrace).append("nn");
					}
 
					//final failure
					Throwable last = verificationFailures.get(size-1);
					failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":n");
					failureMessage.append(last.toString());
 
					//set merged throwable
					Throwable merged = new Throwable(failureMessage.toString());
					merged.setStackTrace(last.getStackTrace());
 
					result.setThrowable(merged);
					
				}
			}
		
		}
		
	}
    public void result(String name ,String result){
/*
suppose in TestSuite 1 testcase have to run for two data set, for 1 data set its should be passed and for second data set.
it should failed and captured by Listener in report, To Handle this we use Report function in listiner.
In HashTable suppose one test case is passed for 1 data set and failed for other testdata while capture this in report. 
Pass testdata value override by fail testdata and Hashtable dont allowed duplicate and TestCase name is override for failed or passed
data set  so in below logic we are keep checking Test Name in Hash table by using iteration_number.    	
*/ 	
    	int iteration_number =1;
    	while(resulttable.containsKey(name+" iteration"+iteration_number)){
    		iteration_number++;
    	}
    	keys.add(name+" iteration"+iteration_number);// Add keys in arrays
    	resulttable.put(name+" iteration"+iteration_number, result);
    }
    public void writeResult(String Testcase,String Result){
    }

	
	}
