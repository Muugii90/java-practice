package day46_static_keyword;

public class Campus {
	private String city;
	static  String country;
	
	static {
		System.out.println("Static block -1");
		country ="USA";
		
	}
	static {
		System.out.println("ststic block -2");
		country ="Canada";
	}
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	public static void CampusInfo() {
		System.out.println("Welcome to Campus!");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
