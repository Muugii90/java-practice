package day22_Recap_loops;

public class CountCats {

	public static void main(String[] args) {
		 
	    String str = "mycatyourcat";
        //count how many "cat" s
        int cats = 0;
        for(int i = 0; i <= str.length()-3; i++) {
            System.out.println(str.substring(i, i+3));
            if(str.substring(i, i+3).equals("cat") ) {
                cats++;
            }
        }
        
        System.out.println("Cats: " + cats);
  //================================================
        //cat dog homework
	String word = "catanddog";
	 int countOfCats = 0;
	int countOfDogs = 0;
	
	for(int i =0; i<=word.length()-3;i++) {
		if(word.substring(i, i+3).equals("cat")) {
			countOfCats++;
		}
	if(word.substring(i, i+3).equals("dog")) {
		countOfDogs++;
	}
	}
	if(countOfCats==countOfDogs) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	}
}
