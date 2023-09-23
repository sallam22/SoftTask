package com.soft.testCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL="https://magento.softwaretestingboard.com/";

	public  WebDriver driver;
	
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeClass

    public void setup(){
	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
        

}
	
	@AfterClass
	public void close() {
		// driver.quit();
	}

}
