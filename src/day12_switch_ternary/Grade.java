package day12_switch_ternary;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
		System.out.println("Pass");
		break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
		
		}
			
		
		}
	}

