package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.base.OHRMBase;
import com.ohrm.pages.AdminPage;
import com.ohrm.pages.DashboardPage;
import com.ohrm.pages.LoginPage;

public class AdminPageTest extends OHRMBase{
	
	LoginPage lp;
	DashboardPage dp;
	AdminPage ap;
	
	@BeforeMethod
	public void browserConfig()
	{
		initialization();
		lp = new LoginPage();
		dp = lp.login();
		ap = dp.dashboardtoAdminPage();
		
	}
	
	@Test
	public void systemUserSection()
	{
		Assert.assertTrue(ap.systemUserPresent());
	}
	
	@Test
	public void addUserTest()
	{
		ap.addUserTestPresent();
	}
	
	@AfterMethod
	public void closeSetup()
	{
		tearDown();
	}

}
