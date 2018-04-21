package com.AltoroMutual.pages.CustomerAccount;

import com.AltoroMutual.Base.Page;

// Referenced classes of package com.AltoroMutual.pages.CustomerAccount:
//            CustomerfindTransactions

public class CustomerAccount extends Page
{

    public CustomerAccount()
    {
    }

    public String Savingaccountprofile()
    {
        click("AccoutDetailsDropList");
        mouseactions("AccountDetailSav");
        click("AccountClick");
        gettext("Accountno");
        System.out.println("Savingaccountprofile-- CustomerAccount");
		return gettext("Accountno");

    }

    public String Checkingaccountprofile()
    {
        click("AccoutDetailsDropList");
        System.out.println("Checkingaccountprofile #1-- CustomerAccount");
        mouseactions("AccountDetailChe");
        click("AccountClick");
        String checkingaccountno = gettext("Accountno");
        return checkingaccountno;
       
    }
    
    public CustomerfindTransactions ViewRecentTrxPage(){
    	click("ViewRecentTrx");
    	 return new CustomerfindTransactions();
    }
}
