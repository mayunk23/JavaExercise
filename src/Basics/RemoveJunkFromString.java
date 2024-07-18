package Basics;

public class RemoveJunkFromString {

	public static void main(String[] args) {


		String str= "This%% is to test the@@@ removal$%$^% of junk#$#$";
		String s =  str.replaceAll("[^a-zA-Z]", " ").replaceAll("\\s+", " ");
		System.out.println(s);
	}

}
