package com.laptrinhjavaweb;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.test.TestMain;

public class JavaCoreMain {
	public static void main(String[] args) {

/*		List <Integer> list = new ArrayList();
		//list.add("anh yêu em");
		list.add(135);
		//list.add(true);
		String abc1 = list.get(0).toString();
		///Integer abc =Integer.parseInt(list.get(1).toString());
		Integer abc2 =list.get(0);
		}*/
		Map<String, String> map = new HashMap();
		map.put("1234566789", "nguyễn văn a");
		map.put("1233456781", "nguyễn văn af");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		
		
	}
}
