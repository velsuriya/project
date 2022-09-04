package com.testng;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cancel extends Base1 {

	public cancel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "//a[text()='Booked Itinerary']")
	private WebElement bookeditinerary;

	@FindBy(id = "btn_id_654305")
	private WebElement cancel;

	public WebElement getBookeditinerary() {
		return bookeditinerary;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void cancel1(String booked, String cancel) {

		click(getBookeditinerary());
		click(getCancel());

	}

}
