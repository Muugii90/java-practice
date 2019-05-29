package day36_WrapperClasses_ArraysListIntro;

import java.util.ArrayList;



public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Mongolia");
		languages.add("Russian");
		languages.add("Spanish");
		languages.add("English");
		
		
		
		System.out.println(languages.size());
		languages.add("Java");
		System.out.println(languages.size());
		languages.remove(0);
		System.out.println(languages.size());
		System.out.println(languages.toString());
	}

}
