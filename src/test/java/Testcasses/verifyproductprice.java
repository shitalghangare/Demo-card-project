package Testcasses;



import PageOm.productprice;
import resources.Cuforprice;
import resources.bbase;
import resources.pricedata;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import PageOm.productprice;
//import resources.CUforprice;
import resources.bbase;
import resources.pricedata;
import resources.regiterdata;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import PageOm.productprice;
import resources.Cuforprice;
import resources.bbase;
import resources.pricedata;
import resources.regiterdata;
public class verifyproductprice extends bbase{
	

	//extends bba
	
		@Test
		public void price() throws InterruptedException
		{
			System.out.println("Testcase:5 verify product price....");
			productprice p=new productprice(driver);
			p.search1().sendKeys(pricedata.sp1);
			p.searchbbb1().click();
			//p.pname1();
			Cuforprice.findprice(p.pname1(),p.pprice1(),p.addcard1(),pricedata.firstpname);
			Double firstproduct=Cuforprice.iphone;
			System.out.println("first product price=="+firstproduct);
			Thread.sleep(5000);
			p.search1().clear();
			p.search1().sendKeys(pricedata.sp2);
			p.searchbbb1().click();
			Thread.sleep(5000);
			//p.pname1();
			Cuforprice.findprice(p.pname1(),p.pprice1(),p.addcard1(),pricedata.secongpname);
			Double secondproduct=Cuforprice.iphone;
			System.out.println("second product price=="+secondproduct);
			Double price=firstproduct+secondproduct;
			String finaltotal="$"+price;
			System.out.println("total price=="+finaltotal);
			
			p.carddetail1().click();
			Cuforprice.addcardprice(p.totalprice1(),finaltotal);
			
			
			
	}
	//normal way 

}

	
		
			
		
		

	
				
		
		
				
			
		
