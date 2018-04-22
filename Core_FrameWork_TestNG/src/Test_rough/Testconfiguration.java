package Test_rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testconfiguration {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Properties prof = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\config.properties");
		prof.load(ip);
		System.out.println(prof.getProperty("enviromentname"));
		
		Properties OR = new Properties();
		ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\OR.properties");
		OR.load(ip);
		System.out.println(OR.getProperty("loginlink"));
		
	}

}
