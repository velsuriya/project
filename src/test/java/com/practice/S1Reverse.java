package com.practice;

import java.util.Arrays;

public class S1Reverse {

	public static void main(String[] args) {
		String s = "java programm";

		String output = " ";

		String[] str = s.split(" ");

		System.out.println(Arrays.toString(str));

		// FOR EACH

		for (String s1 : str) {

			for (int i = s1.length() - 1; i >= 0; i--) {

				char c = s1.charAt(i);
				output = output + c;

			}

			output = output + " ";
		}

		System.out.println(output);
	}

}
