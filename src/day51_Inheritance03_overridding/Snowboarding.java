package day51_Inheritance03_overridding;

public class Snowboarding extends Exercise {
	
	
	public int perform(int minutes) {
		super.perform(10);// call super class version 
		System.out.println("Snowboarding  for " + minutes + " mintues");
		return minutes * 7;
		
	}
}
