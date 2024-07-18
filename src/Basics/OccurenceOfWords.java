package Basics;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWords {

	public static void main(String[] args) {

		String s = "This is the test, but not a test of test";
		String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").replaceAll(",", "");
		System.out.println(str);

		String words[] = str.split("\\s+");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String word : words) {
			Integer count = map.get(word);

			if (count == null) {
				map.put(word, 1);
			} else {
				map.put(word, count + 1);
			}

		}
		System.out.println(map.get("test"));
	}

}
