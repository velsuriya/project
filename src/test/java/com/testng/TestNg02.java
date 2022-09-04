package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Parameter

public class TestNg02 extends Base1 {
	@Parameters({ "username", "password" })
	@Test
	private void tc01(String s, String s2) {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maximize();

		WebElement txtuser = driver.findElement(By.id("email"));
		type(txtuser, s);

		WebElement txtpass = driver.findElement(By.id("pass"));
		type(txtpass, s2);

		WebElement btnclick = driver.findElement(By.name("login"));
		click(btnclick);

	}

}
