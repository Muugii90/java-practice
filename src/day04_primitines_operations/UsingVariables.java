package day04_primitines_operations;

public class UsingVariables {
	public static void main(String[] args) {
		int  num1, num2, num3;
		num1 = 100;
		num2 = num1;
	
		System.out.println (num1);
		System.out.println (num2);
		
		num2 = 200; //200
		num3 = num1; //100
		num1 = num2; //200
		
		
		System.out.println (num1); //200
		System.out.println (num2);//200
		System.out.println (num3); //100 
		
		int apple = 25;
		int kiwis = apple;
		int mangoes = 55;
		kiwis = mangoes;
		System.out.println (apple); //25
		System.out.println (kiwis); //55
		System.out.println (mangoes);//55
		
	}

}
