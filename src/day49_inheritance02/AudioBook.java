package day49_inheritance02;

public class AudioBook extends Book{
	
	private double length;
	private String narrator;
	
	public void listen() {
		System.out.println("Listing to " +getTitle()+ " by "+ getAuthor() +" and narrater by "+ narrator);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarritor(String narrator) {
		this.narrator = narrator;
	}
	
}
