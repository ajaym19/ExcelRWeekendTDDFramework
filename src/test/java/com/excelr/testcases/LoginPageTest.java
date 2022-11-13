package com.excelr.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.excelr.base.ExcelRBase;
import com.excelr.pages.LoginPage;

public class LoginPageTest extends ExcelRBase{
	
	/*
	 * Mistakes:
	 * 1. Duplicating the browser config code - Resolved
	 * 2. Hard Coding of data
	 * 3. Mixing of code and testcases
	 */
	LoginPage lp; 
	
	@BeforeMethod
	public void browserConfig() {
		initialization();
		lp = new LoginPage();
	}
	
	@Test
	public void validateLoginTest() {
		//Assertion needs to be applied over here
		lp.login();
		
	}
	
	@Test
	public void validateLogoTest() {
		boolean logo = lp.getLogo();
		Assert.assertTrue(logo);
	}
	
	@Test
	public void forgotPasswordLinkTest() {
		//in next session
	}
	
	@Test
	public void validateTitleTest() {
		String actTitle = lp.getTitle();
		String expTitle = "OrangeHRM";
		Assert.assertEquals(actTitle, expTitle);	
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
