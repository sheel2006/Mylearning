package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	
	@DataProvider(name="regtest1Dataprovider")
	public static Object[][] getdata(){
		
		Object [][] data = new Object[2][3];
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="xyz@gmail.com";
		data[1][0]="U1";
		data[1][1]="P1";
		data[1][2]="xyz@gmail.com";
		return data;
	}
	
	@DataProvider(name="regtest2Dataprovider")
	public static Object[][] getlogindata(){
		
		Object [][] data = new Object[2][3];
		data[0][0]="U2";
		data[0][1]="P2";
		data[0][2]="xyz1@gmail.com";
		data[1][0]="U3";
		data[1][1]="P3";
		data[1][2]="xyz1@gmail.com";
		return data;
	}
	

	@DataProvider(name="sampleDataprovider")
	public static Object[][] sampledata(Method m){
		Object [][] data = null;
		if(m.getName().equals("testA")){
		data = new Object[2][3];
		data[0][0]="U2";
		data[0][1]="P2";
		data[0][2]="xyz1@gmail.com";
		data[1][0]="U3";
		data[1][1]="P3";
		data[1][2]="xyz1@gmail.com";
		}else if(m.getName().equals("testB"))
		{
			data = new Object[2][2];
			data[0][0]="U2";
			data[0][1]="P2";
			data[1][0]="U3";
			data[1][1]="P3";
		}
			
		return data;
	}
 
}
