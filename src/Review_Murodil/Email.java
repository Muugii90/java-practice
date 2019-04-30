package Review_Murodil;

public class Email {

	public static void main(String[] args) {
		
		System.out.println(email("Moogii","Enkh").toUpperCase());
		
		System.out.println(email("Moogii","Enkh", "yahoo").toUpperCase());
		String[] characters = {"Savannah Daniel", "Abby Green", "Velma Griffin", "Veronica Cooper", "Milly Fitzpatrick"};
		//for(String str : characters) {
			
			//String name = str.split(" ")[0];
			//String lastname = str.split(" ")[1];
			//System.out.println(email(name, lastname).toLowerCase());
			System.out.println(formatName("munkhnasan remerscheid"));
		System.out.println(underAge(21));
	}

	public static String email(String firstName, String lastName) {
		return firstName+"_"+lastName+"@gmail.com";
	}
	public static String email(String firstName, String lastName, String domain) {
		return firstName+"_"+lastName+"@" + domain+".com";
	}
	public static String formatName(String str ) {
		str = str.trim();
		if(str.isEmpty()) {
			return "Name is too short";
		}else if (str.contains(" ")) {
			String []values = str.split(" ");
			String result = "";
			for(String value : values) {
				result = result + value.substring(0,1).toUpperCase()+ value.substring(1).toLowerCase()+" ";			
			}
			return result.trim();
		}
		return str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();
	}
	public static boolean underAge(int age) {
		return age < 21;
	}
}
