package com.practice;

public class StringReverse {

	public static void main(String[] args) {

		String s = "java";
		String output = "";
		// 1 //2 //5
		for (int i = s.length() - 1; i >= 0; i--) {

			// 3
			char c = s.charAt(i);

			// 4
			output = output + c;
		}

		System.out.println(output);

	}

}
