package com.testng;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base1 {

	public Login() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtUsername;

	@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void login1(String Username, String Password) {

		type(getTxtUsername(), Username);
		type(getTxtpassword(), Password);
		click(getBtnlogin());

	}

}
