package com.javapractice;

//// write a code for single inheritance
//class TwoWord {
//	public void techGreen() {
//		System.out.println("inheritance");
//
//	}
//}
//
//public class OneWord extends TwoWord {
//	public void greenTech() {
//		System.out.println("single");
//
//	}
//
//	public static void main(String[] args) {
//			OneWord A = new OneWord();
//			A.greenTech();
//			A.techGreen();
//
//		}
//}
//write code for single inheritance

//class One {
//	public void greenTech() {
//		System.out.println("single");
//	}
//}
//
//class Two extends One {
//	public void techGreen() {
//		System.out.println("inheritance");
//	}
//}
//
//public class OneWord {
//	public static void main(String[] args) {
//
//		Two a = new Two();
//		a.greenTech();
//		a.techGreen();
//	}
//}

// write a code for multilevel inheritance

class One {
	public static void greenTech() {
		System.out.println("single");
	}
}

class Two extends One {
	public static void techGreen() {
		System.out.println("inheritance");
	}
}

class Three extends Two {
	public static void four() {
		System.out.println("inheritance1");
	}

}

public class OneWord {
	public static void main(String[] args) {
		
//		Three a = new Three();
//		a.greenTech();
//		a.techGreen();
//		a.four();
	}
}

// write a code for method overloading


























