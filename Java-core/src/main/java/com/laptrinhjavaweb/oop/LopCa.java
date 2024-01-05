package com.laptrinhjavaweb.oop;

public abstract class LopCa {
	
	protected String colorEye;
	protected String colorSkin;
	
/*	protected void boi() {
		System.out.println("cá nào mà chả biết bơi");
	}*/
	protected abstract void boi(); 
	
/*	protected void boi(String style) {
		System.out.println(style);
	}*/
	public String getColorEye() {
		return colorEye;
	}
	
	public String getColorSkin() {
		return colorSkin;
	}

}
