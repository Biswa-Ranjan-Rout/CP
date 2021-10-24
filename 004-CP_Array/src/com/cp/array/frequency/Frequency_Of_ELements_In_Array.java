package com.cp.array.frequency;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Of_ELements_In_Array {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 10, 5,20, 10, 12, 5, 4 };

		findFrequency(arr);
	}

	// Time complexity: O(n), This approach uses extra space.
	private static void findFrequency(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		/*	
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}			
		*/	
		}
		System.out.println(map);
	}
}
