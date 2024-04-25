package com.allianz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.allianz.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords{
	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public  void enterUsername(String username)
	{		
		setInputText(usernameLocator,username);
		
	}
	public  void enterPassword(String password)
	{
		setInputText(passwordLocator,password);
	}
	public void clickOnLogin()
	{
		clickElement(loginLocator);
	}
	
	//getInvalidErrorMessage()-->should return String
	public String getInvalidErrorMessage()
	{
		return driver.findElement(errorLocator).getText();
	}

}
