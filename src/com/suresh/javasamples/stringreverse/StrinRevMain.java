package com.suresh.javasamples.stringreverse;

/*
 * 
 * String reverse without using inbuilt methods.
 * 
 */

public class StrinRevMain {

	String str = "Hello World";
	char[] strChar = new char[str.length()];
	int count = str.length() - 1;
	int index = 0;

	public void reverseStr() {

		strChar[index] = str.charAt(count);
		System.out.println(new String(strChar));

		index++;
		count--;
		if (index == str.length())
			return;

		reverseStr();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new StrinRevMain().reverseStr();

	}

}
