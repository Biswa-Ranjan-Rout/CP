package com.cp.array.search;

import java.util.PriorityQueue;

public class Kth_Largest_Element_In_an_Array {

	public static void main(String[] args) {

		int[] arr = new int[] { 60, 0, 99, 8, 4, 24, 1 };
		int k = 3;

		int res = kth_Largest(arr, k);
		System.out.println(k + "th largest element is: " + res);
	}

	private static int kth_Largest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}
}
/*
 * Time complexity : O(log k)
 *
 * The time complexity of adding an element in a heap of size k is
 * O(log k), and we do it N times that means O(N log k) time complexity for the algorithm.
 */