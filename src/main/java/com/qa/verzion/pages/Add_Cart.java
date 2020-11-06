package com.qa.verzion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.verzion.Util.JavaScriptUtil;
import com.qa.verzion.base.BasePage_Verizon;


public class Add_Cart extends BasePage_Verizon{
	WebDriver driver;
	JavaScriptUtil javaScriptUtil;

	By newCostumer = By.xpath("//button[contains(text(),'New Customer')]");
	By headerTitle = By.xpath("//h1[contains(text(),'Customize your device.')]");
	By clickCart = By.xpath("//button[@class='gnav20-cart' and @aria-label='Shopping Cart Menu']");
	By cartMenu = By.xpath("//a[contains(text(),'Mobile solutions')]");
	By verifyPhn = By.xpath("//span[contains(text(),'iPhone SE (2020)')]");
	By saveCart = By.xpath("//a[@class='saveCartPadding' and @role='link']");
	By save = By.xpath("//button[contains(text(),'Save')]");
	By send = By.xpath("//input[@name='email']");

	public Add_Cart(WebDriver driver) {
		this.driver = driver;
		javaScriptUtil = new JavaScriptUtil();
	}

	public void newCostum() {
		driver.findElement(newCostumer).click();

	}

	public String verifyHeaderTitle() {
		return driver.findElement(headerTitle).getText();
	}

	public void clickCart() {
		WebElement element = driver.findElement(clickCart);
		javaScriptUtil.clickElementByJS(element, driver);

	}

	public void menuMobile() {
		WebElement element = driver.findElement(cartMenu);
		javaScriptUtil.clickElementByJS(element, driver);
	}

	public String verifyPhone() {
		return driver.findElement(verifyPhn).getText();
	}

	public void saveCart() {
		driver.findElement(saveCart).click();
		WebElement element = driver.findElement(send);
		element.sendKeys("asdf@gmail.com");

		WebElement element1 = driver.findElement(save);
		javaScriptUtil.clickElementByJS(element1, driver);

	}

}
