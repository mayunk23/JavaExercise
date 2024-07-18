package Basics;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {

		int a = 12345;
		int z = a;
		int sum = 0;

		int count = 0;

		while (z > 0) {

			sum = sum + z % 10;
			count++;
			z = z / 10;

		}
		System.out.println(sum);
		System.out.println(count);

	}

}
