package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before method");
	}

	@Test
	private void tc01() {
		System.out.println("Method 1");
	}

	@Test
	private void tc02() {
		System.out.println("Method 2");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("after method");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("after class");
	}

}