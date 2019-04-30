package day07_scanner_operaters;

public class PreAndPost {
	public static void main (String []args) {
		int num = 10;
		int num2 = num++;
		System.out.println("num:" + num);
		System.out.println("num2:" + num2);
		
		int n = 20;
		int n2 = ++n;
		
		System.out.println("n:" +n);
		System.out.println("n2:"+n2);
		
		int i = 10;
		i++;// add 1 automatically
		++i;
		System.out.println("My value "+i);
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println("bananas:" + bananas);//8
		System.out.println("pears: " + pears);//6
		System.out.println("apples: "+ apples);//8
		
		int banana = 6;
		int pear = ++bananas;
		int apple = bananas++;
		
		System.out.println("bananas:" + banana);//6
		System.out.println("pears: " + pear);//9
		System.out.println("apples: "+ apple);//9
		
		int friends = 10;
		System.out.println(friends++);
		System.out.println(friends);
		
		int p1 = 10;
		int sum = p1++ + 5;
		System.out.println("sum " + sum);
		System.out.println("p1 "+ p1);
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);
		System.out.println("oldBatteries: " + oldBatteries);
		System.out.println("totalBatteries: " + totalBatteries);
		
	}

}
