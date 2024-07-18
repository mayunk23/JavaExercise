package Basics;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 12345;

//		int rev = 0;
//
//		while (num != 0) {
//
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println(rev);

//		StringBuffer buffer = new StringBuffer(String.valueOf(num));
//		System.out.println(buffer.reverse());

		StringBuffer sb = new StringBuffer();
		sb.append(num);
		StringBuffer rev = sb.reverse();
		//sb.reverse();
		System.out.println(rev);

	}

}
