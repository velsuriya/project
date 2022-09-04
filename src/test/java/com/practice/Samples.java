package com.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samples {
	
	
	static WebDriver driver;

@BeforeClass
	public static void beforeclass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

@Before
public void before() {
	long time = System.currentTimeMillis();
    System.out.println(time);
}
@Test
public void login() {
	WebElement txtusername = driver.findElement(By.id("username"));
    txtusername.sendKeys("Greens");
    
    WebElement txtpassword = driver.findElement(By.id("password"));
    txtpassword.sendKeys("123456");
    
    WebElement btnlogin = driver.findElement(By.id("login"));
    btnlogin.click();
    
}
@After
public void after() {
	long time1 = System.currentTimeMillis();
	System.out.println(time1);
}


@AfterClass
public static void afterclass() {
		driver.quit();		
	}


}

