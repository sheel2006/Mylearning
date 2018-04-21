package com.qtpselenium.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.qtpselenium.util.Xls_Reader;

public class TestBase {

	public static Logger APP_LOGS =null;
	public static Properties prop =null;
	public static Properties OR   =null;
	public static Xls_Reader suiteXls  =null;
	public static Xls_Reader suiteAxls =null;
	public static Xls_Reader suiteBxls =null;
	public static Xls_Reader suiteCxls =null;
	public static boolean isinitialize =false;
	
public void initialize() throws Throwable{
	/* Purpose of this method to initialize logs,configuration file and xls files
	 * we can selenium webdriver/RC */
	// this will set variable set as "True" once initialize not initialize every time for each suite
	if(!isinitialize){
	/*************************initialize logs *****************************/
	APP_LOGS = Logger.getLogger("devpinoyLogger");
	/* initialize configuration file here to read data from com.qtpselenium.config*/
	/* This will read config.properties */
	/*************************Properties logs *****************************/
	APP_LOGS.debug("Step-1 : Loading Properties Files Starts....");
	prop = new Properties();
	FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\config.properties");
	prop.load(ip);
	/* This will read OR.properties */
	OR = new Properties();
	ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\OR.properties");
	OR.load(ip);
	APP_LOGS.debug("Step-2 : Loaded Properties Files successfully.... ");
	/****************************XLS initialize***************************/
	/*
	 * I have three four data sheets so in have to initialize three times
	 */
	APP_LOGS.debug("Step-3 : Loading Xls Files Starts.... ");
	suiteXls  = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\Suite.xlsx");
	suiteAxls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\A suite.xlsx");
	suiteBxls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\B suite.xlsx");
	suiteCxls = new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\xls\\C suite.xlsx");
	APP_LOGS.debug("Step-4 : Loaded Xls Files successfully.... ");
	isinitialize = false;
	
}

}
}
