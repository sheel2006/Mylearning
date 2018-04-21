package com.qtpselenium.suiteA;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;

/* For every test suite we have use inheritance of class TestSuiteBase.java and this extension of TestBase.java
*/
public class TestCase_A1 extends TestSuiteBase {
   String runmodes[];// to check run-mode of test case Y or N
   static int counter =-1;
   static boolean pass = false;
   static boolean fail = false;
   static boolean skip = false;
   static boolean istestpass = true;
	//this counter set as -1 because array start from 0,1,2,3 on 1st execution this will set as array[0],array[1],array[2],array[3],
	//this.getClass().getSimpleName() give class name as "TestCase_A!
	@BeforeTest
	public void checkTestSkip(){
			if(!TestUtil.isTestCaseRunnable(suiteAxls, this.getClass().getSimpleName())){
			APP_LOGS.debug("Skipping Test case"+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			throw new SkipException("Skipping Test case "+this.getClass().getSimpleName() + "RunMode set as 'NO'");
			}
			
			runmodes =TestUtil.getDataSetRunmodes(suiteAxls, this.getClass().getSimpleName());
				
	}
/*******************************************************************************************************************************/	
	// Parameter of testcaseA1 depends on number( DataA1_1,DataA1_2,DataA1_3,DataA1_4 in Suite A excel sheet)

	@Test(dataProvider = "getTestdata")
	public void testcaseA1(String Col1,	String Col2,String Col3,String Col4){
		//Test the run mode of current data set
		counter++;
		//Check the run mode value in  counter array as 'N' and raise exception
		if(!runmodes[counter].equals("Y")){
			skip=true;
			throw new SkipException("RunMode for Test data A1 is set as No"+counter); 
		}
		APP_LOGS.debug(" Executing test"+ this.getClass().getSimpleName());
		System.out.println();
		APP_LOGS.debug(Col1+"----"+Col2+"----"+Col3+"----"+Col4);
	 
		/*		 Test Case 1# with Selenium code   		 */
	
		String expected_value = "ABC";
		String actual_value =   "ABC";
		//Assert.assertEquals(actual_value, expected_value)==this condition will fail but we want to report this and continue of test use try and catch
		
		try{
			Assert.assertEquals(actual_value, expected_value);	
		}catch(Throwable e){
			//code to report the error in testng
			ErrorUtil.addVerificationFailure(e);
			// Report error in excel files
			TestUtil.reportDatasetResults(suiteAxls, this.getClass().getSimpleName(), counter+2, "Failed");
			fail =true;
			return ;//--this can we enable and control will not move.
						
		}
		System.out.println("*************************************");
		
   }
/******************************************************************************************************************/	
	/*Write in Test case whether result pass, fail or skip in excel sheet
	 *this will update result in tab "TestCase_A1" under excel sheet A suite) 
	 */
	@AfterMethod
	public void reportDatasetresult(){
		if(skip){
			TestUtil.reportDatasetResults(suiteAxls, this.getClass().getSimpleName(), counter+2, "Skiped");
		}
		else if (fail){
			istestpass =false;
			TestUtil.reportDatasetResults(suiteAxls, this.getClass().getSimpleName(), counter+2, "Failed");
		}
		else
			TestUtil.reportDatasetResults(suiteAxls, this.getClass().getSimpleName(), counter+2, "Passed");
		skip= false;
		fail= false;
		}
	
	/*Write in Test case whether result pass, fail or skip in excel sheet
	 * this will update result in tab "TestCase" under excel sheet A suite) 
	 * "TestCases" is name of tab in excel sheet A suite
	 */	
	@AfterTest
	public void reporttestresult(){
		if(istestpass){
			TestUtil.reportDatasetResults(suiteAxls, "TestCases", TestUtil.getRownum(suiteAxls,this.getClass().getSimpleName()), "Passed");
		}
		else{
			TestUtil.reportDatasetResults(suiteAxls, "TestCases", TestUtil.getRownum(suiteAxls,this.getClass().getSimpleName()), "Failed");
		}
	}
	
	@DataProvider	
	   public  Object[][] getTestdata(){
		//this.getClass().getSimpleName() this return current class name
		return TestUtil.getdata(suiteAxls, this.getClass().getSimpleName());
 }
}

