package Basics;

public class Cat extends Animal {

	@Override
	public void meth() {
		System.out.println("Cat");
	}

	public static void main(String[] args) {

		Animal a = new Cat();
		a.meth();
	}

}
