package Basics;

public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {

		// corner case
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {

		for (int i = 2; i <= num; i++) {

			if (isPrimeNumber(i)) {

				System.out.print(i + " ");
			}

		}

	}

	public static void main(String[] args) {

		// prime number
		// 2,3,5,7,13
		// Divisible by 1 and itself

		boolean flag = isPrimeNumber(12);
		System.out.println(flag);

		getPrimeNumbers(50);
	}

}
