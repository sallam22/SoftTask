package com.soft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	// methods

	public void setHover() {
		// Locating the Main Menu (women element)

		WebElement women = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));

		Actions actions = new Actions(driver);

		// Hovering on main menu women
		actions.moveToElement(women);

		// Locating the element from Sub Menu tops

		WebElement tops = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		// To mouse over on tops
		actions.moveToElement(tops);

		WebElement sweatshirts = driver.findElement(By.xpath("//*[@id=\"ui-id-12\"]/span"));

		// To mouse over on sweat shirts
		actions.moveToElement(sweatshirts);

		actions.click().build().perform();

	}

}
