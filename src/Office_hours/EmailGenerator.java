package Office_hours;

public class EmailGenerator {
	 static String companayNmae = "Deloitte";
	 String name;
	 public EmailGenerator (String name) {
		 this.name = name;
	 }
	public String getEmail() {
		return name + "@"+companayNmae+".com";
	}
	
	 
}

