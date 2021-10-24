package com.cp.array.leader_element;

public class Learder_Element_Track_A2 {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 2, 0, 3, 0, 8, 5, 7, 4 };
		printLeader(arr);
	}

	// Efficient approach
	// Time complexity: O(n)
	public static void printLeader(int[] arr) {
		int n = arr.length;
		int cur_leader = arr[n - 1];
		System.out.print(cur_leader+" ");

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > cur_leader) {
				cur_leader = arr[i];
				System.out.print(cur_leader+" ");
			}
		}
	}

}
