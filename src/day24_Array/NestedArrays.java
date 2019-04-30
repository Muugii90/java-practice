package day24_Array;

public class NestedArrays {

	public static void main(String[] args) {
		int [][]ducks = {{1,2,3,4,5},
						 {1,2,3,4,5},
						 {1,2,3,4,5}};
		System.out.println(ducks.length);// 3
		System.out.println(ducks[0].length);//5 first array's length
		System.out.println(ducks[0][3]);
		System.out.println(ducks[2][2]);
	}

}
