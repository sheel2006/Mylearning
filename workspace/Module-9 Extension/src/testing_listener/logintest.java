package testing_listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest {

	
	@Test
	public void login(){
		Assert.assertEquals("A", "B");
		
	}
	
	@Test
	public void loginadmin(){
		Assert.assertEquals("A", "A");
		
	}
}
