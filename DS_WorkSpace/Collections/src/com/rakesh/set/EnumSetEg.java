package com.rakesh.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetEg {

	enum days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	}
	
	public static void main(String[] args) {
		Set<days> ss = EnumSet.of(days.THURSDAY,days.FRIDAY);
		Iterator<days> itr =  ss.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	
	}

}
