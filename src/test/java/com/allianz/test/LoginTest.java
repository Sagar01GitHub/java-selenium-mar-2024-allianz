package com.allianz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
    WebDriver driver;
	
	@Test
	public void validLoginTest(){
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");   //click on login
		driver.findElement(By.xpath("//button[contains(normalize-space()='Login')]")).click(); //enter password admin123
		//assert the header dashboard
	String actualHeader = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
	Assert.assertEquals(actualHeader, "Dashboard");
	}
	
	@Test
	public void invalidLoginTest(String username, String password, String expectedError){
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);   //click on login
		driver.findElement(By.xpath("//button[contains(normalize-space()='Login')]")); //enter password admin123
		
		String actualError=driver.findElement(By.xpath("//p[contains(normalize-space()='Invalid')]")).getText();
		Assert.assertEquals(actualError, expectedError);
	
	}
	

}

