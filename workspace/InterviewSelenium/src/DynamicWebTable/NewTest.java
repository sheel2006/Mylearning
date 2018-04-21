package DynamicWebTable;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Test");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }
  

}
