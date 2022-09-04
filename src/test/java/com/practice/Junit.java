package com.practice;

import org.junit.AfterClass; 
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	// private void before() {
	// long time = System.currentTimeMillis();
	// System.out.println(time);

//	}

	// private void after() {
	// long time1 = System.currentTimeMillis();
	// System.out.println(time1);
	// }

	// private void login() {

	// }

}
