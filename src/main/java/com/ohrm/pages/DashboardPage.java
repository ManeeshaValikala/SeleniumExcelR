package com.ohrm.pages;

import org.openqa.selenium.By;

import com.ohrm.base.OHRMBase;

public class DashboardPage extends OHRMBase{
	
	
	public boolean myActionPresent()
	{
		return driver.findElement(By.xpath("//p[text()='My Actions']")).isDisplayed();
	}
	
	public boolean quickLaunchPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Quick Launch']")).isDisplayed();
		
	}
	
	public boolean buzzLatestPostsPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Buzz Latest Posts']")).isDisplayed();
		
	}
	
	public boolean employeesLeaveTodayPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).isDisplayed();
		
	}
	
	public boolean employteeDistributionSubUnitPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Sub Unit']")).isDisplayed();
		
	}
	
	public boolean employeeDistributionLocationPresent()
	{
		return driver.findElement(By.xpath("//p[text()='Employee Distribution by Location']")).isDisplayed();
		
	}
	
	public AdminPage dashboardtoAdminPage()
	{
		driver.findElement(By.cssSelector("a[href='/web/index.php/admin/viewAdminModule']")).click();
		return new AdminPage();
	
		
	}

}
