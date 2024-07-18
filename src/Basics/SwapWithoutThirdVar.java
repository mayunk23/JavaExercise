package Basics;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {


		int a = 15;
		int b = 10;
		
		b = a+b; // 25
		a = b-a; // 15
		b= b-a;
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
