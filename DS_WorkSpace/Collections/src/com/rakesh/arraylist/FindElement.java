package com.rakesh.arraylist;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		int[] a = {1,3,4,6,5,7,2,9,23,35,34,4,5,53,435,34,1,3,43,5,43,254,52,134,32,23,324,6,456,5,4,43,55,45,6,34,7,456,43,234,67,545,31,3478,800,12,34,127,213,4,5,7,8,6,455,43,44,};
		Scanner sc = new Scanner(System.in);
		System.out.println("Input element");
		int key = sc.nextInt();
		
		for (int i = 0 ; i < a.length;i++){
			if(key == a[i]){
				System.out.println("Key is found");
				break;
			}else{
				System.out.println("Key Not found");
				break;
			}
		}
	}
}
