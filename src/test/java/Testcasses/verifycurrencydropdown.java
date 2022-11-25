package Testcasses;



import PageOm.verifycurrency;
import resources.Cu_for_currency;
import resources.bbase;
import resources.pricedata;
import PageOm.verifycurrency;
import resources.Cu_for_currency;
import resources.bbase;
import resources.pricedata;

import org.testng.annotations.Test;
public class verifycurrencydropdown extends bbase {


	
		
		public void currency() throws InterruptedException
		{
		System.out.println("Testcase:3 verify currency dropdown...");
		verifycurrency vc=new verifycurrency(driver);	
		vc.cu().click();
		Cu_for_currency.button11(vc.button1(),pricedata.currancyname);
		Thread.sleep(10000);
		}
}
	
	
	
	
	
