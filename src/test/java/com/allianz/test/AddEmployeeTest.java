package com.allianz.test;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper {
	
	@Test
	public void uploadInvalidDisplayPictureTest()
	{
		File file = new File("src/test/resources/files/xpath.txt");
		String path =	file.getAbsolutePath();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM menu
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		//click on add employee
		driver.findElement(By.linkText("Add Employee")).click();
		//upload the pdf file instead of image
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);
		//Assert the error - File type not allowed
		String actualError = driver.findElement(By.xpath("//span[contains(normalize-space(),'File type')]")).getText();
		Assert.assertTrue(actualError.contains("File type not allowed")); //expect true
	}

}