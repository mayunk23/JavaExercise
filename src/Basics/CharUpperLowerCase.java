package Basics;

public class CharUpperLowerCase {

	public static void main(String[] args) {

		String str = "abCd eF";
		StringBuilder build = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isLowerCase(ch)) {
				char upperCase = Character.toUpperCase(ch);
				build.append(upperCase);
			}

			else {
				char lowerCase = Character.toLowerCase(ch);
				build.append(lowerCase);
			}

		}
		System.out.println(build);
	}

}
