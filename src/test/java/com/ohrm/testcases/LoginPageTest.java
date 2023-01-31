package com.ohrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.LoginPage;

public class LoginPageTest {
	
	LoginPage lp;
	
	
	@BeforeMethod
	public void browserConfig()
	{
		lp = new LoginPage();
		lp.initialization();
		
	}
	
	@Test
	public void validateTitleTest()
	{
		
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		
		
	}
	
	@Test
	public void validateLogin()
	{
		
		lp.login();
	}
	
	@Test
	public void forgotPasswordTest()
	{
		Assert.assertTrue(lp.forgotPasswordClick());
	}
	
	@Test
	public void companyLinkTest()
	{
		Assert.assertTrue(lp.getCompanyLink());
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}
	

}
