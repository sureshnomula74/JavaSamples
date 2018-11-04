package com.suresh.javasamples.staticdemo;

/*
 * 
 * Static keyword demo
 * 
 */

public class StaticDemoMain {

	private static String var = "this is static var";
	private static int a = 20;
	private static int b = 30;
	private int c = 40;

	// Static block can access static variables
	static {

		System.out.println("Static variables are " + var + "," + a + "," + b);
	}

	private static void add() {
		System.out.println(a + b);

	}

	private void multiply() {
		System.out.println(a * b);
	}

	public static void main(String[] args) {

		// Object creation is not required to access static fields or methods
		System.out.println(StaticDemoMain.var);

		// static method can only access static fields
		StaticDemoMain.add();

		// non-static methods can acess both static and non static fields
		new StaticDemoMain().multiply();
	}

}
