package com.internetbanking.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String  baseURL="http://demo.guru99.com/V4/";
	public String  username="mngr248386";
	public String  password="pagYtUz";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
