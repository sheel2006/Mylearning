package Test_rough;

import com.qtpselenium.util.Zip;

public class TestZip {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//make sure rep folder should be present 
		Zip.zipFolder("C:\\rep","C:\\mytarget.rar");
	} 

}
