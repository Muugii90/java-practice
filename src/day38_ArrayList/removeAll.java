package day38_ArrayList;
import java.util.*;
import java.util.function.Predicate;
public class removeAll {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(22);
		list1.add(32);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(32);
		list2.add(19);
		list2.add(12);
		list2.add(1);
		list2.add(345);
		list2.add(22);
		list2.add(320);
		list2.add(12);
		System.out.println(list1);
		System.out.println(list2);
		
		
		list2.removeAll(list1);
		System.out.println(list2);
		
		list1.addAll(list2);
		System.out.println(list1);
		
	}

}
