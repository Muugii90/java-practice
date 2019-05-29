package day51_Inheritance03_overridding;

public class Running extends Exercise{

	@Override
	public int perform(int minutes) {
		System.out.println("Running");
		return minutes * 10;
		
	}
}
