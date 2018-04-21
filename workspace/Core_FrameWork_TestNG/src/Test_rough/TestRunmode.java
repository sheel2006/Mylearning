package Test_rough;

import com.qtpselenium.util.Xls_Reader;

public class TestRunmode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader  reader = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\A suite.xlsx");
		System.out.println(isTestCaseRunnable(reader,"TestCase_A1"));
		Xls_Reader  X1 = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\B suite.xlsx");
		System.out.println(isTestCaseRunnable(reader,"TestCase_B1"));
	}
	
	public static boolean isTestCaseRunnable(Xls_Reader xls, String testcase){
		boolean isRunnable = false;
		for(int i =2; i<=xls.getRowCount("TestCases");i++){
			String tcid = xls.getCellData("TestCases", "TCID", i);
			String runmode = xls.getCellData("TestCases", "Runmode", i);
			if(tcid.equalsIgnoreCase(testcase)){
				if(runmode.equalsIgnoreCase("Y")){
					isRunnable=true;
				}else{
					isRunnable=false;
				}
			}
		}
		xls = null;
		return isRunnable;
		
	}

}
