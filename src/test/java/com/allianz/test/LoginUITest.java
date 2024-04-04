package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

	@Test(priority = 1)
	public void titleTest()
	{
		
	        // Instantiate ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        // Navigate to a webpage
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

	        // Get the title of the page
	        String title = driver.getTitle();

	        // Print the title
	        System.out.println("Page Title: " + title);
	        
	        Assert.assertEquals(title, "OrangeHRM");
	        
	        // Close the browser
	        driver.quit();
	}
	
	@Test(priority = 2)
	public void applicationDescription()
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Navigate to a webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        
        String actualVersion=driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.6.1']")).getText();
        System.out.println("Page Title: " + actualVersion);
        Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.1");
        driver.quit();
	}
}
