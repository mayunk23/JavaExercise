package Basics;

public class SortedArray {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 11, 57 };

		int input = 1;

		for (int i = 0; i < arr.length; i++) {

			if (input == arr[i]) {
				System.out.println("Number is present at index: " + i);
			}
		}

	}

}
