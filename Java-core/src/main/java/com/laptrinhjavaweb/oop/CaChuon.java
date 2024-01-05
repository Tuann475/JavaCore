package com.laptrinhjavaweb.oop;

public class CaChuon extends LopCa {
	
	private String colorEye;
	private String colorSkin;
	

	public CaChuon() {
		
	}
	
/*	public CaChuon(String colorEyes, String colorSkin, String colorEyeParent, String colorSkinParent) {
		this.colorEye = colorEye;
		this.colorSkin = colorSkin;
		super.colorEye = colorEyeParent;
		super.colorSkin = colorSkinParent;
	}*/

	public String getColorEye() {
		//return "Children: "+ colorEye + "- Parent: "+ super.getColorEye();
		return colorEye;
	}

	public String getColorSkin() {
		return colorSkin;
	}
	
	@Override
	protected void boi() {
		System.out.println("cá chuồn bơi theo kiểu của cá chuồn");
	}
	
}
