package Basics;

import java.util.Scanner;

public class ProductOfTwoNums {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = in.nextInt();

		System.out.println("Input second number: ");
		int b = in.nextInt();

		System.out.println("Product of a and b: " + a * b);
	}

}
