package com.crm.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JustLoginTest {
	
	
	@Test
	public void log()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		
		driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("#loginButton")).click();
		driver.close();
	}

}
