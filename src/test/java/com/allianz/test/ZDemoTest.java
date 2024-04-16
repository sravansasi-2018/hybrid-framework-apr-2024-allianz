package com.allianz.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemoTest {
	
	@DataProvider
	public Object[][] validData()
	{
		Object[][] data = new Object[3][2];
		//i -> number of testcase = 3 - 3 set of username and password
		//j -> number of parameters =2 - username and password
		data[0][0] = "saul";
		data[0][1] = "saul123";
		
		data[1][0] = "peter";
		data[1][1] = "peter123";
		
		data[2][0] = "kim";
		data[2][1] = "kim123";
		
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validTest(String username, String password)
	{	
		System.out.println("valid test" + username + password);
		
	}
}
