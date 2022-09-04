package com.practice;

import java.io.IOException;
import org.openqa.selenium.WebElement;

import com.testng.Base1;

public class AdactionHotel extends Base1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		Base1 base = new Base1();

		base.getDriver();
		base.maximize();
		base.loadUrl("https://adactinhotelapp.com/");

		WebElement id = base.findElementById("username");
		String data = base.getData("Sheet1", 1, 0);
		base.type(id, data);

		WebElement pass = base.findElementById("password");
		String data2 = base.getData("Sheet1", 1, 1);
		base.type(pass, data2);

		WebElement btnclick = base.findElementById("login");
		base.click(btnclick);

		WebElement btnlocation = base.findElementById("location");
		base.selectByIndex(btnlocation, 1);

		WebElement hotel = base.findElementById("hotels");
		base.selectByIndex(hotel, 1);

		WebElement room = base.findElementById("room_type");
		base.selectByIndex(room, 1);

		WebElement roomNo = base.findElementById("room_nos");
		base.selectByIndex(roomNo, 1);

		WebElement checkIn = base.findElementById("datepick_in");
		base.txtClear(checkIn);
		String data3 = base.getData("Sheet1", 1, 6);
		base.type(checkIn, data3);

		WebElement checkout = base.findElementById("datepick_out");
		base.txtClear(checkout);
		String data4 = base.getData("Sheet1", 1, 7);
		base.type(checkout, data4);

		WebElement adultroom = base.findElementById("adult_room");
		base.selectByIndex(adultroom, 1);

		WebElement childroom = base.findElementById("child_room");
		base.selectByIndex(childroom, 1);

		WebElement search = base.findElementById("Submit");
		base.click(search);

		WebElement btnclick1 = base.findElementById("radiobutton_0");
		base.click(btnclick1);

		WebElement continue1 = base.findElementById("continue");
		base.click(continue1);

		WebElement fstname = base.findElementById("first_name");
		String data5 = base.getData("Sheet1", 1, 10);
		base.type(fstname, data5);

		WebElement lastname = base.findElementById("last_name");
		String data6 = base.getData("Sheet1", 1, 11);
		base.type(lastname, data6);

		WebElement billing = base.findElementById("address");
		String data7 = base.getData("Sheet1", 1, 12);
		base.type(billing, data7);

		WebElement ccnumber = base.findElementById("cc_num");
		String data8 = base.getData("Sheet1", 1, 13);
		base.type(ccnumber, data8);

		WebElement cardtype = base.findElementById("cc_type");
		base.selectByIndex(cardtype, 1);

		WebElement month = base.findElementById("cc_exp_month");
		base.selectByIndex(month, 1);

		WebElement year = base.findElementById("cc_exp_year");
		base.selectByIndex(year, 12);

		WebElement cvvnum = base.findElementById("cc_cvv");
		String data9 = base.getData("Sheet1", 1, 17);
		base.type(cvvnum, data9);

		WebElement booknow = base.findElementById("book_now");
		base.click(booknow);
		
		Thread.sleep(5000);

		WebElement orderid = base.findElementByName("order_no");
		String value = base.getAttributeValue(orderid);
		System.out.println(value);
		
		base.insertValueInCell("Sheet1", 1, 18, value);
		
		
		
		
		

	}

}
