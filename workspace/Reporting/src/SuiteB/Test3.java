package SuiteB;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void test3(){
		throw new SkipException("Test Skipped");
	}
}
