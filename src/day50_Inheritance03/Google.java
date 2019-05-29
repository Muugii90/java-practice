package day50_Inheritance03;

public class Google extends SearchEngine{
	@Override
	public int search(String changed) {
		System.out.println("Searching for: "+ changed);
		int result = changed.length();
		return result;
	}
	@Override
	public void search(String item1,String item2) {
		System.out.println("Searching for 2 items: "+ item1+ ", "+ item2);
		int result = item1.length()+ item2.length();
		System.out.println("Total count: "+ result);
	}
	@Override
	protected String clickResult() {// when we add parameter here it is overloading 
		System.out.println("Clicking Result");
		return "Search result page";
	}
	
}
