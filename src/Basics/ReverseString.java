package Basics;

public class ReverseString {

	public static void main(String[] args) {

		String str = "selenium automation";

		// using extra variable and charAt
//		int len = str.length();
		String rev = "";
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);

		// using char array
//		char c[] = str.toCharArray();
//		int len = c.length;
//
//		for (int i = len - 1; i >= 0; i--) {
//			rev = rev + c[i];
//		}
//		System.out.println(rev);
		
		//using string builder
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);

	}
}
