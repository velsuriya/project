package com.testng;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends Base1 {

	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

	public void Bookings() {

		String attribute = getAttributeValue(getOrderid());

	}

}
