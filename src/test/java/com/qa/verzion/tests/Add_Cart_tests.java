package com.qa.verzion.tests;

import java.util.Properties;

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

public class Add_Cart_tests {
	
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
	add_Cart=new Add_Cart(driver);
	javaScriptUtil=new JavaScriptUtil();
	select_Phnoe=mainPage_Verizon.shop();
	add_Cart=select_Phnoe.clickCont();
	
 
	
	
}
@Test(priority=1)
public void newCostum(){
	add_Cart.newCostum();
	
}

@Test(priority=2)
public void verifyHeader() {
	String text= add_Cart.verifyHeaderTitle();
	System.out.println("Page header is : " + text);
	Assert.assertEquals(text, "Customize your device.");
}
@Test(priority=3)
public void clikCart() {
	add_Cart.clickCart();
}
@Test(priority=4)
public void menuMbl() {
	add_Cart.menuMobile();
}


@Test(priority=5)
public void correctPhone() {
	String verifyPhnoeTitle=add_Cart.verifyPhone();
	System.out.println("Correct phone is : " +verifyPhnoeTitle);
	Assert.assertEquals(verifyPhnoeTitle, "iPhone SE (2020)");
}
@Test(priority=6)
public void saveCart() {
	add_Cart.saveCart();
}

@AfterTest
public void tearDown() {
	driver.quit();
}

}
