package day42_encapsulation_contructor;

public class TeslaDealer {

	public static void main(String[] args) {

		
		Tesla tesla = new Tesla();
		tesla.setModel ("Model d");
		tesla.setRange(310);
		tesla.setPrice(51.450);
		tesla.setZetoTo60(3.2);
		tesla.setSelfDriving(true);
		
	
		
		System.out.println("Model: "+ tesla.getModel()+ 
						   " Range: "+ tesla.getRange()+
						   " Price: "+ tesla.getPrice() +
					    	" Zero to 60 "+ tesla.getZetoTo60() + 
					    	" Is Self Driving "+ tesla.isSelfDriving());
		
		System.out.println(tesla);
		System.out.println(tesla.toString());
		System.out.println(tesla.isValidModel("model 3"));
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		//tesla , myTesla
		if(tesla.getZetoTo60() > myTesla.getZetoTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZetoTo60());
		}else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZetoTo60());
		}
		

		buy(tesla);
		buy(myTesla);
		System.out.println(testDrive("Model 3"));
		Tesla testCar = testDrive("Model X");
	}
	
	public static Tesla testDrive(String model) {
		
		System.out.println("I would like to test drive "+ model);
		System.out.println("Sure, let me biold the objext and return it, momentarily");
		
		Tesla car = new Tesla();
		car.setTeslaInfo("Model 3", 360, 4.0, 1999999, false);
		return car;
	}
	
	public static void buy(Tesla car) {
			System.out.println("Purchasing: "+ car.toString());
	}
		
		
		
		
		
		
  }