import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class ReadExcel {

	public static void main(String[] args) throws Throwable {
		//Step1 
		FileInputStream fis = new FileInputStream("D:\\webuy_Test.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);//it will invoke workbook
        
       //Step2://Now communicate with Sheet
        HSSFSheet hs = wb.getSheet("Product");// give the sheet tab name 
        
        Iterator<Row> it=hs.iterator();
        while(it.hasNext()){
       // System.out.println(it.next().getCell(0).getStringCellValue());
        System.out.println(it.next().getCell(1).getStringCellValue());
        }
        
        
	}

}
