package com.rakesh.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
			TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
			tm.put(0, "");
			tm.put(2, "Secon");
			tm.put(5, "Third");
			tm.put(6, "Four");
			tm.put(4, "Five");
			tm.put(3, "Six");
			
			for(Map.Entry map : tm.entrySet()){
				System.out.println("key :"+ map.getKey() + " Value : "+map.getValue());
			}
			
	}

}
