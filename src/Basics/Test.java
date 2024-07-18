package Basics;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		char chars[] = { 'a', 'd', 'w', 'a', 'q', 'q', 'q', 'q', 'e', 'd', 'i', 'q', 'v' };

		Map<Character, Integer> values = new HashMap<Character, Integer>();

		for (char c : chars) {

			Integer count = values.get(c);

			if (count == null) {

				values.put(c, 1);
				// System.out.println(values);
			} else {
				values.put(c, count + 1);

			}
		}
		System.out.println(values);

	}

}
