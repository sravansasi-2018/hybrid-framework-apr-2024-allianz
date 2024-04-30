package com.allianz.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {
	
	protected WebDriver driver;
	
	public WebDriverKeywords(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setInputText(By locator, String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	
	public void clickElement(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public String getText(By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public String getAttributeValue(By locator,String attributeName)
	{
		return driver.findElement(locator).getAttribute(attributeName);
	}
}
