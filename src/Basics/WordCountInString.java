package Basics;

import java.util.HashMap;
import java.util.Map;

public class WordCountInString {

	public static void main(String[] args) {

		String s = "A big black bug bit a big black dog on his big black nose";
		String str = s.toLowerCase();
		String words[] = str.split(" ");

		Map<String, Integer> word = new HashMap<String, Integer>();

		for (String e : words) {

			Integer count = word.get(e);

			if (count == null) {

				word.put(e, 1);
			} else {
				word.put(e, count + 1);
			}
		}
		System.out.println(word);

	}

}
