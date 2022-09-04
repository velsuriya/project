package com.testng;

import org.testng.annotations.Test;

public class TestNg1 {

	@Test(priority = 10)
	private void tc01() {
		System.out.println("Method 1");
	}

	@Test(priority = 5)
	private void tc02() {
		System.out.println("Method 2");
	}

	@Test(priority = 2)
	private void tc03() {
		System.out.println("Method 3");
	}

	@Test(priority = -10)
	private void tc04() {
		System.out.println("Method 4");
	}

	@Test(priority = -5)
	private void tc05() {
		System.out.println("Method 5");
	}

}
