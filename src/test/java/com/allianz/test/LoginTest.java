package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test
	public void validLoginTest() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		// enter password admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		// Assert the header - Dashboard
		String dash = driver
				.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"))
				.getText();
		Assert.assertEquals(dash, "Dashboard");
	}

	@Test(dataProvider = "invalidLoginData", dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username, String password, String expectedError) {
		driver.findElement(By.name("username")).sendKeys(username);
		// enter password bala123
		driver.findElement(By.name("password")).sendKeys(password);
		// click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		// Assert the error - Invalid credentials
		String error = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"))
				.getText();
		Assert.assertEquals(error, expectedError);

	}
}
