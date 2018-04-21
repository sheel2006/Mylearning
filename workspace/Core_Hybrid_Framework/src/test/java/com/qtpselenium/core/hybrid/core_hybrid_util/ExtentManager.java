package com.qtpselenium.core.hybrid.core_hybrid_util;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
        	Date d = new Date();
        	String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";
        //  extent = new ExtentReports("D:\\report\\" + fileName, Boolean.valueOf(true), DisplayOrder.NEWEST_FIRST);
        	extent = new ExtentReports(System.getProperty("user.dir")+"\\Extent_Reports\\"+fileName, Boolean.valueOf(true), DisplayOrder.NEWEST_FIRST);
        	extent.loadConfig(new File(System.getProperty("user.dir") + "//ReportsConfig.xml"));
            extent.addSystemInfo("Selenium Version", "2.53.0").addSystemInfo("Environment", "QA");
        }
        return extent;
    }
}
