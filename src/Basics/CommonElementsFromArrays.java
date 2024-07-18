package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromArrays {

	public static void main(String[] args) {

		Integer list1[] = { 1, 3, 5 };
		Integer list2[] = { 1, 2, 3, 4, 5 };
		Integer list3[] = { 2, 3, 4, 5 };

		Set<Integer> a = new HashSet<Integer>(Arrays.asList(list1));
		Set<Integer> b = new HashSet<Integer>(Arrays.asList(list2));
		Set<Integer> c = new HashSet<Integer>(Arrays.asList(list3));
		
		a.retainAll(b);
		a.retainAll(c);
		
		System.out.println(a);
	}

}
