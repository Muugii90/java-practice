package day28_Arrays06;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFoodRestaurants {

	
		
		public static void main(String[] args) throws IOException {
			//read all data and assign to array
			String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
			
			System.out.println("Data size: "+data.length);
			System.out.println(data[0]);
			System.out.println(data[1]);
			
			System.out.println(data[data.length -1]);
			int count = 0;
			for (String restaurants : data  ) {
				
				System.out.println("#"+count+ "=> "+ restaurants);
				count++;
			}
		//String state = "";
		int countVA = 0;
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
			}
		}
			System.out.println("Total resturants in VA: "+ countVA);
		
		int countRes = 0;
		for (String res : data) {
			if (res.contains(",VA,")) {
				String[] resArr = res.split(",");
				countRes++;
				System.out.println(countRes+" => "+resArr[2]+ " - "+ resArr[1]);
		}
			
			}
		for (String zip : data) {
			if(zip.contains("22312")) {
				String [] zipArr = zip.split(",");
				System.out.println("Show "+zipArr[3]);
			}
			
		}
			
			}
		}
	