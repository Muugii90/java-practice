package day38_ArrayList;
import java.util.*;


public class CollectionsSorting {

	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<>();
		numsList.add(44);
		numsList.add(2);
		numsList.add(5);
		numsList.add(786);
		numsList.add(456);
		numsList.add(99);
		numsList.add(13);
		System.out.println(numsList);
		
		System.out.println("Sorting .. wait ...");
		Collections.sort(numsList);
		System.out.println(numsList);
		
		
		List<String> strList = new ArrayList<>();
		strList.add("Moogii");
		strList.add("Tsoomoo");
		strList.add("Haku");
		strList.add("Mike");
		strList.add("Esper");
		System.out.println(strList);
		
		Collections.sort(strList);
		System.out.println(strList);
		
		//MAx, MIN
		int maxNum = Collections.max(numsList);
		System.out.println(maxNum);
		int minNum = Collections.min(numsList);
		System.out.println("Min number: "+minNum);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println("ABC order: "+maxName);
		System.out.println("ZWY order: "+minName);
		
		
		Collections.shuffle(strList);
		System.out.println("Mixed: "+strList);
	}

}
