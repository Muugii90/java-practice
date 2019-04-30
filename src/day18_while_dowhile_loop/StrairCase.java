package day18_while_dowhile_loop;

public class StrairCase {

	public static void main(String[] args) {
		
		String stairs = "*";
		int num = 1;
		while (num <= 15) {
			System.out.println(stairs);
			stairs+= "*";
			num++;
		}
		
		System.out.println();
		//checking with length() here
		String stairs1 ="*";
		while (stairs1.length()<=15) {
			System.out.println(stairs1);
			stairs1+= "*";
			
		}
		
		

	}

}
