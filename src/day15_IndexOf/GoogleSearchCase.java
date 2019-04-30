package day15_IndexOf;

public class GoogleSearchCase {

	public static void main(String[] args) {
	
		String item = "java";
		String pageTitle = item + "Google Search";
		
		if (pageTitle.startsWith(item)) {
			System.out.println("Pass: page title check passed");	
		}else {
			System.out.println("Fail: Page title check failed");
		}
		
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("Pass: Google title check passed");	
		}else {
			System.out.println("Fail: Google title check failed");
		}
		
		
	}

}
