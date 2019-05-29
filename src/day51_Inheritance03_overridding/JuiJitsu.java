package day51_Inheritance03_overridding;

public class JuiJitsu extends Exercise {

	@Override
	public int perform(int minutes) {
		System.out.println("JuiJitsu");
		return minutes * 12;
}
	
	public int perform(int minutes, String name) {
		System.out.println("JuiJitsu");
		return minutes * 12;
}
}