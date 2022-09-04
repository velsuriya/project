package com.practice;

public class B {
	
	private int test1(int stu) {
		
		if (stu==10) {
			return 200;
			}
		if (stu==20) {
			return 300;
			}
		if (stu==30) {
			return 400;
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		B a =new B();
		int test1 = a.test1(10);
		System.out.println(test1);
		

	}

}
