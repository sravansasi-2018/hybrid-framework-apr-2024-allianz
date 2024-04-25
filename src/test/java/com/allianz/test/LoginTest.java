package com.allianz.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.DashboardPage;
import com.allianz.pages.LoginPage;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username,String password,String expectedHeader) {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();
		
		DashboardPage dashboardPage = new DashboardPage(driver);

		String actualHeader = dashboardPage.getDashboardHeader();
		Assert.assertEquals(actualHeader,expectedHeader);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		String actualError = loginPage.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
