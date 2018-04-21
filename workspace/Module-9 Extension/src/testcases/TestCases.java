package testcases;

import org.testng.annotations.Test;

public class TestCases {
	//multiple tests- Same data with same data provider --Possible 
	
	@Test(priority =1,dataProviderClass = Data_Provider.class,dataProvider ="regtest1Dataprovider")
	public void test11(String P1,String P2,String P3){
		System.out.println("Hello with Test1");
		
	}
	
	@Test(priority =2,dataProviderClass = Data_Provider.class,dataProvider ="regtest1Dataprovider")
	public void test22(String P1,String P2,String P3){
		System.out.println("Hello with Test2");
		//multiple tests- different data with same data provider
	}
	
	
	
	/*//multiple tests- different data with same data provider--Possible*/
	@Test(priority =1,dataProviderClass = Data_Provider.class,dataProvider ="sampleDataprovider")
	public void testA(String P1,String P2,String P3){
		System.out.println("Hello with Test1");
		
	}
	
	@Test(priority =2,dataProviderClass = Data_Provider.class,dataProvider ="sampleDataprovider")
	public void testB(String P1,String P2){
		System.out.println("Hello with Test2");
		
	}
	
	
}
