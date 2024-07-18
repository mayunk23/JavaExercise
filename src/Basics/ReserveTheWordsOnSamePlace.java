package Basics;

public class ReserveTheWordsOnSamePlace {

	public static void main(String[] args) {

		String input = "mayank chouhan";

		String words[] = input.split(" ");

		StringBuilder builder = new StringBuilder();

		for (String word : words) {

			String revWord = new StringBuilder(word).reverse().toString();

			builder.append(revWord).append(" ");
		}

		System.out.println(builder);

	}

}
 	