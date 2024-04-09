package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		//click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		//Assert the header - Dashboard
		String dash = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		Assert.assertEquals(dash, "Dashboard");
	}
	
	@Test
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password bala123
		driver.findElement(By.name("password")).sendKeys("bala123");
		//click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		//Assert the error - Invalid credentials
		String error = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		Assert.assertEquals(error, "Invalid credentials");
		
				
				
	}
}
