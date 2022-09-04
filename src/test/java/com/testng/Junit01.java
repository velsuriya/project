package com.testng;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit01 extends Base1 {

	@BeforeClass
	public static void BeforeClass() {
		getDriver();
		maximize();
		loadUrl("https://adactinhotelapp.com/");
		implicitWait(3000);

	}

	@Test
	public void login() throws IOException, InterruptedException {

		WebElement txtusername = findElementById("username");
		String username = getData("Sheet1", 1, 0);
		type(txtusername, username);

		WebElement txtpassword = findElementById("password");
		String password = getData("Sheet1", 1, 1);
		type(txtpassword, password);

		WebElement btnclick = findElementById("login");
		click(btnclick);

		WebElement txtwelcomemsg = findElementById("username_show");
		String actualvaluetxt = getAttributeValue(txtwelcomemsg);
		Assert.assertEquals("verify", "Hello Greens8767!", actualvaluetxt);

		WebElement searchHotelverify = findElementByClassName("login_title");
		String ActualsearchHotelverify = searchHotelverify.getText();
		boolean searchHotel = ActualsearchHotelverify.contains("Search Hotel");
		Assert.assertTrue("verify search hotel", searchHotel);

		WebElement btnlocation = findElementById("location");
		selectByIndex(btnlocation, 1);

		WebElement hotel = findElementById("hotels");
		selectByIndex(hotel, 1);

		WebElement room = findElementById("room_type");
		selectByIndex(room, 1);

		WebElement roomNo = findElementById("room_nos");
		selectByIndex(roomNo, 1);

		WebElement checkIn = findElementById("datepick_in");
		txtClear(checkIn);
		String data3 = getData("adactin", 1, 6);
		type(checkIn, data3);

		WebElement checkout = findElementById("datepick_out");
		txtClear(checkout);
		String data4 = getData("adactin", 1, 7);
		type(checkout, data4);

		WebElement adultroom = findElementById("adult_room");
		selectByIndex(adultroom, 1);

		WebElement childroom = findElementById("child_room");
		selectByIndex(childroom, 1);

		WebElement search = findElementById("Submit");
		click(search);

		WebElement selectHotelverify = findElementByClassName("login_title");
		String actualverifyselectHotel = selectHotelverify.getText();
		Assert.assertEquals("verify search hotel", "Select Hotel", actualverifyselectHotel);

		WebElement btnclick1 = findElementById("radiobutton_0");
		click(btnclick1);

		WebElement continue1 = findElementById("continue");
		click(continue1);

		WebElement BookAHotelverify = findElementByXpath("(//td[@class='login_title'])[2]");
		String actualverifyBookAHotel = BookAHotelverify.getText();
		Assert.assertEquals("verify book a hotel", "Book A Hotel", actualverifyBookAHotel);

		WebElement fstname = findElementById("first_name");
		String data5 = getData("adactin", 1, 10);
		type(fstname, data5);

		WebElement lastname = findElementById("last_name");
		String data6 = getData("adactin", 1, 11);
		type(lastname, data6);

		WebElement billing = findElementById("address");
		String data7 = getData("adactin", 1, 12);
		type(billing, data7);

		WebElement ccnumber = findElementById("cc_num");
		String data8 = getData("adactin", 1, 13);
		type(ccnumber, data8);

		WebElement cardtype = findElementById("cc_type");
		selectByIndex(cardtype, 1);

		WebElement month = findElementById("cc_exp_month");
		selectByIndex(month, 1);

		WebElement year = findElementById("cc_exp_year");
		selectByIndex(year, 12);

		WebElement cvvnum = findElementById("cc_cvv");
		String data9 = getData("adactin", 1, 17);
		type(cvvnum, data9);

		WebElement booknow = findElementById("book_now");
		click(booknow);

		Thread.sleep(5000);

		WebElement orderid = findElementByName("order_no");
		String value = getAttributeValue(orderid);
		System.out.println(value);

		insertValueInCell("adactin", 2, 18, value);

		WebElement BookingConfirmationVerify = findElementByXpath("//td[@class='login_title']");
		String actualbookingVerify = BookingConfirmationVerify.getText();
		Assert.assertEquals("verify booking confirmation", "Booking Confirmation", actualbookingVerify);

	}

//	@AfterClass
//	public static void afterClass() {
//		closeWindow();
//	}

}
