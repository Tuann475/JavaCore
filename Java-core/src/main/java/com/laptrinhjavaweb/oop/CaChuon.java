package com.laptrinhjavaweb.oop;

public class CaChuon extends LopCa {
	
	private String colorEye;
	private String colorSkin;
	
	public CaChuon() {
		
	}
	
	public CaChuon(String colorEyes, String colorSkin) {
		this.colorEye = colorEye;
		this.colorSkin = colorSkin;
	}

	public String getColorEye() {
		return colorEye;
	}

	public String getColorSkin() {
		return colorSkin;
	}
	
}
