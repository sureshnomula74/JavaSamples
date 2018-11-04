package com.suresh.javasamples.finaldemo;

public class FinalDemoMain {

	private static final int a = 10;

	public final int b = 20;

	private static final int[] tmpArr = { '1', '2' };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalDemoMain.a = 20; // throws compilation error , final variable cannt be initialised again
		new FinalDemoMain().b = 50; // throws compilation error , final variable cannt be initialised again

		tmpArr[0] = 5; // final obj data can be modified

		tmpArr = new int[5]; // throws compilation , final obj reference cant be changed

	}

}
