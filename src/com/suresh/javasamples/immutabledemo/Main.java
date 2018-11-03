package com.suresh.javasamples.immutabledemo;

public class Main {

	public static void main(String args[]) {

		Age a = new Age();
		a.setDay(01);
		a.setMonth(01);
		a.setYear(2018);

		ImmutableStudent std = new ImmutableStudent(101, "X", a);
		System.out.println("Alex age year before modification = " + std.getAge().getYear());
		std.getAge().setYear(1993);
		System.out.println("Alex age year after modification = " + std.getAge().getYear());

	}

}
