package day37_ArrayList;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> shoppignList = new ArrayList<>();
		shoppignList.add("Banana");
		shoppignList.add("Kiwi");
		shoppignList.add("Strawberry");
		shoppignList.add("Apple");
		shoppignList.add("Watermelon");
		shoppignList.add("Orange");
		System.out.println(shoppignList);
		for(String list: shoppignList) {
			System.out.print(list+" ");
			
		}
		
		
		System.out.println(shoppignList.get(1));
		int count = shoppignList.size();
		System.out.println("Count shopping list: "+count);
		System.out.println(shoppignList.size());
		
		System.out.println(shoppignList.toString());
		System.out.println(shoppignList.get(0) +" | "+shoppignList.get(count-1));
		
		System.out.println(shoppignList.remove(0));
		shoppignList.remove("Apple");
		
		shoppignList.remove("Orange");
		System.out.println(shoppignList);
		
		System.out.println(shoppignList.get(0));
		shoppignList.remove(0);
		System.out.println(shoppignList);
		
		
	}

}
