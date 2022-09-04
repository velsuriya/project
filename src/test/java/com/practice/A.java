package com.practice;

public class A {

	private int test(int empid) {

		if (empid == 10) {

			return 100;
		} else {

			return 0;
		}

	}

	public static void main(String[] args) {
		
		A b = new A();
		int test = b.test(100);
		System.out.println(test);
		
		

	}

}
