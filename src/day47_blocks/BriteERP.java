package day47_blocks;

import java.time.LocalDateTime;
import static day47_blocks.TestData.*;
public class BriteERP {

		static {
			System.out.println("Launch Browser");
			System.out.println("Navigate to : "+ TestData.url);
			
		}
		public static void enterEmail() {
			System.out.println("Enter email: "+ TestData.email);
		}
		public static void enterPasssword() {
			System.out.println("Enter password: "+ TestData.passsword);
		}
		public static void verifyLogin() {
			System.out.println("Expected name: "+ TestData.userName);
			System.out.println("Actual Name displayed: Munkhnasan Enkhbayar");
			System.out.println("Login Successful - "+ LocalDateTime.now());
		}
		
}