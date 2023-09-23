package com.soft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	 public WebDriver driver;
	 public loginPage(WebDriver driver) {
		 
		 this.driver=driver;
		
		
	 }
	 
	// locators
	
	  By clickSign=By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]");
	  By userEmail=By.id("email");
	  By userPassword=By.id("pass");
	  By signBtn = By.id("send2");
	  
	  // methods
	  
	  public void clickSignin() {
		  
		  driver.findElement(clickSign).click();
	  }
	  
	  public void setLogin(String useremail, String password) {
		      
		      driver.findElement(userEmail).sendKeys(useremail);
		      driver.findElement(userPassword).sendKeys(password);
		  
	  }
	  
	  public void clickLogin() {
		  
		         driver.findElement(signBtn).click();
		  
	  }
	  

}
