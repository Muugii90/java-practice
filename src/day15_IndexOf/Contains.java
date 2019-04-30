package day15_IndexOf;

public class Contains {

	public static void main(String[] args) {
		
		String word = "Bananas";
			System.out.println(word.contains("a"));
		
		String email = "moogii.mogi@gamil.com";
			System.out.println(email.contains("@"));
		
		String list  = "apples, tomotoes, eggs,  milk, bread, cereal";
		System.out.println(list.contains ("apple"));
		
		
		if (list.contains("Apple")){
			System.out.println("Apples are there");
		}
		boolean hasEggs = list.toLowerCase().contains("eggs");
			System.out.println("Contains eggs "+ hasEggs);
				
		boolean hasCucumbers = list.contains("cucumber");
			System.out.println("Contians cucumbers: "+ hasCucumbers);
			
		email = "moogii.mogi@yahoo.com"	;
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account ");
		} else if (email.contains("@gmail")) {	
			System.out.println("Gmail account");
		}else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		
		}else {
			System.out.println("Pipe in not detected");
		}
		
		String name  = "Munkhnasan";
		if (name.contains("a") || name.contains("e")){
			
			System.out.println("My name contains: 'a' and 'e' ");
		}else {
			System.out.println("Not here any 'a' and 'e' ");
		}
		String str = " | ";
			System.out.println("Can check veriable "+ etsyTitle.contains(str));
		}
	}


