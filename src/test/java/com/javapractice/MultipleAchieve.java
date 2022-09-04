package com.javapractice;

interface Name {
	abstract void once();

}

interface Age {
	abstract void saving();

}

class Student implements Name, Age {

	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	public void once() {
		// TODO Auto-generated method stub
		System.out.println("6");
	}
}

public class MultipleAchieve {
	public static void main(String[] args) {

		Student b = new Student();
		b.saving();
		b.once();
	}

}
