package day38_ArrayList;
import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add("Sturday");
		list.add("Java day");
		list.add(90);
		list.add(23.30);
		list.add(true);
		list.add(false);
		System.out.println(list);
		String allValues = list.toString();
		System.out.println(allValues);
		
		
		String str = list.get(0).toString();
		System.out.println(str);
		//All values are stored as raw type. 
		//as a General Object type
		
		Integer num = (Integer)list.get(2);// down casting 
		System.out.println(num);
	}

}
