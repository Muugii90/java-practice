package day15_IndexOf;

public class IndexOfNumber2 {

	public static void main(String[] args) {
		//index of with 2 inputs
		String list = "html-selenium-angular-jerkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("Frist dash: "+ firstDash);
		
		int secondDash = list.indexOf("-", 5);// Instated of 5  
		System.out.println("Second dash: " + secondDash);
		
		int thrisdDash = list.indexOf("-", secondDash + 1 );
		System.out.println("Third dash: " + thrisdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("Last dash: "+ lastDash);// lastIndexOf ~ when I search for 
													//last position of the 
													//character / string 
		
	}

}
