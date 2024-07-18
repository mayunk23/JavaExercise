package Basics;

public class PrintLetterTwice {

	public static void main(String[] args) {


		String name = "Akanksha";
		
		
		int len = name.length();
		//String dupli = name.replaceAll(".", "$0$0");
		
		//System.out.println(dupli);
		
		StringBuilder x = new StringBuilder();
		
		for(int i =0;i < len; i++) {
			
			char c = name.charAt(i);
			x.append(c).append(c);
		}
		System.out.println(x);
		
		
	}

}


//247649