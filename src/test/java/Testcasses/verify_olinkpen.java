package Testcasses;


import java.net.MalformedURLException;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import PageOm.verifylinks;
import resources.bbase;
import resources.linkdata;
import java.io.IOException;
import java.net.MalformedURLException;

import PageOm.verifylinks;
import resources.CU_for_links;
import resources.bbase;
import resources.linkdata;

//import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class verify_olinkpen extends bbase {
	
	
		public void openlinks() throws MalformedURLException, IOException, InterruptedException
		{
			 System.out.println("Testcase:8 verify  link is open or not...");
			verifylinks v3=new verifylinks(driver);
		//	System.out.println()
			Thread.sleep(5000);
		//	driver.getTitle()
//		CU_for_links.linkopen1(v3.links1(),v3.linktext1());
		SoftAssert sa=new SoftAssert();
			for(int i=0;i<v3.links1().size();i++)
			{
				String text=v3.links1().get(i).getText();
				System.out.println("text"+text);
				if(text.equalsIgnoreCase(linkdata.linktital))
				{
					Thread.sleep(5000);
					v3.links1().get(i).click();
					//System.out.println(driver.getTitle());
					Thread.sleep(5000);
					String s=v3.linktext1().getText();
					System.out.println("actual text"+s);
					
					sa.assertEquals(linkdata.actualvalue,s);
					break;
				}
			
			
		     }
			  sa.assertAll();
		
		}
}
	
