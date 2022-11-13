package com.excelr.pages;

import org.openqa.selenium.By;

import com.excelr.base.ExcelRBase;

public class LoginPage extends ExcelRBase{

	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean getLogo() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
