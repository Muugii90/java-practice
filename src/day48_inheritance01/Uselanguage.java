package day48_inheritance01;

public class Uselanguage {
public static void main(String[] args) {
	
	Language lan = new Language("en", "USA", 26);
	lan.setName("MN");
	lan.setRegion("Mongolia");
	lan.setNumberOfLetters(35);
	System.out.println(lan.getName());
	System.out.println(lan.getRegion());
	System.out.println(lan.getNumberOfLetters());
}
}
