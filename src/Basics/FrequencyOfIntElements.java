package Basics;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfIntElements {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 2, 2, 2, 4, 3, 4, 3, 5, 6 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int e : arr) {

			Integer count = map.get(e);

			if (count == null) {

				map.put(e, 1);
			} else {
				map.put(e, count + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			System.out.println("Element " + entry.getKey() + " : " + entry.getValue() + " times");

		}
	}

}
