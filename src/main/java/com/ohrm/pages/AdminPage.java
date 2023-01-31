package com.ohrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ohrm.base.OHRMBase;

public class AdminPage extends OHRMBase{
	
	public boolean systemUserPresent()
	{
		
		return driver.findElement(By.cssSelector(".oxd-table-filter-title")).isDisplayed();
		
	}
	
	public void addUserTestPresent()
	{
		
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		Select sc = new Select(dropdown);
		sc.selectByValue("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paul  Collings");
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")).isSelected();
		
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Maneesha");
		
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")).sendKeys("admin123");
		
		
	}
	


}
