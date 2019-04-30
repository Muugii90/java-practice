package day26_array_continue;

import java.util.Arrays;
import java.util.Random;

public class WarmUp_PopularNames {

	public static void main(String[] args) {
		
		String []names = {"James","Mary",
				"John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		System.out.println("Total names: " + names.length);// how many names are here.
		System.out.println(Arrays.toString(names));
		System.out.println("*****************");
		for (int name = 0; name < names.length; name += 2) {
			System.out.println(names[name] + ", " + names[name + 1]);
		}

		System.out.println("MALE NAMES: ");
		for (int name = 0; name < names.length; name += 2) {
			if (name % 2 == 0)

				System.out.print(names[name] + ", ");

		}
		System.out.println("\nFAMALE NAME: ");
		for (int name = 0; name < names.length; name++) {
			if (name % 2 != 0)
				if (name == names.length - 1) {
					System.out.println(names[name]);
				} else {

					System.out.print(names[name] + ", ");
				}
		}
		System.out.println("RANDOM NAME: ");

		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.print("Random name: " + names[r]);

		System.out.println();
		System.out.println("SHORT NAMES: ");
		for (String name : names) {
			if (name.length() <= 4) {
				System.out.print(name.toUpperCase() + ", ");
			}
		}
		System.out.println("NAMES LENGTH SORT");
		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";
	
		for(String name : names) {
			if(name.length() <= 4) {
				namesUpto4 += name + ", ";
			}else if(name.length() == 5 || name.length() == 6) {
				names5to6 += name + ", ";
			}else {
				names7orMore += name + ", ";
			}
		}
		System.out.println("Names Up to 4: "+ namesUpto4.substring(0, namesUpto4.length()-2));
		System.out.println("Names 5 to 6: "+ names5to6);
		System.out.println("Names 7 or More: "+ names7orMore);
		
		
		System.out.println(Arrays.toString(names));
		for(int i =0; i< names.length; i+=2) {
			String temp = names[i];
			names [i] = names[i+1];
			names [i+1] = temp;
		
		}
		System.out.println("Print swich them");
		System.out.println(Arrays.toString(names));
	}
}
