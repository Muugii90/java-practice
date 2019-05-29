package day42_CustomClasses_encapsulation;
import java.util.*;
public class Starbucks {
public static void main(String[] args) {
	
	//declare coffeearray that can store 2 cofee objects
	Coffee [] coffeeArray = new Coffee [2]; // creating a array
	coffeeArray[0] = new Coffee();
	coffeeArray[0].setCoffeeInfo("Latte Grande", "Tall", 2.55, 7);
	coffeeArray[0].getCoffeeInfo();
	
	
	
	Coffee latte = new Coffee();
	latte.setCoffeeInfo("Latte", "TALL", 3.95, 300);
	coffeeArray[1]= latte;
	latte.getCoffeeInfo();
}
}
