package Review_Murodil;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {

		String[][] countries = { { "USA", "Washington DC" }, 
				{ "Canada", "Ottawa" },
				{ "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, 
				{ "Peru", "Lima" }, 
				{ "Argentina", "Boanes Aeros" },
				{ "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, 
				{ "Kazakhstan", "Nursultan" } };
		Arrays.sort(countries);
		System.out.println(countries[0][0] + " | " + countries[0][1]);
		System.out.println(countries[1][0] + " | " + countries[1][1]);
		System.out.println(countries[2][0] + " | " + countries[2][1]);
		// System.out.println(Arrays.deepToString(countries));
		for (int i = 0; i < countries.length; i++) {

			System.out.print(countries[i][0] + " | ");
			System.out.print(countries[i][1] + " |");
		}

		System.out.println();
		for (String[] count : countries) {
			System.out.print(count[0] + " | ");

		}
		System.out.println();
		// String [] newCities = new String [9];// just give the number of length
		String[] newCities = new String[countries.length];
		for (int i = 0; i < countries.length; i++) {
			newCities[i] = countries[i][1];
		}
		System.out.println(Arrays.toString(newCities));

		for (int row = 0; row < countries.length; row++) {
			if (countries[row][0].equals("Bolivia")) {
				// System.out.print(countries[row][1]);
			if (countries[row][1].equals("La Paz")) {
				System.out.println("Bolivia test passed");
			} else {
				System.out.println("Bolivia test failed");
			}
			break;// exit the loop
			}
		}
	}

}
