package Basics;

public class CapgeminiPractice {

	public static void main(String[] args) {

		// 1
//		String str = "Hello World";
//
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(str.length() - 1));
//		
		// 2

//		Input : Welcome to Capgemini
//		Output: Capgemini to Welcome

//		String input = "Welcome to Capgemini";
//
//		String words[] = input.split(" ");
//		System.out.println(words[2] + " " + words[1] + " " + words[0]);

		// 3

//		Input : Welcome to Capgemini
//		Output : emoclew to Capgemini

//		String input = "Welcome to Capgemini";
//		String words[] = input.split(" ");
//		String rev = "";
//
//		String firstWord = words[0].toString();
//
//		for (int i = firstWord.length() - 1; i >= 0; i--) {
//
//			rev = rev + firstWord.charAt(i);
//		}
//
//		System.out.println(rev + " " + words[1] + " " + words[2]);

		// 4

		// Write a program for the product of 2 numbers is 24 {like 24*1 , 12*2,6*4 ….}

//		int product = 24;
//
//		for (int i = 1; i <= product; i++) {
//
//			if (product % i == 0) {
//				System.out.println(i + "*" + product / i);
//
//			}
//
//		}

		// 5
		// Pre increment and post increment like ++z-x+x+y+z++(find output) ...z=10,
		// x=5,y=3

//		int z = 10, x = 5, y = 3;
//
//		System.out.println(++z - x + x + y + z++);

		// 6

		// Sum of n Numbers

		int n = 20;

//		int sum = 0;
//
//		for (int i = 1; i <= n; i++) {
//
//			sum = sum + i;
//
//		}
//		System.out.println(sum);

		int sum = n * (n + 1) / 2;

		System.out.println(sum);
	}

}
