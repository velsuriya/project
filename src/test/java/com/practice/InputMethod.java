package com.practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class InputMethod {
	private void m1(int a) {
		System.out.println(a);
		}
	private void m2(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		}
	private void m3(ArrayList<String>m) {
		System.out.println(m);
		}
	private void m4(Map<String,String>emp) {
	System.out.println(emp);	
		}
	public static void main(String[] args) {
		InputMethod a =new InputMethod ();
		a.m1(10);
		a.m2(1, 2);
		
		ArrayList<String> m =new ArrayList<String>();
		m.add("java");
		m.add("API");
		a.m3(m);
		
		Map<String,String> emp= new LinkedHashMap<String,String>();
		emp.put("name", "suriya");
		emp.put("mail", "vel@gmail");
		a.m4(emp);
		
		
		}

}
