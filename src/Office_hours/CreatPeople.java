package Office_hours;

public class CreatPeople {

	public static void main(String[] args) {
		
		Person john = new Person("01/01/2000");
		john.setFirstname("John");
		john.setLastName("Doe");
		
		System.out.println(john.getFirstname());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		
		john.setLastName("Smith");
		
		System.out.println(john.getBirthday());
		
	}

}
