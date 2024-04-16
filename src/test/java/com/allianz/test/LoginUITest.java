package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	@Test(priority = 1)
	public void titleTest() {
		// Get the title of the page
		String title = driver.getTitle();

		// Print the title
		System.out.println("Page Title: " + title);

		Assert.assertEquals(title, "OrangeHRM");

		// Close the browser
		driver.quit();
	}

	@Test(priority = 2)
	public void applicationDescription() {
		String actualVersion = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
		System.out.println("Page Title: " + actualVersion);
		Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.1");
		driver.quit();
	}
}
