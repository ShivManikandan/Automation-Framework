package com.internetbanking.testCase;

import org.testng.annotations.Test;

import com.internetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass


{
	
	@Test
	public void loginTest()
	{
		LoginPage lp = new LoginPage(driver);
		driver.get(baseURL);
		lp.setUserName(username);
		lp.setUserpassword(password);
		lp.clicksubmit();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
}
