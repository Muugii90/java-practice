package day48_inheritance01;

public class Language {
	private String name;
	private String region;
	private int numberOfLetters;
	public String pronouciation;
	public char firstAlphabet;
	
	
	
	public Language() {
		System.out.println("No ~ args");
	}
	public Language(String name, String region, int numberOfLetters) {
		this.name = name;
		this.region = region;
		this.numberOfLetters = numberOfLetters;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNumberOfLetters() {
		return numberOfLetters;
	}
	public void setNumberOfLetters(int numberOfLetters) {
		this.numberOfLetters = numberOfLetters;
	}
	
	
}
