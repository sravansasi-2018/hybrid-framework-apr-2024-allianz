package com.allianz.utils;

import org.testng.annotations.DataProvider;

public class DataUtils {

	// create dataprovider and load data and connect to @Test
	// john,john123 , Invalid credentials
	// saul,saul123 , Invalid credentials
	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] data = new Object[2][3];
		// i -> number of testcase = 3 - 3 set of username and password
		// j -> number of parameters =2 - username and password
		data[0][0] = "john";
		data[0][1] = "john123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "saul";
		data[1][1] = "saul123";
		data[1][2] = "Invalid credentials";

		return data;
	}

}
