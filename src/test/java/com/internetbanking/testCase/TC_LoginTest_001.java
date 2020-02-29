package com.internetbanking.testCase;

import org.testng.annotations.Test;

import com.internetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass


{
	LoginPage lp;


	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		
		lp.setUserName(username);
		lp.setUserpassword(password);
		lp.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager Home Page"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
}
