package com.javapractice;

public class Abstract02 extends Abstract01 {

	@Override
	public void savings() {
		System.out.println("70%");

	}

	@Override
	public void deposite() {
		System.out.println("50%");

	}

	public static void main(String[] args) {
		Abstract02 a = new Abstract02();
		a.savings();
		a.deposite();

	}

}
