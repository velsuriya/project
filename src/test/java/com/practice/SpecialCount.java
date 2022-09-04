package com.practice;

public class SpecialCount {

	public static void main(String[] args) {

		String s = "jaVA@123.com";

		int smallcount = 0;
		int capscount = 0;
		int specialcount = 0;
		int numbercount = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >='a' && c <='z') {
				smallcount++;
			} else if (c >= 'A' && c <= 'Z') {
				capscount++;

			} else if (c >= '0' && c <= '9') {
				numbercount++;

			} else {
				specialcount++;

			}

		}
		System.out.println(smallcount + " " + capscount + " " + numbercount + " " + specialcount);

	}

}
