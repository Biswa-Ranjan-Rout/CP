package com.cp.array.search;

/* This is not an efficient solution. */
public class SecondLargeEleInArray_NaiveApproach {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 60, 0, 99, 98, 4, 24, 1 };
		//int[] arr = new int[] { 9,9,9,9 };
		
		int res = findSecondLargest(arr);
		System.out.println("Largest element is: " + res);
	}

	private static int findSecondLargest(int[] arr) {

		int max = 0;
		int sec_max = -1; 
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != max && arr[i] > sec_max) {
				sec_max = arr[i];
			}
		}
		return sec_max;
	}

}

// Time complexity is O(n)
