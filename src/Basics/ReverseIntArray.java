package Basics;

public class ReverseIntArray {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 8, 9, 20, 11, 77 };

		int len = arr.length;
		int rev = 0;

		// o/p={77,11,20,9,8,5,1}

		for (int i = len - 1; i >= 0; i--) {

			rev = arr[i];
			System.out.print(rev + " ");

		}

	}

}
