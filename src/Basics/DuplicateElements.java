package Basics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	// input = {1,5,4,2,1,4,7};
	// output = {1,4}

	public static void main(String[] args) {

		int arr[] = { 1, 5, 4, 2, 1, 4, 7 };

		Set<Integer> uniqueNumber = new HashSet<Integer>();
		boolean isDupicateExists = false;

		for (int i = 0; i < arr.length; i++) {

			if (uniqueNumber.contains(arr[i])) {
				isDupicateExists = true;
				System.out.println("Duplicate number: " + arr[i]);
			} else {
				uniqueNumber.add(arr[i]);
			}
		}

		// System.out.println(uniqueNumber);
		if (!isDupicateExists) {
			System.out.println(-1);
		}
	}

}
