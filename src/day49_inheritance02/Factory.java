package day49_inheritance02;

public class Factory {
	// Factory is a NON- Subclass that is in same package
	public static void main(String[] args) {
		
		Device dv = new Device();
		dv.brand = "LG";
		
		dv.model = "3300";
		dv.price = 1000;
		//dv.country = "China"; not visible bc it is private
	}

}
