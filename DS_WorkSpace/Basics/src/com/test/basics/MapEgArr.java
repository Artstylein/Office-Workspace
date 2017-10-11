package com.test.basics;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapEgArr {

	public static void main(String[] args) {

		String arr[] = { "a", "s", "f", "h", "e", "n", "d", "s", "e", "n", "h", "j", "g", "l", "a", "a", "c", "v", "b",
				"n", "e", "q", "f" };
		
		fetch(arr);
	}
	
	public static String[] fetch(String[] arr) {

		Map<String, String> map = new HashMap<String, String>();
		Map<String, Integer> map1 = new HashMap<String, Integer>();//store count
		
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (map1.get(arr[i]) != null) {
				map1.put(arr[i], map1.get(arr[i]) + 1);
				map.put(arr[i], map.get(arr[i]) + i);
			} else {
				map1.put(arr[i], 1);
				map.put(arr[i], i + "");
			}
		}
		String resp[] = new String[map1.size()];
		for (Map.Entry m1 : map.entrySet()) {
			String temp = (String) m1.getKey();
			System.out.println(temp + "->" + map1.get(temp) + m1.getValue());
			resp[j++] = temp + "->" + map1.get(temp) + m1.getValue();
		}
		
		return resp;
	}
	
	public static boolean getV(){
		return true;
	}

}