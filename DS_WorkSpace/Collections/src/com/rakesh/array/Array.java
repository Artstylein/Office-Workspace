package com.rakesh.array;

import java.util.Collections;

public class Array {

	public static void main(String[] args) {
			int[] test = new int[10];
			int[] test2 = {23,22,34,32,35,66,76,2};
			
			System.out.println(test2.length);
			System.out.println(test2.hashCode());
			
			test[0] = 0;
			test[1] = 2;
			test[2] = 4;
			test[3] = 6;
			test[4] = 8;
			
			for(int i=0;i<test.length;i++){
				 System.out.print(" " +test[i]);
			}
			
			System.out.println("		");
			System.out.println("		");
			System.out.println("2 D Array");
			System.out.println("		");
			System.out.println("		");
			
			int[][] arr = {{1,2,3},{2,3,4},{3,4,5}};
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					System.out.print(arr[i][j]+ " " );
				}
				System.out.println();
			}
			
			
			
	}

}
