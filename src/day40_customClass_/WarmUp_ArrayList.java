package day40_customClass_;

import java.util.*;

public class WarmUp_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("aa");
		myList.add("bb");
		myList.add("aa");
		myList.add("ee");
		String find = "aa";
		
		System.out.println(countOccurances(myList, find));
	}

	public static int countOccurances(ArrayList<String> list, String word) {

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(word)) {
				count++;
				list.remove(word);
			}

		}

		return count;
		
	}
}
