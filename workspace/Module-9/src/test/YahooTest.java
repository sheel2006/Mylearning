package test;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class YahooTest {
	// Now we want to run YahooNewsTest and YahooTest in a Batch so we will use testng.xml	  
		 @BeforeSuite
		  public void beforeSuite() {
			 System.out.println("BeforeSuite");
		  }
		 @BeforeTest
		  public void beforeTest() {
			 System.out.println("In Before Test");
		  }
		 @BeforeClass
		  public void beforeClass() {
			  System.out.println("In Before Class");
		  }
		 @BeforeMethod
		 public void beforeMethod() {
			  System.out.println("beforeMethod");
		  }
		 
		 @Test
		 public void YahooSendMail() {
			 System.out.println("YahooSendMail Main Test");
		 	}
		 @Test
		 public void Yahooreveivemail() {
			 System.out.println("Yahooreveivemail Main Test");
			 throw new SkipException("Skip this Test");
		 	}
		 
		 @AfterTest
		  public void afterTest() {
			 System.out.println("In After Test");
		  }
	     @AfterMethod
	     public void afterMethod() {
	    	 System.out.println("In After Method");
	     	}
	     @AfterSuite
	     public void afterSuite() {
	    	 System.out.println("In After Suite");
	     }
	 


}
