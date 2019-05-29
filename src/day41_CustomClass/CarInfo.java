package day41_CustomClass;

public class CarInfo {

	public static void main(String[] args) {
	
		Car info = new Car();
		info.make = "Toyota";
		info.color ="Red";
		info.currentSpeed = 2000.65;
		info.model = "Camry";
		
		
		info.CarInfomation();
		info.showCurrentSpeed(50);
		info.accellerate(20);
		System.out.println(info.currentSpeed);
		
		
		
		
	}

}
