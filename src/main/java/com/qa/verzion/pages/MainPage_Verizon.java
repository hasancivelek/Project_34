package com.qa.verzion.pages;

import java.sql.Driver;

import org.apache.http.util.Asserts;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.qa.verzion.Util.JavaScriptUtil;
import com.qa.verzion.base.BasePage_Verizon;

public class MainPage_Verizon extends BasePage_Verizon{
	
	WebDriver driver;
	JavaScriptUtil javaScriptUtil;
	
	
	//Locators
	
	By shop= By.xpath("//button[@id='gnav20-Shop-L1']");
	By smartPhones=By.xpath("//a[@id='gnav20-Shop-L3-1']");
	By selectPhnoe= By.xpath("//div[@id='tile_dev13320013']//div[@class='tile-content isPhone']");
	
	//Constructor
	
	public MainPage_Verizon(WebDriver driver) {
		this.driver=driver;
		javaScriptUtil=new JavaScriptUtil();
	}
	//Methods
	
	public String getMainPageTitle() {
		javaScriptUtil.specificScrollPageDown(driver, 100);
		return driver.getTitle();
		
	}
	public Select_Phnoe shop() throws InterruptedException  {
		javaScriptUtil.specificScrollPageDown(driver, 900);
		WebElement element1= driver.findElement(shop);
		Actions action= new Actions(driver);
		action.moveToElement(element1).build().perform();
	
		driver.findElement(smartPhones).click();
		Thread.sleep(5000);
		javaScriptUtil.specificScrollPageDown(driver, 1200);
		WebElement element=driver.findElement(selectPhnoe);
		javaScriptUtil.clickElementByJS(element, driver);
		
		return new Select_Phnoe(driver);
		
		
		

	
	
		
	}

	}

	
	
		
		
		
		
	


