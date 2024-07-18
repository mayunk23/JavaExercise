package Basics;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

	public static void main(String[] args) {
		String str = "maayaay";

		char arr[] = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : arr) {

			Integer count = map.get(c);

			if (count == null) {

				map.put(c, 1);

			} else {

				map.put(c, count+1);

			}
		}

		System.out.println(map);

	}

}
