package com.laptrinhjavaweb.utils;

public class StringUtils {
	
	public static boolean isNullOrEmty(String value) {
		if(value != null && value != "") {
			return false;
		}
		return true;
	}

}
