import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestA {

	@Test(dataProvider="getData")
	public void testA(Hashtable<String,String>data){
	
		System.out.println(data.get("Runmode")+"-------"+data.get("Col1")+"-------"+data.get("Col2"));
		
		
	}

	@DataProvider
	public Object[][] getData(){

		Xls_Reader xls = new Xls_Reader("D:\\DataSheet.xlsx");
		String testCaseName="TestC";
		String sheetName ="Data";
		int testStartRowNum=1;
		while(!xls.getCellData(sheetName,0,testStartRowNum).equals(testCaseName)){
			testStartRowNum++;
		}
		System.out.println("Test starts from rows "+testStartRowNum);
		int colStartRowNum =testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		//Calculate row of data
		int rows =0;
		
		while(!xls.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")){
			rows++;
		}		
		System.out.println("Total number of rows# "+rows);
		//Calcuate Number of colums 
		int cols =0;
		while(!xls.getCellData(sheetName, cols, colStartRowNum).equals("")){
			cols++;
		}
		System.out.println("Total number of column# "+cols);
		
		Object[][] data = new Object[rows][1];//1- is consider that hashtble have only 1 column for key value pai
		int dataRow=0;
		//Hashtable<String,String> table = new Hashtable<String,String>(); this is wrong
	   Hashtable<String,String> table =null;
		
		//Read data from excel sheet
		for (int rNum =dataStartRowNum;rNum<dataStartRowNum+rows;rNum++){
			table= new Hashtable<String,String>();//we have initiallize every time 
			for(int cNum =0; cNum<cols;cNum++){
				String key = xls.getCellData(sheetName, cNum,colStartRowNum );
				String value= xls.getCellData(sheetName, cNum, rNum);
				System.out.println("Value of key "+key);
				System.out.println("Value of value "+value);
				table.put(key, value);
			///data[dataRow][cNum]=xls.getCellData(sheetName, cNum, rNum);
				//System.out.println(xls.getCellData(sheetName, cNum, rNum));
				//	System.out.println("value of data row #"+dataRow);
				//	System.out.println("value of cNum #"+cNum);
				}
			data[dataRow][0]=table;//assigne value in 2D array
				dataRow++;// increase dataRow depends on rNum
				//System.out.println("value of data row outside#"+dataRow);
			}
		
		return data;
	}
}
