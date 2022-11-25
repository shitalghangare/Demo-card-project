package Testcasses;



import java.net.MalformedURLException;

import org.junit.Test;

import PageOm.verifylinks;
import resources.CU_for_links;
import resources.bbase;
import java.io.IOException;
import java.net.MalformedURLException;

import PageOm.verifylinks;
import resources.CU_for_links;
import resources.bbase;
//import org.testng.annotations.Test;
public class verifylinkstext  extends bbase{

	
		//verify all links text
		@Test
		
		public void verifylinktext() throws MalformedURLException, IOException
		{
			 System.out.println("Testcase:7 verify all links text...");
			verifylinks vl=new verifylinks(driver);
			CU_for_links.linktext1(vl.links1());
		 
		}
}
	
