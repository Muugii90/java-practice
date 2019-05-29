package day38_ArrayList;

import java.util.ArrayList;

public class Contains_ContainsAll_Equals {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
	
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1);
		
		
		ArrayList<String> list2 = list1;
		ArrayList<String> months = new ArrayList<>(list1);
		System.out.println(months.toString());
		System.out.println(list2);
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months);
		
		System.out.println(months.contains("May"));
		System.out.println(months.containsAll(list1));
		
		if(months.contains("Jan")) {
			System.out.println("That month is here ");
		}else {
			System.out.println("Not here");
		}
		
		System.out.println(list1.containsAll(months));
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1) == "Feb");
		System.out.println(months.get(1).equals("Feb"));
		
		
		ArrayList <String> month2 = new ArrayList<>(list1);
		System.out.println("Month: "+ months);
		System.out.println("Month2: "+ month2);
		
		if(months.contains(month2)) {
			System.out.println("Months contains all month2 ");
		}else {
			System.out.println("Does not has them");
		}
		month2.add("Jan");
		
		if(months.containsAll(month2)) {
			System.out.println("Months contains all month2 ");
		}else {
			System.out.println("Does not has them");
		}
	}

}
