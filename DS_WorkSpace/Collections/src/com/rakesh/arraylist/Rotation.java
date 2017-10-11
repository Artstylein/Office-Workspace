package com.rakesh.arraylist;

public class Rotation {
	static int temp;

	public static void main(String[] args) {

		int[] arr = { 3, 2, 4, 8, 6, 1, 5, 7 };
		int len = arr.length;
		int rotatePos = 5;
		// Print array
		long currentTime = System.currentTimeMillis();
		while (rotatePos != 0) {
			rotate(arr, len);
			rotatePos--;
		}
		long timeAfterRunning = System.currentTimeMillis();
		long totalExcTime = currentTime - timeAfterRunning;
		printArray(arr);
		System.out.println(" " );
		System.out.println("Time taken for Execution : "+totalExcTime );

	}

	private static void rotate(int[] arr, int len) {
		for (int i = 0; i < len - 1; i++) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

	public static void printArray(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(" " + a[j]);
		}
	}

}
