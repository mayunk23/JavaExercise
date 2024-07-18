package Basics;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		// str1= dot, str dto , it is anagram

		// Str1=ten, str2=ena, this is not an anagram

		String str1 = "dot";

		char ch1[] = str1.toCharArray();

		String str2 = "tod";
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (ch1.length == ch2.length) {

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("String are anagrams");
			}

		} else {
			System.out.println("String are not anagrams");
		}

	}

}
