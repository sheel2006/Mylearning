package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class GoogleLoginWithExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(Excelvalue("Product"));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static String Excelvalue(String SheetName) throws Throwable{
		FileInputStream fis = new FileInputStream("D:/TestFiles");
		HSSFWorkbook hs = new HSSFWorkbook(fis);
		HSSFSheet hm= hs.getSheet(SheetName);
		Iterator<Row> it = hm.iterator();
	while(it.hasNext()){
		 return it.next().getCell(1).getStringCellValue();
	}
	return null;

}
}
