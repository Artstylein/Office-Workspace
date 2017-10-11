package com.rakesh.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
			arr.add("test1");
			arr.add("test2");
			arr.add("test3");
			arr.add("test4");
			
			
			
			for(String s :arr){
				System.out.print("For Each iteration "+s);
			}
			
			System.out.println(" ");
			
			Iterator<String> itr = arr.iterator();
			while(itr.hasNext()){
				System.out.print("Iterator Iteration "+itr.next());
			}
			
			//collectionsAdd
			arr2.addAll(arr);
			System.out.println(" ");
			System.out.println("After collections add " +arr2);
			
			//collectionsRemove
			arr2.removeAll(arr);
			System.out.println("After collections remove " +arr2);
			
			//cloning array
			arr2 = (ArrayList<String>) arr.clone();
			System.out.println("arr2 : "+arr2);
			
			//Equals Array equals 
			System.out.println("Is arr equal to arr2 : "+arr2.equals(arr));
			
			
			
	}
}
