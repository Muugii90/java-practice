package day23_NestedLoops;

public class StringArray {

	public static void main(String[] args) {
		
		String[]names =new String[5];
		String [] names2 = {"Shaun", "Roman", "Vlad", "Burak", "Maria"};
		System.out.println(names2[0]);
		System.out.println("Number of items: "+ names2.length);// counting the how many values inside it.
		// another way to 
		System.out.println("************");
		//for each loop stands for collections of data
		//we need specify data type, variable name : our collection of data
		//for each loop
		//or enhanced loop
		String []fruits = new String[] {"apples", "oranges","kiwi"};
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
	}

}
