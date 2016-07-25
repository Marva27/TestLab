package com.srinimarva.testlab;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
	WebDriver browser;
	
	@BeforeMethod
	public void openBrowser(){
		browser = new FirefoxDriver();
		browser.get("http://www.google.co.in");
	}
	
	@Test
	public void printTitle(){
		System.out.println(browser.getTitle());
	}
	
	@AfterMethod
	public void closeBrowser(){
		browser.quit();
	}

}
