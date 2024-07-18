package Basics;

public class FindMissingNumber {

	public static void main(String[] args) {

		int n = 9;

		int nums[] = { 1, 2, 3, 4, 5, 7, 8, 9 };

		int actualSum = n * (n + 1) / 2;

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];
		}

		System.out.println("Missing number: " + (actualSum - sum));
	}

}
