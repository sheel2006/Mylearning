package ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelReader {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("File path");
		HSSFWorkbook hs = new HSSFWorkbook(fis);
		HSSFSheet hm= hs.getSheet("Tab Name in Sheet");
	
		Iterator<Row> it = hm.iterator();
	while(it.hasNext()){
		 System.out.println(it.next().getCell(1).getStringCellValue());
	}

	}

}
