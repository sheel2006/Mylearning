package com.olx.Testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.olx.util.TestUtil;
import com.olx.util.Xls_Reader;

public class LoginTest {

@Test	
public void simpleTest(){
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//src//com//olx//data//Test Cases.xlsx");
	if(!TestUtil.isTestExecutable("Login Test", xls))
	throw new SkipException("Test is not executable");
	System.out.println("This is simple Test");
	
	
}

}

