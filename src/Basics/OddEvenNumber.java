package Basics;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter any number: ");
//		int number = s.nextInt();
//		
//		if(number%2==0) {
//			System.out.println("It's an Even number: " + number);
//		}
//		
//		else {
//			System.out.println("It's an Odd number: " + number);
//		}

		int limit = 50;

		for (int i = 1; i <= limit; i++) {

			if (i % 2 == 0) {
				System.out.println("It's an Even number: " + i);
			}

			else {
				System.out.println("It's an Odd number: " + i);
			}

		}

	}

}
