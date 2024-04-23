package com.allianz.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	@DataProvider
	public Object[][] invalidLoginData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="john";
		data[0][1]="john123";
		data[0][2]="Invalid credentials";
		
		data[1][0]="saul";
		data[1][1]="saul123";
		data[1][2]="Invalid credentials";
		
		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//Current @Test name is sheetname
		String currentTestName=mtd.getName();
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/test_data/hrm_data.xlsx", currentTestName);
		return data;
	}
	

}