// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 01-05-2016 12:19:25
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   CustomerfindTransactions.java

package com.AltoroMutual.pages.CustomerAccount;

import com.AltoroMutual.Base.Page;
import java.util.Properties;

// Referenced classes of package com.AltoroMutual.pages.CustomerAccount:
//            FundTransfer

public class CustomerfindTransactions extends Page
{

    public CustomerfindTransactions()
    {
    }

    public String  Transactionenquery()
    {
        input("TransactionAftDate", or.getProperty("TransactionAftDateText"));
        isElementPresent("TransactionAftDate");
        input("TransactionBefDate", or.getProperty("TransactionBefDateText"));
        isElementPresent("TransactionBefDate");
        click("TransactionSummary");
        String trxid = gettext("Trxid");
        return trxid;
       }

    public void TransactionDateRange()
    {
    }

    public FundTransfer Fundtransferpage()
    { 
        click("FundTransferLink");
        return new FundTransfer();
    	
    }
}
