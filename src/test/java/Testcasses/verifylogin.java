package Testcasses;



import PageOm.Login;
import PageOm.ragister;
import resources.CommonUtilities;
import resources.bbase;
import resources.regiterdata;
import org.testng.annotations.Test;

import PageOm.ragister;
import PageOm.Login;
import resources.bbase;
import resources.CommonUtilities;
import resources.regiterdata;
public class verifylogin extends bbase{
	

	

		@Test
		public void login() throws InterruptedException
		{
		System.out.println("Testcase:2 verify login...");
		ragister ra = new ragister(driver);
		Thread.sleep(5000);
		ra.myacc().click();//dropdown
		Thread.sleep(2000);
		//commonUtilities.dropdown(re.myacc());
		CommonUtilities.my(ra.register1(),regiterdata.login);
		Login lo=new Login(driver);	
		lo.gmail1().sendKeys(regiterdata.gmaillogin);
		lo.password1().sendKeys(regiterdata.password);
		Thread.sleep(5000);
		
		lo.submit1().click();
		Thread.sleep(5000);
		
		}
}
	
