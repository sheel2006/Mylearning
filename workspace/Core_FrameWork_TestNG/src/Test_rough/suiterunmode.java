package Test_rough;

import com.qtpselenium.util.Xls_Reader;

public class suiterunmode {

	public static void main(String[] args) {
	/* This method will check whether Run mode for test suite is "Yes" or "No" 
	 * \\src\\com\\qtpselenium\\xls this path of suite.xlsx
	 * 
	 */
	    String path = System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\Suite.xlsx";
	   	Xls_Reader xlsreader = new Xls_Reader(path);
	   System.out.println( isSuitableRunnable(xlsreader,"A suite"));
	   System.out.println( isSuitableRunnable(xlsreader,"B suite"));
	   System.out.println( isSuitableRunnable(xlsreader,"C suite"));
	}
 public static boolean isSuitableRunnable(Xls_Reader xls,String suiteName )
 {
	 boolean isExecutable= false;
	 	for(int i=2;i<=xls.getRowCount("Test suite");i++){
	 		String suite 	= xls.getCellData("Test suite", "TSID", i);
	 		String runmode	= xls.getCellData("Test suite", "RunMode", i);
	System.out.println(runmode);
			if(suite.equalsIgnoreCase(suiteName))
			{
				if (runmode.equalsIgnoreCase("Y"))
				{
					isExecutable = true;
				}else
					{
						isExecutable = false;
				    }
			}
		}
	 			xls = null; //remove memory  
	return isExecutable;
	 
 }
}
