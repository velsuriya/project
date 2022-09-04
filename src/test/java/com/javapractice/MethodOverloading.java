package com.javapractice;

//public class MethodOverloading {
//	public static void display(int a) {
//		System.out.println("Arguments: " + a);
//	}
//
//	public static void display(int a, int b) {
//		System.out.println("Arguments: " + a + " and " + b);
//	}
//
//	public static void main(String[] args) {
//		display(1);
//		display(1, 4);
//	}
//}
public class MethodOverloading {
	public static void method(int a) {
		System.out.println(a);
	}

	public static void method(int a, int b) {
		System.out.println(a+""+ b);
	}

	public static void main(String[] args) {
		method(1);
		method(1, 2);
	}
}
