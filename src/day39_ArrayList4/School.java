package day39_ArrayList4;

public class School {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Roman";
		student.age = 25;
		student.subject = "Java";
		
		System.out.println("Name: "+ student.name);
		System.out.println("Age: "+ student.age);
		System.out.println("Subject: "+student.subject);
		
		Student student2 = new Student();
		student2.name = "Munkhnasan";
		student2.age = 29;
		student2.subject = "Selenium";
		
		System.out.println("Name: "+ student2.name);
		System.out.println("Age: "+ student2.age);
		System.out.println("Subject: "+student2.subject);
		
	}

}
