package day51_Inheritance03_overridding;

public class Yoga extends Exercise{

	@Override
	public int perform(int minutes) {
		System.out.println("Yoga");
		return minutes*5;
	}
}
