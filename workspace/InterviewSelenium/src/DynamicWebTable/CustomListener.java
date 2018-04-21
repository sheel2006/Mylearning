package DynamicWebTable;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext it) {
	System.out.println("Start of test case"+it.getStartDate());	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult it) {
		System.out.println(it.getTestName()+"      "+it.getClass()+"     "+it.FAILURE);
		
	}

	@Override
	public void onTestSkipped(ITestResult it) {
		System.out.println(it.getTestName()+"      "+it.getClass()+"     "+it.SKIP);
		
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult it) {
		System.out.println(it.getTestName()+"      "+it.getClass()+"     "+it.SUCCESS);
		
	}

}
