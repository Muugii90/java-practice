package day28_Arrays06;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		String [] [] teams = new String [2][6] ;
		teams[0][0] = "Irina";
		teams[0][1] = "Zarif";
		teams[0][2] = "Cihan";
		teams[0][3] = "Habib";
		teams[0][4] = "Adel";
		teams[0][5] = "Bojan";
		
		teams[1][0] = "Olimjon";
		teams[1][1] = "Mirshod";
		teams[1][2] = "Usman";
		teams[1][3] = "Nursult";
		teams[1][4] = "Roman";
		teams[1][5] = "Dimitriy";
		
		System.out.println("First player of first team: "+teams[0][0]);
		System.out.println("First team of third player: "+teams [0][3]);
		System.out.println("Second team of last player: "+teams[1][5]);
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People of in first team: "+teams[0].length);
		System.out.println("People of second team: "+teams[1].length);
		
		System.out.println(Arrays.deepToString(teams));
		
		
	}

}
