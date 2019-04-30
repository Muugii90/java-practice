package day23_NestedLoops;

public class Trangle {

	public static void main(String[] args) {

		// outer loop
		for (int i = 1; i <= 10; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		// outer loop
		for (int j = 10; j >= 1; j--) {
			// inner loop

			for (int i = j; i >= 1; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}