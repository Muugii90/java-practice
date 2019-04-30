package day34_ArraysList_Intro;

public class Method_Overloading {

	public static void main(String[] args) {
		add(23, 23);
		add(12, 10);
		add("Game", "Over");
	}

	public static void add(int num, int num1) {
		int result = num + num1;
		System.out.println("Result: " + result);

	}

	public static void add(double num, double num1) {
		double result = num + num1;
		System.out.println("Result: " + result);
	}

	public static void add(String str, String str1) {
		String result = str + str1;
		System.out.println("Result: " + result);
	}

}
