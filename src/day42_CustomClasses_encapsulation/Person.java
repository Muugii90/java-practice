package day42_CustomClasses_encapsulation;

public class Person {

	
	
	
	private String name;
	private int age;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Munkhnasan";
		p1.age = 29;
		System.out.println(p1);
	}
	
	//public getter and setter method for name
		public String getName() {
			return name;
	}
		public void setName(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println(name+" | "+age);
		}

}
