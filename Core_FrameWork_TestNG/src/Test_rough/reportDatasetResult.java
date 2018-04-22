package Test_rough;

import com.qtpselenium.util.Xls_Reader;

public class reportDatasetResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\A suite.xlsx");
		reportDatasetResults(reader,"TestCase_A1",2,"Pass");
	}
	//This method will be update result in excel sheet
	public static void reportDatasetResults(Xls_Reader xls,String testCaseName,int rownum,String results){
		xls.setCellData(testCaseName, "Results", rownum, results);
		
	}

}
