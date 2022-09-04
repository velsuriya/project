package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePractice1 {
	WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void getUrl(String url) {
		driver.get(url);
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
