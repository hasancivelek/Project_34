package com.qa.verzion.tests;

import java.util.Properties;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.verzion.Util.JavaScriptUtil;
import com.qa.verzion.base.BasePage_Verizon;
import com.qa.verzion.pages.MainPage_Verizon;
import com.qa.verzion.pages.Select_Phnoe;

public class MainPage_Verizon_test {
	
	WebDriver driver;
	
	BasePage_Verizon basePage_Verizon;
	
	Properties prop;
	
	MainPage_Verizon mainPage_Verizon;
	
	 Select_Phnoe select_Phone;
	 JavaScriptUtil javaScriptUtil;
	
	@BeforeMethod
	public void setUp() {
		basePage_Verizon=new BasePage_Verizon();
		prop=basePage_Verizon.init_properties();
		String browserName=prop.getProperty("browser");
		driver=basePage_Verizon.init_driver(browserName);
		driver.get(prop.getProperty("url")); //BasePage_Verizon icerisine koydum.
javaScriptUtil= new JavaScriptUtil();
		mainPage_Verizon= new MainPage_Verizon(driver);
		select_Phone=new Select_Phnoe(driver);
			
	}
	@Test(priority=1)
	public void verifyMainPageTitle(){
	
		String title= mainPage_Verizon.getMainPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Verizon: Wireless, Internet, TV and Phone Services | Official Site");
	
	}
	@Test(priority=2)
	public void shop() throws InterruptedException  {
	
		Select_Phnoe select_Phnoe=mainPage_Verizon.shop();
		

		
		 
	}
	
@AfterMethod

public void tearDown() {
	driver.quit();
}
}

