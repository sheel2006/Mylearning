package Test_rough;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSequece {

	@Test
	 
	public void testCase1() {
	System.out.println("This is the @Test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute-- @beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute--@afterMethod");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute --@BeforeClass");
		 
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute @AfterClass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute @BeforeTest");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("This will execute @AfterTest");
	}
	@BeforeSuite

	public void beforeSuite() {
		System.out.println("This will execute @BeforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("This will execute @AfterSuite");
	}
	}

