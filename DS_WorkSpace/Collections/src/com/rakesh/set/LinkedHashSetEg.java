package com.rakesh.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Tom");
		lhs.add("Rick");
		lhs.add("harry");
		lhs.add("Teddy");
		lhs.add("Rick");
		lhs.add("Tom");
		
		System.out.println(lhs);
	}

}
