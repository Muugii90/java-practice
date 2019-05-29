package day48_inheritance01;

public class School {
	public static void main(String[] args) {
		
		Person person = new Person();
		Student student = new Student();
		
		person.name = "Obama";
		person.age = 57;
		person.gender = 'm';
		
		student.name = "Roman";
		student.age = 24;
		student.gender = 'm';
		
		person.sleep(8);
		student.sleep(6);
		
		person.eat("Burger");
		student.eat("fries");
		
		person.walk();
		student.walk();
		
		Student student2 = new Student();
		student2.name = "Muugii";
		student2.age =29;
		student2.gender ='f';
		student2.studentID = 12345;
		student2.clazz = "Agile Scrum";
		
		student2.code("Java");
		student2.attendClass();
		student2.eat("Buuz");
		student2.walk();
		student2.sleep(7);
		
	}
}
