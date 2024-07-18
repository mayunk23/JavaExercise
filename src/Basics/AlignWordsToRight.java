package Basics;

public class AlignWordsToRight {

	public static void main(String[] args) {

		String str = "Chamberlain has a good workCulture";

		String words[] = str.split(" ");

		int maxLen = 0;

		for (String word : words) {

			if (word.length() > maxLen) {

				maxLen = word.length();
			}
		}
		// System.out.println(maxLen);

		int space = 0;
		for (String word : words) {

			space = maxLen - word.length(); // 11-3 = 7

			for (int i = 0; i < space; i++) {

				System.out.print(" ");

			}
			System.out.println(word);
		}

	}
}
