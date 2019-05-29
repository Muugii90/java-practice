package day52_inheritance_final_keyword;
import java.util.*;
public class FinalArrayList {

	
	public static final  String COLOR ="Pink";
	
	
	public static void main(String[] args) {
		
		final ArrayList<String>COLOR = new ArrayList<>();
		
		COLOR.add("Orange");
		COLOR.add("Grey");
		COLOR.add("White");
		COLOR.add("Blue");
		
		System.out.println(COLOR.toString());
		
		COLOR.add("Black");
	//	COLOR = new ArrayList<>();// new Object //  won't work with new key word 
		System.out.println(COLOR.toString());
		
		COLOR.add("Yellow");
		System.out.println(COLOR.toString());
		
		
		
	}

}
