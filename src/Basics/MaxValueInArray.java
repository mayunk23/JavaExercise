package Basics;

public class MaxValueInArray {

	public static void main(String[] args) {

		int a[] = { 200, 1440, 20, 4, 100 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
