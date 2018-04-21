package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class YahooNewsTest {
  
  @BeforeTest
  public void xyz() {
	  System.out.println("In YahooNewsTest-beforeTest");
	 // throw new SkipException("Skip this Test");
	  // This is way to Skip test batch by using exception
  }
  @Test
  public void TestNews() {
	  //Selenium Code
	  // expected value and actual value or link is present
	  // If any assertion failed, after that no assertion executed 
	  // for example assertEquals failed control will not move to assertTrue or assertfalse,
	  // To handle the control use try and catch block to continue our test
	  System.out.println("Before asseration");
	  try{
	  Assert.assertEquals("Good", "Good1");
	  }catch(Throwable t){
		  System.out.println( "This test failed so move control on next ");
			// Error out 
		    // capture screen shot
		  }
	  
	  Assert.assertTrue(6>1, "Condidtion is true");
	  Assert.assertFalse(6<1, "Condidtion is false");
	  System.out.println("After asseration");
	  
  }
// Now we want to run YahooNewsTest and YahooTest in a Batch so we will use testng.xml
}
