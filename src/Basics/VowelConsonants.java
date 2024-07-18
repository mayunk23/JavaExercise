package Basics;

public class VowelConsonants {

	public static void main(String[] args) {

		String name = "aEiOuXXX";
		String str = name.replaceAll(" ", "").toLowerCase();
		char c[] = str.toCharArray();
		int len = str.length();
		int vcount = 0;
		int cCount = 0;
		
		for (int i = 0; i < len; i++) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				vcount++;
			}

			else {
				cCount++;
			}
		}
		System.out.println(vcount);
		System.out.println(cCount);
	}

}
