package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		int students = 45;
		System.out.println("Students: " +students);
		
		students = students + 5;
		System.out.println("Students: " + students);

		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		
		teachers +=2;
		System.out.println("Teachers: " + teachers);
		
		teachers -= 5;
		System.out.println("Teachers: " + teachers);
		
		
		int i = 10;
		System.out.println(i -=8);
		
		i = 15;
		System.out.println( i /= 2);
		
		int cars = 12;
		System.out.println("Cars: " + cars );
		
		cars *=2; // cars = cars * 2; long way to do as well. 
		System.out.println("Cars: " + cars); 
		
		cars += cars;
		System.out.println("Cars: " + cars );
		
		//Huvaaj bga  
		int shoes = 20;
		shoes /= 4;
		System.out.println("Shoes: " + shoes);
		
		
		double price = 45.50;
		int amount = 5;
		price += amount;
		System.out.println(price);
		
		int minutes = 66;
		minutes %= 60; // minutes = minutes %60
		System.out.println("Remaining: " +minutes);
		
		
		int pennies = 550;
		pennies %= 100; // pennies= pennies % 100;
		System.out.println("Pennies left: " +pennies);
		
		int apples = 10;
		apples =-3; //assiging -3
		
		System.out.println(apples);
		
		int count = 1;
		count = count + 1;
		count +=1;
		System.out.println(count);
		
	}

}
