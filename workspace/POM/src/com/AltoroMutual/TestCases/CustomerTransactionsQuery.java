
package com.AltoroMutual.TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.AltoroMutual.Base.Page;
import com.AltoroMutual.Util.TestUtil;
import com.AltoroMutual.pages.CustomerAccount.CustomerAccount;
import com.AltoroMutual.pages.CustomerAccount.CustomerfindTransactions;
import com.AltoroMutual.pages.CustomerLogin.CustLoginPage;


public class CustomerTransactionsQuery
{
	@Test
    public void CustomerTransactionsQuery()
    {
    	if(!TestUtil.isTestExecutable("CustomerFundTrx", Page.xls))
        	throw new SkipException("CustomerFundTrx is not executable, Check Status in TestSceanrios.xls");
        		CustomerAccount custaccpage = null;
        			//System.out.println("Page.isLoggedIn   "+Page.isLoggedIn);
        			if(!Page.isLoggedIn)
        				{ 	CustLoginPage loginpage = new CustLoginPage();
        					custaccpage = loginpage.dologin();
        					
        				} else {
        					custaccpage = Page.topmenu.gotolandingpage();
        						}
        			CustomerfindTransactions fundtrx= custaccpage.ViewRecentTrxPage();
        			String trxid =fundtrx.Transactionenquery();
        			Assert.assertEquals(Page.or.getProperty("Trxidvalue"), trxid, "Trx id failed in assertion");
        			fundtrx.Fundtransferpage();
        }
    }

