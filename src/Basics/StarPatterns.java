package Basics;

public class StarPatterns {

	public static void main(String[] args) {

		for (int i = 5; i >=0 ; i--) {

			// System.out.println("*");

			for (int j = 5; j >=i; j--) {
				System.out.print("*");

			}
			System.out.println();

		}

	}
}
