package Vasly_Review;

public class HotDogStand {
	
	private int ID;
	private int sold; // instance var
	private static int total;// shared variable 
	
	
	public HotDogStand(int ID, int sold) {// 
		this.ID =ID;
		this.sold = sold;
		
	}
	public int getSold() {
		return this.sold;
	}
	//Also create a method named justSold that increments by one the number 
	//of hot dogs the stand has sold. 
	
	public void justSold() {
		// this sold is for counting hot dogs for every hot dog stand individually
		sold ++;
		//total for counting sold hot dog for all hot dog stands
		total++;
	}
	
	public static int getTotal() {
		return total;
	
	}
}
