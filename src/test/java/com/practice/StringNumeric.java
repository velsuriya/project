package com.practice;

public class StringNumeric {

	public static void main(String[] args) {

		String s = "java2pro5gr4mm4";

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {

				int cc = Character.getNumericValue(c);

				sum = sum + cc;
			}

		}

		System.out.println(sum);
	}

}
