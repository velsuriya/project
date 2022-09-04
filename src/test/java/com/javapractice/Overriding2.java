package com.javapractice;

public class Overriding2 extends Overriding1 {

	public void method1() {
		System.out.println("siva");
	}

	public static void main(String[] args) {
		Overriding2 a = new Overriding2();
		a.method1();
		Overriding1 b = new Overriding1();
		b.method1();
	}
}
