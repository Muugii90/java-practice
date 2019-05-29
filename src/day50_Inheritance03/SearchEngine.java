package day50_Inheritance03;

public class SearchEngine {
	
	public int search(String item) {
		System.out.println("Searching for: "+ item);
		int result = item.length();
		return result;
	}
	
	protected void search(String item, String item2) {
		System.out.println("Searching for 2 items: "+ item+ ", ");
		int result = item.length()+ item2.length();
		System.out.println("Total count: "+ result);
	}
	
	String clickResult() {
		System.out.println("Clicking Result");
		return "Search result page";
	}
	
}
