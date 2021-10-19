package com.cp.array.sorting;

public class Check_Array_Is_Sorted_Rotated {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 1, 2 };
		// int[] arr = new int[] {2,1,3,4};
		// int[] arr = new int[] {2,1};
		// int[] arr = new int[] {1,2,3};
		// int[] arr = new int[] {1,1,1};

		boolean res = check(arr);

		System.out.println(res);
	}

	private static boolean check(int[] arr) {

		// here we compare all the neighbouring elemnts and check whether they are in
		// somewhat sorted
		// there will be a small change due to rotation in the array at only one place.
		// so if there are irregularities more than once, return false
		// else return true;

		int irregurality = 0;
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			if (arr[i] > arr[(i + 1) % length]) {
				irregurality += 1;
			}
		}
		return irregurality > 1 ? false : true;
	}
}

// Any we module any number with a number which is greater than that number then the result will  be the input number. 
// Ex: 4 % 5 = 4
// nums[(i + 1) % nums.length] => for last iteration this will be nums[0].

// Time O(n)
// Space O(1)