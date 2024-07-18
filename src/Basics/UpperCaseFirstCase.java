package Basics;

public class UpperCaseFirstCase {

	public static void main(String[] args) {

		String s = "why i am doing this, no idea";
		
		String words[] = s.split("\\s+");
		int len = words.length;
		
		String rev = "";
		for(String word:words) {
			if(word.length()>0) {
				rev = rev + Character.toUpperCase(word.charAt(0))+ word.substring(1)+ " ";
			}
		}
		System.out.println(rev);

	}

}


