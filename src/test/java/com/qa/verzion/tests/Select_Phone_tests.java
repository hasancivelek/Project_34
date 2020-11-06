package com.qa.verzion.tests;


import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verzion.Util.JavaScriptUtil;
import com.qa.verzion.base.BasePage_Verizon;
import com.qa.verzion.pages.Add_Cart;
import com.qa.verzion.pages.MainPage_Verizon;
import com.qa.verzion.pages.Select_Phnoe;



public class Select_Phone_tests {
	
	WebDriver driver;
	BasePage_Verizon basePage_Verizon;
	MainPage_Verizon mainPage_Verizon;
	Properties prop;
	Select_Phnoe select_Phnoe;
	JavaScriptUtil javaScriptUtil;
	Add_Cart add_Cart;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		basePage_Verizon=new BasePage_Verizon();
		prop=basePage_Verizon.init_properties();
		String browserName=prop.getProperty("browser");
		driver=basePage_Verizon.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		mainPage_Verizon= new MainPage_Verizon(driver);
		select_Phnoe=new Select_Phnoe(driver);
		javaScriptUtil=new JavaScriptUtil();
		
		 select_Phnoe=mainPage_Verizon.shop();
		 
		 
		 }
	
	@Test(priority=1)
	public void verifyHeader() {
	String text=select_Phnoe.pageHeader();
	System.out.println("main page header is "+text);
	Assert.assertEquals(text, "Apple iPhone SE (2020)");
	
	}
	@Test(priority=2)
	public void select() throws InterruptedException{
		
   select_Phnoe.selectCostum();
   }
	@Test(priority=3)
	public void thanks()  {
		select_Phnoe.NoThanks();
	}
	@Test (priority=4)
	public void contClick() {
	Add_Cart add_Cart=select_Phnoe.clickCont();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}






	


	
	

