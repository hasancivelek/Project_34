package com.qa.verzion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.verzion.Util.JavaScriptUtil;
import com.qa.verzion.base.BasePage_Verizon;

public class Select_Phnoe extends BasePage_Verizon {

	WebDriver driver;
	JavaScriptUtil javaScriptUtil;
	

	
	By pageHeaderSelectPhone=By.xpath("//span[contains(text(),'Apple iPhone SE (2020)')]");
	By color = By.xpath("//input[@id='#F9F8F3']");
	By size = By.xpath("//p[contains(text(),'64GB')]");
	By price = By.xpath("//input[@id='pricingOption1']");
	By thanks = By.xpath("//input[@type='radio' and @name='promo option' and @id='NONE']");
	By cont = By.xpath("//button[@id='ATC-Btn']");
	By zipcode=By.id("zipcode");
	By confirmZipcode=By.xpath("//button[contains(text(),'Confirm Location')]");
	By newCostumer= By.xpath("//button[contains(text(),'New Customer')]");
	
	
	public Select_Phnoe(WebDriver driver) {
		this.driver = driver;
		javaScriptUtil= new JavaScriptUtil();
		
}
	public String pageHeader() {
		return driver.findElement(pageHeaderSelectPhone).getText();
		}

	public void selectCostum() throws InterruptedException {
		Thread.sleep(5000);
		javaScriptUtil.specificScrollPageDown(driver, 1000);
		WebElement element=driver.findElement(color);
		javaScriptUtil.clickElementByJS(element, driver);
	javaScriptUtil.specificScrollPageDown(driver, 1000);
	WebElement element1=driver.findElement(size);
	javaScriptUtil.clickElementByJS(element1, driver);
			javaScriptUtil.specificScrollPageDown(driver, 1000);
			WebElement element2=driver.findElement(price);
		 javaScriptUtil.clickElementByJS(element2, driver);
	
		

	}
	

	public void NoThanks() {
	
		javaScriptUtil.specificScrollPageDown(driver, 1000);
		WebElement element=driver.findElement(thanks);
		javaScriptUtil.clickElementByJS(element, driver);
	
	}
	

	public Add_Cart clickCont() {
		javaScriptUtil.specificScrollPageDown(driver, 1000);
		WebElement element=driver.findElement(cont);
		javaScriptUtil.clickElementByJS(element, driver);
		driver.findElement(zipcode).sendKeys("78239");
		driver.findElement(confirmZipcode).click();
		
		
		
		return new Add_Cart(driver);
				
		}

	
	}
	


