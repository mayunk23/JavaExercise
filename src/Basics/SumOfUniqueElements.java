package Basics;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueElements {

	public static void main(String[] args) {

		int list1[] = { 2, 3, 5, 6, 33 };
		int list2[] = { 5, 6, 4, 2, 33 };
		int sum = 0;

		Set<Integer> s1 = new HashSet<Integer>();
		// Set<Integer> s2 = new HashSet<Integer>();

		for (int e : list1) {
			s1.add(e);

		}
		for (int j : list2) {
			s1.add(j);
		}

		System.out.println(s1);

		for (int num : s1) {
			sum = sum + num;
		}

		System.out.println(sum);

	}
}
