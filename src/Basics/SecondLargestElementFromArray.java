package Basics;

public class SecondLargestElementFromArray {

	public static void main(String[] args) {

		int nums[] = { 1, 4, 5, 6, 7, 8, 10, 34, 2, 5, 8, 12, 324, 34556, 34556 };

//		Arrays.sort(nums);
//		
//		System.out.println(nums[nums.length-2]);

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num > largest) {

				second = largest;
				largest = num;
			} else if (num > second && num != largest) {
				second = num;
			}
		}
		System.out.println(second);

	}

}
