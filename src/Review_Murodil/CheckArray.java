package Review_Murodil;

public class CheckArray {

	public static void main(String[] args) {
		
		int n = 55;
		int nums [] = {12,34,55,67,875,90};
		
		boolean present = false;
		for(int num : nums) {
			if(num == 55) {
				present = true;
				break;
			}
	}
		System.out.println("Is "+ n+ " present? "+present);
	}
}
