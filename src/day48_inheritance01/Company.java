package day48_inheritance01;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Marifjon";
		emp1.jobTitle = "Teacher";
		emp1.gender = 'm';
		emp1.age = 35;
		
		Employee emp2 = new Employee();
		emp2.name = "Kiki";
		emp2.jobTitle = "Resume Prep";
		emp2.gender = 'f';
		emp2.age = 26;
		
		emp1.work();
		emp2.work();
		
		emp1.walk();
		emp2.walk();
		
		emp1.eat("Chicken tender");
		emp2.eat("Salad");
		
		emp1.sleep(9);
		emp2.sleep(5);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

}
