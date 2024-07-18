package Basics;

public class ReverseStringConsistingSpecialChars {

	public static void main(String[] args) {

		String s = "A@B#C";

		char arr[] = s.toCharArray();
		// System.out.println(arr);

		int left = 0;
		int right = s.length() - 1;

		while (left < right) {

			// Move left pointer to the next alphanumeric character

			while (left < right && !Character.isLetterOrDigit(arr[left])) {
				left++;
			}

			// Move right pointer to the previous alphanumeric character

			while (left < right && !Character.isLetterOrDigit(arr[right])) {
				right--;
			}
			// Swap the characters

			if (left < right) {
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;

			}
		}
		System.out.println(arr);

	}

}
