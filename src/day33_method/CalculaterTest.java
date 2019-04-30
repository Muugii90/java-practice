package day33_method;

public class CalculaterTest {

	public static void main(String[] args) {
		System.out.println(Calculater.add(20, 10));
		System.out.println(Calculater.multiply(2, 4));
		System.out.println(Calculater.divide(100, 2));
		System.out.println(Calculater.minus(20, 9));
		
		int addResult = Calculater.add(20, 1);
		int multiResult = Calculater.multiply(2,5);
		int dividResult = Calculater.divide(30, 3);
		int minResult = Calculater.minus(10, 5);
		System.out.println("Add Result: "+addResult);
		System.out.println("Minus result: "+minResult);
		System.out.println("Divid result: "+ dividResult);
		System.out.println("Multiply result "+ multiResult);
		
		
		int a= 10, b = 5;
		int myResult = Calculater.minus(a, b);
		
		System.out.println("My Result "+myResult);
		
		int []dNums = {2, 4};
		int result2 = Calculater.multiply(dNums[0], dNums[1]);
		System.out.println("Result 2: "+result2);
		if(Calculater.add(10, 16)==26) {
			System.out.println("Add Unit test Passed ");
		}else {
			System.out.println("Add Unit test failed");
		}
		if(Calculater.divide(10, 2)==5) {
			System.out.println("Divide Unit test passed ");
		}else {
			System.out.println("failed");
		}
	}

}
