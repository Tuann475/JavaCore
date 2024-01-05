package com.laptrinhjavaweb.oop;

import com.laptrinhjavaweb.test.TestMain;

public class JavaCoreMain {
	public static void main(String[] args) {
		//long test = 123456789;
		CaChuon caChuon = new CaChuon("yellow","black");
		//caChuon.colorEye = "yellow";
		System.out.println("Color eye: "+caChuon.getColorEye());
		caChuon.boi();
		TestMain testMain = new TestMain();
		
	}
}
