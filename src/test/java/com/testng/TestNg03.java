package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// @optional
public class TestNg03 extends Base1 {

	@Parameters({ "username", "Password" })
	@Test
	private void tc02(String s, @Optional("akash@gmail.com") String s2) {
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
