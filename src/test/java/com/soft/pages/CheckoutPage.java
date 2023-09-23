package com.soft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckoutPage {

	public WebDriver driver;

	public CheckoutPage(WebDriver driver) {

		this.driver = driver;
	}

	// locators
	By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
	By ProceedCheckout = By.xpath("//span[contains(text(),'Proceed to Checkout')]");
	By clickNext = By.xpath("//span[contains(text(),'Next')]");

	By bestWay = By.xpath("//td[@id='label_carrier_bestway_tablerate']");
	By placeOrder = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button");

	By successMessage=By.xpath("//span[contains(text(),'Thank you for your purchase!')]");

	// methods
	public void makeCheckout() {
		driver.findElement(shoppingCart).click();
		driver.findElement(ProceedCheckout).click();
		driver.findElement(bestWay).click();
		driver.findElement(clickNext).click();
		/*
		WebElement element = driver.findElement(placeOrder);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		

		
		 * driver.findElement(EmailAddress).sendKeys("sallamfcis@gmail.com");
		 * driver.findElement(firstName).sendKeys("sayed");
		 * driver.findElement(lastName).sendKeys("sallam");
		 * driver.findElement(company).sendKeys("soft");
		 * driver.findElement(street).sendKeys("sallam22");
		 * driver.findElement(city).sendKeys("cairo");
		 * driver.findElement(code).sendKeys("12345-6789");
		 * driver.findElement(phone).sendKeys("01002366487");
		 * driver.findElement(shippingMethods).click();
		 */

	}
	public void makePlaceOrder() {
		
		 WebElement element = driver.findElement(placeOrder);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);		
	}
	
	public String purchaseMessage() {
		
		
		return(driver.findElement(successMessage).getText());
	}
}
