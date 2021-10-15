package com.backTracking.ParanthesisProblems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	public static void main(String[] args) {

		List<String> brackets = new ArrayList<>();
		int n = 3;

		backTracking(brackets, new StringBuilder("("), 1, 0, n);

		System.out.println(brackets);
	}

	private static void backTracking(List<String> brackets, StringBuilder cur, int open, int close, int n) {
		// When cur.length == 2 * n, then add in the list and return
		if (cur.length() == 2 * n) {
			brackets.add(cur.toString());
		}

		// If open count < n then, add more open bracket
		if (open < n) {
			cur.append("(");
			// append till we reach length == n. Ex: (((
			backTracking(brackets, cur, open + 1, close, n);
			cur.deleteCharAt(cur.length() - 1);

		}
		/*
		 * If close count < open count, that means we can add more close bracket. This
		 * condition will only run when we have open bracket
		 */
		if (close < open) {
			cur.append(")");
			// closing bracket length should be equal to open length, not more.
			backTracking(brackets, cur, open, close + 1, n);
			cur.deleteCharAt(cur.length() - 1);
		}
		System.out.println();
	}
}
