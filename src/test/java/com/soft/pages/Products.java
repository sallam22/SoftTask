package com.soft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

	public WebDriver driver;

	public Products( WebDriver driver) {
		
		
		this.driver=driver;
	}
	
	
	
	//locators
	By sweatShart=By.xpath("//a[contains(text(),'Cassia Funnel Sweatshirt')]");
	By smallSize=By.xpath("//div[@option-id='167']");
	By whiteColor=By.xpath("//div[@option-id='59']");
	By addToCart=By.xpath("//span[contains(text(),'Add to Cart')]");
	By message=By.xpath("//a[contains(text(),'shopping cart')]");
	
	// methods
	public void addSweatShart() {
		
		driver.findElement(sweatShart).click();
		
		
	}
	
	public void checkCart() {
		driver.findElement(smallSize).click();
		driver.findElement(whiteColor).click();
		driver.findElement(addToCart).click();
		
	}
	
	public String getSuccess() {
		
		
		return (driver.findElement(message).getText());
	}
	
	
}
