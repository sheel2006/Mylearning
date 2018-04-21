
public class DataManagment {

	public static void main(String[]args){
		Xls_Reader xls = new Xls_Reader("D:\\DataSheet.xlsx");
		
		String testCaseName="TestA";
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
		System.out.println("Total number of rows "+rows);
		//Calcuate Number of colums 
		int col =0;
		while(!xls.getCellData(sheetName, col, colStartRowNum).equals("")){
			col++;
		}
		System.out.println("Total number of rows "+col);
	
		//Read data from excel sheet
		for (int rNum =dataStartRowNum;rNum<dataStartRowNum+rows;rNum++){
			for(int cNum =0; cNum<=col;cNum++){
				System.out.println(xls.getCellData(sheetName, cNum, rNum));
			}
			
		}
	}
	
	
}
