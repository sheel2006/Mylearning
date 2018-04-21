package com.qtp.selenium.framework.datadriven.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.SkipException;

import com.qtpselenium.framework.datadriven.util.Constants;
import com.qtpselenium.framework.datadriven.util.Utility;
import com.qtpselenium.framework.datadriven.util.Xls_Reader;

public class TestBase {

public static Properties prop;
public static Logger Application_logs= Logger.getLogger("devpinoyLogger");

public void initLogs(Class<?>class1){
	// By This function for each test case seprate log will create if Test are running on Selenium Grid
	FileAppender appender = new FileAppender();
	appender.setFile(System.getProperty("user.dir")+"//Reporting//Result//"+CustomListener.folderName+"//"+class1.getName()+".log");;
	appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
	appender.setAppend(false);
	appender.activateOptions();
	
	Application_logs= Logger.getLogger(class1);
	Application_logs.setLevel(Level.DEBUG);
	Application_logs.addAppender(appender);
	
}


public static void init(){
		
		if(prop==null){
			String path =System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties";
			System.out.println(System.getProperty("user.dir"));
		    prop = new Properties();
			try {
				FileInputStream fs = new  FileInputStream(path);
				try {
					prop.load(fs);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			}
			System.out.println(prop.getProperty("xlsfilelocation"));
			}
		}	
	
	public static void validateRunmodes(String testname,String suiteName,String dataRunmode){
		Application_logs.debug("Step#1.1 : Validating  method validateRunmodes "+testname+ " in suite "+suiteName);
		boolean issuteRunmode = Utility.isSuitableRunnable(suiteName, new Xls_Reader(prop.getProperty("xlsfilelocation")+"Suite.xlsx"));
		//System.out.println("Hello Test----"+prop.getProperty("xlsfilelocation"));
		boolean istestRunmode = Utility.isTestCaseRunnable(testname,  new Xls_Reader(prop.getProperty("xlsfilelocation")+suiteName+".xlsx"));
		boolean datasetRunmode = false;
			if(dataRunmode.equals(Constants.RUNMODE_YES))
					datasetRunmode = true;
			if(!(issuteRunmode && istestRunmode&&datasetRunmode))
				throw new SkipException("Skipping the test"+testname+"inside the suite "+suiteName);
			TestBase.Application_logs.debug("Step#1.5 : Skipping the test"+testname+"inside the suite "+suiteName);
}
}


	
