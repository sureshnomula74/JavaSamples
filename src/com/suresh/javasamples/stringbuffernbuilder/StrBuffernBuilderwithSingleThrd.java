package com.suresh.javasamples.stringbuffernbuilder;

/*
 * https://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer
 * 
 * In single threads, StringBuffer is not significantly slower than 
 * StringBuilder, thanks to JVM optimisations. And in multithreading, you can't use safely a StringBuilder.
 */

public class StrBuffernBuilderwithSingleThrd {

	public static void main(String[] args) {

		String withString = "";
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			withString += "some string";
		}
		System.out.println("strings:" + (System.currentTimeMillis() - t0));

		t0 = System.currentTimeMillis();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			buf.append("some string");
		}
		System.out.println("Buffers : " + (System.currentTimeMillis() - t0));

		t0 = System.currentTimeMillis();
		StringBuilder building = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			building.append("some string");
		}
		System.out.println("Builder : " + (System.currentTimeMillis() - t0));
	}
}
