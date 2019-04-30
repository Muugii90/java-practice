package day30_method;

import java.util.Scanner;

public class RangePrint {
	
	public static void main(String[] args) {
		rangePrint();
	}
		public static void rangePrint () {
		
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter 2 numbers: ");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			
			if(number1 < number2) {
				for (int i = number1; i <= number2; i++) {
					System.out.print(i+" ");
				}
			}else if (number1 > number2) {
				for (int j = number1; j >= number2; j--) {
					System.out.print(j+" ");
				}
			}else {
				System.out.print(number1);
			}
			System.out.println();
		}
		}
	


