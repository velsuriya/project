package com.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchHotel extends Base1 {

	public SearchHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "hotels")
	private WebElement dDnHostel;

	@FindBy(id = "room_type")
	private WebElement dDnRoomtype;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement clearCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement clearCheckOutDate;

	@FindBy(id = "datepick_in")
	private WebElement txtcheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtcheckoutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnadultroom;

	@FindBy(id = "child_room")
	private WebElement dDnchildroom;

	@FindBy(id = "Submit")
	private WebElement btnlogin;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnHostel() {
		return dDnHostel;
	}

	public WebElement getdDnRoomtype() {
		return dDnRoomtype;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getClearCheckInDate() {
		return clearCheckInDate;
	}

	public WebElement getClearCheckOutDate() {
		return clearCheckOutDate;
	}

	public WebElement getTxtchechInDate() {
		return getTxtchechInDate();
	}

	public WebElement getTxtcheckoutDate() {
		return txtcheckoutDate;
	}

	public WebElement getdDnadultroom() {
		return dDnadultroom;
	}

	public WebElement getdDnchildroom() {
		return dDnchildroom;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkoutDate, String adultperRoom, String childperRoom) {

		selectByValue(getdDnlocation(), location);

		selectByValue(getdDnHostel(), hotels);

		selectByValue(getdDnRoomtype(), roomType);

		selectByValue(getdDnNoOfRooms(), noOfRooms);

		txtClear(getTxtchechInDate());

		type(getTxtchechInDate(), checkInDate);
		txtClear(getTxtcheckoutDate());

		type(getTxtcheckoutDate(), checkoutDate);

		selectByValue(getdDnadultroom(), adultperRoom);

		selectByValue(getdDnchildroom(), childperRoom);

		click(getBtnlogin());

	}

}
