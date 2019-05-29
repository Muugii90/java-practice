package day50_Inheritance03;

public class SlackChannel {

	public static void main(String[] args) {
		
		SlackUser user = new SlackUser("Nadir");
		AdminUser adminUser = new AdminUser("Munkhnasan");
		
		user.sendAMessage("Study hard You can do it Moogii, You will get a job");
		adminUser.sendAMessage("Thank you");
	}

}
