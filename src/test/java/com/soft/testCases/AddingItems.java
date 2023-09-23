package com.soft.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.soft.pages.CheckoutPage;
import com.soft.pages.HomePage;
import com.soft.pages.Products;
import com.soft.pages.loginPage;

public class AddingItems extends BaseClass {

	@Test
	public void loginWithValidCreditanls() {

		driver.get(baseURL);
		// login
		loginPage login = new loginPage(driver);
		login.clickSignin();
		login.setLogin("sallamfcis@gmail.com", "sallam123123@");
		login.clickLogin();
		
		// Home page
		HomePage home = new HomePage(driver);
		home.setHover();

		// products

		Products product = new Products(driver);
		product.addSweatShart();

		product.checkCart();

		Assert.assertEquals(product.getSuccess(), "shopping cart");
		
		//checkout
		
		CheckoutPage item=new CheckoutPage(driver);
		item.makeCheckout();
		item.makePlaceOrder();
		Assert.assertEquals(item.purchaseMessage(), "Thank you for your purchase!");
		

	}
}
