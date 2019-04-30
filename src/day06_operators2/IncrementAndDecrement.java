package day06_operators2;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int employees/*variable*/ = 50;
		System.out.println("Emplayees:" + employees);
		
		employees++;
		employees ++; // add or increment 1
		
		employees += 1;
		employees = employees +1;// long way
		System.out.println("Emplayees:" + employees); // 51 
	
		employees --; //decrease by one
		System.out.println("Empoyees: "+ employees);
		
		
		//Summary today ++/ -- 
		int apples = 5;
		apples = apples +1;
		apples +=1;
		apples ++;
		System.out.println(apples);
		
		
		
		
		
	}

}
