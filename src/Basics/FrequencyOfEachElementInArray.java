package Basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {


		int list1[] = {11,11,33,44,55,323,33,22,11,44,22};
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int e: list1) {
			
			map.put(e, map.getOrDefault(e, 0)+1);
			
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		
	}

}
