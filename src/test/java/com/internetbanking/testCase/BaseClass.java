package com.internetbanking.testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String  baseURL="http://demo.guru99.com/V4/";
	public String  username="mngr248386";
	public String  password="pagYtUz";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
