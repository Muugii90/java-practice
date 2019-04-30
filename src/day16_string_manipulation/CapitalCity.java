package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		str = str.replace("Moscow", "Mongolia").replace("Russia", "Ulaanbaatar");
		
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		String company = "FannieMea";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
		String car = "Toyota is the best";
		String model = "camry";
		String brand = car.replace("best", model);
		System.out.println(brand);
		
		
		
		
	}

}