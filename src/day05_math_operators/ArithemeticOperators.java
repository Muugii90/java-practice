package day05_math_operators;

public class ArithemeticOperators {
 public static void main(String[] args) {
	System.out.println(55+5);
	
	int chairs = 140;
	System.out.println(chairs +2);
	
	int moreChairs = chairs + 5;
	System.out.println(moreChairs);
	
	int tables = 130;
	int total = tables + chairs;
	System.out.println(total);
	
	 
	System.out.println(500-123);
	
	int result = 44-23;
	System.out.println(result);
	
	double balance = 1200.50;
	double transaction = 56.44;
	
	System.out.println(balance - transaction);
	
	int linesOfCode = 50;
	System.out.println(linesOfCode - 2);
	System.out.println("Lines of code " + linesOfCode);
	
	System.out.println(22*2);
	
	int classes = 5;
	System.out.println(linesOfCode * classes);
	
	int totalLinesOfCode = linesOfCode * classes;
	System.out.println(totalLinesOfCode);
	
	System.out.println ("totalLineOfCode=" + totalLinesOfCode);
	
	//Division operation
	System.out.println(55 / 5);
	System.out.println(10.0 / 3);
	System.out.println(15 / 7);
	System.out.println(15.0 / 7);
	System.out.println(5 / 2);
	System.out.println(11.0 / 0);
	
	int i=1;
	int k=2;
				
	i = i + k; //1 = 1 + 2;/3
	k = i - k;// 2 = 1 - 2; /
	i =	i - k;// 1 = 1 - 2;/
	
	
	System.out.println("This is k: "+ k);
	
	System.out.println("This is i: "+i);
}
}
