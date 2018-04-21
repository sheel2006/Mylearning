// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 01-05-2016 12:34:56
// Home Page:  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   FundTransfer.java

package com.AltoroMutual.pages.CustomerAccount;

import com.AltoroMutual.Base.Page;
import java.util.Properties;

// Referenced classes of package com.AltoroMutual.pages.CustomerAccount:
//            ManualDoc

public class FundTransfer extends Page
{

    public FundTransfer()
    {
    }

    public String fundTransfer()
    {
        click("FromAccount");
        mouseactions("FromAccountCheck");
        click("ToAccount");
        mouseactions("ToAccountSav");
        input("TransactionAmtpath", or.getProperty("TransactionAmt"));
        click("TransferMoney");
        return gettext("trxmsg");
       
    }
  
    public ManualDoc ManualDocPage(){
    	javascriptclick("inSideManual");
    	return new ManualDoc();
    }
  
}
