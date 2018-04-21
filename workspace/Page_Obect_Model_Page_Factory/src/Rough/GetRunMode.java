package Rough;

import com.olx.util.TestUtil;
import com.olx.util.Xls_Reader;

public class GetRunMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"//src//com//olx//data//Test Cases.xlsx");
     /*  for(int rownum=2;rownum<=xls.getRowCount("Test Cases");rownum++){
		//  System.out.println(xls.getCellData("Test Cases", "TCID", rownum));
	        if(xls.getCellData("Test Cases", "RunMode", rownum).equals("Y")){
	        	System.out.println(xls.getCellData("Test Cases", "TCID", rownum)+ "  "+xls.getCellData("Test Cases", "RunMode", rownum));	
	        }
	  }*/
     System.out.println(TestUtil.isTestExecutable("Test1", xls));
	}

}
