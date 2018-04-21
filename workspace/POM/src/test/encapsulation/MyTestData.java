package test.encapsulation;

import com.AltoroMutual.Util.TestUtil;
import com.AltoroMutual.Util.Xls_Reader;

public class MyTestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUtil.getData("CustomerLoginTest", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\Util\\TestSceanrios.xlsx"));
		TestUtil.getData("CustomerAccountProfile", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\Util\\TestSceanrios.xlsx"));
		TestUtil.getData("CustomerTransactionsQuery", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\Util\\TestSceanrios.xlsx"));
		TestUtil.getData("CustomerFundTrx", new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\AltoroMutual\\Util\\TestSceanrios.xlsx"));

	}

}
