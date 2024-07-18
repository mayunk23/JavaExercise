package Basics;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s.nextInt();

		int fact = 1;

		for (int i = num; i >= 1; i--) {

			fact = i * fact; // 

		}
		System.out.println(fact);

	}

}
