package com.practice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTrue {

	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

//	@Before
//	public void before() {
//		long time = System.currentTimeMillis();
//		System.out.println(time);
//	}

	@Test
	public void login() {
//		WebElement txtusername = driver.findElement(By.id("username"));
//		txtusername.sendKeys("Greens8767");
//		String name = txtusername.getAttribute("value");
//		Assert.assertEquals("verify username", "Greens8767", name);
//
//		WebElement txtpass = driver.findElement(By.id("password"));
//		txtpass.sendKeys("QN8V3A");
//		String pass = txtpass.getAttribute("value");
//		Assert.assertEquals("verify pass", "QN8V3A", pass);
//
//		WebElement btnlogin = driver.findElement(By.name("login"));
//		btnlogin.click();
//
//		String title = driver.getTitle();
//		boolean b = title.contains("com");
//		Assert.assertTrue("verify title", b);
		
		System.out.println("start......");
		Assert.assertTrue("verify username", true);
		Assert.assertTrue("verify pass", false);
		Assert.assertTrue("verify button", true);
		System.out.println("End....");
		
	}
	@Test
	public void text() {
		System.out.println("text1");
	}
	
	
	

//	@After
//	public void after() {
//		long time1 = System.currentTimeMillis();
//		System.out.println(time1);
//	}

//	@AfterClass
//	public static void afterclass() {
//		driver.quit();
//
//	}

}
