package day50_Inheritance03;

public class TestAnimal {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(20);
		cat.move(10);
		dog.move(10);
		duck.move(30);
		}

}
