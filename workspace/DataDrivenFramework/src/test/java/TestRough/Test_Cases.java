package TestRough;

import java.util.Hashtable;

import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class Test_Cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader	xls= new Xls_Reader("C:\\Sheel\\workspace\\DataDrivenFramework\\src\\test\\java\\com\\qtpselenium\\framework\\datadriven\\Xlsx\\SuiteA.xlsx");
		
		getData	("test1",xls);
	}
	public static Object[][] getData(String testName,Xls_Reader xls){
		testName = "test1";
		xls= new Xls_Reader("C:\\Sheel\\workspace\\DataDrivenFramework\\src\\test\\java\\com\\qtpselenium\\framework\\datadriven\\Xlsx\\SuiteA.xlsx");
		int rowcount = xls.getRowCount(Constants.DATASHEET_NAME);
	 	System.out.println("Total number of rows "+rowcount);
	 	//row number for test case
	 	int testcaserownum=1;
	    for(testcaserownum=1;testcaserownum<rowcount;testcaserownum++){
		 String testnamexls = xls.getCellData(Constants.DATASHEET_NAME, 0, testcaserownum);
		 // 0 has taken because in data sheet no index 
		 if(testnamexls.equalsIgnoreCase(testName))
			 break;
	    } 
     System.out.println(" Test Satrt from row number "+testcaserownum);
     int dataStartrowNum = testcaserownum+2;
     int colStartrowNum = testcaserownum+1;
     
  // find data positions in rows(eg.C11,C12,C13)d lopping loop when space comes in excel sheet that mean no data and stop loop
     int testrows=1;
     while(!xls.getCellData(Constants.DATASHEET_NAME,0, dataStartrowNum+testrows).equals("")){
    	 testrows++;
     }
     System.out.println("Total rows of data are "+testrows);
     // find data positions in column(eg.C11,C22,C33) and stopping loop when space comes in excel sheet that mean no data and stop loop
     int testcol=0;
     while(!xls.getCellData(Constants.DATASHEET_NAME,testcol,colStartrowNum).equals("")){
    	 testcol++;
     }
     System.out.println("Total column of data are "+testcol);
   // Display data value in test suite
     Object [][] data = new Object[testrows][testcol];
     // Array have only column to use Hash table concept
     int r=0;
     for(int rNum=dataStartrowNum;rNum<(dataStartrowNum+testrows);rNum++){
    	// Hashtable<String,String> table = new Hashtable<String,String>();
    	 // Hastable used to avoid parameter in main test
    	 // we are storing array values in Hashtable
    	 // Every rows has new hashtable 
    	 for(int cNum=0;cNum<testcol;cNum++){
    		 System.out.println(xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum));
    		// data[r][cNum] = xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum);
    		// table.put(xls.getCellData(Constants.DATASHEET_NAME, cNum, colStartrowNum), xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum));
    	 //(xls.getCellData(Constants.DATASHEET_NAME, cNum, colStartrowNum) == This will return key value as "Runmode","Result,"Col1",Col2 etc
    	 // (xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum)== This will back value againest key("Runmode")as --> Y
    		 data[r][cNum]=(xls.getCellData(Constants.DATASHEET_NAME, cNum, rNum));
    	 }
    	 // here we are putting hashtable inside every rows
    	 r++;
     }
     return data;
	 
    }
}
	


