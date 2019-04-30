package day28_Arrays06;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		String [][] pizzas ={{"sausage", "pepperoni"},
							{"pieapple", "ham", "cheese"},
							{"4 cheese"},
							{"chicken", "tomatoes", "olives", "apples"},
							{"green peppers", "zuccini", "brocolli", "spinach", "beef"}
							};
		System.out.println(Arrays.toString(pizzas[0]));
		for (String [] pizza : pizzas) {
			System.out.println(pizza.length+ " - ");
		System.out.println(Arrays.toString(pizza));
		}
		System.out.println("###### FOR LOOP #####");
		for (int i = 0; i < pizzas.length; i++) {
			//System.out.println(pizzas[i].length + " - ");
			System.out.println(pizzas[i].length + " - "+Arrays.toString(pizzas[i]));
		}
		for (String topping : pizzas [0]) {
			System.out.println("Only 0: "+topping);
		}
		
		
		int [][] students = {{4, 5, 6},
							{12 ,7, 5},
							{23, 56, 64, 78, 87,}};
		for(int [] group : students) {
			for (int studentsID : group ) {
				System.out.print(studentsID+", ");
			}
			System.out.println();
		}
		int [][]nums = {{10, 20},
						{20, 30, 40, 50},
						{100, 200, 400},
						{555, 333, 111, 666, 789},
						};
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				
			
		System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
