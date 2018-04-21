package testing_listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		System.out.println("Fail      "+tr.getName());
	}
    public void onTestskipped(ITestResult tr){
    	System.out.println("Skipped   "+tr.getName());
	}
    public void onTestSuccess(ITestResult tr){
    	System.out.println("Success    "+tr.getName());
	}
}
