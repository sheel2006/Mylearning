package Rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop =new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//com//olx//config//OR.properties");
			try {
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("Name"));
		
	}

}
