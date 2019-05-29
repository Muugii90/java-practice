package day41_CustomClass;

public class Microwave {
	String brand;
	boolean isOn;// false
	
	public void turnOn() {
		
		if(isOn == true) {
			System.out.println(brand+ "It is a");
		}else {
			System.out.println("Turn on "+brand + "microwave");
			isOn = true;
		}
		
	}
	public void turnOff() {
		
		if(isOn == false) {
			System.out.println(brand + " microwave is alrady OFF");
		}else {
			System.out.println("Turn OFF "+ brand + " macrowave");
			isOn =false;
		}
	}
	
	public void heat (String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is OFF, cannot heat " + food);
		}
	} 
	
}
