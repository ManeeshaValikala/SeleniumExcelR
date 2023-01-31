package com.ohrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ohrm.base.OHRMBase;

public class LoginPage extends OHRMBase {

	
	
	public DashboardPage login()
	{
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//return driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
		return new DashboardPage();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean forgotPasswordClick()
	{
		driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
		return driver.findElement(By.xpath("//h6[text()='Reset Password']")).isDisplayed();
		
	}
	
	public boolean getCompanyLink()
	{
		return driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).isDisplayed();
	}
	
	

}
