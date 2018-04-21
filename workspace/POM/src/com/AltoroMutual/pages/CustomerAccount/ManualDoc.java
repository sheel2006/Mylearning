// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 01-05-2016 12:36:34
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ManualDoc.java

package com.AltoroMutual.pages.CustomerAccount;

import com.AltoroMutual.Base.Page;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class ManualDoc extends Page
{

    public ManualDoc()
    {
    }

    public void ReadingManual()
    {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        mouseactions("PDFReading");
    }
}
