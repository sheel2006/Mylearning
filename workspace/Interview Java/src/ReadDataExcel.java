import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ReadDataExcel {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		File file;  
	    file = new File("C:\\Users\\Lenovo\\Desktop\\TestExceltoRead.xlsx");  

		Workbook workbook = Workbook.getWorkbook(file);  
	     Sheet sh = workbook.getSheet(0);  
	     for (int rows = 0; rows < sh.getRows(); rows++) {  
	       for (int colm = 0; colm < sh.getColumns(); colm++) {  
	         System.out.print(sh.getCell(colm, rows).getContents() + " ");  
	       }  
	       System.out.println();  
	     }  
	   }  


	}


