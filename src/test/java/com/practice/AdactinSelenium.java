package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinSelenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Eclipse\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Greens8767");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("QN8V3A");
		WebElement btnlgn = driver.findElement(By.id("login"));
		btnlgn.click();
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByIndex(3);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotels);
		select1.selectByValue("Hotel Creek");
		WebElement hotel = driver.findElement(By.id("room_type"));
		Select select2 = new Select(hotel);
		select2.selectByVisibleText("Deluxe");
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(roomnos);
		select3.selectByIndex(1);
		WebElement checkin = driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("28/07/2022");
		WebElement checkout = driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("29/07/2022");
		WebElement adtperroom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adtperroom);
		select4.selectByIndex(1);
		WebElement child = driver.findElement(By.id("child_room"));
		Select select5 = new Select(child);
		select5.selectByIndex(1);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement firstname = driver.findElement(By.name("first_name"));
		firstname.sendKeys("suriya");
		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("kumar");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("40 B WEST CAR STREET");
		WebElement creditcardno = driver.findElement(By.name("cc_num"));
		creditcardno.sendKeys("1000 2323 7378 5595");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select selectcard = new Select(cardtype);
		selectcard.selectByIndex(1);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(month);
		s.selectByIndex(1);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s1 = new Select(year);
		s1.selectByIndex(12);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("777");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(5000);
		WebElement orderno = driver.findElement(By.xpath("(//input[@type='text'])[16]"));
		String text = orderno.getAttribute("value");
		System.out.println(text);

	}
}
