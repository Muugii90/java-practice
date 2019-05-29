package day39_ArrayList4;
import java.util.*;
public class CustomListMethod {

	public static void main(String[] args) {
		ArrayList <Integer> numsList = new ArrayList<>();
		numsList.add(12);
		numsList.add(2);
		numsList.add(22);
		numsList.add(42);
		numsList.add(124);
		printList(numsList);
		
		List<Double> nums = new ArrayList<>();
		nums.add(23.30);
		nums.add(2.40);
		nums.add(60.3);
		nums.add(65.08);
		nums.add(23.30);
		
		System.out.println(sumList(nums));
		System.out.println(getList(5));
		List<Integer> num2 = getList(10);
		System.out.println(num2);
		//for(;;) {
		System.out.println(gerRandomList(10));
		
		List<Integer> rList = gerRandomList(10);
		Collections.sort(rList);
		System.out.println(rList);
		
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("43");
		strNums.add("8");
		strNums.add("76");
		List<Integer> converted = converToList(strNums);
		System.out.println(converted);
	}
	public static void printList (ArrayList<Integer> nums) {
		
		for(Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static double sumList(List<Double> nums) {
		double sum = 0;
		for (int i = 0; i < nums.size(); i++) {
				sum+= nums.get(i);
		}
			return sum;
	}

	
	public static List<Integer> getList(int size){
		List<Integer> num = new ArrayList<>();
		
		for (int i = 1; i <= size ; i++) {
			num.add(i);
			
		}
		return num;
	}
	
	public static List<Integer> gerRandomList(int size){
		Random r = new Random ();
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			nums.add(r.nextInt(101));
		}
	
	return nums;
	}

	public static List<Integer> converToList(List <String> strList){
		List<Integer> newList = new ArrayList<>();
		for (String str : strList) {
			newList.add(Integer.parseInt(str));
			
		}
	return newList;
}
}