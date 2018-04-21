package Test_rough;

import com.qtpselenium.util.Xls_Reader;

public class TestExtractjava {

	public static void main(String[] args){
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\A suite.xlsx");
		getdata(reader,"TestCase_A1");
	}
	// This will return test data from excet sheet
	public static Object[][] getdata (Xls_Reader xls, String testcasename){
		//Checking that sheet present or not
		if(!xls.isSheetExist(testcasename)){
			xls=null;
			return new Object[1][0];
			//Here sheet is not present, still we are execute test
		}
		
		int row =  xls.getRowCount(testcasename);
		int cols = xls.getColumnCount(testcasename);
		Object [][] dataarray = new Object[row-1][cols-3];
		//Array is defined to store extract data from excel sheet  
		System.out.println(row+"------"+cols);
		for(int rowNum=2;rowNum<=xls.getRowCount(testcasename);rowNum++){
			for(int colNum=0;colNum<xls.getColumnCount(testcasename)-3;colNum++){
				System.out.print(xls.getCellData(testcasename, colNum, rowNum));
				dataarray[rowNum-2][colNum]=xls.getCellData(testcasename, colNum, rowNum);	
				// This dataarray store excel data in array
			}
			System.out.println();
		}
		
		
		return dataarray;
	
		
	}
}
