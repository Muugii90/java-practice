package day29_GoOver;

public class Student {

	public static void main(String[] args) {
		sayHello();
		study();
		code();
	}
	
	public static void study() { //custom method
		System.out.println("Student is studying");
		
	}
	public static void sayHello () {
		System.out.println("Hello.");
		System.out.println("How are you?");
	}
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
	
	

}
