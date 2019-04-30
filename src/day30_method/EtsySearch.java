package day30_method;

public class EtsySearch {

	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResult();
		
	}
	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'Wooden Spoon' into search field ");
		System.out.println("Click on 'Search' button ");
	}
	public static void printResult() {
		System.out.println(" wooden spoon (14,700 Result)");
	}
	
	
}
