package com.AltoroMutual.Util;

import java.util.Hashtable;

// Referenced classes of package com.AltoroMutual.Util:
//            Xls_Reader
public class TestUtil
{
    public TestUtil()
    {
    }
    public static boolean isTestExecutable(String testname, Xls_Reader reader)
    {
        for(int rownum = 2; rownum <= reader.getRowCount("TestCases"); rownum++)
            if(testname.equals(reader.getCellData("TestCases", "TCID", rownum)))
                return reader.getCellData("TestCases", "RunMode", rownum).equals("Y");

        return false;
    }
    
    public static Object[][] getData(String testname ,Xls_Reader xls){
    	
    	// Refer video number 9 for this in POM, This is genrice function to read data from excel sheet
		// Step#1 Find the test in xls file, Test Data is my tab Name in excel Sheet
    	int testCaseStartIndex=0;// Assume that total Data are 0
    	System.out.println("********************");
    	for(int rNum= 1;rNum<xls.getRowCount("Test Data");rNum++){
    		if(testname.equals(xls.getCellData("Test Data", 0, rNum))){// Match found between TestCase and Test Data
    			testCaseStartIndex=rNum;
    			break;
    		}
    		}
    	System.out.println("Test Data Start Postion in excel sheet--"+testCaseStartIndex);
    	
    	// Step#2 Find the Number of col in xls file
    	int colStartIndex = testCaseStartIndex+1;// column will start position
    	int cols =0;// Assume that total number of column are 0
    	while(!xls.getCellData("Test Data", cols, colStartIndex).equals("")){// here we are count the column and stop control where "Blank" come in cell
    		cols++;
    	}
    	System.out.println("Total Number of column in Test Data in excel sheet for indiviual test--"+cols);
    	// // Step#3 Find the Number of Rows in xls file
    	
    	int dataStartindex = testCaseStartIndex+2;
 // Test data is start from 2nd row for example 1st row "CustomerLoginTest" and 2nd row has "RunMode","UserName","Password"
    	int rows =0;
    	while(!xls.getCellData("Test Data", 0, (dataStartindex+rows)).equals("")){
    		rows++;
    	  	}
    	System.out.println("Total Number of Test Rows in Test Data for indiviual test--"+rows);
  
 //Step 4: Print Data of the test
    	Object[][]data 	= new Object[rows][1];
    	Hashtable<String,String>table = null;//
    	for(int rNum=dataStartindex;rNum<(dataStartindex+rows);rNum++){
    		table=new Hashtable<String,String>();// In loop for every rows hashtable call to store data
    		for(int cNum= 0;cNum<cols;cNum++){
    			table.put(xls.getCellData("Test Data", cNum, colStartIndex), xls.getCellData("Test Data", cNum, rNum));
    			//table.put(Column name as key and value is data
    		System.out.print(xls.getCellData("Test Data", cNum, rNum)+"--");
    		}
  // Step 5 : Put Hashtable data in object array
    		
    		data[rNum-dataStartindex][0]=table;
    	}
    	System.out.println();
    	return data;
    	
    }
}
