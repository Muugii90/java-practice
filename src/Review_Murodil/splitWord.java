package Review_Murodil;

public class splitWord {

	public static void main(String[] args) {
		String words = "java-selenium-cucumber-testing-junit-eclipse-maven-git-github";
		String[]splited =words.split("-");
		
		
		System.out.println(splited.length);
		System.out.println(splited[0]);
		for (String word : splited) {
		System.out.println(word);
		}
		String search = "All this result 'wooden spoon' 13,456 result ";
		String []spliting = search.split(" ");
		System.out.println("Length of searh: "+ spliting.length);
		
		System.out.println("Wooden spoon count: "+ spliting[5]);
		
	
		int nums [] = {2,15,67,43,54,5};
		boolean found =false;
		for(int i = 0; i< nums.length-1; i++) {
			if(nums[i]==5 && nums[i+1]==5) {
				found =true;
				break;
			}
		}
		System.out.println(found);
		
			
		}
	}


