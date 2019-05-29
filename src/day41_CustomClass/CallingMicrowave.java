package day41_CustomClass;

public class CallingMicrowave {

	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza with Pepproni& sausage");
		mic.turnOff();
		
	}
}
