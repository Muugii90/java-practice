package day30_method;

public class Student {

	public static void main(String[] args) {
		study("Java");
		study ("SQL");
		sleep(7);
	}
	public static void study (String topic) {
		System.out.println("Student is studying "+ topic);
		
	}
		
	public static void sleep (int hours) {
		System.out.println("Student has been sleeping for "+ hours+ " hours");
	}
}
