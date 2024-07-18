package Basics;

import java.util.HashSet;
import java.util.Set;

public class CountWordsFromString {

	public static void main(String[] args) {

		String str = "A big black bug bit a big black dog on his big black nose";
		String words[] = str.split(" ");
		boolean duplicateWords = false;
		int count = 0;

		int len = words.length;

//		for (int i = 0; i < len; i++) {
//
//			for (int j = 1; j < len; j++) {
//
//				if (words[i].equals(words[j])) {
//					count++;
//					//System.out.println(words[i] + ":" + count);
//				}
//			}
//		}

		Set<String> word = new HashSet<String>();
		for (int i = 0; i < len; i++) {
			if (word.contains(words[i])) {
				duplicateWords = true;
				System.out.println("duplicate value : " + words[i]);
			} else {
				word.add(words[i]);
			}
		}
	}

}
