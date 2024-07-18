package Basics;

public class RevereseSentence {

	public static void main(String[] args) {

		String str = "This is my practice code for		 string manipulations";

		String words[] = str.split("\\s+");

		int len = words.length;
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev+words[i]+" ";
			
		}
		System.out.println(rev);

	}

}
