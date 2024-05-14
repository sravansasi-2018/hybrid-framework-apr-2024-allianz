package com.allianz.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ZDemo3Extent {

	public static void main(String[] args) {
		
		//initialize report - run only once before all the @Test method
		//@BeforeSuite
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		
		//before the @Test method //@BeforeMethod
		ExtentTest test=extent.createTest("MyFirstTest123");
		
		//after the @Test method //@AfterMethod
		test.log(Status.FAIL, "This is a logging event for MyFirstTest123, and it passed!");
		
		//run at the end after all @Test
		//@AfterSuite
		extent.flush();


	}

}