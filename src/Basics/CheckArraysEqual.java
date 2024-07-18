package Basics;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {

		int a[] = { 30, 25, 40 };
		int b[] = { 30, 25, 40 };

		boolean result = Arrays.equals(a, b);

		if (result) {

			System.out.println("Arrays are equal ");
		} else {
			System.out.println("Arrays are not equal ");
		}
	}

}
