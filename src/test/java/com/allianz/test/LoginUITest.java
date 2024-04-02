package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest {

	@Test(priority = 1)
	public void titleTest()
	{
		System.out.println("title test");
	}
	
	@Test(priority = 2)
	public void applicationDescription()
	{
		System.out.println("app");
	}
}
