package Office_hours;

public class Employees {

	public static void main(String[] args) {
		EmailGenerator e1 = new EmailGenerator("Munkhnasan");
		System.out.println(e1.getEmail());
		
		EmailGenerator e2 = new EmailGenerator("Tsolmon");
		System.out.println(e2.getEmail());
		EmailGenerator.companayNmae ="amazon";
		System.out.println(e1.getEmail());
		System.out.println(e2.getEmail());
		
	}

}
