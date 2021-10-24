package com.cp.array.leader_element;

public class Learder_Element_Track_A1{
	public static void main(String[] args) {
		int[] arr = new int[] { 9, 2, 0, 3, 0, 8, 5, 7, 4 };
		printLeader(arr);

	}

	// Naive Approach
	// Time complexity: O(n ^ 2)
	public static void printLeader(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] <= arr[j]) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
