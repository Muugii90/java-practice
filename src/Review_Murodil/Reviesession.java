package Review_Murodil;

public class Reviesession {

	public static void main(String[] args) {

		int[] numbers = { 421, 235, 435, 64, 547, 63, 54, 845, 4 };
		double [] nums = {123,6543,5432,4321,1232,432};
		int m = findMin(numbers);
		System.out.println("Min number integer: "+m);
		double d = findMin(nums);
		System.out.println("Min double: "+d);
			
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (i < min) {
				min=i;
			}
		}
		return min;
	}
	public static double findMin(double[] arr) {
		double min = arr[0];
		for (double i : arr) {
			if (i < min) {
				min=i;
			}
		}
		return min;
	}
}
