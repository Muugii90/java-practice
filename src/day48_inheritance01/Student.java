package day48_inheritance01;

public class Student extends Person{

		int studentID;
		String clazz;
		
		public void code(String language) {
			System.out.println(name+" is coding "+language);
		}
		
		public void attendClass() {
		System.out.println(name + " is attanding "+ clazz+ " class");
	}

}
