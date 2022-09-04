package com.testng;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Base1 {

	public BookHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastNmae;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardNo;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement selectMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement selectYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNomber;

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastNmae;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCvvNomber() {
		return cvvNomber;
	}

	public WebElement getBook() {
		return book;
	}

	public void selectHotels(String firstName, String lastName, String address, String cardNo, String cardType,
			String month, String year, String cvvNumber) {

		type(getFirstName(), firstName);

		type(getLastName(), lastName);

		type(getAddress(), address);

		type(getCardNo(), cardNo);

		selectByValue(getSelectMonth(), month);

		selectByValue(getSelectYear(), year);

		selectByValue(getCvvNomber(), cvvNumber);

		click(getBook());

	}

}
