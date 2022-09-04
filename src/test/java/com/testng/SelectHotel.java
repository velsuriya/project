package com.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SelectHotel extends Base1 {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement clickRadioBtn;

	@FindBy(id = "continue")
	private WebElement clickContinue;

	public WebElement getClickRadioBtn() {
		return clickRadioBtn;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}

	public void selectHotels() {

		click(getClickRadioBtn());

		click(getClickContinue());

	}

}
