package day38_ArrayList;
import java.util.*;
public class MethodSummary {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
			//add method to add a value
			list.add("red");
			list.add("blue");
			list.add("white");
			list.add("grey");
			list.add("black");
			// add method with index: "yellow will be places to index 0"
			list.add(0, "yellow");
			
			
			
			System.out.println(list.toString());
			//size method return number of values
			System.out.println("Number of elements: "+ list.size());
			//get method return value from index
			System.out.println("3: "+list.get(3));
			System.out.println("0: "+ list.get(0));
			
			//remove using index removes value from index position
			list.remove(0);
			System.out.println(list);
			
			list.remove("blue");
			System.out.println(list);
			
			
			//set(index, value) replace certain index with new value
			
			list.set(0, "orange");
			System.out.println(list);// red will be replaced by orange
		
			//indexOf(value) returns index of value in the list
			System.out.println("grey: "+ list.indexOf("grey"));
			
			
			System.out.println("green: "+ list.indexOf("green"));
			
			//isEmpty() returns true if list empty. size == 0
			System.out.println("is list Empty? "+ list.isEmpty());
			
			System.out.println("is list Empty? "+ (list.size()==0));
			
			//contains (that element) returns true if value is present
			System.out.println("white is list: "+ list.contains("white"));
			
			
			
			List<String>list2 = new ArrayList<>();
			//addAll values from one list into another
			list2.addAll(list);
			
			System.out.println("list2: "+list2);
			
			//ContainsAll check if list has all value of another list
			System.out.println("Checking all contained: "+list.containsAll(list2));
			
			//Equals(list) checks if 2 lists are exactly equals
			System.out.println("equals: "+ list.equals(list2));
			
			list2.add("pink");
			list2.removeAll(list);
			System.out.println("list2 after removeAlls "+list2);
			
			System.out.println("list: " + list);
			
			//addAll (index , list) ad a new values starting from given index
			
			list2.addAll(0, list);
			System.out.println(list2);
			
			list.clear();
			list2.clear();
			System.out.println("both Empty? "+list.isEmpty());
			System.out.println("both Empty? "+list2.isEmpty());
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
