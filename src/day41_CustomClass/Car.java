package day41_CustomClass;

public class Car {
	
	 String make;
	 String model;
	 double currentSpeed;
	 String color;
	 int speed;
	
	 public void CarInfomation() {
			String info = "Car make [ "+make+"], model ["+model+"], color ["+color+"], currentSpeed ["+currentSpeed+"]";
	System.out.println(info);	
	 }
	 public void showCurrentSpeed(int speedLimit) {
		 if(currentSpeed <=speedLimit) {
			 System.out.println(make+" is driving at "+ currentSpeed +" mph, following speed limit "+speedLimit);
		 }else {
			 System.out.println(make+" is driving at "+ currentSpeed+" mph, over the speed limit "+speedLimit);
		 }
	 }
	 public void accellerate(int mph) {

			 currentSpeed+=mph;
			 System.out.println(currentSpeed);
		 }
	 
	 }

